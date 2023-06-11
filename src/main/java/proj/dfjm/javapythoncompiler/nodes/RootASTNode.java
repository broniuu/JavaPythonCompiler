package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionCallToCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class RootASTNode extends ASTNode {
    private List<CustomFunctionDeclaration> customFunctionDeclarations = new ArrayList<>();
    private List<CustomFunctionCallToCheck> calledCustomFunctions = new ArrayList<>();

    public RootASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(1, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        checkCustomFunctionCorrectness();

        workflowPatternBuilder.appendSourceCode(
            children.get(0).getWorkflowPatternBuilder(indentationLevel).getSourceCode()
        );

        if (customFunctionDeclarations.size() == 0) {
            return workflowPatternBuilder;
        }

        return workflowPatternBuilder.appendCustomFunctionDeclarations(customFunctionDeclarations);
    }

    public String getSourceCode() {
        return getWorkflowPatternBuilder(0).getSourceCode();
    }

    public boolean doesNotHaveChildren() {
        return children.isEmpty();
    }

    public void addArgumentToLastCustomFunction(String argument) {
        customFunctionDeclarations.get(customFunctionDeclarations.size() - 1).addArgument(argument);
    }

    public void setLastCustomFunctionReturnTypeAndName(String returnType, String functionName) {
        CustomFunctionDeclaration lastCustomFunctionDeclaration = customFunctionDeclarations.get(
            customFunctionDeclarations.size() - 1
        );

        lastCustomFunctionDeclaration.setFunctionName(functionName);
        lastCustomFunctionDeclaration.setReturnType(returnType);
    }

    private void checkCustomFunctionCorrectness() {
        if (customFunctionDeclarations.isEmpty() && calledCustomFunctions.isEmpty()) {
            return;
        }

        boolean allFunctionDeclarationsMatchCalledFunctions = customFunctionDeclarations
            .stream()
            .anyMatch(x ->
                calledCustomFunctions.stream().anyMatch(y ->
                    y.getFunctionName().equals(x.getFunctionName()) && y.getArgumentNumber() == x.getArguments().size()
                )
            );

        if (!allFunctionDeclarationsMatchCalledFunctions) {
            throw new RuntimeException("Function declarations do not match their calls (or vice versa).");
        }

        List<String> duplicates = customFunctionDeclarations
            .stream()
            .map(x -> x.getFunctionName())
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .toList();

        if (duplicates.size() > 0) {
            throw new RuntimeException("The same function has been declared twice.");
        }
    }

    public void addEmptyCustomFunctionDeclarationASTNode() {
        customFunctionDeclarations.add(new CustomFunctionDeclaration());
    }

    public void addSeqASTNode() {
        addAsChild(new SeqASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addBranchBranchReASTNode() {
        addAsChild(new BranchBranchReASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addConcurReASTNode() {
        addAsChild(new ConcurReASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addConcurASTNode() {
        addAsChild(new ConcurASTNode(workflowPatternBuilder.createNewInstance()));
    }
    public void addCondASTNode() {
        addAsChild(new CondASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addParaASTNode() {
        addAsChild(new ParaASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addLoopASTNode() {
        addAsChild(new LoopASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addChoiceASTNode() {
        addAsChild(new ChoiceASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addSeqSeqASTNode() {
        addAsChild(new SeqSeqASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addRepeatASTNode() {
        addAsChild(new RepeatASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addSpecialFunctionParamASTNode(String content) {
        addAsChild(new SpecialFunctionParamASTNode(workflowPatternBuilder.createNewInstance(), content));
    }

    public void addCustomFunctionCallASTNode(String functionName, int argumentNumber) {
        calledCustomFunctions.add(new CustomFunctionCallToCheck(functionName, argumentNumber));
        addAsChild(new CustomFunctionCallASTNode(
            argumentNumber,
            workflowPatternBuilder.createNewInstance(),
            functionName
        ));
    }
}
