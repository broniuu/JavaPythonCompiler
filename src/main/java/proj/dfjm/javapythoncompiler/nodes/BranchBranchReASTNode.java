package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

final class BranchBranchReASTNode extends ASTNode {
    public BranchBranchReASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(6, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendBranchBranchRe(
                children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(1).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(2).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(3).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(4).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(5).getWorkflowPatternBuilder(indentationLevel + 1)
            );
    }
}
