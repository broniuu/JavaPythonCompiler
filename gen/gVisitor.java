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
	 * Visit a parse tree produced by {@link gParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(gParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_params(gParser.J_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_param(gParser.J_paramContext ctx);
}