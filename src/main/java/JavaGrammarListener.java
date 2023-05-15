import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import tree.mainNode.JavaMainNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class JavaGrammarListener extends GrammarBaseListener {
    private JavaMainNode grammarNode = new JavaMainNode();
    private boolean errorOccurred = false;
    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }
    @Override
    public void enterJ_condition(GrammarParser.J_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
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
    public void enterJ_function_call(GrammarParser.J_function_callContext ctx) {
        int numberOfArguments = ctx.j_function_args().j_function_arg().size();
        String functionName = ctx.ID().getText();
        grammarNode.addCustomFunctionJavaNode(functionName, numberOfArguments);
    }


    @Override
    public void enterJ_function_arg(GrammarParser.J_function_argContext ctx) {
        grammarNode.addCodeBlockNodeToTree(ctx.getText());
    }

    @Override
    public void enterJ_function_declaration(GrammarParser.J_function_declarationContext ctx) {
        String functionType = ctx.j_type().getText();
        String functionName  = ctx.ID().getText();
        grammarNode.addEmptyFunctionDeclaration();
        grammarNode.setLastFunctionTypeAndName(functionType, functionName);
    }

    @Override
    public void enterJ_function_param(GrammarParser.J_function_paramContext ctx) {
        String type = ctx.j_type().getText();
        String name = ctx.ID().getText();
        String param = type + " " + name;
        grammarNode.addParamToLastFunction(param);
    }

    @Override
    public void enterJ_seq_normal_args(GrammarParser.J_seq_normal_argsContext ctx) {
        grammarNode.addSeqNode();
    }
    @Override
    public void enterJ_branches(GrammarParser.J_branchesContext ctx) {
        grammarNode.addBranchBranchReNode();
    }

    @Override
    public void enterJ_choice(GrammarParser.J_choiceContext ctx) {
        grammarNode.addChoiceNode();
    }

    @Override
    public void enterJ_seqSeq(GrammarParser.J_seqSeqContext ctx) {
        grammarNode.addSeqSeqNode();
    }

    @Override
    public void enterJ_cond(GrammarParser.J_condContext ctx) {
        grammarNode.addCondNode();
    }

    @Override
    public void enterJ_loop(GrammarParser.J_loopContext ctx) {
        grammarNode.addLoopNode();
    }

    @Override
    public void enterJ_para(GrammarParser.J_paraContext ctx) {
        grammarNode.addParaNode();
    }

    @Override
    public void enterJ_repeat(GrammarParser.J_repeatContext ctx) {
        grammarNode.addRepeatNode();
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if(errorOccurred) return;
        System.out.println(grammarNode.getCode());
    }
}
