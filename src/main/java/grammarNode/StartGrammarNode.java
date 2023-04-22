package grammarNode;

public class StartGrammarNode extends GrammarNode{
    public StartGrammarNode() {
        maxNodesNumber = 1;
    }

    @Override
    public StringBuilder getCode() {
        return grammarNodes.get(0).getCode();
    }
}
