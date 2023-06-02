package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

public final class SeqSeqASTNode extends ASTNode {
    public SeqSeqASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(3, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendSeqSeq(
                children.get(0).getWorkflowPatternBuilder(indentationLevel),
                children.get(1).getWorkflowPatternBuilder(indentationLevel),
                children.get(2).getWorkflowPatternBuilder(indentationLevel)
            );
    }
}
