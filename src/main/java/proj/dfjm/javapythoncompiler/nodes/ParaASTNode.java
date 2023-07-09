package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;

final class ParaASTNode extends ASTNode {
    private final RootASTNode rootASTNode;

    public ParaASTNode(RootASTNode rootASTNode, IWorkflowPatternBuilder workflowPatternBuilder) {
        super(4, workflowPatternBuilder);
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
            .appendPara(
                children.get(0).getWorkflowPatternBuilder(indentationLevel + 1),
                null,
                null,
                children.get(3).getWorkflowPatternBuilder(indentationLevel + 1)
            );
    }
}
