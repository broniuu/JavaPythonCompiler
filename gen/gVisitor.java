// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link gParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface gVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link gParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(gParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#java}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJava(gParser.JavaContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#python}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPython(gParser.PythonContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_line(gParser.P_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_line(gParser.J_lineContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_function_call(gParser.J_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_args(gParser.J_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg(gParser.J_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_function_call(gParser.P_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_args(gParser.P_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg(gParser.P_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_declaration(gParser.J_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_array_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_array_declaration(gParser.J_array_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_initialization(gParser.J_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_int_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_int_initialization(gParser.J_int_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_string_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_string_initialization(gParser.J_string_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_bool_initialization(gParser.J_bool_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_float_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_float_initialization(gParser.J_float_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_double_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_double_initialization(gParser.J_double_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_char_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_char_initialization(gParser.J_char_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_array_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_array_initialization(gParser.J_array_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_assignment(gParser.P_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_rhs_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_rhs_value(gParser.P_rhs_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_string(gParser.P_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_list(gParser.P_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_type(gParser.J_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_loop(gParser.J_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(gParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#conditionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionStatement(gParser.ConditionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(gParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(gParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(gParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(gParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition_greater_less}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_greater_less(gParser.Condition_greater_lessContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_equal_unequal(gParser.Condition_equal_unequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#incDecExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncDecExpression(gParser.IncDecExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_forloop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_forloop(gParser.P_forloopContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_exp(gParser.P_expContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_range(gParser.P_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_if(gParser.J_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_condition(gParser.J_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_if(gParser.P_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_condition(gParser.P_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_code_block(gParser.J_arg_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_condition(gParser.J_arg_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_function(gParser.J_arg_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_special_function(gParser.J_arg_special_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_arg_universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_arg_universal(gParser.J_arg_universalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg_code_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_code_block(gParser.P_arg_code_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_condition(gParser.P_arg_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_function(gParser.P_arg_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_special_function(gParser.P_arg_special_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_arg_universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_arg_universal(gParser.P_arg_universalContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_seqSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_seqSeq(gParser.J_seqSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_seqSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_seqSeq(gParser.P_seqSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_choice(gParser.J_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_choice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_choice(gParser.P_choiceContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#p_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_repeat(gParser.P_repeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_repeat(gParser.J_repeatContext ctx);
}