package tree.java;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;
import tree.java.specialFunctionsNodes.BranchBranchReJavaNode;
import tree.java.specialFunctionsNodes.ChoiceJavaNode;
import tree.java.specialFunctionsNodes.SeqJavaNode;
import tree.java.specialFunctionsNodes.SeqSeqJavaNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainJavaNode extends GrammarNode {
    private List<JavaFunctionDeclaration> functionDeclarations = new ArrayList<>();
    private List<JavaFunctionCallToCheck> calledFunctions = new ArrayList<>();
    public void addEmptyFunctionDeclaration() {
        this.functionDeclarations.add(new JavaFunctionDeclaration());
    }

    public void addParamToLastFunction(String param){
        functionDeclarations.get(functionDeclarations.size() - 1).addParameter(param);
    }

    public void setLastFunctionTypeAndName(String type, String name) {
        JavaFunctionDeclaration lastFunctionDeclaration = functionDeclarations.get(functionDeclarations.size() - 1);
        lastFunctionDeclaration.setName(name);
        lastFunctionDeclaration.setType(type);
    }

    public MainJavaNode() {
        maxChildrenNumber = 1;
    }
    public String getCode(){
        return this.getCode(0).toString();
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        checkCustomFunctionCorrectness();
        codeStringBuilder.append(childGrammarNodes.get(0).getCode(tabNumber));
        if (functionDeclarations.size() == 0) return codeStringBuilder;
        return codeStringBuilder.append("\n\n")
                .append("// - - - - Deklaracje funkcji - - - - -")
                .append("\n\n")
                .appendFunctionDeclarations(functionDeclarations);
    }
    private void checkCustomFunctionCorrectness() {
        if (functionDeclarations.isEmpty() && calledFunctions.isEmpty()) return;
        var allFunctionDeclarationsMatchCalledFunctions = functionDeclarations
                .stream().anyMatch(x ->
                        calledFunctions.stream().anyMatch(
                                y -> y.getName().equals(x.getName()) && y.getNumberOfArguments() == x.getParameters().size()
                        )
                );
        if (!allFunctionDeclarationsMatchCalledFunctions) {
            throw new RuntimeException("Deklaracje funckji nie zgadzają się z ich wywołaniami");
        }
        List<String> duplicates = functionDeclarations.stream().map(x -> x.getName())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        if (duplicates.size() > 0) {
            throw new RuntimeException("Dwa razy zadeklarowano tą samą funckję");
        }
    }
    public void addCodeBlockNodeToTree(String code){
        JavaCodeBlockNode codeBlockNode = new JavaCodeBlockNode();
        codeBlockNode.setCode(code);
        addChild(codeBlockNode);
    }

    public void addCustomFunctionJavaNode(String functionName, int numberOfArguments) {
        calledFunctions.add(new JavaFunctionCallToCheck(functionName, numberOfArguments));
        this.addChild(new CustomFunctionJavaNode(functionName, numberOfArguments));
    }
    public void addSeqNodeToTree() {
        this.addChild(new SeqJavaNode());
    }
    public void addBranchBranchReNodeToTree() {
        this.addChild(new BranchBranchReJavaNode());
    }
    public void addChoiceJavaNode() {this.addChild(new ChoiceJavaNode());}
    public void addSeqSeqJavaNode() {this.addChild(new SeqSeqJavaNode());}

}
