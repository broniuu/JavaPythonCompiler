package tree.workflowPatternNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.GrammarNode;

public class SeqNode extends GrammarNode {
    public SeqNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(workflowPatternBuilder, 2);
    }

    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        IWorkflowPatternBuilder firsArgument = childGrammarNodes.get(0).getPatternBuilder(tabNumber);
        IWorkflowPatternBuilder secondArgument = childGrammarNodes.get(1).getPatternBuilder(tabNumber);
        return workflowPatternBuilder.setTabNumber(tabNumber)
                .appendSeq(firsArgument, secondArgument);
    }
}
