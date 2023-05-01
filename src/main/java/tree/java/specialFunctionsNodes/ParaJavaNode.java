package tree.java.specialFunctionsNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class ParaJavaNode extends GrammarNode {
    public ParaJavaNode() {
        maxChildrenNumber = 4;
    }
    private int threadNumber = 1;

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder fourthArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        return codeStringBuilder
                .appendFirstLine(firstArgument)
                .appendTabs(tabNumber).appendThread(String.valueOf(secondArgument), threadNumber).appendNewLine()
                .appendStartThread(threadNumber++).appendNewLine()
                .appendTabs(tabNumber).appendThread(String.valueOf(thirdArgument), threadNumber).appendNewLine()
                .appendStartThread(threadNumber++).appendNewLine()
                .append(fourthArgument);

    }
}
