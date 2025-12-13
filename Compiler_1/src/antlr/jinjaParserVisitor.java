// Generated from D:/UY Things/Compiler/Compiler_1/src/antlr/jinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link jinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface jinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link jinjaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(jinjaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#text_or_eval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText_or_eval(jinjaParser.Text_or_evalContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(jinjaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(jinjaParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqInt(jinjaParser.EqIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqPar(jinjaParser.EqParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqAdd(jinjaParser.EqAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqVar(jinjaParser.EqVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqMul(jinjaParser.EqMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqString(jinjaParser.EqStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqDouble(jinjaParser.EqDoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBoolPar(jinjaParser.EqBoolParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpr(jinjaParser.RelationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolEq(jinjaParser.BoolEqContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqBool(jinjaParser.EqBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#evaluation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvaluation_statement(jinjaParser.Evaluation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(jinjaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_fragment(jinjaParser.If_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(jinjaParser.Elif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(jinjaParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_fragment(jinjaParser.Elif_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_fragment(jinjaParser.Else_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_fragment(jinjaParser.Endif_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(jinjaParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_fragment(jinjaParser.While_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndwhile_fragment(jinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(jinjaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#for_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_fragment(jinjaParser.For_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link jinjaParser#endfor_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndfor_fragment(jinjaParser.Endfor_fragmentContext ctx);
}