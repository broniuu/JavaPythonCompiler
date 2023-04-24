package grammarNode;

public class SeqNode extends GrammarNode {
    public SeqNode() {
        maxChildrenNumber = 2;
    }
    @Override
    public StringBuilder getCode() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder firsArgument = childGrammarNodes.get(0).getCode();
        StringBuilder secondArgument = childGrammarNodes.get(1).getCode();
        return stringBuilder.append(firsArgument).append("\n")
                .append(secondArgument).append("\n");
    }
}
