import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.Console;

public class PythonGrammarListener extends GrammarBaseListener {
    private final StringBuilder code = new StringBuilder();
    private boolean errorOccurred = false;
    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }
    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred){
            System.out.println(code);
        }
    }
}
