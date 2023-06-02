package proj.dfjm.javapythoncompiler.nodes;

import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.IWorkflowPatternBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class ASTNode {
    private final int expectedChildrenNumber;

    protected IWorkflowPatternBuilder workflowPatternBuilder;
    protected List<ASTNode> children = new ArrayList<>();

    public ASTNode(int expectedChildrenNumber, IWorkflowPatternBuilder workflowPatternBuilder) {
        this.expectedChildrenNumber = expectedChildrenNumber;
        this.workflowPatternBuilder = workflowPatternBuilder;
    }

    protected void addAsChild(ASTNode nodeToAdd) {
        Optional<ASTNode> firstNotFilledChild = children
            .stream()
            .filter(ASTNode::isNotFilledUp)
            .findFirst();

        if (firstNotFilledChild.isEmpty()) {
            if (isNotFilledUp()) {
                children.add(nodeToAdd);
            }
            return;
        }

        firstNotFilledChild.get().addAsChild(nodeToAdd);
    }

    protected abstract IWorkflowPatternBuilder getWorkflowPatternBuilder(int indentationLevel);

    private boolean isNotFilledUp() {
        return children.size() < expectedChildrenNumber;
    }
}
