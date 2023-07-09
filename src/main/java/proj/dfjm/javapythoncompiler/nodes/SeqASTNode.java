package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

final class SeqASTNode extends ASTNode {
    public SeqASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(2, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendSeq(
                children.get(0).getWorkflowPatternBuilder(indentationLevel),
                children.get(1).getWorkflowPatternBuilder(indentationLevel)
            );
    }
}
