package tree.javaNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class ChoiceJavaNode extends GrammarNode {
    public ChoiceJavaNode() {
        maxChildrenNumber = 4;
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder fourthArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        return codeStringBuilder
                .appendFirstLine(firstArgument)
                .appendTabs(tabNumber).appendStartIf("").appendNewLine()
                .appendLine(secondArgument, tabNumber + 1)
                .appendTabs(tabNumber).appendStartElse().appendNewLine()
                .appendLine(thirdArgument, tabNumber + 1)
                .appendTabs(tabNumber).appendClosedBracket().appendNewLine()
                .appendTabs(tabNumber).append(fourthArgument);

    }
}
