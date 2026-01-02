// Generated from D:/Compiler_1/Compiler/Compiler_1/src/antlr/cssParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link cssParser}.
 */
public interface cssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link cssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(cssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(cssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(cssParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(cssParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void enterImport_statement(cssParser.Import_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#import_statement}.
	 * @param ctx the parse tree
	 */
	void exitImport_statement(cssParser.Import_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#namespace_statement}.
	 * @param ctx the parse tree
	 */
	void enterNamespace_statement(cssParser.Namespace_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#namespace_statement}.
	 * @param ctx the parse tree
	 */
	void exitNamespace_statement(cssParser.Namespace_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterNamespacePrefix(cssParser.NamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#namespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitNamespacePrefix(cssParser.NamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#media}.
	 * @param ctx the parse tree
	 */
	void enterMedia(cssParser.MediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#media}.
	 * @param ctx the parse tree
	 */
	void exitMedia(cssParser.MediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(cssParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(cssParser.MediaQueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(cssParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(cssParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void enterMediaType(cssParser.MediaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void exitMediaType(cssParser.MediaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpression(cssParser.MediaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpression(cssParser.MediaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void enterMediaFeature(cssParser.MediaFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void exitMediaFeature(cssParser.MediaFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#page}.
	 * @param ctx the parse tree
	 */
	void enterPage(cssParser.PageContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#page}.
	 * @param ctx the parse tree
	 */
	void exitPage(cssParser.PageContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void enterPseudoPage(cssParser.PseudoPageContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#pseudoPage}.
	 * @param ctx the parse tree
	 */
	void exitPseudoPage(cssParser.PseudoPageContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(cssParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(cssParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(cssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(cssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(cssParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(cssParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelectorSequence(cssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#simpleSelectorSequence}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelectorSequence(cssParser.SimpleSelectorSequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void enterTypeSelector(cssParser.TypeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#typeSelector}.
	 * @param ctx the parse tree
	 */
	void exitTypeSelector(cssParser.TypeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void enterTypeNamespacePrefix(cssParser.TypeNamespacePrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#typeNamespacePrefix}.
	 * @param ctx the parse tree
	 */
	void exitTypeNamespacePrefix(cssParser.TypeNamespacePrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(cssParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(cssParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#universal}.
	 * @param ctx the parse tree
	 */
	void enterUniversal(cssParser.UniversalContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#universal}.
	 * @param ctx the parse tree
	 */
	void exitUniversal(cssParser.UniversalContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(cssParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(cssParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void enterAttrib(cssParser.AttribContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#attrib}.
	 * @param ctx the parse tree
	 */
	void exitAttrib(cssParser.AttribContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void enterPseudo(cssParser.PseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#pseudo}.
	 * @param ctx the parse tree
	 */
	void exitPseudo(cssParser.PseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void enterFunctionalPseudo(cssParser.FunctionalPseudoContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#functionalPseudo}.
	 * @param ctx the parse tree
	 */
	void exitFunctionalPseudo(cssParser.FunctionalPseudoContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(cssParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(cssParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#negation}.
	 * @param ctx the parse tree
	 */
	void enterNegation(cssParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#negation}.
	 * @param ctx the parse tree
	 */
	void exitNegation(cssParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void enterNegationArg(cssParser.NegationArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#negationArg}.
	 * @param ctx the parse tree
	 */
	void exitNegationArg(cssParser.NegationArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterGoodOperator(cssParser.GoodOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitGoodOperator(cssParser.GoodOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 */
	void enterBadOperator(cssParser.BadOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badOperator}
	 * labeled alternative in {@link cssParser#operator_}.
	 * @param ctx the parse tree
	 */
	void exitBadOperator(cssParser.BadOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterGoodProperty(cssParser.GoodPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code goodProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitGoodProperty(cssParser.GoodPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 */
	void enterBadProperty(cssParser.BadPropertyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badProperty}
	 * labeled alternative in {@link cssParser#property_}.
	 * @param ctx the parse tree
	 */
	void exitBadProperty(cssParser.BadPropertyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterKnownRuleset(cssParser.KnownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitKnownRuleset(cssParser.KnownRulesetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void enterUnknownRuleset(cssParser.UnknownRulesetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownRuleset}
	 * labeled alternative in {@link cssParser#ruleset}.
	 * @param ctx the parse tree
	 */
	void exitUnknownRuleset(cssParser.UnknownRulesetContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationList(cssParser.DeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#declarationList}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationList(cssParser.DeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownDeclaration(cssParser.KnownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownDeclaration(cssParser.KnownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownDeclaration(cssParser.UnknownDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownDeclaration}
	 * labeled alternative in {@link cssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownDeclaration(cssParser.UnknownDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#prio}.
	 * @param ctx the parse tree
	 */
	void enterPrio(cssParser.PrioContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#prio}.
	 * @param ctx the parse tree
	 */
	void exitPrio(cssParser.PrioContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(cssParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(cssParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(cssParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(cssParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterKnownTerm(cssParser.KnownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitKnownTerm(cssParser.KnownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterUnknownTerm(cssParser.UnknownTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitUnknownTerm(cssParser.UnknownTermContext ctx);
	/**
	 * Enter a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterBadTerm(cssParser.BadTermContext ctx);
	/**
	 * Exit a parse tree produced by the {@code badTerm}
	 * labeled alternative in {@link cssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitBadTerm(cssParser.BadTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#function_}.
	 * @param ctx the parse tree
	 */
	void enterFunction_(cssParser.Function_Context ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#function_}.
	 * @param ctx the parse tree
	 */
	void exitFunction_(cssParser.Function_Context ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void enterDxImageTransform(cssParser.DxImageTransformContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#dxImageTransform}.
	 * @param ctx the parse tree
	 */
	void exitDxImageTransform(cssParser.DxImageTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void enterHexcolor(cssParser.HexcolorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#hexcolor}.
	 * @param ctx the parse tree
	 */
	void exitHexcolor(cssParser.HexcolorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(cssParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(cssParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#percentage}.
	 * @param ctx the parse tree
	 */
	void enterPercentage(cssParser.PercentageContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#percentage}.
	 * @param ctx the parse tree
	 */
	void exitPercentage(cssParser.PercentageContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(cssParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(cssParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	void enterUnknownDimension(cssParser.UnknownDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#unknownDimension}.
	 * @param ctx the parse tree
	 */
	void exitUnknownDimension(cssParser.UnknownDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#any_}.
	 * @param ctx the parse tree
	 */
	void enterAny_(cssParser.Any_Context ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#any_}.
	 * @param ctx the parse tree
	 */
	void exitAny_(cssParser.Any_Context ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link cssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterUnknownAtRule(cssParser.UnknownAtRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownAtRule}
	 * labeled alternative in {@link cssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitUnknownAtRule(cssParser.UnknownAtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#unused}.
	 * @param ctx the parse tree
	 */
	void enterUnused(cssParser.UnusedContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#unused}.
	 * @param ctx the parse tree
	 */
	void exitUnused(cssParser.UnusedContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(cssParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(cssParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void enterNestedStatement(cssParser.NestedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#nestedStatement}.
	 * @param ctx the parse tree
	 */
	void exitNestedStatement(cssParser.NestedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void enterGroupRuleBody(cssParser.GroupRuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#groupRuleBody}.
	 * @param ctx the parse tree
	 */
	void exitGroupRuleBody(cssParser.GroupRuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void enterSupportsRule(cssParser.SupportsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void exitSupportsRule(cssParser.SupportsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsCondition(cssParser.SupportsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsCondition(cssParser.SupportsConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportsConditionInParens(cssParser.SupportsConditionInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsConditionInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportsConditionInParens(cssParser.SupportsConditionInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void enterSupportsNegation(cssParser.SupportsNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsNegation}.
	 * @param ctx the parse tree
	 */
	void exitSupportsNegation(cssParser.SupportsNegationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsConjunction(cssParser.SupportsConjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsConjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsConjunction(cssParser.SupportsConjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDisjunction(cssParser.SupportsDisjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsDisjunction}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDisjunction(cssParser.SupportsDisjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsDeclarationCondition(cssParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#supportsDeclarationCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsDeclarationCondition(cssParser.SupportsDeclarationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void enterGeneralEnclosed(cssParser.GeneralEnclosedContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#generalEnclosed}.
	 * @param ctx the parse tree
	 */
	void exitGeneralEnclosed(cssParser.GeneralEnclosedContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(cssParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(cssParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#var_}.
	 * @param ctx the parse tree
	 */
	void enterVar_(cssParser.Var_Context ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#var_}.
	 * @param ctx the parse tree
	 */
	void exitVar_(cssParser.Var_Context ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#calc}.
	 * @param ctx the parse tree
	 */
	void enterCalc(cssParser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#calc}.
	 * @param ctx the parse tree
	 */
	void exitCalc(cssParser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void enterCalcSum(cssParser.CalcSumContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#calcSum}.
	 * @param ctx the parse tree
	 */
	void exitCalcSum(cssParser.CalcSumContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void enterCalcProduct(cssParser.CalcProductContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#calcProduct}.
	 * @param ctx the parse tree
	 */
	void exitCalcProduct(cssParser.CalcProductContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void enterCalcValue(cssParser.CalcValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#calcValue}.
	 * @param ctx the parse tree
	 */
	void exitCalcValue(cssParser.CalcValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFaceRule(cssParser.FontFaceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFaceRule(cssParser.FontFaceRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterKnownFontFaceDeclaration(cssParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code knownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitKnownFontFaceDeclaration(cssParser.KnownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUnknownFontFaceDeclaration(cssParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unknownFontFaceDeclaration}
	 * labeled alternative in {@link cssParser#fontFaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUnknownFontFaceDeclaration(cssParser.UnknownFontFaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesRule(cssParser.KeyframesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesRule(cssParser.KeyframesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeBlock(cssParser.KeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeBlock(cssParser.KeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeSelector(cssParser.KeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeSelector(cssParser.KeyframeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#viewport}.
	 * @param ctx the parse tree
	 */
	void enterViewport(cssParser.ViewportContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#viewport}.
	 * @param ctx the parse tree
	 */
	void exitViewport(cssParser.ViewportContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void enterCounterStyle(cssParser.CounterStyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#counterStyle}.
	 * @param ctx the parse tree
	 */
	void exitCounterStyle(cssParser.CounterStyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFeatureValuesRule(cssParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#fontFeatureValuesRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFeatureValuesRule(cssParser.FontFeatureValuesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyNameList(cssParser.FontFamilyNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#fontFamilyNameList}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyNameList(cssParser.FontFamilyNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void enterFontFamilyName(cssParser.FontFamilyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#fontFamilyName}.
	 * @param ctx the parse tree
	 */
	void exitFontFamilyName(cssParser.FontFamilyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueBlock(cssParser.FeatureValueBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#featureValueBlock}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueBlock(cssParser.FeatureValueBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#featureType}.
	 * @param ctx the parse tree
	 */
	void enterFeatureType(cssParser.FeatureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#featureType}.
	 * @param ctx the parse tree
	 */
	void exitFeatureType(cssParser.FeatureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void enterFeatureValueDefinition(cssParser.FeatureValueDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#featureValueDefinition}.
	 * @param ctx the parse tree
	 */
	void exitFeatureValueDefinition(cssParser.FeatureValueDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(cssParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(cssParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link cssParser#ws}.
	 * @param ctx the parse tree
	 */
	void enterWs(cssParser.WsContext ctx);
	/**
	 * Exit a parse tree produced by {@link cssParser#ws}.
	 * @param ctx the parse tree
	 */
	void exitWs(cssParser.WsContext ctx);
}