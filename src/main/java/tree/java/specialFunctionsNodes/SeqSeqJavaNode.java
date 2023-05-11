package tree.java.specialFunctionsNodes;

import builder.codeBuilder.JavaCodeBuilder;
import tree.java.GrammarNode;

public class SeqSeqJavaNode extends GrammarNode {
    public SeqSeqJavaNode() {
        maxChildrenNumber = 3;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber);
        return workflowPatternBuilder.setCurrentTabsNumber(tabNumber)
                .appendLine(firstArgument)
                .appendLine(secondArgument)
                .appendLine(thirdArgument);
    }
}
