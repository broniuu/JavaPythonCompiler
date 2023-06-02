package tree.mainNode;
import builder.workflowPatternBuilder.JavaWorkflowPatternBuilder;

public class JavaMainNode extends MainNode {
    public JavaMainNode() {
        super(new JavaWorkflowPatternBuilder());
    }
}
