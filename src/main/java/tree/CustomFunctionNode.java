package tree;

import builder.workflowPatternBuilder.IWorkflowPatternBuilder;

import java.util.List;

public class CustomFunctionNode extends GrammarNode {
    private final String functionName;
    public CustomFunctionNode(IWorkflowPatternBuilder workflowPatternBuilder, String functionName, int numberOfChildren) {
        super(workflowPatternBuilder, numberOfChildren);
        this.functionName = functionName;
    }

    @Override
    public IWorkflowPatternBuilder getPatternBuilder(int tabNumber) {
        List<String> arguments = childGrammarNodes.stream().map( x -> x.getPatternBuilder(0).getCode()).toList();
        return workflowPatternBuilder.appendFunctionCall(functionName, arguments);
    }
}
