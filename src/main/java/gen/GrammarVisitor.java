package gen;// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava(GrammarParser.JavaContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#python}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPython(GrammarParser.PythonContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_line(GrammarParser.P_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_line(GrammarParser.J_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_function_call(GrammarParser.J_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_args(GrammarParser.J_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg(GrammarParser.J_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_function_call(GrammarParser.P_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_args(GrammarParser.P_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg(GrammarParser.P_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_declaration(GrammarParser.J_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_array_declaration(GrammarParser.J_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_initialization(GrammarParser.J_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_int_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_int_initialization(GrammarParser.J_int_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_string_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_string_initialization(GrammarParser.J_string_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_bool_initialization(GrammarParser.J_bool_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_float_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_float_initialization(GrammarParser.J_float_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_double_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_double_initialization(GrammarParser.J_double_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_char_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_char_initialization(GrammarParser.J_char_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_array_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_array_initialization(GrammarParser.J_array_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_assignment(GrammarParser.P_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_rhs_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_rhs_value(GrammarParser.P_rhs_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_string(GrammarParser.P_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_list(GrammarParser.P_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_type(GrammarParser.J_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_loop(GrammarParser.J_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(GrammarParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition_greater_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_greater_less(GrammarParser.Condition_greater_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_equal_unequal(GrammarParser.Condition_equal_unequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#incDecExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpression(GrammarParser.IncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_forloop(GrammarParser.P_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_exp(GrammarParser.P_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_range(GrammarParser.P_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_if(GrammarParser.J_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_condition(GrammarParser.J_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_if(GrammarParser.P_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_condition(GrammarParser.P_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_code_block(GrammarParser.J_arg_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_condition(GrammarParser.J_arg_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_function(GrammarParser.J_arg_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_special_function(GrammarParser.J_arg_special_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_arg_universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_universal(GrammarParser.J_arg_universalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_code_block(GrammarParser.P_arg_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_condition(GrammarParser.P_arg_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_function(GrammarParser.P_arg_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_special_function(GrammarParser.P_arg_special_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_arg_universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_universal(GrammarParser.P_arg_universalContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_seqSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_seqSeq(GrammarParser.J_seqSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_seqSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_seqSeq(GrammarParser.P_seqSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_choice(GrammarParser.J_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_choice(GrammarParser.P_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#p_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_repeat(GrammarParser.P_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#j_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_repeat(GrammarParser.J_repeatContext ctx);
}