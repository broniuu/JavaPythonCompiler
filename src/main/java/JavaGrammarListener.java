import gen.GrammarBaseListener;
import gen.GrammarParser;
import grammarNode.CodeBlockNode;
import grammarNode.GrammarNode;
import grammarNode.StartNode;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

public class JavaGrammarListener extends GrammarBaseListener {
    private StringBuilder currentCodeBuilder = new StringBuilder();
    private StartNode grammarNode = new StartNode();
    private int currentBranchNestingDegree = -1;

    private int tabNumber = 0;
    private final String CODE_BLOCK_SIGN = "`";
    private boolean errorOccurred = false;

    private void printTabs() {
        currentCodeBuilder.append("\t".repeat(Math.max(0, tabNumber)));
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }

    @Override
    public void exitJ_repeat_first_action(GrammarParser.J_repeat_first_actionContext ctx) {
        printTabs();
        currentCodeBuilder.append("do {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_repeat_second_action(GrammarParser.J_repeat_second_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.append("} while(");
    }

    @Override
    public void enterJ_condition(GrammarParser.J_conditionContext ctx) {

    }

    @Override
    public void enterJ_arg_condition(GrammarParser.J_arg_conditionContext ctx) {
        separateChildrenWithSpace(ctx);
    }

    @Override
    public void enterJ_repeat_third_action(GrammarParser.J_repeat_third_actionContext ctx) {
        currentCodeBuilder.append(")\n");
    }

    @Override
    public void enterJ_choice_second_action(GrammarParser.J_choice_second_actionContext ctx) {
        printTabs();
        currentCodeBuilder.append("if () {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_third_action(GrammarParser.J_choice_third_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.append("} else {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_choice_fourth_action(GrammarParser.J_choice_fourth_actionContext ctx) {
        tabNumber--;
        printTabs();
        currentCodeBuilder.append("}\n");
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
    public void enterJ_seq(GrammarParser.J_seqContext ctx) {
        if (ctx.children.stream().noneMatch(x -> x instanceof GrammarParser.J_branchesContext))
            grammarNode.addSeqNodeToTree();
    }

    @Override
    public void enterJ_branches(GrammarParser.J_branchesContext ctx) {
        grammarNode.addBranchBranchReNodeToTree();
    }

    @Override
    public void enterJ_arg_universal(GrammarParser.J_arg_universalContext ctx) {
        if (ctx.J_ARG_CODE_BLOCK() != null) {
            grammarNode.addCodeBlockNodeToTree(ctx.J_ARG_CODE_BLOCK().getText());
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
        currentCodeBuilder.append("while (");
    }

    @Override
    public void exitJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx) {
        currentCodeBuilder.append(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        super.enterJ_loop_third_action(ctx);
    }

    @Override
    public void exitJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx) {
        currentCodeBuilder.append("}\n");
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
        currentCodeBuilder.append("Runnable first_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_second_action(GrammarParser.J_para_second_actionContext ctx) {
        currentCodeBuilder.append("};\n");
        tabNumber--;
    }

    @Override
    public void enterJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        currentCodeBuilder.append("Runnable second_runnable = () -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_para_third_action(GrammarParser.J_para_third_actionContext ctx) {
        currentCodeBuilder.append("};\n");
        tabNumber--;
        currentCodeBuilder.append("first_runnable.start();\n");
        currentCodeBuilder.append("second_runnable.start();\n");
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
        currentCodeBuilder.append("if (");
    }

    @Override
    public void exitJ_cond_first_arg(GrammarParser.J_cond_first_argContext ctx) {
        currentCodeBuilder.append(") {\n");
        tabNumber++;
    }

    @Override
    public void enterJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        currentCodeBuilder.append("} else {\n");
    }

    @Override
    public void exitJ_cond_third_arg(GrammarParser.J_cond_third_argContext ctx) {
        currentCodeBuilder.append("}\n");
        tabNumber--;
    }

    @Override
    public void enterJ_concur_second_arg(GrammarParser.J_concur_second_argContext ctx) {
        currentCodeBuilder.append("new Thread(() -> {\n");
        tabNumber++;
    }

    @Override
    public void exitJ_concur_second_arg(GrammarParser.J_concur_second_argContext ctx) {
        currentCodeBuilder.append("}).start();\n");
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
        currentCodeBuilder.append("{\n");
        currentCodeBuilder.append("\tThread thread1 = new Thread(() -> {\n");
        tabNumber += 2;
    }

    @Override
    public void exitJ_concurRe_first_arg(GrammarParser.J_concurRe_first_argContext ctx) {
        currentCodeBuilder.append("\t});\n\tthread1.start();\n");
    }

    @Override
    public void enterJ_concurRe_second_arg(GrammarParser.J_concurRe_second_argContext ctx) {
        currentCodeBuilder.append("\tThread thread2 = new Thread(() -> {\n");
    }

    @Override
    public void exitJ_concurRe_second_arg(GrammarParser.J_concurRe_second_argContext ctx) {
        currentCodeBuilder.append("\t});\n\tthread2.start();\n");
    }

    @Override
    public void enterJ_concurRe_third_arg(GrammarParser.J_concurRe_third_argContext ctx) {
        tabNumber--;
        currentCodeBuilder.append(
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
    public void enterJ_line(GrammarParser.J_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitJ_line(GrammarParser.J_lineContext ctx) {
        currentCodeBuilder.append(";\n");
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred) {
            System.out.println(grammarNode.getCode());
        }
    }
}
