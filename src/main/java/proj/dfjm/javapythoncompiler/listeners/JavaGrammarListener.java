package proj.dfjm.javapythoncompiler.listeners;

import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.JavaWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.nodes.RootASTNode;
import proj.dfjm.javapythoncompiler.util.CommonUtilities;

public final class JavaGrammarListener extends GrammarCodeRetrievableListener {
    public JavaGrammarListener() {
        super(new RootASTNode(new JavaWorkflowPatternBuilder()));
    }

    @Override
    public void enterJCustomFunctionDeclaration(GrammarParser.JCustomFunctionDeclarationContext ctx) {
        rootASTNode.addEmptyCustomFunctionDeclaration();
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
        rootASTNode.addSpecialFunctionParamASTNode(CommonUtilities.separateElementsWithWhitespaces(ctx));
    }

    @Override
    public void enterJCheckedCustomFunctionCall(GrammarParser.JCheckedCustomFunctionCallContext ctx) {
        rootASTNode.addCustomFunctionCallASTNode(
            ctx.ID().getText(),
            ctx.jCheckedCustomFunctionCallParams() != null
                ? ctx.jCheckedCustomFunctionCallParams().jCheckedCustomFunctionCallParam().size()
                : 0
        );
    }

    @Override
    public void enterJCheckedCustomFunctionCallParam(GrammarParser.JCheckedCustomFunctionCallParamContext ctx) {
        rootASTNode.addSpecialFunctionParamASTNode(ctx.getText());
    }
}
