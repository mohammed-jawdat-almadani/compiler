// Generated from D:/Compiler/Compiler_1/src/antlr/htmlParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link htmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface htmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlDocument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlDocument(htmlParser.HtmlDocumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#scriptletOrSeaWs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScriptletOrSeaWs(htmlParser.ScriptletOrSeaWsContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElements(htmlParser.HtmlElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlElement(htmlParser.HtmlElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(htmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(htmlParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlChardata}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlChardata(htmlParser.HtmlChardataContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlMisc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlMisc(htmlParser.HtmlMiscContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#htmlComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlComment(htmlParser.HtmlCommentContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(htmlParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link htmlParser#style}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyle(htmlParser.StyleContext ctx);
}