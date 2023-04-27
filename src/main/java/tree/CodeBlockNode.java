package tree;

import codeBuilder.JavaCodeBuilder;

public class CodeBlockNode extends GrammarNode {
    private String code;
    private final String CODE_BLOCK_SIGN = "`";
    public CodeBlockNode() {
        maxChildrenNumber = 0;
    }
    @Override
    public JavaCodeBuilder getCode(int tabsNumber) {
        return codeStringBuilder
                .append(code.replace(CODE_BLOCK_SIGN, ""));
    }

    public void setCode(String code) {
        this.code = code;
    }
}
