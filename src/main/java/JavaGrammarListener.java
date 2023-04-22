import codeBuilder.CodeStackBuilder;
import codeBuilder.ICodeStackBuilder;
import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;

public class JavaGrammarListener extends GrammarBaseListener {
    private ICodeStackBuilder currentCodeBuilder;
    private final ICodeStackBuilder branchIfCodeStackBuilder = new CodeStackBuilder();
    private final ICodeStackBuilder branchElseCodeStackBuilder = new CodeStackBuilder();
    private final ICodeStackBuilder branchConditionCodeStackBuilder = new CodeStackBuilder();
    private final ICodeStackBuilder baseCodeBuilder = new CodeStackBuilder();

    public JavaGrammarListener() {
        currentCodeBuilder = baseCodeBuilder;
    }

    private int tabNumber = 0;
    private final String CODE_BLOCK_SIGN = "`";
    private boolean errorOccurred = false;

    private void printTabs() {
        currentCodeBuilder.appendCode("\t".repeat(Math.max(0, tabNumber)));
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }

    @Override
    public void exitJ_repeat_first_action(GrammarParser.J_repeat_first_actionContext ctx) {
        printTabs();
        currentCodeBuilder.appendCode("do {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_repeat_second_action(GrammarParser.J_repeat_second_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.appendCode("} while(");
    }

    @Override
    public void enterJ_condition(GrammarParser.J_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
    }

    @Override
    public void enterJ_repeat_third_action(GrammarParser.J_repeat_third_actionContext ctx) {
        currentCodeBuilder.appendCode(")\n");
    }

    @Override
    public void enterJ_choice_second_action(GrammarParser.J_choice_second_actionContext ctx) {
        printTabs();
        currentCodeBuilder.appendCode("if () {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_third_action(GrammarParser.J_choice_third_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.appendCode("} else {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_fourth_action(GrammarParser.J_choice_fourth_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.appendCode("}\n");
    }

    @Override
    public void enterJ_initialization(GrammarParser.J_initializationContext ctx) {
        var childContext = ctx.getChild(0);
        separateChildrenWithSpace(childContext);
    }

    private void separateChildrenWithSpace(ParseTree context) {
        var maxLastChildIndex = context.getChildCount() - 1;
        for (int i = 0; i < maxLastChildIndex; ++i) {
            currentCodeBuilder.appendCode(context.getChild(i).getText()).appendCode(" ");
        }
        currentCodeBuilder.appendCode(context.getChild(maxLastChildIndex).getText());
    }

    @Override
    public void enterJ_arg_universal(GrammarParser.J_arg_universalContext ctx) {
        printTabs();
        if (ctx.J_ARG_CODE_BLOCK() != null) {
            currentCodeBuilder.appendCode(ctx.J_ARG_CODE_BLOCK().getText().replace(CODE_BLOCK_SIGN, ""));
            currentCodeBuilder.appendCode("\n");
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
        currentCodeBuilder.appendCode("while (");
    }

    @Override
    public void exitJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx) {
        currentCodeBuilder.appendCode(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        super.enterJ_loop_third_action(ctx);
    }

    @Override
    public void exitJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        currentCodeBuilder.appendCode("}\n");
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
        currentCodeBuilder.appendCode("Runnable first_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_second_action(GrammarParser.J_para_second_actionContext ctx) {
        currentCodeBuilder.appendCode("};\n");
        tabNumber--;
    }

    @Override
    public void enterJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        currentCodeBuilder.appendCode("Runnable second_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        currentCodeBuilder.appendCode("};\n");
        tabNumber--;
        currentCodeBuilder.appendCode("first_runnable.start();\n");
        currentCodeBuilder.appendCode("second_runnable.start();\n");
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
        currentCodeBuilder.appendCode("if (");
    }

    @Override
    public void exitJ_cond_first_arg(GrammarParser.J_cond_first_argContext ctx) {
        currentCodeBuilder.appendCode(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        currentCodeBuilder.appendCode("} else {\n");
    }

    @Override
    public void exitJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        currentCodeBuilder.appendCode("}\n");
        tabNumber--;
    }

    @Override
    public void enterJ_concur_second_arg(GrammarParser.J_concur_second_argContext ctx) {
        currentCodeBuilder.appendCode("new Thread(() -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_concur_second_arg(GrammarParser.J_concur_second_argContext ctx) {
        currentCodeBuilder.appendCode("}).start();\n");
        tabNumber--;
    }

    @Override
    public void enterJ_concur_third_arg(GrammarParser.J_concur_third_argContext ctx) {
        enterJ_concur_second_arg(null);
    }

    @Override
    public void exitJ_concur_third_arg(GrammarParser.J_concur_third_argContext ctx) {
        exitJ_concur_second_arg(null);
    }

    @Override
    public void enterJ_concurRe_first_arg(GrammarParser.J_concurRe_first_argContext ctx) {
        currentCodeBuilder.appendCode("{\n");
        currentCodeBuilder.appendCode("\tThread thread1 = new Thread(() -> {\n");
        tabNumber += 2;
    }

    @Override
    public void exitJ_concurRe_first_arg(GrammarParser.J_concurRe_first_argContext ctx) {
        currentCodeBuilder.appendCode("\t});\n\tthread1.start();\n");
    }

    @Override
    public void enterJ_concurRe_second_arg(GrammarParser.J_concurRe_second_argContext ctx) {
        currentCodeBuilder.appendCode("\tThread thread2 = new Thread(() -> {\n");
    }

    @Override
    public void exitJ_concurRe_second_arg(GrammarParser.J_concurRe_second_argContext ctx) {
        currentCodeBuilder.appendCode("\t});\n\tthread2.start();\n");
    }

    @Override
    public void enterJ_concurRe_third_arg(GrammarParser.J_concurRe_third_argContext ctx) {
        tabNumber--;
        currentCodeBuilder.appendCode(
                """
                        \ttry {
                        \t\tthread1.join();
                        \t\tthread2.join();
                        \t} catch (InterruptedException e) {
                        \t\te.printStackTrace();
                        \t}
                        """
        );
    }

    @Override
    public void exitJ_concurRe_third_arg(GrammarParser.J_concurRe_third_argContext ctx) {
        currentCodeBuilder.appendCode("}\n");
        tabNumber--;
    }

    @Override
    public void enterJ_branch_first_arg(GrammarParser.J_branch_first_argContext ctx) {
//        currentCodeBuilder.pushNewEmptyCode(); //
        currentCodeBuilder = branchConditionCodeStackBuilder;
        currentCodeBuilder.pushNewEmptyCode();
        printTabs();
        currentCodeBuilder.appendCode("if (");
    }

    @Override
    public void exitJ_branch_first_arg(GrammarParser.J_branch_first_argContext ctx) {
        currentCodeBuilder.appendCode(") { \n");
        tabNumber++;
    }

    @Override
    public void enterJ_branch_second_arg(GrammarParser.J_branch_second_argContext ctx) {
        currentCodeBuilder = branchIfCodeStackBuilder;
        currentCodeBuilder.pushNewEmptyCode();
        if (!branchConditionCodeStackBuilder.codeAboveStackIsNull())
            currentCodeBuilder.appendCode(branchConditionCodeStackBuilder.popCodeAboveStack());

    }

    @Override
    public void exitJ_branch_second_arg(GrammarParser.J_branch_second_argContext ctx) {
        currentCodeBuilder = branchElseCodeStackBuilder;
        currentCodeBuilder.pushNewEmptyCode();
    }

    @Override
    public void exitJ_branch_third_arg(GrammarParser.J_branch_third_argContext ctx) {
        currentCodeBuilder = baseCodeBuilder;
//        currentCodeBuilder = branchConditionCodeStackBuilder ;
    }

    @Override
    public void enterJ_branchRe_first_arg(GrammarParser.J_branchRe_first_argContext ctx) {
        tabNumber--;
//        branchIfCodeStackBuilder.appendCode(currentCodeBuilder.popCodeAboveStack());
        currentCodeBuilder.appendCode(branchIfCodeStackBuilder.popCodeAboveStack());
        tabNumber++;
    }

    @Override
    public void enterJ_branchRe_second_arg(GrammarParser.J_branchRe_second_argContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.appendCode("} else {\n")
                .appendCode(branchElseCodeStackBuilder.popCodeAboveStack());
        tabNumber++;
    }

    @Override
    public void exitJ_branchRe_second_arg(GrammarParser.J_branchRe_second_argContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.appendCode("}\n");
    }

    @Override
    public void enterJ_line(GrammarParser.J_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitJ_line(GrammarParser.J_lineContext ctx) {
        currentCodeBuilder.appendCode(";\n");
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred) {
            System.out.println(currentCodeBuilder);
        }
    }
}
