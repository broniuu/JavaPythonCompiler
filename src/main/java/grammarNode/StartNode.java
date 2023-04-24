package grammarNode;

public class StartNode extends GrammarNode {
    public StartNode() {
        maxChildrenNumber = 1;
    }

    @Override
    public StringBuilder getCode() {
        return childGrammarNodes.get(0).getCode();
    }
    public void addCodeBlockNodeToTree(String code){
        CodeBlockNode codeBlockNode = new CodeBlockNode();
        codeBlockNode.setCode(code);
        addChild(codeBlockNode);
    }
    public void addSeqNodeToTree() {
        this.addChild(new SeqNode());
    }
    public void addBranchBranchReNodeToTree() {
        this.addChild(new BranchBranchReNode());
    }
}
