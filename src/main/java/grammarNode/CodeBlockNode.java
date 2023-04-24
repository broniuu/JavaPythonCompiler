package grammarNode;

public class CodeBlockNode extends GrammarNode {
    private String code;
    private final String CODE_BLOCK_SIGN = "`";
    public CodeBlockNode() {
        maxChildrenNumber = 0;
    }
    @Override
    public StringBuilder getCode() {
        return new StringBuilder().append(code.replace(CODE_BLOCK_SIGN, ""));
    }

    public void setCode(String code) {
        this.code = code;
    }
}
