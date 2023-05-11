package tree.java.specialFunctionsNodes;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.java.GrammarNode;

public class BranchBranchReJavaNode extends GrammarNode {
    public BranchBranchReJavaNode() {
        maxChildrenNumber = 6;
    }

    @Override
    public IWorkflowPatternBuilder getCode(int tabNumber) {
        IWorkflowPatternBuilder firstBranchArgument = childGrammarNodes.get(0).getCode(tabNumber + 1);
        IWorkflowPatternBuilder secondBranchArgument = childGrammarNodes.get(1).getCode(tabNumber + 1);
        IWorkflowPatternBuilder thirdBranchArgument = childGrammarNodes.get(2).getCode(tabNumber + 1);
        IWorkflowPatternBuilder firstBranchReArgument = childGrammarNodes.get(3).getCode(tabNumber + 1);
        IWorkflowPatternBuilder secondBranchReArgument = childGrammarNodes.get(4).getCode(tabNumber + 1);
        IWorkflowPatternBuilder thirdBranchReArgument = childGrammarNodes.get(5).getCode(tabNumber + 1);
        return workflowPatternBuilder.setCurrentTabsNumber(tabNumber)
                .appendIf(firstBranchArgument.toString(), secondBranchArgument, firstBranchReArgument)
                .appendElse(thirdBranchArgument, secondBranchReArgument)
                .appendLastLine(thirdBranchReArgument);
    }
}
