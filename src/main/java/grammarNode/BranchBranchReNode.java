package grammarNode;

public class BranchBranchReNode extends GrammarNode{
    public BranchBranchReNode() {
        maxChildrenNumber = 6;
    }

    @Override
    public StringBuilder getCode() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder firstBranchArgument = childGrammarNodes.get(0).getCode();
        StringBuilder secondBranchArgument = childGrammarNodes.get(1).getCode();
        StringBuilder thirdBranchArgument = childGrammarNodes.get(2).getCode();
        StringBuilder firstBranchReArgument = childGrammarNodes.get(3).getCode();
        StringBuilder secondBranchReArgument = childGrammarNodes.get(4).getCode();
        StringBuilder thirdBranchReArgument = childGrammarNodes.get(5).getCode();
        return stringBuilder.append("if (").append(firstBranchArgument).append(") {\n")
                .append("\t").append(secondBranchArgument).append("\n")
                .append("\t").append(firstBranchReArgument).append("\n")
                .append("} else {\n")
                .append("\t").append(thirdBranchArgument).append("\n")
                .append("\t").append(secondBranchReArgument).append("\n")
                .append("}\n")
                .append(thirdBranchReArgument);
    }
}
