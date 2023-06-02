package tree.workflowPatternNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.GrammarNode;

public class BranchBranchReNode extends GrammarNode {
    public BranchBranchReNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(workflowPatternBuilder, 6);
    }

    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        IWorkflowPatternBuilder firstBranchArgument = childGrammarNodes.get(0).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder secondBranchArgument = childGrammarNodes.get(1).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder thirdBranchArgument = childGrammarNodes.get(2).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder firstBranchReArgument = childGrammarNodes.get(3).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder secondBranchReArgument = childGrammarNodes.get(4).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder thirdBranchReArgument = childGrammarNodes.get(5).getPatternBuilder(tabNumber + 1);
        return workflowPatternBuilder.setTabNumber(tabNumber)
                .appendBranchBranchRe(
                firstBranchArgument,
                secondBranchArgument,
                thirdBranchArgument,
                firstBranchReArgument,
                secondBranchReArgument,
                thirdBranchReArgument);
    }
}
