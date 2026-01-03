// Generated from C:/Users/NEW MSI/IdeaProjects/Flask-and-Jinja2-with-HTML-and-CSS7/Compiler_1/src/antlr/HtmlJinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlJinjaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlJinjaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(HtmlJinjaParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#block_open}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_open(HtmlJinjaParser.Block_openContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#block_close}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_close(HtmlJinjaParser.Block_closeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(HtmlJinjaParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#extends_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtends_statement(HtmlJinjaParser.Extends_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(HtmlJinjaParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(HtmlJinjaParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HtmlJinjaParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(HtmlJinjaParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(HtmlJinjaParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(HtmlJinjaParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(HtmlJinjaParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqInt(HtmlJinjaParser.EqIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqFilter}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqFilter(HtmlJinjaParser.EqFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqPar(HtmlJinjaParser.EqParContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqAdd(HtmlJinjaParser.EqAddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqIndex}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqIndex(HtmlJinjaParser.EqIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqId}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqId(HtmlJinjaParser.EqIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqMul(HtmlJinjaParser.EqMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqString(HtmlJinjaParser.EqStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqAttr}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqAttr(HtmlJinjaParser.EqAttrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqCompare}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCompare(HtmlJinjaParser.EqCompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqDouble(HtmlJinjaParser.EqDoubleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinja_statement(HtmlJinjaParser.Jinja_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_statement(HtmlJinjaParser.Assignment_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HtmlJinjaParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_fragment(HtmlJinjaParser.If_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_statement(HtmlJinjaParser.Elif_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif_fragment(HtmlJinjaParser.Elif_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(HtmlJinjaParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_fragment(HtmlJinjaParser.Else_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndif_fragment(HtmlJinjaParser.Endif_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(HtmlJinjaParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_fragment(HtmlJinjaParser.While_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndwhile_fragment(HtmlJinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#for_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_statement(HtmlJinjaParser.For_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#for_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_fragment(HtmlJinjaParser.For_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#for_target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_target(HtmlJinjaParser.For_targetContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#endfor_fragment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEndfor_fragment(HtmlJinjaParser.Endfor_fragmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(HtmlJinjaParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(HtmlJinjaParser.StyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#templateContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemplateContent(HtmlJinjaParser.TemplateContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlJinjaParser#htmlTagContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagContent(HtmlJinjaParser.HtmlTagContentContext ctx);
}