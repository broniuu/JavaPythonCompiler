import gen.GrammarBaseListener;
import gen.GrammarParser;
import tree.MainJavaNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class JavaGrammarListener extends GrammarBaseListener {
    private MainJavaNode grammarNode = new MainJavaNode();
    @Override
    public void enterJ_arg_condition(GrammarParser.J_arg_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
    }
    @Override
    public void enterJ_initialization(GrammarParser.J_initializationContext ctx) {
        var childContext = ctx.getChild(0);
        separateChildrenWithSpace(childContext);
    }
    private void separateChildrenWithSpace(ParseTree context) {
        var maxLastChildIndex = context.getChildCount() - 1;
        StringBuilder localStringBuilder = new StringBuilder();
        for (int i = 0; i < maxLastChildIndex; ++i) {
            localStringBuilder.append(context.getChild(i).getText()).append(" ");
        }
        localStringBuilder.append(context.getChild(maxLastChildIndex).getText());
        grammarNode.addCodeBlockNodeToTree(localStringBuilder.toString());
    }
    @Override
    public void enterJ_arg_universal(GrammarParser.J_arg_universalContext ctx) {
        if (ctx.J_ARG_CODE_BLOCK() != null) {
            grammarNode.addCodeBlockNodeToTree(ctx.J_ARG_CODE_BLOCK().getText());
        }
    }
    @Override
    public void enterJ_seq_normal_args(GrammarParser.J_seq_normal_argsContext ctx) {
        grammarNode.addSeqNodeToTree();
    }
    @Override
    public void enterJ_branches(GrammarParser.J_branchesContext ctx) {
        grammarNode.addBranchBranchReNodeToTree();
    }

    @Override
    public void enterJ_choice(GrammarParser.J_choiceContext ctx) {
        grammarNode.addChoiceJavaNode();
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        System.out.println(grammarNode.getCode());
    }
}
