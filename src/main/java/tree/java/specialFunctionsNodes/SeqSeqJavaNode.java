package tree.java.specialFunctionsNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class SeqSeqJavaNode extends GrammarNode {
    public SeqSeqJavaNode() {
        maxChildrenNumber = 3;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstArgument = childGrammarNodes.get(0).getCode(tabNumber);
        JavaCodeBuilder secondArgument = childGrammarNodes.get(1).getCode(tabNumber);
        JavaCodeBuilder thirdArgument = childGrammarNodes.get(2).getCode(tabNumber);
        return codeStringBuilder.append(firstArgument).appendNewLine()
                .appendLine(secondArgument, tabNumber)
                .appendLine(thirdArgument, tabNumber);
    }
}
