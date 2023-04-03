import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;

public class PythonGrammarListener extends GrammarBaseListener {
    private final StringBuilder code = new StringBuilder();
    private int tabNumber = 0;

    private void printTabs(){
        code.append("\t".repeat(Math.max(0, tabNumber)));
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
    public void enterP_line(GrammarParser.P_lineContext ctx) {
        printTabs();
    }

    @Override
    public void exitP_line(GrammarParser.P_lineContext ctx) {
        code.append("\n");
    }
    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        System.out.println(code);
    }
}
