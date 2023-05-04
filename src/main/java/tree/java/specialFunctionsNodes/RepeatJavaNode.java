package tree.java.specialFunctionsNodes;
import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;
public class RepeatJavaNode extends GrammarNode {
    public RepeatJavaNode() {
        maxChildrenNumber = 4;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        codeStringBuilder.setCurrentTabsNumber(tabNumber);
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder conditionalArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        return codeStringBuilder.appendFirstLine(firstArgument)
                .appendTabs().appendDoWhile(conditionalArgument.toString(), secondArgument)
                .appendLastLine(thirdArgument);
    }
}

