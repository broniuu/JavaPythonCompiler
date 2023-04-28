package tree.java;

import codeBuilder.JavaCodeBuilder;
import tree.GrammarNode;

public class JavaCodeBlockNode extends GrammarNode {
    private String code;
    private final String CODE_BLOCK_SIGN = "`";
    public JavaCodeBlockNode() {
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
