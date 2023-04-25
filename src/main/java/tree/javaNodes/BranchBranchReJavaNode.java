package tree.javaNodes;

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
        return codeStringBuilder
                .append("if (").append(firstBranchArgument).append(") {\n")
                .appendTabs(tabNumber +1).append(secondBranchArgument).appendNewLine()
                .appendTabs(tabNumber + 1).append(firstBranchReArgument).appendNewLine()
                .appendTabs(tabNumber).append("} else {\n")
                .appendTabs(tabNumber + 1).append(thirdBranchArgument).appendNewLine()
                .appendTabs(tabNumber + 1).append(secondBranchReArgument).appendNewLine()
                .appendTabs(tabNumber).append("}\n")
                .appendTabs(tabNumber).append(thirdBranchReArgument);
    }
}
