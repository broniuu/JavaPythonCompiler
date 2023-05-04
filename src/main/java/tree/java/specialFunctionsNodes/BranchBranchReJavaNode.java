package tree.java.specialFunctionsNodes;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class BranchBranchReJavaNode extends GrammarNode {
    public BranchBranchReJavaNode() {
        maxChildrenNumber = 6;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        JavaCodeBuilder firstBranchArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        JavaCodeBuilder secondBranchArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        JavaCodeBuilder thirdBranchArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        JavaCodeBuilder firstBranchReArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        JavaCodeBuilder secondBranchReArgument = childGrammarNodes.get(4).getCode(tabNumber + 1);
        JavaCodeBuilder thirdBranchReArgument = childGrammarNodes.get(5).getCode(tabNumber + 1);
        return codeStringBuilder.setCurrentTabsNumber(tabNumber)
                .appendIf(firstBranchArgument.toString(), secondBranchArgument, firstBranchReArgument)
                .appendElse(thirdBranchArgument, secondBranchReArgument)
                .appendLastLine(thirdBranchReArgument);
    }
}
