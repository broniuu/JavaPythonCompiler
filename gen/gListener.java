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
}