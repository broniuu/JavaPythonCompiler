package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

public final class SpecialFunctionParamASTNode extends ASTNode {
    String content;

    public SpecialFunctionParamASTNode(IWorkflowPatternBuilder workflowPatternBuilder, String content) {
        super(0, workflowPatternBuilder);
        this.content = content;
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder.appendSourceCode(content.replace("`", ""));
    }
}
