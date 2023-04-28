package tree.java.specialFunctionsNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class SeqJavaNode extends GrammarNode {
    public SeqJavaNode() {
        maxChildrenNumber = 2;
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firsArgument = childGrammarNodes.get(0).getCode(tabNumber);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber);
        return codeStringBuilder
                .append(firsArgument).append("\n")
                .appendTabs(tabNumber).append(secondArgument).append("\n");
    }
}
