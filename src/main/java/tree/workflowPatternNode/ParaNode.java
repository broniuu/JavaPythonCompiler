package tree.workflowPatternNode;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;
import tree.GrammarNode;

public class ParaNode extends GrammarNode {
    public ParaNode(IWorkflowPatternBuilder workflowPatternBuilder) {
        super(workflowPatternBuilder,4);
    }


    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        IWorkflowPatternBuilder firstArgument = childGrammarNodes.get(0).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder secondArgument = childGrammarNodes.get(1).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder thirdArgument = childGrammarNodes.get(2).getPatternBuilder(tabNumber + 1);
        IWorkflowPatternBuilder fourthArgument = childGrammarNodes.get(3).getPatternBuilder(tabNumber + 1);
        return workflowPatternBuilder.setTabNumber(tabNumber)
                .appendPara(firstArgument, secondArgument, thirdArgument, fourthArgument);

    }
}
