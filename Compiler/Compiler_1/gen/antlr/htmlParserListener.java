// Generated from D:/Compiler/Compiler_1/src/antlr/htmlParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link htmlParser}.
 */
public interface htmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void enterHtmlDocument(htmlParser.HtmlDocumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 */
	void exitHtmlDocument(htmlParser.HtmlDocumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void enterScriptletOrSeaWs(htmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 */
	void exitScriptletOrSeaWs(htmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElements(htmlParser.HtmlElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlElements}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElements(htmlParser.HtmlElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(htmlParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(htmlParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void enterHtmlChardata(htmlParser.HtmlChardataContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 */
	void exitHtmlChardata(htmlParser.HtmlChardataContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void enterHtmlMisc(htmlParser.HtmlMiscContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 */
	void exitHtmlMisc(htmlParser.HtmlMiscContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void enterHtmlComment(htmlParser.HtmlCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#htmlComment}.
	 * @param ctx the parse tree
	 */
	void exitHtmlComment(htmlParser.HtmlCommentContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(htmlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(htmlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link htmlParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(htmlParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link htmlParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(htmlParser.StyleContext ctx);
}