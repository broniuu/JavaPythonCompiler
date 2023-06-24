package proj.dfjm.javapythoncompiler.listeners;

import org.antlr.v4.runtime.tree.ParseTree;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.JavaWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.nodes.RootASTNode;

public final class JavaGrammarListener extends GrammarCodeRetrievableListener {
    public JavaGrammarListener() {
        super(new RootASTNode(new JavaWorkflowPatternBuilder()));
    }

    @Override
    public void enterJCustomFunctionDeclaration(GrammarParser.JCustomFunctionDeclarationContext ctx) {
        rootASTNode.addEmptyCustomFunctionDeclarationASTNode();
        rootASTNode.setLastCustomFunctionReturnTypeAndName(ctx.functionReturnDataType().getText(), ctx.ID().getText());
    }

    @Override
    public void enterJCustomFunctionDeclarationParam(GrammarParser.JCustomFunctionDeclarationParamContext ctx) {
        rootASTNode.addArgumentToLastCustomFunction(ctx.variableDataType().getText() + " " + ctx.ID().getText());
    }

    @Override
    public void enterJSeq(GrammarParser.JSeqContext ctx) {
        if (!ctx.jSpecialFunctionParam().isEmpty()) {
            rootASTNode.addSeqASTNode();
        }
    }

    @Override
    public void enterJBranch(GrammarParser.JBranchContext ctx) {
        rootASTNode.addBranchBranchReASTNode();
    }

    @Override
    public void enterJConcur(GrammarParser.JConcurContext ctx) {
        rootASTNode.addConcurASTNode();
    }

    @Override
    public void enterJConcurRe(GrammarParser.JConcurReContext ctx) {
        rootASTNode.addConcurReASTNode();
    }

    @Override
    public void enterJCond(GrammarParser.JCondContext ctx) {
        rootASTNode.addCondASTNode();
    }

    @Override
    public void enterJPara(GrammarParser.JParaContext ctx) {
        rootASTNode.addParaASTNode();
    }

    @Override
    public void enterJLoop(GrammarParser.JLoopContext ctx) {
        rootASTNode.addLoopASTNode();
    }

    @Override
    public void enterJChoice(GrammarParser.JChoiceContext ctx) {
        rootASTNode.addChoiceASTNode();
    }

    @Override
    public void enterJSeqSeq(GrammarParser.JSeqSeqContext ctx) {
        rootASTNode.addSeqSeqASTNode();
    }

    @Override
    public void enterJRepeat(GrammarParser.JRepeatContext ctx) {
        rootASTNode.addRepeatASTNode();
    }

    @Override
    public void enterJAlt(GrammarParser.JAltContext ctx) {
        rootASTNode.addAltASTNode();
    }

    @Override
    public void enterJSpecialFunctionParam(GrammarParser.JSpecialFunctionParamContext ctx) {
        if (ctx.JAVA_CODE_SNIPPET() != null) {
            rootASTNode.addSpecialFunctionParamASTNode(ctx.JAVA_CODE_SNIPPET().getText());
        }
    }

    @Override
    public void enterJCondition(GrammarParser.JConditionContext ctx) {
        separateItemsWithWhitespaces(ctx);
    }

    @Override
    public void enterJCustomFunctionCall(GrammarParser.JCustomFunctionCallContext ctx) {
        rootASTNode.addCustomFunctionCallASTNode(
            ctx.ID().getText(),
            ctx.jCustomFunctionCallParams() != null
                ? ctx.jCustomFunctionCallParams().jCustomFunctionCallParam().size()
                : 0
        );
    }

    @Override
    public void enterJCustomFunctionCallParam(GrammarParser.JCustomFunctionCallParamContext ctx) {
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
