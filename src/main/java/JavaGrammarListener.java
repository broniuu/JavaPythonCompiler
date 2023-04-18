import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.Console;

public class JavaGrammarListener extends GrammarBaseListener{
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
    public void exitJ_repeat_first_action(GrammarParser.J_repeat_first_actionContext ctx) {
        printTabs();
        code.append("do {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_repeat_second_action(GrammarParser.J_repeat_second_actionContext ctx) {
        tabNumber--;
        printTabs();
        code.append("} while(");
    }

    @Override
    public void enterJ_condition(GrammarParser.J_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
    }

    @Override
    public void enterJ_repeat_third_action(GrammarParser.J_repeat_third_actionContext ctx) {
        code.append(")\n");
    }

    @Override
    public void enterJ_choice_second_action(GrammarParser.J_choice_second_actionContext ctx) {
        printTabs();
        code.append("if () {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_third_action(GrammarParser.J_choice_third_actionContext ctx) {
        tabNumber--;
        printTabs();
        code.append("} else {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_fourth_action(GrammarParser.J_choice_fourth_actionContext ctx) {
        tabNumber--;
        printTabs();
        code.append("}\n");
    }

    @Override
    public void enterJ_initialization(GrammarParser.J_initializationContext ctx) {
        var childContext = ctx.getChild(0);
        separateChildrenWithSpace(childContext);
    }

    private void separateChildrenWithSpace(ParseTree context){
        var maxLastChildIndex = context.getChildCount() - 1;
        for (int i = 0; i < maxLastChildIndex; ++i) {
            code.append(context.getChild(i).getText()).append(" ");
        }
        code.append(context.getChild(maxLastChildIndex).getText());
    }

    @Override
    public void enterJ_arg_universal(GrammarParser.J_arg_universalContext ctx) {
        printTabs();
        if (ctx.J_ARG_CODE_BLOCK() != null){
            code.append(ctx.J_ARG_CODE_BLOCK().getText().replace(CODE_BLOCK_SIGN,""));
            code.append("\n");
        }
    }

    @Override
    public void enterJ_loop_first_action(GrammarParser.J_loop_first_actionContext ctx) {
        super.enterJ_loop_first_action(ctx);
    }

    @Override
    public void exitJ_loop_first_action(GrammarParser.J_loop_first_actionContext ctx) {
        super.exitJ_loop_first_action(ctx);
    }

    @Override
    public void enterJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx) {
        code.append("while (");
    }

    @Override
    public void exitJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx) {
        code.append(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        super.enterJ_loop_third_action(ctx);
    }

    @Override
    public void exitJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        code.append("}\n");
        tabNumber--;
    }

    @Override
    public void enterJ_loop_fourth_action(GrammarParser.J_loop_fourth_actionContext ctx) {
        super.enterJ_loop_fourth_action(ctx);
    }

    @Override
    public void exitJ_loop_fourth_action(GrammarParser.J_loop_fourth_actionContext ctx) {
        super.exitJ_loop_fourth_action(ctx);
    }


    @Override
    public void enterJ_para_first_action(GrammarParser.J_para_first_actionContext ctx) {
        super.enterJ_para_first_action(ctx);
    }

    @Override
    public void exitJ_para_first_action(GrammarParser.J_para_first_actionContext ctx) {
        super.exitJ_para_first_action(ctx);
    }

    @Override
    public void enterJ_para_second_action(GrammarParser.J_para_second_actionContext ctx) {
        code.append("Runnable first_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_second_action(GrammarParser.J_para_second_actionContext ctx) {
        code.append("};\n");
        tabNumber--;
    }

    @Override
    public void enterJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        code.append("Runnable second_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        code.append("};\n");
        tabNumber--;
        code.append("first_runnable.start();\n");
        code.append("second_runnable.start();\n");
    }

    @Override
    public void enterJ_para_fourth_action(GrammarParser.J_para_fourth_actionContext ctx) {
        super.enterJ_para_fourth_action(ctx);
    }

    @Override
    public void exitJ_para_fourth_action(GrammarParser.J_para_fourth_actionContext ctx) {
        super.exitJ_para_fourth_action(ctx);
    }

    @Override
    public void enterJ_cond_first_arg(GrammarParser.J_cond_first_argContext ctx) {
        code.append("if (");
    }

    @Override
    public void exitJ_cond_first_arg(GrammarParser.J_cond_first_argContext ctx) {
        code.append(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        code.append("} else {\n");
    }

    @Override
    public void exitJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        code.append("}\n");
        tabNumber--;
    }

    @Override
    public void enterJ_line(GrammarParser.J_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitJ_line(GrammarParser.J_lineContext ctx) {
        code.append(";\n");
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred){
            System.out.println(code);
        }
    }
}
