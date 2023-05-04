package tree.java.specialFunctionsNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class CondJavaNode extends GrammarNode {

    public CondJavaNode() {
        maxChildrenNumber = 4;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder fourthArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
//        return codeStringBuilder
//                .appendTabs(tabNumber).appendStartIf(String.valueOf(firstArgument)).appendNewLine()
//                .appendLine(secondArgument, tabNumber + 1)
//                .appendTabs(tabNumber).appendStartElse().appendNewLine()
//                .appendLine(thirdArgument, tabNumber + 1)
//                .appendTabs(tabNumber).appendClosedBracket().appendNewLine()
//                .appendTabs(tabNumber).append(fourthArgument);
        return codeStringBuilder.setCurrentTabsNumber(tabNumber)
                .appendIf(firstArgument.toString(), secondArgument)
                .appendElse(thirdArgument)
                .appendLastLine(firstArgument)
    }
}
