package tree.mainNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.*;
import tree.workflowPatternNode.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class MainNode extends GrammarNode {
    private List<FunctionDeclaration> functionDeclarations = new ArrayList<>();
    private List<FunctionCallToCheck> calledFunctions = new ArrayList<>();
    public MainNode(IWorkflowPatternBuilder workflowPatternBuilder){
        super(workflowPatternBuilder, 1);
    }
    public void addParamToLastFunction(String param){
        functionDeclarations.get(functionDeclarations.size() - 1).addParameter(param);
    }

    public void setLastFunctionTypeAndName(String type, String name) {
        FunctionDeclaration lastFunctionDeclaration = functionDeclarations.get(functionDeclarations.size() - 1);
        lastFunctionDeclaration.setName(name);
        lastFunctionDeclaration.setType(type);
    }
    public String getCode(){
        return this.getPatternBuilder(0).toString();
    }
    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        checkCustomFunctionCorrectness();
        workflowPatternBuilder.appendCode(childGrammarNodes.get(0).getPatternBuilder(tabNumber).getCode());
        if (functionDeclarations.size() == 0) return workflowPatternBuilder;
        return workflowPatternBuilder.appendFunctionDeclarations(functionDeclarations);
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
        CodeBlockNode codeBlockNode = new CodeBlockNode(workflowPatternBuilder.createNewInstance());
        codeBlockNode.setCode(code);
        addChild(codeBlockNode);
    }

    public void addCustomFunctionNode(String functionName, int numberOfArguments) {
        calledFunctions.add(new FunctionCallToCheck(functionName, numberOfArguments));
        this.addChild(new CustomFunctionNode(workflowPatternBuilder.createNewInstance(), functionName, numberOfArguments));
    }
    public void addEmptyFunctionDeclaration() {
        this.functionDeclarations.add(new FunctionDeclaration());
    }
    public void addSeqNode() {
        this.addChild(new SeqNode(workflowPatternBuilder.createNewInstance()));
    }
    public void addBranchBranchReNode() {
        this.addChild(new BranchBranchReNode(workflowPatternBuilder.createNewInstance()));
    }
    public void addChoiceNode() {this.addChild(new ChoiceNode(workflowPatternBuilder.createNewInstance()));}
    public void addSeqSeqNode() {this.addChild(new SeqSeqNode(workflowPatternBuilder.createNewInstance()));}
    public void addCondNode() {this.addChild(new CondNode(workflowPatternBuilder.createNewInstance()));}
    public void addLoopNode() {this.addChild(new LoopNode(workflowPatternBuilder.createNewInstance()));}
    public void addParaNode() {this.addChild(new ParaNode(workflowPatternBuilder.createNewInstance()));}
    public void addRepeatNode() {this.addChild(new RepeatNode(workflowPatternBuilder.createNewInstance()));}
}
