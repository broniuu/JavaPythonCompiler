package tree.java.specialFunctionsNodes;

import builder.codeBuilder.JavaCodeBuilder;
import tree.java.GrammarNode;

public class SeqJavaNode extends GrammarNode {
    public SeqJavaNode() {
        maxChildrenNumber = 2;
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firsArgument = childGrammarNodes.get(0).getCode(tabNumber);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber);
        return workflowPatternBuilder.setCurrentTabsNumber(tabNumber)
                .append(firsArgument).append("\n")
                .appendTabs().append(secondArgument).append("\n");
    }
}
