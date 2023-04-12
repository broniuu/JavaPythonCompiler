// Generated from C:/Users/dawpy/Documents/GitHub/JavaPythonCompiler/src/main/java\Grammar.g4 by ANTLR 4.12.0
package gen;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#java}.
	 * @param ctx the parse tree
	 */
	void enterJava(GrammarParser.JavaContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#java}.
	 * @param ctx the parse tree
	 */
	void exitJava(GrammarParser.JavaContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#python}.
	 * @param ctx the parse tree
	 */
	void enterPython(GrammarParser.PythonContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#python}.
	 * @param ctx the parse tree
	 */
	void exitPython(GrammarParser.PythonContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_line}.
	 * @param ctx the parse tree
	 */
	void enterP_line(GrammarParser.P_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_line}.
	 * @param ctx the parse tree
	 */
	void exitP_line(GrammarParser.P_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_line}.
	 * @param ctx the parse tree
	 */
	void enterJ_line(GrammarParser.J_lineContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_line}.
	 * @param ctx the parse tree
	 */
	void exitJ_line(GrammarParser.J_lineContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void enterJ_function_call(GrammarParser.J_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_function_call}.
	 * @param ctx the parse tree
	 */
	void exitJ_function_call(GrammarParser.J_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_args}.
	 * @param ctx the parse tree
	 */
	void enterJ_args(GrammarParser.J_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_args}.
	 * @param ctx the parse tree
	 */
	void exitJ_args(GrammarParser.J_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_arg}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg(GrammarParser.J_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_arg}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg(GrammarParser.J_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_function_call}.
	 * @param ctx the parse tree
	 */
	void enterP_function_call(GrammarParser.P_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_function_call}.
	 * @param ctx the parse tree
	 */
	void exitP_function_call(GrammarParser.P_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_args}.
	 * @param ctx the parse tree
	 */
	void enterP_args(GrammarParser.P_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_args}.
	 * @param ctx the parse tree
	 */
	void exitP_args(GrammarParser.P_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_arg}.
	 * @param ctx the parse tree
	 */
	void enterP_arg(GrammarParser.P_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_arg}.
	 * @param ctx the parse tree
	 */
	void exitP_arg(GrammarParser.P_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJ_declaration(GrammarParser.J_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJ_declaration(GrammarParser.J_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_array_declaration}.
	 * @param ctx the parse tree
	 */
	void enterJ_array_declaration(GrammarParser.J_array_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_array_declaration}.
	 * @param ctx the parse tree
	 */
	void exitJ_array_declaration(GrammarParser.J_array_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_initialization(GrammarParser.J_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_initialization(GrammarParser.J_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_int_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_int_initialization(GrammarParser.J_int_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_int_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_int_initialization(GrammarParser.J_int_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_string_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_string_initialization(GrammarParser.J_string_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_string_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_string_initialization(GrammarParser.J_string_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_bool_initialization(GrammarParser.J_bool_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_bool_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_bool_initialization(GrammarParser.J_bool_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_float_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_float_initialization(GrammarParser.J_float_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_float_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_float_initialization(GrammarParser.J_float_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_double_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_double_initialization(GrammarParser.J_double_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_double_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_double_initialization(GrammarParser.J_double_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_char_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_char_initialization(GrammarParser.J_char_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_char_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_char_initialization(GrammarParser.J_char_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_array_initialization}.
	 * @param ctx the parse tree
	 */
	void enterJ_array_initialization(GrammarParser.J_array_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_array_initialization}.
	 * @param ctx the parse tree
	 */
	void exitJ_array_initialization(GrammarParser.J_array_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_assignment}.
	 * @param ctx the parse tree
	 */
	void enterP_assignment(GrammarParser.P_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_assignment}.
	 * @param ctx the parse tree
	 */
	void exitP_assignment(GrammarParser.P_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_rhs_value}.
	 * @param ctx the parse tree
	 */
	void enterP_rhs_value(GrammarParser.P_rhs_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_rhs_value}.
	 * @param ctx the parse tree
	 */
	void exitP_rhs_value(GrammarParser.P_rhs_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_string}.
	 * @param ctx the parse tree
	 */
	void enterP_string(GrammarParser.P_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_string}.
	 * @param ctx the parse tree
	 */
	void exitP_string(GrammarParser.P_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_list}.
	 * @param ctx the parse tree
	 */
	void enterP_list(GrammarParser.P_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_list}.
	 * @param ctx the parse tree
	 */
	void exitP_list(GrammarParser.P_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_type}.
	 * @param ctx the parse tree
	 */
	void enterJ_type(GrammarParser.J_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_type}.
	 * @param ctx the parse tree
	 */
	void exitJ_type(GrammarParser.J_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loopFun}.
	 * @param ctx the parse tree
	 */
	void enterJ_loopFun(GrammarParser.J_loopFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loopFun}.
	 * @param ctx the parse tree
	 */
	void exitJ_loopFun(GrammarParser.J_loopFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(GrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(GrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(GrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionStatement(GrammarParser.ConditionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#conditionStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionStatement(GrammarParser.ConditionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(GrammarParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void enterBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#basicForStatement}.
	 * @param ctx the parse tree
	 */
	void exitBasicForStatement(GrammarParser.BasicForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(GrammarParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(GrammarParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(GrammarParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(GrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition_greater_less}.
	 * @param ctx the parse tree
	 */
	void enterCondition_greater_less(GrammarParser.Condition_greater_lessContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition_greater_less}.
	 * @param ctx the parse tree
	 */
	void exitCondition_greater_less(GrammarParser.Condition_greater_lessContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 */
	void enterCondition_equal_unequal(GrammarParser.Condition_equal_unequalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#condition_equal_unequal}.
	 * @param ctx the parse tree
	 */
	void exitCondition_equal_unequal(GrammarParser.Condition_equal_unequalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void enterIncDecExpression(GrammarParser.IncDecExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#incDecExpression}.
	 * @param ctx the parse tree
	 */
	void exitIncDecExpression(GrammarParser.IncDecExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_forloop}.
	 * @param ctx the parse tree
	 */
	void enterP_forloop(GrammarParser.P_forloopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_forloop}.
	 * @param ctx the parse tree
	 */
	void exitP_forloop(GrammarParser.P_forloopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_exp}.
	 * @param ctx the parse tree
	 */
	void enterP_exp(GrammarParser.P_expContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_exp}.
	 * @param ctx the parse tree
	 */
	void exitP_exp(GrammarParser.P_expContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_range}.
	 * @param ctx the parse tree
	 */
	void enterP_range(GrammarParser.P_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_range}.
	 * @param ctx the parse tree
	 */
	void exitP_range(GrammarParser.P_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_if}.
	 * @param ctx the parse tree
	 */
	void enterJ_if(GrammarParser.J_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_if}.
	 * @param ctx the parse tree
	 */
	void exitJ_if(GrammarParser.J_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_condition}.
	 * @param ctx the parse tree
	 */
	void enterJ_condition(GrammarParser.J_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_condition}.
	 * @param ctx the parse tree
	 */
	void exitJ_condition(GrammarParser.J_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_if}.
	 * @param ctx the parse tree
	 */
	void enterP_if(GrammarParser.P_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_if}.
	 * @param ctx the parse tree
	 */
	void exitP_if(GrammarParser.P_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_condition}.
	 * @param ctx the parse tree
	 */
	void enterP_condition(GrammarParser.P_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_condition}.
	 * @param ctx the parse tree
	 */
	void exitP_condition(GrammarParser.P_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_arg_condition}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_condition(GrammarParser.J_arg_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_arg_condition}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_condition(GrammarParser.J_arg_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_arg_function}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_function(GrammarParser.J_arg_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_arg_function}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_function(GrammarParser.J_arg_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_special_function(GrammarParser.J_arg_special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_special_function(GrammarParser.J_arg_special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_arg_universal}.
	 * @param ctx the parse tree
	 */
	void enterJ_arg_universal(GrammarParser.J_arg_universalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_arg_universal}.
	 * @param ctx the parse tree
	 */
	void exitJ_arg_universal(GrammarParser.J_arg_universalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_arg_condition}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_condition(GrammarParser.P_arg_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_arg_condition}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_condition(GrammarParser.P_arg_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_arg_function}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_function(GrammarParser.P_arg_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_arg_function}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_function(GrammarParser.P_arg_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_special_function(GrammarParser.P_arg_special_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_arg_special_function}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_special_function(GrammarParser.P_arg_special_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_arg_universal}.
	 * @param ctx the parse tree
	 */
	void enterP_arg_universal(GrammarParser.P_arg_universalContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_arg_universal}.
	 * @param ctx the parse tree
	 */
	void exitP_arg_universal(GrammarParser.P_arg_universalContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_seqSeq}.
	 * @param ctx the parse tree
	 */
	void enterJ_seqSeq(GrammarParser.J_seqSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_seqSeq}.
	 * @param ctx the parse tree
	 */
	void exitJ_seqSeq(GrammarParser.J_seqSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_seqSeq}.
	 * @param ctx the parse tree
	 */
	void enterP_seqSeq(GrammarParser.P_seqSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_seqSeq}.
	 * @param ctx the parse tree
	 */
	void exitP_seqSeq(GrammarParser.P_seqSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_choice}.
	 * @param ctx the parse tree
	 */
	void enterJ_choice(GrammarParser.J_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_choice}.
	 * @param ctx the parse tree
	 */
	void exitJ_choice(GrammarParser.J_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_choice_second_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_choice_second_action(GrammarParser.J_choice_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_choice_second_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_choice_second_action(GrammarParser.J_choice_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_choice_third_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_choice_third_action(GrammarParser.J_choice_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_choice_third_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_choice_third_action(GrammarParser.J_choice_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_choice_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_choice_fourth_action(GrammarParser.J_choice_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_choice_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_choice_fourth_action(GrammarParser.J_choice_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_choice}.
	 * @param ctx the parse tree
	 */
	void enterP_choice(GrammarParser.P_choiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_choice}.
	 * @param ctx the parse tree
	 */
	void exitP_choice(GrammarParser.P_choiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_choice_second_action}.
	 * @param ctx the parse tree
	 */
	void enterP_choice_second_action(GrammarParser.P_choice_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_choice_second_action}.
	 * @param ctx the parse tree
	 */
	void exitP_choice_second_action(GrammarParser.P_choice_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_choice_third_action}.
	 * @param ctx the parse tree
	 */
	void enterP_choice_third_action(GrammarParser.P_choice_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_choice_third_action}.
	 * @param ctx the parse tree
	 */
	void exitP_choice_third_action(GrammarParser.P_choice_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_choice_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterP_choice_fourth_action(GrammarParser.P_choice_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_choice_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitP_choice_fourth_action(GrammarParser.P_choice_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_repeat}.
	 * @param ctx the parse tree
	 */
	void enterP_repeat(GrammarParser.P_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_repeat}.
	 * @param ctx the parse tree
	 */
	void exitP_repeat(GrammarParser.P_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_repeat_first_action}.
	 * @param ctx the parse tree
	 */
	void enterP_repeat_first_action(GrammarParser.P_repeat_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_repeat_first_action}.
	 * @param ctx the parse tree
	 */
	void exitP_repeat_first_action(GrammarParser.P_repeat_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_repeat_second_action}.
	 * @param ctx the parse tree
	 */
	void enterP_repeat_second_action(GrammarParser.P_repeat_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_repeat_second_action}.
	 * @param ctx the parse tree
	 */
	void exitP_repeat_second_action(GrammarParser.P_repeat_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_repeat_third_action}.
	 * @param ctx the parse tree
	 */
	void enterP_repeat_third_action(GrammarParser.P_repeat_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_repeat_third_action}.
	 * @param ctx the parse tree
	 */
	void exitP_repeat_third_action(GrammarParser.P_repeat_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_repeat}.
	 * @param ctx the parse tree
	 */
	void enterJ_repeat(GrammarParser.J_repeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_repeat}.
	 * @param ctx the parse tree
	 */
	void exitJ_repeat(GrammarParser.J_repeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_repeat_first_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_repeat_first_action(GrammarParser.J_repeat_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_repeat_first_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_repeat_first_action(GrammarParser.J_repeat_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_repeat_second_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_repeat_second_action(GrammarParser.J_repeat_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_repeat_second_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_repeat_second_action(GrammarParser.J_repeat_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_repeat_third_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_repeat_third_action(GrammarParser.J_repeat_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_repeat_third_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_repeat_third_action(GrammarParser.J_repeat_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loop}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop(GrammarParser.J_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loop}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop(GrammarParser.J_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loop_first_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop_first_action(GrammarParser.J_loop_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loop_first_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop_first_action(GrammarParser.J_loop_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loop_second_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loop_second_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop_second_action(GrammarParser.J_loop_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loop_third_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loop_third_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop_third_action(GrammarParser.J_loop_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_loop_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_loop_fourth_action(GrammarParser.J_loop_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_loop_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_loop_fourth_action(GrammarParser.J_loop_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_loop}.
	 * @param ctx the parse tree
	 */
	void enterP_loop(GrammarParser.P_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_loop}.
	 * @param ctx the parse tree
	 */
	void exitP_loop(GrammarParser.P_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_loop_first_action}.
	 * @param ctx the parse tree
	 */
	void enterP_loop_first_action(GrammarParser.P_loop_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_loop_first_action}.
	 * @param ctx the parse tree
	 */
	void exitP_loop_first_action(GrammarParser.P_loop_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_loop_second_action}.
	 * @param ctx the parse tree
	 */
	void enterP_loop_second_action(GrammarParser.P_loop_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_loop_second_action}.
	 * @param ctx the parse tree
	 */
	void exitP_loop_second_action(GrammarParser.P_loop_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_loop_third_action}.
	 * @param ctx the parse tree
	 */
	void enterP_loop_third_action(GrammarParser.P_loop_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_loop_third_action}.
	 * @param ctx the parse tree
	 */
	void exitP_loop_third_action(GrammarParser.P_loop_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_loop_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterP_loop_fourth_action(GrammarParser.P_loop_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_loop_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitP_loop_fourth_action(GrammarParser.P_loop_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_para}.
	 * @param ctx the parse tree
	 */
	void enterJ_para(GrammarParser.J_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_para}.
	 * @param ctx the parse tree
	 */
	void exitJ_para(GrammarParser.J_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_para_first_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_para_first_action(GrammarParser.J_para_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_para_first_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_para_first_action(GrammarParser.J_para_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_para_second_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_para_second_action(GrammarParser.J_para_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_para_second_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_para_second_action(GrammarParser.J_para_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_para_third_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_para_third_action(GrammarParser.J_para_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_para_third_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_para_third_action(GrammarParser.J_para_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_para_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_para_fourth_action(GrammarParser.J_para_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_para_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_para_fourth_action(GrammarParser.J_para_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_para}.
	 * @param ctx the parse tree
	 */
	void enterP_para(GrammarParser.P_paraContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_para}.
	 * @param ctx the parse tree
	 */
	void exitP_para(GrammarParser.P_paraContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_para_first_action}.
	 * @param ctx the parse tree
	 */
	void enterP_para_first_action(GrammarParser.P_para_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_para_first_action}.
	 * @param ctx the parse tree
	 */
	void exitP_para_first_action(GrammarParser.P_para_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_para_second_action}.
	 * @param ctx the parse tree
	 */
	void enterP_para_second_action(GrammarParser.P_para_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_para_second_action}.
	 * @param ctx the parse tree
	 */
	void exitP_para_second_action(GrammarParser.P_para_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_para_third_action}.
	 * @param ctx the parse tree
	 */
	void enterP_para_third_action(GrammarParser.P_para_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_para_third_action}.
	 * @param ctx the parse tree
	 */
	void exitP_para_third_action(GrammarParser.P_para_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_para_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterP_para_fourth_action(GrammarParser.P_para_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_para_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitP_para_fourth_action(GrammarParser.P_para_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_cond}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond(GrammarParser.J_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_cond}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond(GrammarParser.J_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_cond_first_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond_first_action(GrammarParser.J_cond_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_cond_first_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond_first_action(GrammarParser.J_cond_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_cond_second_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond_second_action(GrammarParser.J_cond_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_cond_second_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond_second_action(GrammarParser.J_cond_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_cond_third_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond_third_action(GrammarParser.J_cond_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_cond_third_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond_third_action(GrammarParser.J_cond_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_cond_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterJ_cond_fourth_action(GrammarParser.J_cond_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_cond_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitJ_cond_fourth_action(GrammarParser.J_cond_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_cond}.
	 * @param ctx the parse tree
	 */
	void enterP_cond(GrammarParser.P_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_cond}.
	 * @param ctx the parse tree
	 */
	void exitP_cond(GrammarParser.P_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_cond_first_action}.
	 * @param ctx the parse tree
	 */
	void enterP_cond_first_action(GrammarParser.P_cond_first_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_cond_first_action}.
	 * @param ctx the parse tree
	 */
	void exitP_cond_first_action(GrammarParser.P_cond_first_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_cond_second_action}.
	 * @param ctx the parse tree
	 */
	void enterP_cond_second_action(GrammarParser.P_cond_second_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_cond_second_action}.
	 * @param ctx the parse tree
	 */
	void exitP_cond_second_action(GrammarParser.P_cond_second_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_cond_third_action}.
	 * @param ctx the parse tree
	 */
	void enterP_cond_third_action(GrammarParser.P_cond_third_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_cond_third_action}.
	 * @param ctx the parse tree
	 */
	void exitP_cond_third_action(GrammarParser.P_cond_third_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_cond_fourth_action}.
	 * @param ctx the parse tree
	 */
	void enterP_cond_fourth_action(GrammarParser.P_cond_fourth_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_cond_fourth_action}.
	 * @param ctx the parse tree
	 */
	void exitP_cond_fourth_action(GrammarParser.P_cond_fourth_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_seq}.
	 * @param ctx the parse tree
	 */
	void enterJ_seq(GrammarParser.J_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_seq}.
	 * @param ctx the parse tree
	 */
	void exitJ_seq(GrammarParser.J_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_seq}.
	 * @param ctx the parse tree
	 */
	void enterP_seq(GrammarParser.P_seqContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_seq}.
	 * @param ctx the parse tree
	 */
	void exitP_seq(GrammarParser.P_seqContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_branch}.
	 * @param ctx the parse tree
	 */
	void enterJ_branch(GrammarParser.J_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_branch}.
	 * @param ctx the parse tree
	 */
	void exitJ_branch(GrammarParser.J_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_branch}.
	 * @param ctx the parse tree
	 */
	void enterP_branch(GrammarParser.P_branchContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_branch}.
	 * @param ctx the parse tree
	 */
	void exitP_branch(GrammarParser.P_branchContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#j_branchRe}.
	 * @param ctx the parse tree
	 */
	void enterJ_branchRe(GrammarParser.J_branchReContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#j_branchRe}.
	 * @param ctx the parse tree
	 */
	void exitJ_branchRe(GrammarParser.J_branchReContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#p_branchRe}.
	 * @param ctx the parse tree
	 */
	void enterP_branchRe(GrammarParser.P_branchReContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#p_branchRe}.
	 * @param ctx the parse tree
	 */
	void exitP_branchRe(GrammarParser.P_branchReContext ctx);
}