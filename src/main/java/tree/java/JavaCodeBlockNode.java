package tree.java;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;

public class JavaCodeBlockNode extends GrammarNode {
    private String code;
    private final String CODE_BLOCK_SIGN = "`";
    public JavaCodeBlockNode() {
        maxChildrenNumber = 0;
    }
    @Override
    public IWorkflowPatternBuilder getCode(int tabsNumber) {
        return workflowPatternBuilder
                .appendCode(code.replace(CODE_BLOCK_SIGN, ""));
    }

    public void setCode(String code) {
        this.code = code;
    }
}
