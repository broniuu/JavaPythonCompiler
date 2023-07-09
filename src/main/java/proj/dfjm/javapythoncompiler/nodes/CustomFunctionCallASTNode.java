package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

import java.util.List;

final class CustomFunctionCallASTNode extends ASTNode {
    private final String functionName;

    public CustomFunctionCallASTNode(
        int expectedChildrenNumber, IWorkflowPatternBuilder workflowPatternBuilder, String functionName
    ) {
        super(expectedChildrenNumber, workflowPatternBuilder);
        this.functionName = functionName;
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        List<String> arguments = children
            .stream()
            .map(x -> x.getWorkflowPatternBuilder(0).getSourceCode())
            .toList();

        return workflowPatternBuilder.appendCustomFunctionCall(functionName, arguments);
    }
}
