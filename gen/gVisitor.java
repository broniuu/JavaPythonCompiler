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
	 * Visit a parse tree produced by {@link gParser#p_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitP_declaration(gParser.P_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link gParser#j_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJ_type(gParser.J_typeContext ctx);
}