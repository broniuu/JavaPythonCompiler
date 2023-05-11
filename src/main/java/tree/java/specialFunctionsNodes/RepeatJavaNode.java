package tree.java.specialFunctionsNodes;
import builder.codeBuilder.JavaCodeBuilder;
import tree.java.GrammarNode;
public class RepeatJavaNode extends GrammarNode {
    public RepeatJavaNode() {
        maxChildrenNumber = 4;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder conditionalArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        return workflowPatternBuilder.setCurrentTabsNumber(tabNumber)
                .appendFirstLine(firstArgument)
                .appendTabs()
                .appendDoWhile(conditionalArgument.toString(), secondArgument)
                .appendLastLine(thirdArgument);
    }
}

