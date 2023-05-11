package tree.java;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class GrammarNode {
    protected int maxChildrenNumber = 0;
    protected List<GrammarNode> childGrammarNodes = new ArrayList<>();
    protected IWorkflowPatternBuilder workflowPatternBuilder;
    public IWorkflowPatternBuilder getCode(int tabNumber) {
        return workflowPatternBuilder;
    }
    protected void addChild(GrammarNode grammarNode){
        Optional<GrammarNode> firstNotFilledChild = childGrammarNodes.stream()
                .filter(GrammarNode::notFilled).findFirst();
        if (firstNotFilledChild.isEmpty()){
            if (this.notFilled()) childGrammarNodes.add(grammarNode);
            return;
        }
        firstNotFilledChild.get().addChild(grammarNode);
    }
    public boolean notFilled() {
        return this.childGrammarNodes.size() < this.maxChildrenNumber;
    }
}

