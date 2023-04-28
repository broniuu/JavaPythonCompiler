package tree;

import codeBuilder.JavaCodeBuilder;
import tree.javaNodes.*;

public class MainJavaNode extends GrammarNode {
    public MainJavaNode() {
        maxChildrenNumber = 1;
    }
    public String getCode(){
        return this.getCode(0).toString();
    }
    @Override
    public JavaCodeBuilder getCode(int tabNumber) {
        return childGrammarNodes.get(0).getCode(tabNumber);
    }
    public void addCodeBlockNodeToTree(String code){
        JavaCodeBlockNode codeBlockNode = new JavaCodeBlockNode();
        codeBlockNode.setCode(code);
        addChild(codeBlockNode);
    }

    public void addCustomFunctionJavaNode(String functionName, int numberOfArguments) {
        this.addChild(new CustomFunctionJavaNode(functionName, numberOfArguments));
    }
    public void addSeqNodeToTree() {
        this.addChild(new SeqJavaNode());
    }
    public void addBranchBranchReNodeToTree() {
        this.addChild(new BranchBranchReJavaNode());
    }
    public void addChoiceJavaNode() {this.addChild(new ChoiceJavaNode());}
    public void addSeqSeqJavaNode() {this.addChild(new SeqSeqJavaNode());}
}
