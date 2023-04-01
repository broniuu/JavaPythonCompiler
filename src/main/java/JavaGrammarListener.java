import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.Console;

public class JavaGrammarListener extends GrammarBaseListener{
    private StringBuilder code = new StringBuilder();
    private int tabNumber = 0;
    private void printTabs(){
        for (int i = 0; i < tabNumber; ++i) {
            code.append("\t");
        }
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
    public void enterJ_line(GrammarParser.J_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitJ_line(GrammarParser.J_lineContext ctx) {
        code.append(";\n");
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        System.out.println(code);
    }
}
