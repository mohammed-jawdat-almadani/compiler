// Generated from D:/Compiler_1/Compiler/Compiler_1/src/antlr/cssParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link cssParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface cssParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link cssParser#stylesheet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStylesheet(cssParser.StylesheetContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(cssParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#import_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_statement(cssParser.Import_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#namespace_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace_statement(cssParser.Namespace_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#namespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespacePrefix(cssParser.NamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#media}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMedia(cssParser.MediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQueryList(cssParser.MediaQueryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#mediaQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaQuery(cssParser.MediaQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#mediaType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaType(cssParser.MediaTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#mediaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaExpression(cssParser.MediaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#mediaFeature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMediaFeature(cssParser.MediaFeatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPage(cssParser.PageContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#pseudoPage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudoPage(cssParser.PseudoPageContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#selectorGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectorGroup(cssParser.SelectorGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelector(cssParser.SelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#combinator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinator(cssParser.CombinatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelectorSequence(cssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#typeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSelector(cssParser.TypeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeNamespacePrefix(cssParser.TypeNamespacePrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#elementName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementName(cssParser.ElementNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#universal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniversal(cssParser.UniversalContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(cssParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#attrib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrib(cssParser.AttribContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#pseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPseudo(cssParser.PseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#functionalPseudo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionalPseudo(cssParser.FunctionalPseudoContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(cssParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#negation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(cssParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#negationArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationArg(cssParser.NegationArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodOperator(cssParser.GoodOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadOperator(cssParser.BadOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoodProperty(cssParser.GoodPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadProperty(cssParser.BadPropertyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownRuleset(cssParser.KnownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownRuleset(cssParser.UnknownRulesetContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#declarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationList(cssParser.DeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownDeclaration(cssParser.KnownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDeclaration(cssParser.UnknownDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#prio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrio(cssParser.PrioContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(cssParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(cssParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownTerm(cssParser.KnownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownTerm(cssParser.UnknownTermContext ctx);
	/**
	 * Visit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBadTerm(cssParser.BadTermContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#function_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_(cssParser.Function_Context ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#dxImageTransform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDxImageTransform(cssParser.DxImageTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#hexcolor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexcolor(cssParser.HexcolorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(cssParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#percentage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPercentage(cssParser.PercentageContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(cssParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#unknownDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownDimension(cssParser.UnknownDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#any_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_(cssParser.Any_Context ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link cssParser#atRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownAtRule(cssParser.UnknownAtRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#unused}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnused(cssParser.UnusedContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(cssParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#nestedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedStatement(cssParser.NestedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#groupRuleBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupRuleBody(cssParser.GroupRuleBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsRule(cssParser.SupportsRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsCondition(cssParser.SupportsConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConditionInParens(cssParser.SupportsConditionInParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsNegation(cssParser.SupportsNegationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsConjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsConjunction(cssParser.SupportsConjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDisjunction(cssParser.SupportsDisjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSupportsDeclarationCondition(cssParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#generalEnclosed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneralEnclosed(cssParser.GeneralEnclosedContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(cssParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#var_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_(cssParser.Var_Context ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#calc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalc(cssParser.CalcContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#calcSum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcSum(cssParser.CalcSumContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#calcProduct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcProduct(cssParser.CalcProductContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#calcValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCalcValue(cssParser.CalcValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFaceRule(cssParser.FontFaceRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKnownFontFaceDeclaration(cssParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknownFontFaceDeclaration(cssParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#keyframesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframesRule(cssParser.KeyframesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeBlock(cssParser.KeyframeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyframeSelector(cssParser.KeyframeSelectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#viewport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewport(cssParser.ViewportContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#counterStyle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCounterStyle(cssParser.CounterStyleContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFeatureValuesRule(cssParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyNameList(cssParser.FontFamilyNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#fontFamilyName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFontFamilyName(cssParser.FontFamilyNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#featureValueBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueBlock(cssParser.FeatureValueBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#featureType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureType(cssParser.FeatureTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFeatureValueDefinition(cssParser.FeatureValueDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(cssParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link cssParser#ws}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWs(cssParser.WsContext ctx);
}