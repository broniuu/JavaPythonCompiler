package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

final class ChoiceASTNode extends ASTNode {
    public ChoiceASTNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(4, workflowPatternBuilder);
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendChoice(
                children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(1).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(2).getWorkflowPatternBuilder(indentationLevel + 1),
                children.get(3).getWorkflowPatternBuilder(indentationLevel + 1)
            );
    }
}
