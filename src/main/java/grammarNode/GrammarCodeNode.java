package grammarNode;

public class GrammarCodeNode extends GrammarNode {
    private String code;
    public GrammarCodeNode() {
        maxNodesNumber = 0;
    }
    @Override
    public StringBuilder getCode() {
        return new StringBuilder().append(code);
    }

    public void setCode(String code) {
        this.code = code;
    }
}
