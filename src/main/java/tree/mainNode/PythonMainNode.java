package tree.mainNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import builder.workflowPatternBuilder.PythonWorkflowPatternBuilder;

public class PythonMainNode extends MainNode{
    public PythonMainNode() {
        super(new PythonWorkflowPatternBuilder());
    }
}
