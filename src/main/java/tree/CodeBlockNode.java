package tree;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;

public class CodeBlockNode extends GrammarNode {
    private String code;
    private final String CODE_BLOCK_SIGN = "`";
    public CodeBlockNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(workflowPatternBuilder, 0);
    }

    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabsNumber) {
        return workflowPatternBuilder
                .appendCode(code.replace(CODE_BLOCK_SIGN, ""));
    }

    public void setCode(String code) {
        this.code = code;
    }
}
