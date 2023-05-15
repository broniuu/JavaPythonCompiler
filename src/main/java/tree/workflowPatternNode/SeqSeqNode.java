package tree.workflowPatternNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.GrammarNode;

public class SeqSeqNode extends GrammarNode {
    public SeqSeqNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(workflowPatternBuilder, 3);
    }

    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        IWorkflowPatternBuilder firstArgument = childGrammarNodes.get(0).getPatternBuilder(tabNumber);
        IWorkflowPatternBuilder secondArgument = childGrammarNodes.get(1).getPatternBuilder(tabNumber);
        IWorkflowPatternBuilder thirdArgument = childGrammarNodes.get(2).getPatternBuilder(tabNumber);
        return workflowPatternBuilder.setTabNumber(tabNumber)
                .appendSeqSeq(firstArgument, secondArgument, thirdArgument);
    }
}
