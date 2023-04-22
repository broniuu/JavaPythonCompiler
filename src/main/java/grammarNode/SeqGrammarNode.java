package grammarNode;

public class SeqGrammarNode extends GrammarNode {
    public SeqGrammarNode() {
        maxNodesNumber = 2;
    }
    @Override
    public StringBuilder getCode() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder firsArgument = grammarNodes.get(0).getCode();
        StringBuilder secondArgument = grammarNodes.get(1).getCode();
        return stringBuilder.append(firsArgument).append("\n")
                .append(secondArgument).append("\n");
    }
}
