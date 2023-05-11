package tree.java;

import builder.codeBuilder.JavaCodeBuilder;

import java.util.List;

public class CustomFunctionJavaNode extends GrammarNode {
    private final String functionName;
    public CustomFunctionJavaNode(String functionName, int numberOfChildren) {
        maxChildrenNumber = numberOfChildren;
        this.functionName = functionName;
    }

    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        List<JavaCodeBuilder> arguments = childGrammarNodes.stream().map( x -> x.getCode(0)).toList();
        return workflowPatternBuilder.appendFunctionCall(functionName, arguments);
    }
}
