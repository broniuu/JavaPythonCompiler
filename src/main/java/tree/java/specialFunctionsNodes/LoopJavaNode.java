package tree.java.specialFunctionsNodes;

import builder.codeBuilder.JavaCodeBuilder;
import tree.java.GrammarNode;

public class LoopJavaNode extends GrammarNode {

    public LoopJavaNode() {
        maxChildrenNumber = 4;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder fourthArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
//        return codeStringBuilder
//                .appendFirstLine(firstArgument)
//                .appendTabs(tabNumber).appendStartWhile(String.valueOf(secondArgument)).appendNewLine()
//                .appendLine(thirdArgument, tabNumber + 1)
//                .appendTabs(tabNumber).appendClosedBracket().appendNewLine()
//                .appendTabs(tabNumber).append(fourthArgument);
        return  workflowPatternBuilder.setCurrentTabsNumber(tabNumber)
                .appendFirstLine(firstArgument)
                .appendWhile(secondArgument.toString(), thirdArgument).appendNewLine()
                .appendLastLine(fourthArgument);
    }
}
