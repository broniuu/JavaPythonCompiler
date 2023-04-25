package tree;

import codeBuilder.JavaCodeBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class GrammarNode {
    protected int maxChildrenNumber = 0;
    protected List<GrammarNode> childGrammarNodes = new ArrayList<>();
    protected JavaCodeBuilder codeStringBuilder = new JavaCodeBuilder();
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
    public JavaCodeBuilder getCode(int tabNumber) {
        return codeStringBuilder;
    }
    public List<GrammarNode> getChildren() {
        return childGrammarNodes;
    }

}

