// Generated from D:/Compiler/Compiler_1/src/antlr/jinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link jinjaParser}.
 */
public interface jinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link jinjaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(jinjaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(jinjaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(jinjaParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(jinjaParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(jinjaParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(jinjaParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqInt(jinjaParser.EqIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqInt(jinjaParser.EqIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqPar(jinjaParser.EqParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqPar(jinjaParser.EqParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqAdd(jinjaParser.EqAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqAdd(jinjaParser.EqAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqVar(jinjaParser.EqVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqVar}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqVar(jinjaParser.EqVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqMul(jinjaParser.EqMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqMul(jinjaParser.EqMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqString(jinjaParser.EqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqString(jinjaParser.EqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqDouble(jinjaParser.EqDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link jinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqDouble(jinjaParser.EqDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqBoolPar(jinjaParser.EqBoolParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBoolPar}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqBoolPar(jinjaParser.EqBoolParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelationExpr(jinjaParser.RelationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relationExpr}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelationExpr(jinjaParser.RelationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolEq(jinjaParser.BoolEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolEq}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolEq(jinjaParser.BoolEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void enterEqBool(jinjaParser.EqBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link jinjaParser#boolean_expression}.
	 * @param ctx the parse tree
	 */
	void exitEqBool(jinjaParser.EqBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#evaluation_statement}.
	 * @param ctx the parse tree
	 */
	void enterEvaluation_statement(jinjaParser.Evaluation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#evaluation_statement}.
	 * @param ctx the parse tree
	 */
	void exitEvaluation_statement(jinjaParser.Evaluation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(jinjaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(jinjaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(jinjaParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(jinjaParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(jinjaParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(jinjaParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void enterIf_fragment(jinjaParser.If_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void exitIf_fragment(jinjaParser.If_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElif_fragment(jinjaParser.Elif_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElif_fragment(jinjaParser.Elif_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElse_fragment(jinjaParser.Else_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElse_fragment(jinjaParser.Else_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndif_fragment(jinjaParser.Endif_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndif_fragment(jinjaParser.Endif_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void enterCode_block(jinjaParser.Code_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#code_block}.
	 * @param ctx the parse tree
	 */
	void exitCode_block(jinjaParser.Code_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(jinjaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(jinjaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_fragment(jinjaParser.While_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_fragment(jinjaParser.While_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndwhile_fragment(jinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndwhile_fragment(jinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(jinjaParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(jinjaParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#contents}.
	 * @param ctx the parse tree
	 */
	void enterContents(jinjaParser.ContentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#contents}.
	 * @param ctx the parse tree
	 */
	void exitContents(jinjaParser.ContentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link jinjaParser#html_element}.
	 * @param ctx the parse tree
	 */
	void enterHtml_element(jinjaParser.Html_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link jinjaParser#html_element}.
	 * @param ctx the parse tree
	 */
	void exitHtml_element(jinjaParser.Html_elementContext ctx);
}