package listener;

import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import tree.mainNode.PythonMainNode;

import java.io.Console;

public class PythonGrammarListener extends GrammarBaseListener {
    private PythonMainNode pythonMainNode = new PythonMainNode();
    private boolean errorOccurred = false;
    @Override
    public void visitErrorNode(ErrorNode node) {
        errorOccurred = true;
    }

    @Override
    public void enterP_seq(GrammarParser.P_seqContext ctx) {
        pythonMainNode.addSeqNode();
    }

    @Override
    public void enterP_arg_universal(GrammarParser.P_arg_universalContext ctx) {
        if (ctx.P_ARG_CODE_BLOCK() != null) {
            pythonMainNode.addCodeBlockNodeToTree(ctx.P_ARG_CODE_BLOCK().getText());
        }
    }

    @Override
    public void exitProg(GrammarParser.ProgContext ctx) {
        if (!errorOccurred){
            System.out.println(pythonMainNode.getCode());
        }
    }
}
