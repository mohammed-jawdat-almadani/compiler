// Generated from antlr/HtmlJinjaParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlJinjaParser}.
 */
public interface HtmlJinjaParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(HtmlJinjaParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(HtmlJinjaParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#block_open}.
	 * @param ctx the parse tree
	 */
	void enterBlock_open(HtmlJinjaParser.Block_openContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#block_open}.
	 * @param ctx the parse tree
	 */
	void exitBlock_open(HtmlJinjaParser.Block_openContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#block_close}.
	 * @param ctx the parse tree
	 */
	void enterBlock_close(HtmlJinjaParser.Block_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#block_close}.
	 * @param ctx the parse tree
	 */
	void exitBlock_close(HtmlJinjaParser.Block_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(HtmlJinjaParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(HtmlJinjaParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#extends_statement}.
	 * @param ctx the parse tree
	 */
	void enterExtends_statement(HtmlJinjaParser.Extends_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#extends_statement}.
	 * @param ctx the parse tree
	 */
	void exitExtends_statement(HtmlJinjaParser.Extends_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(HtmlJinjaParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(HtmlJinjaParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(HtmlJinjaParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(HtmlJinjaParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlJinjaParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HtmlJinjaParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HtmlJinjaParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(HtmlJinjaParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(HtmlJinjaParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(HtmlJinjaParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(HtmlJinjaParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(HtmlJinjaParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(HtmlJinjaParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void enterJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinjaComment}.
	 * @param ctx the parse tree
	 */
	void exitJinjaComment(HtmlJinjaParser.JinjaCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(HtmlJinjaParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(HtmlJinjaParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqInt(HtmlJinjaParser.EqIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqInt}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqInt(HtmlJinjaParser.EqIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqOr}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqOr(HtmlJinjaParser.EqOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqOr}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqOr(HtmlJinjaParser.EqOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqFilter}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqFilter(HtmlJinjaParser.EqFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqFilter}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqFilter(HtmlJinjaParser.EqFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNot}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqNot(HtmlJinjaParser.EqNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNot}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqNot(HtmlJinjaParser.EqNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNeg}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqNeg(HtmlJinjaParser.EqNegContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNeg}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqNeg(HtmlJinjaParser.EqNegContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqBool(HtmlJinjaParser.EqBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqBool}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqBool(HtmlJinjaParser.EqBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqIndex}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqIndex(HtmlJinjaParser.EqIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqIndex}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqIndex(HtmlJinjaParser.EqIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqId}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqId(HtmlJinjaParser.EqIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqId}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqId(HtmlJinjaParser.EqIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqAnd}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqAnd(HtmlJinjaParser.EqAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqAnd}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqAnd(HtmlJinjaParser.EqAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqString(HtmlJinjaParser.EqStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqString}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqString(HtmlJinjaParser.EqStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqAttr}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqAttr(HtmlJinjaParser.EqAttrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqAttr}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqAttr(HtmlJinjaParser.EqAttrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqTernary}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqTernary(HtmlJinjaParser.EqTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqTernary}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqTernary(HtmlJinjaParser.EqTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqDouble(HtmlJinjaParser.EqDoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqDouble}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqDouble(HtmlJinjaParser.EqDoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqNone}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqNone(HtmlJinjaParser.EqNoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqNone}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqNone(HtmlJinjaParser.EqNoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqPar(HtmlJinjaParser.EqParContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqPar}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqPar(HtmlJinjaParser.EqParContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqAdd(HtmlJinjaParser.EqAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqAdd}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqAdd(HtmlJinjaParser.EqAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqIs}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqIs(HtmlJinjaParser.EqIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqIs}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqIs(HtmlJinjaParser.EqIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqMul(HtmlJinjaParser.EqMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqMul}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqMul(HtmlJinjaParser.EqMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqConcat}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqConcat(HtmlJinjaParser.EqConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqConcat}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqConcat(HtmlJinjaParser.EqConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqCall}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqCall(HtmlJinjaParser.EqCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqCall}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqCall(HtmlJinjaParser.EqCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqCompare}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqCompare(HtmlJinjaParser.EqCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqCompare}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqCompare(HtmlJinjaParser.EqCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqIn}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqIn(HtmlJinjaParser.EqInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqIn}
	 * labeled alternative in {@link HtmlJinjaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqIn(HtmlJinjaParser.EqInContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(HtmlJinjaParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(HtmlJinjaParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code kwArgument}
	 * labeled alternative in {@link HtmlJinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterKwArgument(HtmlJinjaParser.KwArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code kwArgument}
	 * labeled alternative in {@link HtmlJinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitKwArgument(HtmlJinjaParser.KwArgumentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code posArgument}
	 * labeled alternative in {@link HtmlJinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterPosArgument(HtmlJinjaParser.PosArgumentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code posArgument}
	 * labeled alternative in {@link HtmlJinjaParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitPosArgument(HtmlJinjaParser.PosArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void enterJinja_statement(HtmlJinjaParser.Jinja_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#jinja_statement}.
	 * @param ctx the parse tree
	 */
	void exitJinja_statement(HtmlJinjaParser.Jinja_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_statement(HtmlJinjaParser.Assignment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#assignment_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_statement(HtmlJinjaParser.Assignment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HtmlJinjaParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HtmlJinjaParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void enterIf_fragment(HtmlJinjaParser.If_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#if_fragment}.
	 * @param ctx the parse tree
	 */
	void exitIf_fragment(HtmlJinjaParser.If_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(HtmlJinjaParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(HtmlJinjaParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElif_fragment(HtmlJinjaParser.Elif_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#elif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElif_fragment(HtmlJinjaParser.Elif_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(HtmlJinjaParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(HtmlJinjaParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void enterElse_fragment(HtmlJinjaParser.Else_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#else_fragment}.
	 * @param ctx the parse tree
	 */
	void exitElse_fragment(HtmlJinjaParser.Else_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndif_fragment(HtmlJinjaParser.Endif_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#endif_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndif_fragment(HtmlJinjaParser.Endif_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(HtmlJinjaParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(HtmlJinjaParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void enterWhile_fragment(HtmlJinjaParser.While_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#while_fragment}.
	 * @param ctx the parse tree
	 */
	void exitWhile_fragment(HtmlJinjaParser.While_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndwhile_fragment(HtmlJinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#endwhile_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndwhile_fragment(HtmlJinjaParser.Endwhile_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(HtmlJinjaParser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(HtmlJinjaParser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#for_fragment}.
	 * @param ctx the parse tree
	 */
	void enterFor_fragment(HtmlJinjaParser.For_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#for_fragment}.
	 * @param ctx the parse tree
	 */
	void exitFor_fragment(HtmlJinjaParser.For_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#for_target}.
	 * @param ctx the parse tree
	 */
	void enterFor_target(HtmlJinjaParser.For_targetContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#for_target}.
	 * @param ctx the parse tree
	 */
	void exitFor_target(HtmlJinjaParser.For_targetContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#endfor_fragment}.
	 * @param ctx the parse tree
	 */
	void enterEndfor_fragment(HtmlJinjaParser.Endfor_fragmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#endfor_fragment}.
	 * @param ctx the parse tree
	 */
	void exitEndfor_fragment(HtmlJinjaParser.Endfor_fragmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(HtmlJinjaParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(HtmlJinjaParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(HtmlJinjaParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(HtmlJinjaParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void enterTemplateContent(HtmlJinjaParser.TemplateContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#templateContent}.
	 * @param ctx the parse tree
	 */
	void exitTemplateContent(HtmlJinjaParser.TemplateContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlJinjaParser#htmlTagContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagContent(HtmlJinjaParser.HtmlTagContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlJinjaParser#htmlTagContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagContent(HtmlJinjaParser.HtmlTagContentContext ctx);
}