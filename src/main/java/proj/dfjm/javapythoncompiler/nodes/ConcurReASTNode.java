package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

final class ConcurReASTNode extends ASTNode {
    public ConcurReASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(3, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendConcurRe(
                children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(1).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(2).getWorkflowPatternBuilder(indentationLevel + 1)
            );
    }
}
