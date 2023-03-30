// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link gParser}.
 */
public interface gListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link gParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(gParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(gParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#java}.
	 * @param ctx the parse tree
	 */
	void enterJava(gParser.JavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#java}.
	 * @param ctx the parse tree
	 */
	void exitJava(gParser.JavaContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#python}.
	 * @param ctx the parse tree
	 */
	void enterPython(gParser.PythonContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#python}.
	 * @param ctx the parse tree
	 */
	void exitPython(gParser.PythonContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_line}.
	 * @param ctx the parse tree
	 */
	void enterP_line(gParser.P_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_line}.
	 * @param ctx the parse tree
	 */
	void exitP_line(gParser.P_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_line}.
	 * @param ctx the parse tree
	 */
	void enterJ_line(gParser.J_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_line}.
	 * @param ctx the parse tree
	 */
	void exitJ_line(gParser.J_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void enterJ_function_call(gParser.J_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void exitJ_function_call(gParser.J_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_args}.
	 * @param ctx the parse tree
	 */
	void enterJ_args(gParser.J_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_args}.
	 * @param ctx the parse tree
	 */
	void exitJ_args(gParser.J_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg(gParser.J_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg(gParser.J_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_function_call}.
	 * @param ctx the parse tree
	 */
	void enterP_function_call(gParser.P_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_function_call}.
	 * @param ctx the parse tree
	 */
	void exitP_function_call(gParser.P_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_args}.
	 * @param ctx the parse tree
	 */
	void enterP_args(gParser.P_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_args}.
	 * @param ctx the parse tree
	 */
	void exitP_args(gParser.P_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg}.
	 * @param ctx the parse tree
	 */
	void enterP_arg(gParser.P_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg}.
	 * @param ctx the parse tree
	 */
	void exitP_arg(gParser.P_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJ_declaration(gParser.J_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJ_declaration(gParser.J_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJ_array_declaration(gParser.J_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJ_array_declaration(gParser.J_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_initialization(gParser.J_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_initialization(gParser.J_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_int_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_int_initialization(gParser.J_int_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_int_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_int_initialization(gParser.J_int_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_string_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_string_initialization(gParser.J_string_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_string_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_string_initialization(gParser.J_string_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_bool_initialization(gParser.J_bool_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_bool_initialization(gParser.J_bool_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_float_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_float_initialization(gParser.J_float_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_float_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_float_initialization(gParser.J_float_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_double_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_double_initialization(gParser.J_double_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_double_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_double_initialization(gParser.J_double_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_char_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_char_initialization(gParser.J_char_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_char_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_char_initialization(gParser.J_char_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_array_initialization(gParser.J_array_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_array_initialization(gParser.J_array_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_assignment}.
	 * @param ctx the parse tree
	 */
	void enterP_assignment(gParser.P_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_assignment}.
	 * @param ctx the parse tree
	 */
	void exitP_assignment(gParser.P_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_rhs_value}.
	 * @param ctx the parse tree
	 */
	void enterP_rhs_value(gParser.P_rhs_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_rhs_value}.
	 * @param ctx the parse tree
	 */
	void exitP_rhs_value(gParser.P_rhs_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_string}.
	 * @param ctx the parse tree
	 */
	void enterP_string(gParser.P_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_string}.
	 * @param ctx the parse tree
	 */
	void exitP_string(gParser.P_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_list}.
	 * @param ctx the parse tree
	 */
	void enterP_list(gParser.P_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_list}.
	 * @param ctx the parse tree
	 */
	void exitP_list(gParser.P_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_type}.
	 * @param ctx the parse tree
	 */
	void enterJ_type(gParser.J_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_type}.
	 * @param ctx the parse tree
	 */
	void exitJ_type(gParser.J_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_loop}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop(gParser.J_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_loop}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop(gParser.J_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(gParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(gParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(gParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(gParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(gParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(gParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(gParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(gParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(gParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(gParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(gParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(gParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(gParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(gParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(gParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(gParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(gParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(gParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition_greater_less}.
	 * @param ctx the parse tree
	 */
	void enterCondition_greater_less(gParser.Condition_greater_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition_greater_less}.
	 * @param ctx the parse tree
	 */
	void exitCondition_greater_less(gParser.Condition_greater_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 */
	void enterCondition_equal_unequal(gParser.Condition_equal_unequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 */
	void exitCondition_equal_unequal(gParser.Condition_equal_unequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpression(gParser.IncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpression(gParser.IncDecExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_forloop}.
	 * @param ctx the parse tree
	 */
	void enterP_forloop(gParser.P_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_forloop}.
	 * @param ctx the parse tree
	 */
	void exitP_forloop(gParser.P_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_exp}.
	 * @param ctx the parse tree
	 */
	void enterP_exp(gParser.P_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_exp}.
	 * @param ctx the parse tree
	 */
	void exitP_exp(gParser.P_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_range}.
	 * @param ctx the parse tree
	 */
	void enterP_range(gParser.P_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_range}.
	 * @param ctx the parse tree
	 */
	void exitP_range(gParser.P_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_if}.
	 * @param ctx the parse tree
	 */
	void enterJ_if(gParser.J_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_if}.
	 * @param ctx the parse tree
	 */
	void exitJ_if(gParser.J_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_condition}.
	 * @param ctx the parse tree
	 */
	void enterJ_condition(gParser.J_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_condition}.
	 * @param ctx the parse tree
	 */
	void exitJ_condition(gParser.J_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_if}.
	 * @param ctx the parse tree
	 */
	void enterP_if(gParser.P_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_if}.
	 * @param ctx the parse tree
	 */
	void exitP_if(gParser.P_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_condition}.
	 * @param ctx the parse tree
	 */
	void enterP_condition(gParser.P_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_condition}.
	 * @param ctx the parse tree
	 */
	void exitP_condition(gParser.P_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg_code_block}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_code_block(gParser.J_arg_code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg_code_block}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_code_block(gParser.J_arg_code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg_condition}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_condition(gParser.J_arg_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg_condition}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_condition(gParser.J_arg_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg_function}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_function(gParser.J_arg_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg_function}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_function(gParser.J_arg_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_special_function(gParser.J_arg_special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_special_function(gParser.J_arg_special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_arg_universal}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_universal(gParser.J_arg_universalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_arg_universal}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_universal(gParser.J_arg_universalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg_code_block}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_code_block(gParser.P_arg_code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg_code_block}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_code_block(gParser.P_arg_code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg_condition}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_condition(gParser.P_arg_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg_condition}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_condition(gParser.P_arg_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg_function}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_function(gParser.P_arg_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg_function}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_function(gParser.P_arg_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_special_function(gParser.P_arg_special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_special_function(gParser.P_arg_special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_arg_universal}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_universal(gParser.P_arg_universalContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_arg_universal}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_universal(gParser.P_arg_universalContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_seqSeq}.
	 * @param ctx the parse tree
	 */
	void enterJ_seqSeq(gParser.J_seqSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_seqSeq}.
	 * @param ctx the parse tree
	 */
	void exitJ_seqSeq(gParser.J_seqSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_seqSeq}.
	 * @param ctx the parse tree
	 */
	void enterP_seqSeq(gParser.P_seqSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_seqSeq}.
	 * @param ctx the parse tree
	 */
	void exitP_seqSeq(gParser.P_seqSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_choice}.
	 * @param ctx the parse tree
	 */
	void enterJ_choice(gParser.J_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_choice}.
	 * @param ctx the parse tree
	 */
	void exitJ_choice(gParser.J_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_choice}.
	 * @param ctx the parse tree
	 */
	void enterP_choice(gParser.P_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_choice}.
	 * @param ctx the parse tree
	 */
	void exitP_choice(gParser.P_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#p_repeat}.
	 * @param ctx the parse tree
	 */
	void enterP_repeat(gParser.P_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_repeat}.
	 * @param ctx the parse tree
	 */
	void exitP_repeat(gParser.P_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_repeat}.
	 * @param ctx the parse tree
	 */
	void enterJ_repeat(gParser.J_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_repeat}.
	 * @param ctx the parse tree
	 */
	void exitJ_repeat(gParser.J_repeatContext ctx);
}