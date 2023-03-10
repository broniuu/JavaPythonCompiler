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
	 * Enter a parse tree produced by {@link gParser#p_declaration}.
	 * @param ctx the parse tree
	 */
	void enterP_declaration(gParser.P_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#p_declaration}.
	 * @param ctx the parse tree
	 */
	void exitP_declaration(gParser.P_declarationContext ctx);
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
}