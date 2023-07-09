package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionCallToCheck;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;
import proj.dfjm.javapythoncompiler.exceptions.CodeParsingException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class RootASTNode extends ASTNode {
    private final List<CustomFunctionDeclaration> customFunctionDeclarations = new ArrayList<>();
    private final List<CustomFunctionCallToCheck> calledCustomFunctions = new ArrayList<>();

    private final List<ThreadFunctionDefinition> threadFunctionDefinitions = new ArrayList<>();

    public RootASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(1, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        checkCustomFunctionCorrectness();

        workflowPatternBuilder.appendSourceCode(
            children.get(0).getWorkflowPatternBuilder(indentationLevel).getSourceCode()
        );

        if (customFunctionDeclarations.size() > 0) {
            workflowPatternBuilder.appendCustomFunctionDeclarations(customFunctionDeclarations);
        }

        if (threadFunctionDefinitions.size() > 0) {
            workflowPatternBuilder.appendThreadFunctionDefinitions(threadFunctionDefinitions);
        }

        return workflowPatternBuilder;
    }

    public int getThreadFunctionDefinitionNumber() {
        return threadFunctionDefinitions.size();
    }

    public String getSourceCode() {
        return !children.isEmpty() ? getWorkflowPatternBuilder(0).getSourceCode() : null;
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

    public void addEmptyCustomFunctionDeclaration() {
        customFunctionDeclarations.add(new CustomFunctionDeclaration());
    }

    public void addThreadFunctionDefinition(ThreadFunctionDefinition threadFunctionDefinition) {
        threadFunctionDefinitions.add(threadFunctionDefinition);
    }

    public void addSeqASTNode() {
        addAsChild(new SeqASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addBranchBranchReASTNode() {
        addAsChild(new BranchBranchReASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addConcurASTNode() {
        addAsChild(new ConcurASTNode(this, workflowPatternBuilder.createNewInstance()));
    }

    public void addConcurReASTNode() {
        addAsChild(new ConcurReASTNode(this, workflowPatternBuilder.createNewInstance()));
    }

    public void addCondASTNode() {
        addAsChild(new CondASTNode(workflowPatternBuilder.createNewInstance()));
    }

    public void addParaASTNode() {
        addAsChild(new ParaASTNode(this, workflowPatternBuilder.createNewInstance()));
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

    public void addAltASTNode() {
        addAsChild(new AltASTNode(workflowPatternBuilder.createNewInstance()));
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

    private void checkCustomFunctionCorrectness() throws CodeParsingException {
        if (customFunctionDeclarations.isEmpty() && calledCustomFunctions.isEmpty()) {
            return;
        }

        boolean doAllFunctionDeclarationsMatchFunctionCalls = false;

        // In theory, there is no chance that lists of different sizes can contain the same elements, but in
        // practice, the Stream#allMatch() method could still return 'true' in such case. We don't want that.
        if (customFunctionDeclarations.size() == calledCustomFunctions.size()) {
            doAllFunctionDeclarationsMatchFunctionCalls = customFunctionDeclarations
                .stream()
                .allMatch(x ->
                    calledCustomFunctions.stream().anyMatch(y ->
                        y.getFunctionName().equals(x.getFunctionName())
                        && y.getArgumentNumber() == x.getArguments().size()
                    )
                );
        }

        if (!doAllFunctionDeclarationsMatchFunctionCalls) {
            throw new CodeParsingException(
                "In the code provided as input, function declarations" +
                " do not match their calls (or the other way around)!"
            );
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
            throw new CodeParsingException(
                "In the code provided as input, functions with the same name have been detected!"
            );
        }
    }
}
