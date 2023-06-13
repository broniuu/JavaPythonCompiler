package proj.dfjm.javapythoncompiler.listeners;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import proj.dfjm.javapythoncompiler.antlr.GrammarBaseListener;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.PythonWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.nodes.RootASTNode;

public final class PythonGrammarListener extends GrammarCodeRetrievableListener {
    public PythonGrammarListener() {
        rootASTNode = new RootASTNode(new PythonWorkflowPatternBuilder());
    }

    @Override
    public void enterPCustomFunctionDeclaration(GrammarParser.PCustomFunctionDeclarationContext ctx) {
        rootASTNode.addEmptyCustomFunctionDeclarationASTNode();
        rootASTNode.setLastCustomFunctionReturnTypeAndName(
            ctx.pCustomFunctionDeclarationReturnType() != null
                ? ctx.pCustomFunctionDeclarationReturnType().ID().getText()
                : null,
            ctx.ID().getText()
        );
    }

    @Override
    public void enterPCustomFunctionDeclarationParams(GrammarParser.PCustomFunctionDeclarationParamsContext ctx) {
        for (TerminalNode id : ctx.ID()) {
            rootASTNode.addArgumentToLastCustomFunction(id.getText());
        }
    }

    @Override
    public void enterPSeq(GrammarParser.PSeqContext ctx) {
        if (!ctx.pSpecialFunctionParam().isEmpty()) {
            rootASTNode.addSeqASTNode();
        }
    }

    @Override
    public void enterPBranch(GrammarParser.PBranchContext ctx) {
        rootASTNode.addBranchBranchReASTNode();
    }

    @Override
    public void enterPConcur(GrammarParser.PConcurContext ctx) {
        rootASTNode.addConcurASTNode();
    }

    @Override
    public void enterPConcurRe(GrammarParser.PConcurReContext ctx) {
        rootASTNode.addConcurReASTNode();
    }

    @Override
    public void enterPCond(GrammarParser.PCondContext ctx) {
        rootASTNode.addCondASTNode();
    }

    @Override
    public void enterPPara(GrammarParser.PParaContext ctx) {
        rootASTNode.addParaASTNode();
    }

    @Override
    public void enterPLoop(GrammarParser.PLoopContext ctx) {
        rootASTNode.addLoopASTNode();
    }

    @Override
    public void enterPChoice(GrammarParser.PChoiceContext ctx) {
        rootASTNode.addChoiceASTNode();
    }

    @Override
    public void enterPSeqSeq(GrammarParser.PSeqSeqContext ctx) {
        rootASTNode.addSeqSeqASTNode();
    }

    @Override
    public void enterPRepeat(GrammarParser.PRepeatContext ctx) {
        rootASTNode.addRepeatASTNode();
    }

    @Override
    public void enterPSpecialFunctionParam(GrammarParser.PSpecialFunctionParamContext ctx) {
        if (ctx.PYTHON_CODE_SNIPPET() != null) {
            rootASTNode.addSpecialFunctionParamASTNode(ctx.PYTHON_CODE_SNIPPET().getText());
        }
    }

    @Override
    public void enterPCondition(GrammarParser.PConditionContext ctx) {
        separateItemsWithWhitespaces(ctx);
    }

    @Override
    public void enterPCustomFunctionCall(GrammarParser.PCustomFunctionCallContext ctx) {
        rootASTNode.addCustomFunctionCallASTNode(
            ctx.ID().getText(),
            ctx.pCustomFunctionCallParams() != null
                ? ctx.pCustomFunctionCallParams().pCustomFunctionCallParam().size()
                : 0
        );
    }

    @Override
    public void enterPCustomFunctionCallParam(GrammarParser.PCustomFunctionCallParamContext ctx) {
        rootASTNode.addSpecialFunctionParamASTNode(ctx.getText());
    }

    private void separateItemsWithWhitespaces(ParseTree context) {
        StringBuilder internalStringBuilder = new StringBuilder();
        int lastChildIndex = context.getChildCount() - 1;

        for (int i = 0; i < lastChildIndex; i++) {
            internalStringBuilder.append(context.getChild(i).getText()).append(" ");
        }
        internalStringBuilder.append(context.getChild(lastChildIndex).getText());

        rootASTNode.addSpecialFunctionParamASTNode(internalStringBuilder.toString());
    }
}
