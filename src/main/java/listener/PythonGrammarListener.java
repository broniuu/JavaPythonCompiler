package listener;

import gen.GrammarBaseListener;
import gen.GrammarParser;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import tree.mainNode.MainNode;
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
    public void enterP_function_call(GrammarParser.P_function_callContext ctx) {
        int numberOfArguments = ctx.p_args() == null ? 0 : ctx.p_args().p_arg().size();
        String functionName = ctx.ID().getText();
        pythonMainNode.addCustomFunctionJavaNode(functionName, numberOfArguments);
    }

    @Override
    public void enterP_function_declaration(GrammarParser.P_function_declarationContext ctx) {
        String functionType = ctx.p_function_type() == null ? "" : ctx.p_function_type().ID().getText();
        String functionName  = ctx.ID().getText();
        pythonMainNode.addEmptyFunctionDeclaration();
        pythonMainNode.setLastFunctionTypeAndName(functionType, functionName);
    }

    @Override
    public void enterP_params(GrammarParser.P_paramsContext ctx) {
        ctx.ID().forEach(x -> {
            pythonMainNode.addParamToLastFunction(x.getText());
        });
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
