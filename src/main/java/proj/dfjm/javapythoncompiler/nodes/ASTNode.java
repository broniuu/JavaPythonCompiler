package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

import java.util.ArrayList;
import java.util.List;

abstract class ASTNode {
    private final int expectedChildrenNumber;

    protected IWorkflowPatternBuilder workflowPatternBuilder;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(int expectedChildrenNumber, IWorkflowPatternBuilder workflowPatternBuilder) {
        this.expectedChildrenNumber = expectedChildrenNumber;
        this.workflowPatternBuilder = workflowPatternBuilder;
    }

    /**
     * Adds a given AST node to the abstract syntax tree as a child of one of the existing AST nodes. The exact
     * location in which the given node will end up is determined by the DFS pre-order tree search algorithm.
     * @param nodeToAdd An AST node to be added as a child of one of the existing AST nodes.
     * @return true if the given node was successfully added as a child, false otherwise.
     */
    protected boolean addAsChild(ASTNode nodeToAdd) {
        for (int i = 0; i < expectedChildrenNumber; i++) {
            if (i < children.size()) {
                boolean wasAddedSuccessfully = children.get(i).addAsChild(nodeToAdd);

                if (wasAddedSuccessfully) {
                    return true;
                }
            } else {
                children.add(nodeToAdd);
                return true;
            }
        }

        return false;
    }

    protected abstract IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel);
}
