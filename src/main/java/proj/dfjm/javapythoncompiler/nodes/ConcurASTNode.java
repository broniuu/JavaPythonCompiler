package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;

final class ConcurASTNode extends ASTNode {
    private final RootASTNode rootASTNode;

    public ConcurASTNode(RootASTNode rootASTNode, IWorkflowPatternBuilder workflowPatternBuilder) {
        super(3, workflowPatternBuilder);
        this.rootASTNode = rootASTNode;
    }

    @Override
    protected IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel) {
        rootASTNode.addThreadFunctionDefinition(new ThreadFunctionDefinition(
            children.get(1).getWorkflowPatternBuilder(1).getSourceCode(),
            rootASTNode.getThreadFunctionDefinitionNumber() + 1
        ));

        rootASTNode.addThreadFunctionDefinition(new ThreadFunctionDefinition(
            children.get(2).getWorkflowPatternBuilder(1).getSourceCode(),
            rootASTNode.getThreadFunctionDefinitionNumber() + 1
        ));

        return workflowPatternBuilder
            .setIndentationLevel(indentationLevel)
            .appendConcur(
                children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
                null,
                null
            );
    }
}
