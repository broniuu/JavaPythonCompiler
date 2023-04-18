import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.Console;

public class PythonGrammarListener extends GrammarBaseListener {
    private final StringBuilder code = new StringBuilder();
    private int tabNumber = 0;
    private final String CODE_BLOCK_SIGN = "`";
    private boolean errorOccurred = false;
    private void printTabs(){
        code.append("\t".repeat(Math.max(0, tabNumber)));
    }
    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }
    @Override
    public void exitP_repeat_first_action(GrammarParser.P_repeat_first_actionContext ctx) {
        printTabs();
        code.append("while True :\n");
        tabNumber++;
    }

    @Override
    public void exitP_repeat_second_action(GrammarParser.P_repeat_second_actionContext ctx) {
        printTabs();
        code.append("if ");
    }
    @Override
    public void enterP_condition(GrammarParser.P_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
    }

    @Override
    public void enterP_repeat_third_action(GrammarParser.P_repeat_third_actionContext ctx) {
        code.append(":\n");
        tabNumber++;
        printTabs();
        code.append("break \n");
        tabNumber--;
        tabNumber--;
    }

    @Override
    public void enterP_choice_second_action(GrammarParser.P_choice_second_actionContext ctx) {
        printTabs();
        code.append("if :\n");
        tabNumber++;
    }

    @Override
    public void enterP_choice_third_action(GrammarParser.P_choice_third_actionContext ctx) {
        tabNumber--;
        printTabs();
        code.append("else:\n");
        tabNumber++;
    }

    @Override
    public void enterP_choice_fourth_action(GrammarParser.P_choice_fourth_actionContext ctx) {
        tabNumber--;
        printTabs();
    }

    @Override
    public void enterP_assignment(GrammarParser.P_assignmentContext ctx) {
        separateChildrenWithSpace(ctx);
    }

    private void separateChildrenWithSpace(ParseTree context){
        var maxLastChildIndex = context.getChildCount() - 1;
        for (int i = 0; i < maxLastChildIndex; ++i) {
            code.append(context.getChild(i).getText()).append(" ");
        }
        code.append(context.getChild(maxLastChildIndex).getText());
    }

    @Override
    public void enterP_arg_universal(GrammarParser.P_arg_universalContext ctx) {
        printTabs();
        if(ctx.P_ARG_CODE_BLOCK() != null){
            code.append(ctx.P_ARG_CODE_BLOCK().getText().replace(CODE_BLOCK_SIGN,""));
            code.append("\n");
        }
    }

    @Override
    public void enterP_loop_second_action(GrammarParser.P_loop_second_actionContext ctx) {
        code.append("while ");
    }

    @Override
    public void exitP_loop_second_action(GrammarParser.P_loop_second_actionContext ctx) {
        code.append(":\n");
        tabNumber++;
    }

    @Override
    public void exitP_loop_third_action(GrammarParser.P_loop_third_actionContext ctx) {
        tabNumber--;
    }

    @Override
    public void enterP_para_first_action(GrammarParser.P_para_first_actionContext ctx) {
        super.enterP_para_first_action(ctx);
    }

    @Override
    public void exitP_para_first_action(GrammarParser.P_para_first_actionContext ctx) {
        super.exitP_para_first_action(ctx);
    }

    @Override
    public void enterP_para_second_action(GrammarParser.P_para_second_actionContext ctx) {
        code.append("first_thread = threading.Thread(target=");
    }

    @Override
    public void exitP_para_second_action(GrammarParser.P_para_second_actionContext ctx) {
        code.append(", name='first_thread')\n");
    }

    @Override
    public void enterP_para_third_action(GrammarParser.P_para_third_actionContext ctx) {
        code.append("second_thread = threading.Thread(target=");
    }

    @Override
    public void exitP_para_third_action(GrammarParser.P_para_third_actionContext ctx) {
        code.append(", name='second_thread')\n");
    }

    @Override
    public void enterP_para_fourth_action(GrammarParser.P_para_fourth_actionContext ctx) {
        super.enterP_para_fourth_action(ctx);
    }

    @Override
    public void exitP_para_fourth_action(GrammarParser.P_para_fourth_actionContext ctx) {
        super.exitP_para_fourth_action(ctx);
    }

    @Override
    public void enterP_cond_first_arg(GrammarParser.P_cond_first_argContext ctx) {
        code.append("if ");
    }

    @Override
    public void exitP_cond_first_arg(GrammarParser.P_cond_first_argContext ctx) {
        code.append(":\n");
        tabNumber++;
    }

    @Override
    public void enterP_cond_third_arg(GrammarParser.P_cond_third_argContext ctx) {
        code.append("else:\n");
    }

    @Override
    public void exitP_cond_third_arg(GrammarParser.P_cond_third_argContext ctx) {
        tabNumber--;
    }

    @Override
    public void enterP_concur_second_arg(GrammarParser.P_concur_second_argContext ctx) {
        code.append("threading.Thread(\n\ttarget=lambda : ");
    }

    @Override
    public void exitP_concur_second_arg(GrammarParser.P_concur_second_argContext ctx) {
        code.append(").start()\n");
    }

    @Override
    public void enterP_concur_third_arg(GrammarParser.P_concur_third_argContext ctx) {
        enterP_concur_second_arg(null);
    }

    @Override
    public void exitP_concur_third_arg(GrammarParser.P_concur_third_argContext ctx) {
        exitP_concur_second_arg(null);
    }

    @Override
    public void enterP_concurRe_first_arg(GrammarParser.P_concurRe_first_argContext ctx) {
        code.append("thread1 = threading.Thread(\n\ttarget=lambda : ");
    }

    @Override
    public void exitP_concurRe_first_arg(GrammarParser.P_concurRe_first_argContext ctx) {
        code.append(")\nthread1.start()\n");
    }

    @Override
    public void enterP_concurRe_second_arg(GrammarParser.P_concurRe_second_argContext ctx) {
        code.append("thread2 = threading.Thread(\n\ttarget=lambda : ");
    }

    @Override
    public void exitP_concurRe_second_arg(GrammarParser.P_concurRe_second_argContext ctx) {
        code.append(")\nthread2.start()\n");
    }

    @Override
    public void enterP_concurRe_third_arg(GrammarParser.P_concurRe_third_argContext ctx) {
        code.append("thread1.join()\nthread2.join()\n");
    }

    @Override
    public void enterP_line(GrammarParser.P_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitP_line(GrammarParser.P_lineContext ctx) {
        code.append("\n");
    }
    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred){
            System.out.println(code);
        }
    }
}
