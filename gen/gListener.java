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
	 * Enter a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(gParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(gParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_params}.
	 * @param ctx the parse tree
	 */
	void enterJ_params(gParser.J_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_params}.
	 * @param ctx the parse tree
	 */
	void exitJ_params(gParser.J_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link gParser#j_param}.
	 * @param ctx the parse tree
	 */
	void enterJ_param(gParser.J_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link gParser#j_param}.
	 * @param ctx the parse tree
	 */
	void exitJ_param(gParser.J_paramContext ctx);
}