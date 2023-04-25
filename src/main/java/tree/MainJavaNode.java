package tree;

import codeBuilder.JavaCodeBuilder;
import tree.javaNodes.BranchBranchReJavaNode;
import tree.javaNodes.ChoiceJavaNode;
import tree.javaNodes.SeqJavaNode;

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
        CodeBlockNode codeBlockNode = new CodeBlockNode();
        codeBlockNode.setCode(code);
        addChild(codeBlockNode);
    }
    public void addSeqNodeToTree() {
        this.addChild(new SeqJavaNode());
    }
    public void addBranchBranchReNodeToTree() {
        this.addChild(new BranchBranchReJavaNode());
    }
    public void addChoiceJavaNode() {this.addChild(new ChoiceJavaNode());}
}
