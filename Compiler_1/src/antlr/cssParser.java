// Generated from D:/Compiler_1/Compiler/Compiler_1/src/antlr/cssParser.g4 by ANTLR 4.13.2
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class cssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMMENT=1, CHARSET=2, IMPORT=3, PAGE=4, MEDIA=5, NAMESPACE=6, FONT_FACE=7, 
		SUPPORTS=8, IMPORTANT=9, MEDIA_ONLY=10, NOT=11, AND=12, OR=13, AT_KEYWORD=14, 
		Keyframes=15, FROM=16, TO=17, Viewport=18, CounterStyle=19, FontFeatureValues=20, 
		PSEUDO_NOT=21, URL_=22, Var=23, FUNCTION_IDENT=24, Calc=25, EQUAL=26, 
		MULTI=27, DIVIDE=28, PLUS=29, MINUS=30, LSBRAC=31, RSBRAC=32, LPAREN=33, 
		RPAREN=34, LBRACE=35, RBRACE=36, SEMI=37, COLON=38, DOT=39, PIPE=40, UNDER_SCORE=41, 
		GREATER=42, COMMA=43, TILDE=44, PREFIX_MATCH=45, SUFFIX_MATCH=46, SUB_STR_MATCH=47, 
		ICLUDES=48, DASH_MATCH=49, HASH=50, URL=51, SPACE=52, CDO=53, CDC=54, 
		PERCENTAGE=55, UNICODE_RANGE=56, DIMENSION=57, UNKNOWN_DIME=58, DxImageTransform=59, 
		NUMBER=60, STRING=61, Variable=62, IDENT=63, UnexpectedCharacter=64;
	public static final int
		RULE_stylesheet = 0, RULE_charset = 1, RULE_import_statement = 2, RULE_namespace_statement = 3, 
		RULE_namespacePrefix = 4, RULE_media = 5, RULE_mediaQueryList = 6, RULE_mediaQuery = 7, 
		RULE_mediaType = 8, RULE_mediaExpression = 9, RULE_mediaFeature = 10, 
		RULE_page = 11, RULE_pseudoPage = 12, RULE_selectorGroup = 13, RULE_selector = 14, 
		RULE_combinator = 15, RULE_simpleSelectorSequence = 16, RULE_typeSelector = 17, 
		RULE_typeNamespacePrefix = 18, RULE_elementName = 19, RULE_universal = 20, 
		RULE_className = 21, RULE_attrib = 22, RULE_pseudo = 23, RULE_functionalPseudo = 24, 
		RULE_expression = 25, RULE_negation = 26, RULE_negationArg = 27, RULE_operator_ = 28, 
		RULE_property_ = 29, RULE_ruleset = 30, RULE_declarationList = 31, RULE_declaration = 32, 
		RULE_prio = 33, RULE_value = 34, RULE_expr = 35, RULE_term = 36, RULE_function_ = 37, 
		RULE_dxImageTransform = 38, RULE_hexcolor = 39, RULE_number = 40, RULE_percentage = 41, 
		RULE_dimension = 42, RULE_unknownDimension = 43, RULE_any_ = 44, RULE_atRule = 45, 
		RULE_unused = 46, RULE_block = 47, RULE_nestedStatement = 48, RULE_groupRuleBody = 49, 
		RULE_supportsRule = 50, RULE_supportsCondition = 51, RULE_supportsConditionInParens = 52, 
		RULE_supportsNegation = 53, RULE_supportsConjunction = 54, RULE_supportsDisjunction = 55, 
		RULE_supportsDeclarationCondition = 56, RULE_generalEnclosed = 57, RULE_url = 58, 
		RULE_var_ = 59, RULE_calc = 60, RULE_calcSum = 61, RULE_calcProduct = 62, 
		RULE_calcValue = 63, RULE_fontFaceRule = 64, RULE_fontFaceDeclaration = 65, 
		RULE_keyframesRule = 66, RULE_keyframeBlock = 67, RULE_keyframeSelector = 68, 
		RULE_viewport = 69, RULE_counterStyle = 70, RULE_fontFeatureValuesRule = 71, 
		RULE_fontFamilyNameList = 72, RULE_fontFamilyName = 73, RULE_featureValueBlock = 74, 
		RULE_featureType = 75, RULE_featureValueDefinition = 76, RULE_ident = 77, 
		RULE_ws = 78;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "charset", "import_statement", "namespace_statement", "namespacePrefix", 
			"media", "mediaQueryList", "mediaQuery", "mediaType", "mediaExpression", 
			"mediaFeature", "page", "pseudoPage", "selectorGroup", "selector", "combinator", 
			"simpleSelectorSequence", "typeSelector", "typeNamespacePrefix", "elementName", 
			"universal", "className", "attrib", "pseudo", "functionalPseudo", "expression", 
			"negation", "negationArg", "operator_", "property_", "ruleset", "declarationList", 
			"declaration", "prio", "value", "expr", "term", "function_", "dxImageTransform", 
			"hexcolor", "number", "percentage", "dimension", "unknownDimension", 
			"any_", "atRule", "unused", "block", "nestedStatement", "groupRuleBody", 
			"supportsRule", "supportsCondition", "supportsConditionInParens", "supportsNegation", 
			"supportsConjunction", "supportsDisjunction", "supportsDeclarationCondition", 
			"generalEnclosed", "url", "var_", "calc", "calcSum", "calcProduct", "calcValue", 
			"fontFaceRule", "fontFaceDeclaration", "keyframesRule", "keyframeBlock", 
			"keyframeSelector", "viewport", "counterStyle", "fontFeatureValuesRule", 
			"fontFamilyNameList", "fontFamilyName", "featureValueBlock", "featureType", 
			"featureValueDefinition", "ident", "ws"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'url('", 
			"'var('", null, "'calc('", "'='", "'*'", "'/'", "'+'", "'-'", "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "';'", "':'", "'.'", "'|'", "'_'", 
			"'>'", "','", "'~'", "'^='", "'$='", "'*='", "'~='", "'|='", null, null, 
			null, "'<!--'", "'-->'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "COMMENT", "CHARSET", "IMPORT", "PAGE", "MEDIA", "NAMESPACE", "FONT_FACE", 
			"SUPPORTS", "IMPORTANT", "MEDIA_ONLY", "NOT", "AND", "OR", "AT_KEYWORD", 
			"Keyframes", "FROM", "TO", "Viewport", "CounterStyle", "FontFeatureValues", 
			"PSEUDO_NOT", "URL_", "Var", "FUNCTION_IDENT", "Calc", "EQUAL", "MULTI", 
			"DIVIDE", "PLUS", "MINUS", "LSBRAC", "RSBRAC", "LPAREN", "RPAREN", "LBRACE", 
			"RBRACE", "SEMI", "COLON", "DOT", "PIPE", "UNDER_SCORE", "GREATER", "COMMA", 
			"TILDE", "PREFIX_MATCH", "SUFFIX_MATCH", "SUB_STR_MATCH", "ICLUDES", 
			"DASH_MATCH", "HASH", "URL", "SPACE", "CDO", "CDC", "PERCENTAGE", "UNICODE_RANGE", 
			"DIMENSION", "UNKNOWN_DIME", "DxImageTransform", "NUMBER", "STRING", 
			"Variable", "IDENT", "UnexpectedCharacter"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "cssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public cssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(cssParser.EOF, 0); }
		public List<CharsetContext> charset() {
			return getRuleContexts(CharsetContext.class);
		}
		public CharsetContext charset(int i) {
			return getRuleContext(CharsetContext.class,i);
		}
		public List<Import_statementContext> import_statement() {
			return getRuleContexts(Import_statementContext.class);
		}
		public Import_statementContext import_statement(int i) {
			return getRuleContext(Import_statementContext.class,i);
		}
		public List<Namespace_statementContext> namespace_statement() {
			return getRuleContexts(Namespace_statementContext.class);
		}
		public Namespace_statementContext namespace_statement(int i) {
			return getRuleContext(Namespace_statementContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<TerminalNode> COMMENT() { return getTokens(cssParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(cssParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(cssParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(cssParser.SPACE, i);
		}
		public List<TerminalNode> CDO() { return getTokens(cssParser.CDO); }
		public TerminalNode CDO(int i) {
			return getToken(cssParser.CDO, i);
		}
		public List<TerminalNode> CDC() { return getTokens(cssParser.CDC); }
		public TerminalNode CDC(int i) {
			return getToken(cssParser.CDC, i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			ws();
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CHARSET) {
				{
				{
				setState(159);
				charset();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) {
					{
					{
					setState(160);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(171);
				import_statement();
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) {
					{
					{
					setState(172);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(177);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAMESPACE) {
				{
				{
				setState(183);
				namespace_statement();
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) {
					{
					{
					setState(184);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5219951472086614608L) != 0)) {
				{
				{
				setState(195);
				nestedStatement();
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) {
					{
					{
					setState(196);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31525197391593474L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharsetContext extends ParserRuleContext {
		public TerminalNode CHARSET() { return getToken(cssParser.CHARSET, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public TerminalNode SEMI() { return getToken(cssParser.SEMI, 0); }
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_charset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(CHARSET);
			setState(210);
			ws();
			setState(211);
			match(STRING);
			setState(212);
			ws();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(213);
				match(SEMI);
				}
			}

			setState(216);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Import_statementContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(cssParser.IMPORT, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cssParser.SEMI, 0); }
		public Import_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterImport_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitImport_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitImport_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_statementContext import_statement() throws RecognitionException {
		Import_statementContext _localctx = new Import_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IMPORT);
			setState(219);
			ws();
			setState(222);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(220);
				match(STRING);
				}
				break;
			case URL_:
			case URL:
				{
				setState(221);
				url();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(224);
			ws();
			setState(225);
			mediaQueryList();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(226);
				match(SEMI);
				}
			}

			setState(229);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Namespace_statementContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(cssParser.NAMESPACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public NamespacePrefixContext namespacePrefix() {
			return getRuleContext(NamespacePrefixContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cssParser.SEMI, 0); }
		public Namespace_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNamespace_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNamespace_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNamespace_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Namespace_statementContext namespace_statement() throws RecognitionException {
		Namespace_statementContext _localctx = new Namespace_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_namespace_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(NAMESPACE);
			setState(232);
			ws();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854563840L) != 0)) {
				{
				setState(233);
				namespacePrefix();
				setState(234);
				ws();
				}
			}

			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(238);
				match(STRING);
				}
				break;
			case URL_:
			case URL:
				{
				setState(239);
				url();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(242);
			ws();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(243);
				match(SEMI);
				}
			}

			setState(246);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NamespacePrefixContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public NamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacePrefixContext namespacePrefix() throws RecognitionException {
		NamespacePrefixContext _localctx = new NamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_namespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaContext extends ParserRuleContext {
		public TerminalNode MEDIA() { return getToken(cssParser.MEDIA, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public MediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_media; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaContext media() throws RecognitionException {
		MediaContext _localctx = new MediaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_media);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(MEDIA);
			setState(251);
			ws();
			setState(252);
			mediaQueryList();
			setState(253);
			groupRuleBody();
			setState(254);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryListContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cssParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(256);
				mediaQuery();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(257);
					match(COMMA);
					setState(258);
					ws();
					setState(259);
					mediaQuery();
					}
					}
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(268);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(cssParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(cssParser.AND, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode MEDIA_ONLY() { return getToken(cssParser.MEDIA_ONLY, 0); }
		public TerminalNode NOT() { return getToken(cssParser.NOT, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaQuery);
		int _la;
		try {
			int _alt;
			setState(295);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case SPACE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(270);
					_la = _input.LA(1);
					if ( !(_la==MEDIA_ONLY || _la==NOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(273);
				ws();
				setState(274);
				mediaType();
				setState(275);
				ws();
				setState(282);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(276);
						match(AND);
						setState(277);
						ws();
						setState(278);
						mediaExpression();
						}
						} 
					}
					setState(284);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				mediaExpression();
				setState(292);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						match(AND);
						setState(287);
						ws();
						setState(288);
						mediaExpression();
						}
						} 
					}
					setState(294);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaTypeContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMediaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMediaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(LPAREN);
			setState(300);
			ws();
			setState(301);
			mediaFeature();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(302);
				match(COLON);
				setState(303);
				ws();
				setState(304);
				expr();
				}
			}

			setState(308);
			match(RPAREN);
			setState(309);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaFeatureContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitMediaFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitMediaFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			ident();
			setState(312);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PageContext extends ParserRuleContext {
		public TerminalNode PAGE() { return getToken(cssParser.PAGE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public PseudoPageContext pseudoPage() {
			return getRuleContext(PseudoPageContext.class,0);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cssParser.SEMI, i);
		}
		public PageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_page; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PageContext page() throws RecognitionException {
		PageContext _localctx = new PageContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_page);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(PAGE);
			setState(315);
			ws();
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(316);
				pseudoPage();
				}
			}

			setState(319);
			match(LBRACE);
			setState(320);
			ws();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683819269702656L) != 0)) {
				{
				setState(321);
				declaration();
				}
			}

			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(324);
				match(SEMI);
				setState(325);
				ws();
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683819269702656L) != 0)) {
					{
					setState(326);
					declaration();
					}
				}

				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(RBRACE);
			setState(335);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoPageContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PseudoPageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoPage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterPseudoPage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitPseudoPage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitPseudoPage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoPageContext pseudoPage() throws RecognitionException {
		PseudoPageContext _localctx = new PseudoPageContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pseudoPage);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(COLON);
			setState(338);
			ident();
			setState(339);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cssParser.COMMA, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			selector();
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(342);
				match(COMMA);
				setState(343);
				ws();
				setState(344);
				selector();
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorSequenceContext> simpleSelectorSequence() {
			return getRuleContexts(SimpleSelectorSequenceContext.class);
		}
		public SimpleSelectorSequenceContext simpleSelectorSequence(int i) {
			return getRuleContext(SimpleSelectorSequenceContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			simpleSelectorSequence();
			setState(352);
			ws();
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4525590396796928L) != 0)) {
				{
				{
				setState(353);
				combinator();
				setState(354);
				simpleSelectorSequence();
				setState(355);
				ws();
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(cssParser.PLUS, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode GREATER() { return getToken(cssParser.GREATER, 0); }
		public TerminalNode TILDE() { return getToken(cssParser.TILDE, 0); }
		public TerminalNode SPACE() { return getToken(cssParser.SPACE, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_combinator);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				match(PLUS);
				setState(363);
				ws();
				}
				break;
			case GREATER:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(GREATER);
				setState(365);
				ws();
				}
				break;
			case TILDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				match(TILDE);
				setState(367);
				ws();
				}
				break;
			case SPACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(368);
				match(SPACE);
				setState(369);
				ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorSequenceContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public List<TerminalNode> HASH() { return getTokens(cssParser.HASH); }
		public TerminalNode HASH(int i) {
			return getToken(cssParser.HASH, i);
		}
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public List<AttribContext> attrib() {
			return getRuleContexts(AttribContext.class);
		}
		public AttribContext attrib(int i) {
			return getRuleContext(AttribContext.class,i);
		}
		public List<PseudoContext> pseudo() {
			return getRuleContexts(PseudoContext.class);
		}
		public PseudoContext pseudo(int i) {
			return getRuleContext(PseudoContext.class,i);
		}
		public List<NegationContext> negation() {
			return getRuleContexts(NegationContext.class);
		}
		public NegationContext negation(int i) {
			return getRuleContext(NegationContext.class,i);
		}
		public SimpleSelectorSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelectorSequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSimpleSelectorSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSimpleSelectorSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSimpleSelectorSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorSequenceContext simpleSelectorSequence() throws RecognitionException {
		SimpleSelectorSequenceContext _localctx = new SimpleSelectorSequenceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_simpleSelectorSequence);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case MULTI:
			case PIPE:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(372);
					typeSelector();
					}
					break;
				case 2:
					{
					setState(373);
					universal();
					}
					break;
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1126726690144256L) != 0)) {
					{
					setState(381);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(376);
						match(HASH);
						}
						break;
					case DOT:
						{
						setState(377);
						className();
						}
						break;
					case LSBRAC:
						{
						setState(378);
						attrib();
						}
						break;
					case COLON:
						{
						setState(379);
						pseudo();
						}
						break;
					case PSEUDO_NOT:
						{
						setState(380);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(385);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case PSEUDO_NOT:
			case LSBRAC:
			case COLON:
			case DOT:
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(391); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case HASH:
						{
						setState(386);
						match(HASH);
						}
						break;
					case DOT:
						{
						setState(387);
						className();
						}
						break;
					case LSBRAC:
						{
						setState(388);
						attrib();
						}
						break;
					case COLON:
						{
						setState(389);
						pseudo();
						}
						break;
					case PSEUDO_NOT:
						{
						setState(390);
						negation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(393); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1126726690144256L) != 0) );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeSelectorContext extends ParserRuleContext {
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TypeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterTypeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitTypeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitTypeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSelectorContext typeSelector() throws RecognitionException {
		TypeSelectorContext _localctx = new TypeSelectorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_typeSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(397);
				typeNamespacePrefix();
				}
				break;
			}
			setState(400);
			elementName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeNamespacePrefixContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(cssParser.PIPE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode MULTI() { return getToken(cssParser.MULTI, 0); }
		public TypeNamespacePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeNamespacePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterTypeNamespacePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitTypeNamespacePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitTypeNamespacePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNamespacePrefixContext typeNamespacePrefix() throws RecognitionException {
		TypeNamespacePrefixContext _localctx = new TypeNamespacePrefixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_typeNamespacePrefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case IDENT:
				{
				setState(402);
				ident();
				}
				break;
			case MULTI:
				{
				setState(403);
				match(MULTI);
				}
				break;
			case PIPE:
				break;
			default:
				break;
			}
			setState(406);
			match(PIPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementNameContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UniversalContext extends ParserRuleContext {
		public TerminalNode MULTI() { return getToken(cssParser.MULTI, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public UniversalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_universal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUniversal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUniversal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUniversal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UniversalContext universal() throws RecognitionException {
		UniversalContext _localctx = new UniversalContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_universal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(410);
				typeNamespacePrefix();
				}
				break;
			}
			setState(413);
			match(MULTI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(cssParser.DOT, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(DOT);
			setState(416);
			ident();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttribContext extends ParserRuleContext {
		public TerminalNode LSBRAC() { return getToken(cssParser.LSBRAC, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public TerminalNode RSBRAC() { return getToken(cssParser.RSBRAC, 0); }
		public TypeNamespacePrefixContext typeNamespacePrefix() {
			return getRuleContext(TypeNamespacePrefixContext.class,0);
		}
		public TerminalNode PREFIX_MATCH() { return getToken(cssParser.PREFIX_MATCH, 0); }
		public TerminalNode SUFFIX_MATCH() { return getToken(cssParser.SUFFIX_MATCH, 0); }
		public TerminalNode SUB_STR_MATCH() { return getToken(cssParser.SUB_STR_MATCH, 0); }
		public TerminalNode EQUAL() { return getToken(cssParser.EQUAL, 0); }
		public TerminalNode ICLUDES() { return getToken(cssParser.ICLUDES, 0); }
		public TerminalNode DASH_MATCH() { return getToken(cssParser.DASH_MATCH, 0); }
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitAttrib(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitAttrib(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attrib);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(LSBRAC);
			setState(419);
			ws();
			setState(421);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(420);
				typeNamespacePrefix();
				}
				break;
			}
			setState(423);
			ident();
			setState(424);
			ws();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715601862656L) != 0)) {
				{
				setState(425);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1090715601862656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(426);
				ws();
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MEDIA_ONLY:
				case NOT:
				case AND:
				case OR:
				case FROM:
				case TO:
				case IDENT:
					{
					setState(427);
					ident();
					}
					break;
				case STRING:
					{
					setState(428);
					match(STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431);
				ws();
				}
			}

			setState(435);
			match(RSBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(cssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(cssParser.COLON, i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FunctionalPseudoContext functionalPseudo() {
			return getRuleContext(FunctionalPseudoContext.class,0);
		}
		public PseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoContext pseudo() throws RecognitionException {
		PseudoContext _localctx = new PseudoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pseudo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(COLON);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(438);
				match(COLON);
				}
			}

			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case IDENT:
				{
				setState(441);
				ident();
				}
				break;
			case FUNCTION_IDENT:
				{
				setState(442);
				functionalPseudo();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionalPseudoContext extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENT() { return getToken(cssParser.FUNCTION_IDENT, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public FunctionalPseudoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionalPseudo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFunctionalPseudo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFunctionalPseudo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFunctionalPseudo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionalPseudoContext functionalPseudo() throws RecognitionException {
		FunctionalPseudoContext _localctx = new FunctionalPseudoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionalPseudo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			match(FUNCTION_IDENT);
			setState(446);
			ws();
			setState(447);
			expression();
			setState(448);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(cssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(cssParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(cssParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(cssParser.MINUS, i);
		}
		public List<TerminalNode> DIMENSION() { return getTokens(cssParser.DIMENSION); }
		public TerminalNode DIMENSION(int i) {
			return getToken(cssParser.DIMENSION, i);
		}
		public List<TerminalNode> UNKNOWN_DIME() { return getTokens(cssParser.UNKNOWN_DIME); }
		public TerminalNode UNKNOWN_DIME(int i) {
			return getToken(cssParser.UNKNOWN_DIME, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(cssParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(cssParser.NUMBER, i);
		}
		public List<TerminalNode> STRING() { return getTokens(cssParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(cssParser.STRING, i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(457);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(450);
					match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(451);
					match(MINUS);
					}
					break;
				case DIMENSION:
					{
					setState(452);
					match(DIMENSION);
					}
					break;
				case UNKNOWN_DIME:
					{
					setState(453);
					match(UNKNOWN_DIME);
					}
					break;
				case NUMBER:
					{
					setState(454);
					match(NUMBER);
					}
					break;
				case STRING:
					{
					setState(455);
					match(STRING);
					}
					break;
				case MEDIA_ONLY:
				case NOT:
				case AND:
				case OR:
				case FROM:
				case TO:
				case IDENT:
					{
					setState(456);
					ident();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(459);
				ws();
				}
				}
				setState(462); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -5332261957195842560L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationContext extends ParserRuleContext {
		public TerminalNode PSEUDO_NOT() { return getToken(cssParser.PSEUDO_NOT, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NegationArgContext negationArg() {
			return getRuleContext(NegationArgContext.class,0);
		}
		public TerminalNode RSBRAC() { return getToken(cssParser.RSBRAC, 0); }
		public NegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationContext negation() throws RecognitionException {
		NegationContext _localctx = new NegationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(PSEUDO_NOT);
			setState(465);
			ws();
			setState(466);
			negationArg();
			setState(467);
			ws();
			setState(468);
			match(RSBRAC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NegationArgContext extends ParserRuleContext {
		public TypeSelectorContext typeSelector() {
			return getRuleContext(TypeSelectorContext.class,0);
		}
		public UniversalContext universal() {
			return getRuleContext(UniversalContext.class,0);
		}
		public TerminalNode HASH() { return getToken(cssParser.HASH, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public PseudoContext pseudo() {
			return getRuleContext(PseudoContext.class,0);
		}
		public NegationArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negationArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNegationArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNegationArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNegationArg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NegationArgContext negationArg() throws RecognitionException {
		NegationArgContext _localctx = new NegationArgContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_negationArg);
		try {
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				typeSelector();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(471);
				universal();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(472);
				match(HASH);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				className();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(474);
				attrib();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(475);
				pseudo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Operator_Context extends ParserRuleContext {
		public Operator_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_; }
	 
		public Operator_Context() { }
		public void copyFrom(Operator_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadOperatorContext extends Operator_Context {
		public TerminalNode EQUAL() { return getToken(cssParser.EQUAL, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public BadOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterBadOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitBadOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitBadOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodOperatorContext extends Operator_Context {
		public TerminalNode DIVIDE() { return getToken(cssParser.DIVIDE, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(cssParser.COMMA, 0); }
		public TerminalNode SPACE() { return getToken(cssParser.SPACE, 0); }
		public GoodOperatorContext(Operator_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterGoodOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitGoodOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitGoodOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Operator_Context operator_() throws RecognitionException {
		Operator_Context _localctx = new Operator_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_operator_);
		try {
			setState(486);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIVIDE:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				match(DIVIDE);
				setState(479);
				ws();
				}
				break;
			case COMMA:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				match(COMMA);
				setState(481);
				ws();
				}
				break;
			case SPACE:
				_localctx = new GoodOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(SPACE);
				setState(483);
				ws();
				}
				break;
			case EQUAL:
				_localctx = new BadOperatorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(484);
				match(EQUAL);
				setState(485);
				ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Property_Context extends ParserRuleContext {
		public Property_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_; }
	 
		public Property_Context() { }
		public void copyFrom(Property_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadPropertyContext extends Property_Context {
		public TerminalNode MULTI() { return getToken(cssParser.MULTI, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode UNDER_SCORE() { return getToken(cssParser.UNDER_SCORE, 0); }
		public BadPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterBadProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitBadProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitBadProperty(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GoodPropertyContext extends Property_Context {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode Variable() { return getToken(cssParser.Variable, 0); }
		public GoodPropertyContext(Property_Context ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterGoodProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitGoodProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitGoodProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_Context property_() throws RecognitionException {
		Property_Context _localctx = new Property_Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_property_);
		try {
			setState(497);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case IDENT:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(488);
				ident();
				setState(489);
				ws();
				}
				break;
			case Variable:
				_localctx = new GoodPropertyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				match(Variable);
				setState(492);
				ws();
				}
				break;
			case MULTI:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(493);
				match(MULTI);
				setState(494);
				ident();
				}
				break;
			case UNDER_SCORE:
				_localctx = new BadPropertyContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				match(UNDER_SCORE);
				setState(496);
				ident();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RulesetContext extends ParserRuleContext {
		public RulesetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ruleset; }
	 
		public RulesetContext() { }
		public void copyFrom(RulesetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownRulesetContext extends RulesetContext {
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public UnknownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownRulesetContext extends RulesetContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KnownRulesetContext(RulesetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKnownRuleset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKnownRuleset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKnownRuleset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesetContext ruleset() throws RecognitionException {
		RulesetContext _localctx = new RulesetContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_ruleset);
		int _la;
		try {
			setState(522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				_localctx = new KnownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				selectorGroup();
				setState(500);
				match(LBRACE);
				setState(501);
				ws();
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683681830749184L) != 0)) {
					{
					setState(502);
					declarationList();
					}
				}

				setState(505);
				match(RBRACE);
				setState(506);
				ws();
				}
				break;
			case 2:
				_localctx = new UnknownRulesetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5219953155851994112L) != 0)) {
					{
					{
					setState(508);
					any_();
					}
					}
					setState(513);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(514);
				match(LBRACE);
				setState(515);
				ws();
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683681830749184L) != 0)) {
					{
					setState(516);
					declarationList();
					}
				}

				setState(519);
				match(RBRACE);
				setState(520);
				ws();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationListContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cssParser.SEMI, i);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declarationList);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(524);
				match(SEMI);
				setState(525);
				ws();
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			declaration();
			setState(532);
			ws();
			setState(540);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(533);
					match(SEMI);
					setState(534);
					ws();
					setState(536);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(535);
						declaration();
						}
						break;
					}
					}
					} 
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownDeclarationContext extends DeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrioContext prio() {
			return getRuleContext(PrioContext.class,0);
		}
		public KnownDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKnownDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKnownDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKnownDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_declaration);
		int _la;
		try {
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new KnownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(543);
				property_();
				setState(544);
				match(COLON);
				setState(545);
				ws();
				setState(546);
				expr();
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IMPORTANT) {
					{
					setState(547);
					prio();
					}
				}

				}
				break;
			case 2:
				_localctx = new UnknownDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(550);
				property_();
				setState(551);
				match(COLON);
				setState(552);
				ws();
				setState(553);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrioContext extends ParserRuleContext {
		public TerminalNode IMPORTANT() { return getToken(cssParser.IMPORTANT, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PrioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterPrio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitPrio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitPrio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrioContext prio() throws RecognitionException {
		PrioContext _localctx = new PrioContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_prio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(IMPORTANT);
			setState(558);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> AT_KEYWORD() { return getTokens(cssParser.AT_KEYWORD); }
		public TerminalNode AT_KEYWORD(int i) {
			return getToken(cssParser.AT_KEYWORD, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(564); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(564);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEDIA_ONLY:
					case NOT:
					case AND:
					case OR:
					case FROM:
					case TO:
					case URL_:
					case FUNCTION_IDENT:
					case PLUS:
					case MINUS:
					case LSBRAC:
					case LPAREN:
					case COLON:
					case ICLUDES:
					case DASH_MATCH:
					case HASH:
					case URL:
					case PERCENTAGE:
					case UNICODE_RANGE:
					case DIMENSION:
					case UNKNOWN_DIME:
					case NUMBER:
					case STRING:
					case IDENT:
						{
						setState(560);
						any_();
						}
						break;
					case LBRACE:
						{
						setState(561);
						block();
						}
						break;
					case AT_KEYWORD:
						{
						setState(562);
						match(AT_KEYWORD);
						setState(563);
						ws();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(566); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<Operator_Context> operator_() {
			return getRuleContexts(Operator_Context.class);
		}
		public Operator_Context operator_(int i) {
			return getRuleContext(Operator_Context.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			term();
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4512396055937024L) != 0)) {
						{
						setState(569);
						operator_();
						}
					}

					setState(572);
					term();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BadTermContext extends TermContext {
		public DxImageTransformContext dxImageTransform() {
			return getRuleContext(DxImageTransformContext.class,0);
		}
		public BadTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterBadTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitBadTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitBadTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownTermContext extends TermContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public TerminalNode UNICODE_RANGE() { return getToken(cssParser.UNICODE_RANGE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public Var_Context var_() {
			return getRuleContext(Var_Context.class,0);
		}
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public HexcolorContext hexcolor() {
			return getRuleContext(HexcolorContext.class,0);
		}
		public CalcContext calc() {
			return getRuleContext(CalcContext.class,0);
		}
		public Function_Context function_() {
			return getRuleContext(Function_Context.class,0);
		}
		public KnownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKnownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKnownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKnownTerm(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownTermContext extends TermContext {
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public UnknownTermContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_term);
		try {
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(578);
				number();
				setState(579);
				ws();
				}
				break;
			case 2:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				percentage();
				setState(582);
				ws();
				}
				break;
			case 3:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(584);
				dimension();
				setState(585);
				ws();
				}
				break;
			case 4:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				match(STRING);
				setState(588);
				ws();
				}
				break;
			case 5:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(589);
				match(UNICODE_RANGE);
				setState(590);
				ws();
				}
				break;
			case 6:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(591);
				ident();
				setState(592);
				ws();
				}
				break;
			case 7:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(594);
				var_();
				}
				break;
			case 8:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				url();
				setState(596);
				ws();
				}
				break;
			case 9:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(598);
				hexcolor();
				}
				break;
			case 10:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(599);
				calc();
				}
				break;
			case 11:
				_localctx = new KnownTermContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(600);
				function_();
				}
				break;
			case 12:
				_localctx = new UnknownTermContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(601);
				unknownDimension();
				setState(602);
				ws();
				}
				break;
			case 13:
				_localctx = new BadTermContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(604);
				dxImageTransform();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_Context extends ParserRuleContext {
		public TerminalNode FUNCTION_IDENT() { return getToken(cssParser.FUNCTION_IDENT, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public Function_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFunction_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFunction_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFunction_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_Context function_() throws RecognitionException {
		Function_Context _localctx = new Function_Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_function_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(FUNCTION_IDENT);
			setState(608);
			ws();
			setState(609);
			expr();
			setState(610);
			match(RPAREN);
			setState(611);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DxImageTransformContext extends ParserRuleContext {
		public TerminalNode DxImageTransform() { return getToken(cssParser.DxImageTransform, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public DxImageTransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dxImageTransform; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterDxImageTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitDxImageTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitDxImageTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DxImageTransformContext dxImageTransform() throws RecognitionException {
		DxImageTransformContext _localctx = new DxImageTransformContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_dxImageTransform);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(DxImageTransform);
			setState(614);
			ws();
			setState(615);
			expr();
			setState(616);
			match(RPAREN);
			setState(617);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexcolorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(cssParser.HASH, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public HexcolorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexcolor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterHexcolor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitHexcolor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitHexcolor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexcolorContext hexcolor() throws RecognitionException {
		HexcolorContext _localctx = new HexcolorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_hexcolor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(HASH);
			setState(620);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(cssParser.NUMBER, 0); }
		public TerminalNode PLUS() { return getToken(cssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cssParser.MINUS, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(622);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(625);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PercentageContext extends ParserRuleContext {
		public TerminalNode PERCENTAGE() { return getToken(cssParser.PERCENTAGE, 0); }
		public TerminalNode PLUS() { return getToken(cssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cssParser.MINUS, 0); }
		public PercentageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_percentage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterPercentage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitPercentage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitPercentage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PercentageContext percentage() throws RecognitionException {
		PercentageContext _localctx = new PercentageContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_percentage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(627);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(630);
			match(PERCENTAGE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DimensionContext extends ParserRuleContext {
		public TerminalNode DIMENSION() { return getToken(cssParser.DIMENSION, 0); }
		public TerminalNode PLUS() { return getToken(cssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cssParser.MINUS, 0); }
		public DimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensionContext dimension() throws RecognitionException {
		DimensionContext _localctx = new DimensionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_dimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(632);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(635);
			match(DIMENSION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnknownDimensionContext extends ParserRuleContext {
		public TerminalNode UNKNOWN_DIME() { return getToken(cssParser.UNKNOWN_DIME, 0); }
		public TerminalNode PLUS() { return getToken(cssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(cssParser.MINUS, 0); }
		public UnknownDimensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknownDimension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownDimension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownDimension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownDimension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownDimensionContext unknownDimension() throws RecognitionException {
		UnknownDimensionContext _localctx = new UnknownDimensionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_unknownDimension);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(637);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(640);
			match(UNKNOWN_DIME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Any_Context extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public TerminalNode HASH() { return getToken(cssParser.HASH, 0); }
		public TerminalNode UNICODE_RANGE() { return getToken(cssParser.UNICODE_RANGE, 0); }
		public TerminalNode ICLUDES() { return getToken(cssParser.ICLUDES, 0); }
		public TerminalNode DASH_MATCH() { return getToken(cssParser.DASH_MATCH, 0); }
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public TerminalNode FUNCTION_IDENT() { return getToken(cssParser.FUNCTION_IDENT, 0); }
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public TerminalNode LSBRAC() { return getToken(cssParser.LSBRAC, 0); }
		public TerminalNode RSBRAC() { return getToken(cssParser.RSBRAC, 0); }
		public Any_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterAny_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitAny_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitAny_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_Context any_() throws RecognitionException {
		Any_Context _localctx = new Any_Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_any_);
		int _la;
		try {
			setState(708);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				ident();
				setState(643);
				ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(645);
				number();
				setState(646);
				ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(648);
				percentage();
				setState(649);
				ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(651);
				dimension();
				setState(652);
				ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(654);
				unknownDimension();
				setState(655);
				ws();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(657);
				match(STRING);
				setState(658);
				ws();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(659);
				url();
				setState(660);
				ws();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(662);
				match(HASH);
				setState(663);
				ws();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(664);
				match(UNICODE_RANGE);
				setState(665);
				ws();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(666);
				match(ICLUDES);
				setState(667);
				ws();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(668);
				match(DASH_MATCH);
				setState(669);
				ws();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(670);
				match(COLON);
				setState(671);
				ws();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(672);
				match(FUNCTION_IDENT);
				setState(673);
				ws();
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5192931386289062912L) != 0)) {
					{
					setState(676);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEDIA_ONLY:
					case NOT:
					case AND:
					case OR:
					case FROM:
					case TO:
					case URL_:
					case FUNCTION_IDENT:
					case PLUS:
					case MINUS:
					case LSBRAC:
					case LPAREN:
					case COLON:
					case ICLUDES:
					case DASH_MATCH:
					case HASH:
					case URL:
					case PERCENTAGE:
					case UNICODE_RANGE:
					case DIMENSION:
					case UNKNOWN_DIME:
					case NUMBER:
					case STRING:
					case IDENT:
						{
						setState(674);
						any_();
						}
						break;
					case AT_KEYWORD:
					case LBRACE:
					case SEMI:
					case CDO:
					case CDC:
						{
						setState(675);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(680);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				match(RPAREN);
				setState(682);
				ws();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(684);
				match(LPAREN);
				setState(685);
				ws();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5192931386289062912L) != 0)) {
					{
					setState(688);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEDIA_ONLY:
					case NOT:
					case AND:
					case OR:
					case FROM:
					case TO:
					case URL_:
					case FUNCTION_IDENT:
					case PLUS:
					case MINUS:
					case LSBRAC:
					case LPAREN:
					case COLON:
					case ICLUDES:
					case DASH_MATCH:
					case HASH:
					case URL:
					case PERCENTAGE:
					case UNICODE_RANGE:
					case DIMENSION:
					case UNKNOWN_DIME:
					case NUMBER:
					case STRING:
					case IDENT:
						{
						setState(686);
						any_();
						}
						break;
					case AT_KEYWORD:
					case LBRACE:
					case SEMI:
					case CDO:
					case CDC:
						{
						setState(687);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(692);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(693);
				match(RPAREN);
				setState(694);
				ws();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(696);
				match(LSBRAC);
				setState(697);
				ws();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5192931386289062912L) != 0)) {
					{
					setState(700);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MEDIA_ONLY:
					case NOT:
					case AND:
					case OR:
					case FROM:
					case TO:
					case URL_:
					case FUNCTION_IDENT:
					case PLUS:
					case MINUS:
					case LSBRAC:
					case LPAREN:
					case COLON:
					case ICLUDES:
					case DASH_MATCH:
					case HASH:
					case URL:
					case PERCENTAGE:
					case UNICODE_RANGE:
					case DIMENSION:
					case UNKNOWN_DIME:
					case NUMBER:
					case STRING:
					case IDENT:
						{
						setState(698);
						any_();
						}
						break;
					case AT_KEYWORD:
					case LBRACE:
					case SEMI:
					case CDO:
					case CDC:
						{
						setState(699);
						unused();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(705);
				match(RSBRAC);
				setState(706);
				ws();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
	 
		public AtRuleContext() { }
		public void copyFrom(AtRuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownAtRuleContext extends AtRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(cssParser.AT_KEYWORD, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cssParser.SEMI, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public UnknownAtRuleContext(AtRuleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_atRule);
		int _la;
		try {
			_localctx = new UnknownAtRuleContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			match(AT_KEYWORD);
			setState(711);
			ws();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5219953155851994112L) != 0)) {
				{
				{
				setState(712);
				any_();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(721);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(718);
				block();
				}
				break;
			case SEMI:
				{
				setState(719);
				match(SEMI);
				setState(720);
				ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnusedContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode AT_KEYWORD() { return getToken(cssParser.AT_KEYWORD, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(cssParser.SEMI, 0); }
		public TerminalNode CDO() { return getToken(cssParser.CDO, 0); }
		public TerminalNode CDC() { return getToken(cssParser.CDC, 0); }
		public UnusedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unused; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnused(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnused(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnused(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnusedContext unused() throws RecognitionException {
		UnusedContext _localctx = new UnusedContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_unused);
		try {
			setState(732);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(723);
				block();
				}
				break;
			case AT_KEYWORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
				match(AT_KEYWORD);
				setState(725);
				ws();
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(726);
				match(SEMI);
				setState(727);
				ws();
				}
				break;
			case CDO:
				enterOuterAlt(_localctx, 4);
				{
				setState(728);
				match(CDO);
				setState(729);
				ws();
				}
				break;
			case CDC:
				enterOuterAlt(_localctx, 5);
				{
				setState(730);
				match(CDC);
				setState(731);
				ws();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<DeclarationListContext> declarationList() {
			return getRuleContexts(DeclarationListContext.class);
		}
		public DeclarationListContext declarationList(int i) {
			return getRuleContext(DeclarationListContext.class,i);
		}
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> AT_KEYWORD() { return getTokens(cssParser.AT_KEYWORD); }
		public TerminalNode AT_KEYWORD(int i) {
			return getToken(cssParser.AT_KEYWORD, i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cssParser.SEMI, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(LBRACE);
			setState(735);
			ws();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -608263117197017680L) != 0)) {
				{
				setState(744);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(736);
					declarationList();
					}
					break;
				case 2:
					{
					setState(737);
					nestedStatement();
					}
					break;
				case 3:
					{
					setState(738);
					any_();
					}
					break;
				case 4:
					{
					setState(739);
					block();
					}
					break;
				case 5:
					{
					setState(740);
					match(AT_KEYWORD);
					setState(741);
					ws();
					}
					break;
				case 6:
					{
					setState(742);
					match(SEMI);
					setState(743);
					ws();
					}
					break;
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			match(RBRACE);
			setState(750);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NestedStatementContext extends ParserRuleContext {
		public RulesetContext ruleset() {
			return getRuleContext(RulesetContext.class,0);
		}
		public MediaContext media() {
			return getRuleContext(MediaContext.class,0);
		}
		public PageContext page() {
			return getRuleContext(PageContext.class,0);
		}
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public ViewportContext viewport() {
			return getRuleContext(ViewportContext.class,0);
		}
		public CounterStyleContext counterStyle() {
			return getRuleContext(CounterStyleContext.class,0);
		}
		public FontFeatureValuesRuleContext fontFeatureValuesRule() {
			return getRuleContext(FontFeatureValuesRuleContext.class,0);
		}
		public AtRuleContext atRule() {
			return getRuleContext(AtRuleContext.class,0);
		}
		public NestedStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterNestedStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitNestedStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitNestedStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedStatementContext nestedStatement() throws RecognitionException {
		NestedStatementContext _localctx = new NestedStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_nestedStatement);
		try {
			setState(762);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case PSEUDO_NOT:
			case URL_:
			case FUNCTION_IDENT:
			case MULTI:
			case PLUS:
			case MINUS:
			case LSBRAC:
			case LPAREN:
			case LBRACE:
			case COLON:
			case DOT:
			case PIPE:
			case ICLUDES:
			case DASH_MATCH:
			case HASH:
			case URL:
			case PERCENTAGE:
			case UNICODE_RANGE:
			case DIMENSION:
			case UNKNOWN_DIME:
			case NUMBER:
			case STRING:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(752);
				ruleset();
				}
				break;
			case MEDIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(753);
				media();
				}
				break;
			case PAGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(754);
				page();
				}
				break;
			case FONT_FACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(755);
				fontFaceRule();
				}
				break;
			case Keyframes:
				enterOuterAlt(_localctx, 5);
				{
				setState(756);
				keyframesRule();
				}
				break;
			case SUPPORTS:
				enterOuterAlt(_localctx, 6);
				{
				setState(757);
				supportsRule();
				}
				break;
			case Viewport:
				enterOuterAlt(_localctx, 7);
				{
				setState(758);
				viewport();
				}
				break;
			case CounterStyle:
				enterOuterAlt(_localctx, 8);
				{
				setState(759);
				counterStyle();
				}
				break;
			case FontFeatureValues:
				enterOuterAlt(_localctx, 9);
				{
				setState(760);
				fontFeatureValuesRule();
				}
				break;
			case AT_KEYWORD:
				enterOuterAlt(_localctx, 10);
				{
				setState(761);
				atRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupRuleBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<NestedStatementContext> nestedStatement() {
			return getRuleContexts(NestedStatementContext.class);
		}
		public NestedStatementContext nestedStatement(int i) {
			return getRuleContext(NestedStatementContext.class,i);
		}
		public GroupRuleBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupRuleBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterGroupRuleBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitGroupRuleBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitGroupRuleBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupRuleBodyContext groupRuleBody() throws RecognitionException {
		GroupRuleBodyContext _localctx = new GroupRuleBodyContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_groupRuleBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(764);
			match(LBRACE);
			setState(765);
			ws();
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5219951472086614608L) != 0)) {
				{
				{
				setState(766);
				nestedStatement();
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
			match(RBRACE);
			setState(773);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsRuleContext extends ParserRuleContext {
		public TerminalNode SUPPORTS() { return getToken(cssParser.SUPPORTS, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public GroupRuleBodyContext groupRuleBody() {
			return getRuleContext(GroupRuleBodyContext.class,0);
		}
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			match(SUPPORTS);
			setState(776);
			ws();
			setState(777);
			supportsCondition();
			setState(778);
			ws();
			setState(779);
			groupRuleBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConditionContext extends ParserRuleContext {
		public SupportsNegationContext supportsNegation() {
			return getRuleContext(SupportsNegationContext.class,0);
		}
		public SupportsConjunctionContext supportsConjunction() {
			return getRuleContext(SupportsConjunctionContext.class,0);
		}
		public SupportsDisjunctionContext supportsDisjunction() {
			return getRuleContext(SupportsDisjunctionContext.class,0);
		}
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_supportsCondition);
		try {
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				supportsNegation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(782);
				supportsConjunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(783);
				supportsDisjunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(784);
				supportsConditionInParens();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConditionInParensContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public SupportsDeclarationConditionContext supportsDeclarationCondition() {
			return getRuleContext(SupportsDeclarationConditionContext.class,0);
		}
		public GeneralEnclosedContext generalEnclosed() {
			return getRuleContext(GeneralEnclosedContext.class,0);
		}
		public SupportsConditionInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConditionInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsConditionInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsConditionInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsConditionInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionInParensContext supportsConditionInParens() throws RecognitionException {
		SupportsConditionInParensContext _localctx = new SupportsConditionInParensContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_supportsConditionInParens);
		try {
			setState(795);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(787);
				match(LPAREN);
				setState(788);
				ws();
				setState(789);
				supportsCondition();
				setState(790);
				ws();
				setState(791);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				supportsDeclarationCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(794);
				generalEnclosed();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsNegationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(cssParser.NOT, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode SPACE() { return getToken(cssParser.SPACE, 0); }
		public SupportsConditionInParensContext supportsConditionInParens() {
			return getRuleContext(SupportsConditionInParensContext.class,0);
		}
		public SupportsNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsNegationContext supportsNegation() throws RecognitionException {
		SupportsNegationContext _localctx = new SupportsNegationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_supportsNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			match(NOT);
			setState(798);
			ws();
			setState(799);
			match(SPACE);
			setState(800);
			ws();
			setState(801);
			supportsConditionInParens();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(cssParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(cssParser.SPACE, i);
		}
		public List<TerminalNode> AND() { return getTokens(cssParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(cssParser.AND, i);
		}
		public SupportsConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsConjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConjunctionContext supportsConjunction() throws RecognitionException {
		SupportsConjunctionContext _localctx = new SupportsConjunctionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_supportsConjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			supportsConditionInParens();
			setState(813); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(804);
					ws();
					setState(805);
					match(SPACE);
					setState(806);
					ws();
					setState(807);
					match(AND);
					setState(808);
					ws();
					setState(809);
					match(SPACE);
					setState(810);
					ws();
					setState(811);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(815); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsDisjunctionContext extends ParserRuleContext {
		public List<SupportsConditionInParensContext> supportsConditionInParens() {
			return getRuleContexts(SupportsConditionInParensContext.class);
		}
		public SupportsConditionInParensContext supportsConditionInParens(int i) {
			return getRuleContext(SupportsConditionInParensContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(cssParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(cssParser.SPACE, i);
		}
		public List<TerminalNode> OR() { return getTokens(cssParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(cssParser.OR, i);
		}
		public SupportsDisjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDisjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsDisjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsDisjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsDisjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDisjunctionContext supportsDisjunction() throws RecognitionException {
		SupportsDisjunctionContext _localctx = new SupportsDisjunctionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_supportsDisjunction);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(817);
			supportsConditionInParens();
			setState(827); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(818);
					ws();
					setState(819);
					match(SPACE);
					setState(820);
					ws();
					setState(821);
					match(OR);
					setState(822);
					ws();
					setState(823);
					match(SPACE);
					setState(824);
					ws();
					setState(825);
					supportsConditionInParens();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(829); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsDeclarationConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public SupportsDeclarationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsDeclarationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterSupportsDeclarationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitSupportsDeclarationCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitSupportsDeclarationCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsDeclarationConditionContext supportsDeclarationCondition() throws RecognitionException {
		SupportsDeclarationConditionContext _localctx = new SupportsDeclarationConditionContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_supportsDeclarationCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(LPAREN);
			setState(832);
			ws();
			setState(833);
			declaration();
			setState(834);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GeneralEnclosedContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public TerminalNode FUNCTION_IDENT() { return getToken(cssParser.FUNCTION_IDENT, 0); }
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public List<Any_Context> any_() {
			return getRuleContexts(Any_Context.class);
		}
		public Any_Context any_(int i) {
			return getRuleContext(Any_Context.class,i);
		}
		public List<UnusedContext> unused() {
			return getRuleContexts(UnusedContext.class);
		}
		public UnusedContext unused(int i) {
			return getRuleContext(UnusedContext.class,i);
		}
		public GeneralEnclosedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generalEnclosed; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterGeneralEnclosed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitGeneralEnclosed(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitGeneralEnclosed(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GeneralEnclosedContext generalEnclosed() throws RecognitionException {
		GeneralEnclosedContext _localctx = new GeneralEnclosedContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_generalEnclosed);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			_la = _input.LA(1);
			if ( !(_la==FUNCTION_IDENT || _la==LPAREN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & -5192931386289062912L) != 0)) {
				{
				setState(839);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MEDIA_ONLY:
				case NOT:
				case AND:
				case OR:
				case FROM:
				case TO:
				case URL_:
				case FUNCTION_IDENT:
				case PLUS:
				case MINUS:
				case LSBRAC:
				case LPAREN:
				case COLON:
				case ICLUDES:
				case DASH_MATCH:
				case HASH:
				case URL:
				case PERCENTAGE:
				case UNICODE_RANGE:
				case DIMENSION:
				case UNKNOWN_DIME:
				case NUMBER:
				case STRING:
				case IDENT:
					{
					setState(837);
					any_();
					}
					break;
				case AT_KEYWORD:
				case LBRACE:
				case SEMI:
				case CDO:
				case CDC:
					{
					setState(838);
					unused();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UrlContext extends ParserRuleContext {
		public TerminalNode URL_() { return getToken(cssParser.URL_, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public TerminalNode URL() { return getToken(cssParser.URL, 0); }
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_url);
		try {
			setState(853);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case URL_:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				match(URL_);
				setState(847);
				ws();
				setState(848);
				match(STRING);
				setState(849);
				ws();
				setState(850);
				match(RPAREN);
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				match(URL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_Context extends ParserRuleContext {
		public TerminalNode Var() { return getToken(cssParser.Var, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode Variable() { return getToken(cssParser.Variable, 0); }
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public Var_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterVar_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitVar_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitVar_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_Context var_() throws RecognitionException {
		Var_Context _localctx = new Var_Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_var_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(Var);
			setState(856);
			ws();
			setState(857);
			match(Variable);
			setState(858);
			ws();
			setState(859);
			match(RPAREN);
			setState(860);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcContext extends ParserRuleContext {
		public TerminalNode Calc() { return getToken(cssParser.Calc, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public CalcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCalc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCalc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCalc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcContext calc() throws RecognitionException {
		CalcContext _localctx = new CalcContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_calc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(Calc);
			setState(863);
			ws();
			setState(864);
			calcSum();
			setState(865);
			match(RPAREN);
			setState(866);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcSumContext extends ParserRuleContext {
		public List<CalcProductContext> calcProduct() {
			return getRuleContexts(CalcProductContext.class);
		}
		public CalcProductContext calcProduct(int i) {
			return getRuleContext(CalcProductContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(cssParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(cssParser.SPACE, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(cssParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(cssParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(cssParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(cssParser.MINUS, i);
		}
		public CalcSumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcSum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCalcSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCalcSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCalcSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcSumContext calcSum() throws RecognitionException {
		CalcSumContext _localctx = new CalcSumContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_calcSum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			calcProduct();
			setState(879);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SPACE) {
				{
				{
				setState(869);
				match(SPACE);
				setState(870);
				ws();
				setState(871);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(872);
				ws();
				setState(873);
				match(SPACE);
				setState(874);
				ws();
				setState(875);
				calcProduct();
				}
				}
				setState(881);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcProductContext extends ParserRuleContext {
		public List<CalcValueContext> calcValue() {
			return getRuleContexts(CalcValueContext.class);
		}
		public CalcValueContext calcValue(int i) {
			return getRuleContext(CalcValueContext.class,i);
		}
		public List<TerminalNode> MULTI() { return getTokens(cssParser.MULTI); }
		public TerminalNode MULTI(int i) {
			return getToken(cssParser.MULTI, i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(cssParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(cssParser.DIVIDE, i);
		}
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public CalcProductContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcProduct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCalcProduct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCalcProduct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCalcProduct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcProductContext calcProduct() throws RecognitionException {
		CalcProductContext _localctx = new CalcProductContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_calcProduct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			calcValue();
			setState(894);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTI || _la==DIVIDE) {
				{
				setState(892);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULTI:
					{
					setState(883);
					match(MULTI);
					setState(884);
					ws();
					setState(885);
					calcValue();
					}
					break;
				case DIVIDE:
					{
					setState(887);
					match(DIVIDE);
					setState(888);
					ws();
					setState(889);
					number();
					setState(890);
					ws();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(896);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcValueContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public DimensionContext dimension() {
			return getRuleContext(DimensionContext.class,0);
		}
		public UnknownDimensionContext unknownDimension() {
			return getRuleContext(UnknownDimensionContext.class,0);
		}
		public PercentageContext percentage() {
			return getRuleContext(PercentageContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(cssParser.LPAREN, 0); }
		public CalcSumContext calcSum() {
			return getRuleContext(CalcSumContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(cssParser.RPAREN, 0); }
		public CalcValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCalcValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCalcValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCalcValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcValueContext calcValue() throws RecognitionException {
		CalcValueContext _localctx = new CalcValueContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_calcValue);
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				number();
				setState(898);
				ws();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(900);
				dimension();
				setState(901);
				ws();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(903);
				unknownDimension();
				setState(904);
				ws();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(906);
				percentage();
				setState(907);
				ws();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(909);
				match(LPAREN);
				setState(910);
				ws();
				setState(911);
				calcSum();
				setState(912);
				match(RPAREN);
				setState(913);
				ws();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFaceRuleContext extends ParserRuleContext {
		public TerminalNode FONT_FACE() { return getToken(cssParser.FONT_FACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<FontFaceDeclarationContext> fontFaceDeclaration() {
			return getRuleContexts(FontFaceDeclarationContext.class);
		}
		public FontFaceDeclarationContext fontFaceDeclaration(int i) {
			return getRuleContext(FontFaceDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cssParser.SEMI, i);
		}
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFontFaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFontFaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_fontFaceRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(917);
			match(FONT_FACE);
			setState(918);
			ws();
			setState(919);
			match(LBRACE);
			setState(920);
			ws();
			setState(922);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683819269702656L) != 0)) {
				{
				setState(921);
				fontFaceDeclaration();
				}
			}

			setState(931);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI) {
				{
				{
				setState(924);
				match(SEMI);
				setState(925);
				ws();
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683819269702656L) != 0)) {
					{
					setState(926);
					fontFaceDeclaration();
					}
				}

				}
				}
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(934);
			match(RBRACE);
			setState(935);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFaceDeclarationContext extends ParserRuleContext {
		public FontFaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceDeclaration; }
	 
		public FontFaceDeclarationContext() { }
		public void copyFrom(FontFaceDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class KnownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KnownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKnownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKnownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKnownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnknownFontFaceDeclarationContext extends FontFaceDeclarationContext {
		public Property_Context property_() {
			return getRuleContext(Property_Context.class,0);
		}
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public WsContext ws() {
			return getRuleContext(WsContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public UnknownFontFaceDeclarationContext(FontFaceDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterUnknownFontFaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitUnknownFontFaceDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitUnknownFontFaceDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceDeclarationContext fontFaceDeclaration() throws RecognitionException {
		FontFaceDeclarationContext _localctx = new FontFaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_fontFaceDeclaration);
		try {
			setState(947);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				_localctx = new KnownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(937);
				property_();
				setState(938);
				match(COLON);
				setState(939);
				ws();
				setState(940);
				expr();
				}
				break;
			case 2:
				_localctx = new UnknownFontFaceDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				property_();
				setState(943);
				match(COLON);
				setState(944);
				ws();
				setState(945);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode Keyframes() { return getToken(cssParser.Keyframes, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode SPACE() { return getToken(cssParser.SPACE, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<KeyframeBlockContext> keyframeBlock() {
			return getRuleContexts(KeyframeBlockContext.class);
		}
		public KeyframeBlockContext keyframeBlock(int i) {
			return getRuleContext(KeyframeBlockContext.class,i);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_keyframesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(Keyframes);
			setState(950);
			ws();
			setState(951);
			match(SPACE);
			setState(952);
			ws();
			setState(953);
			ident();
			setState(954);
			ws();
			setState(955);
			match(LBRACE);
			setState(956);
			ws();
			setState(960);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797019160576L) != 0)) {
				{
				{
				setState(957);
				keyframeBlock();
				}
				}
				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(963);
			match(RBRACE);
			setState(964);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeBlockContext extends ParserRuleContext {
		public KeyframeSelectorContext keyframeSelector() {
			return getRuleContext(KeyframeSelectorContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public KeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeBlockContext keyframeBlock() throws RecognitionException {
		KeyframeBlockContext _localctx = new KeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_keyframeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(966);
			keyframeSelector();
			setState(967);
			match(LBRACE);
			setState(968);
			ws();
			setState(970);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683681830749184L) != 0)) {
				{
				setState(969);
				declarationList();
				}
			}

			setState(972);
			match(RBRACE);
			setState(973);
			ws();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> FROM() { return getTokens(cssParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(cssParser.FROM, i);
		}
		public List<TerminalNode> TO() { return getTokens(cssParser.TO); }
		public TerminalNode TO(int i) {
			return getToken(cssParser.TO, i);
		}
		public List<TerminalNode> PERCENTAGE() { return getTokens(cssParser.PERCENTAGE); }
		public TerminalNode PERCENTAGE(int i) {
			return getToken(cssParser.PERCENTAGE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cssParser.COMMA, i);
		}
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797019160576L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(976);
			ws();
			setState(984);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(977);
				match(COMMA);
				setState(978);
				ws();
				setState(979);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797019160576L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(980);
				ws();
				}
				}
				setState(986);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewportContext extends ParserRuleContext {
		public TerminalNode Viewport() { return getToken(cssParser.Viewport, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public ViewportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterViewport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitViewport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitViewport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewportContext viewport() throws RecognitionException {
		ViewportContext _localctx = new ViewportContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_viewport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(987);
			match(Viewport);
			setState(988);
			ws();
			setState(989);
			match(LBRACE);
			setState(990);
			ws();
			setState(992);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683681830749184L) != 0)) {
				{
				setState(991);
				declarationList();
				}
			}

			setState(994);
			match(RBRACE);
			setState(995);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CounterStyleContext extends ParserRuleContext {
		public TerminalNode CounterStyle() { return getToken(cssParser.CounterStyle, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public CounterStyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_counterStyle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterCounterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitCounterStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitCounterStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CounterStyleContext counterStyle() throws RecognitionException {
		CounterStyleContext _localctx = new CounterStyleContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_counterStyle);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(CounterStyle);
			setState(998);
			ws();
			setState(999);
			ident();
			setState(1000);
			ws();
			setState(1001);
			match(LBRACE);
			setState(1002);
			ws();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -4611683681830749184L) != 0)) {
				{
				setState(1003);
				declarationList();
				}
			}

			setState(1006);
			match(RBRACE);
			setState(1007);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFeatureValuesRuleContext extends ParserRuleContext {
		public TerminalNode FontFeatureValues() { return getToken(cssParser.FontFeatureValues, 0); }
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameListContext fontFamilyNameList() {
			return getRuleContext(FontFamilyNameListContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<FeatureValueBlockContext> featureValueBlock() {
			return getRuleContexts(FeatureValueBlockContext.class);
		}
		public FeatureValueBlockContext featureValueBlock(int i) {
			return getRuleContext(FeatureValueBlockContext.class,i);
		}
		public FontFeatureValuesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFeatureValuesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFontFeatureValuesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFontFeatureValuesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFontFeatureValuesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFeatureValuesRuleContext fontFeatureValuesRule() throws RecognitionException {
		FontFeatureValuesRuleContext _localctx = new FontFeatureValuesRuleContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_fontFeatureValuesRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
			match(FontFeatureValues);
			setState(1010);
			ws();
			setState(1011);
			fontFamilyNameList();
			setState(1012);
			ws();
			setState(1013);
			match(LBRACE);
			setState(1014);
			ws();
			setState(1018);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_KEYWORD) {
				{
				{
				setState(1015);
				featureValueBlock();
				}
				}
				setState(1020);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1021);
			match(RBRACE);
			setState(1022);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyNameListContext extends ParserRuleContext {
		public List<FontFamilyNameContext> fontFamilyName() {
			return getRuleContexts(FontFamilyNameContext.class);
		}
		public FontFamilyNameContext fontFamilyName(int i) {
			return getRuleContext(FontFamilyNameContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(cssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(cssParser.COMMA, i);
		}
		public FontFamilyNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFontFamilyNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFontFamilyNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFontFamilyNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameListContext fontFamilyNameList() throws RecognitionException {
		FontFamilyNameListContext _localctx = new FontFamilyNameListContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_fontFamilyNameList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1024);
			fontFamilyName();
			setState(1032);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1025);
					ws();
					setState(1026);
					match(COMMA);
					setState(1027);
					ws();
					setState(1028);
					fontFamilyName();
					}
					} 
				}
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,100,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFamilyNameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(cssParser.STRING, 0); }
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public FontFamilyNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFamilyName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFontFamilyName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFontFamilyName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFontFamilyName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFamilyNameContext fontFamilyName() throws RecognitionException {
		FontFamilyNameContext _localctx = new FontFamilyNameContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_fontFamilyName);
		try {
			int _alt;
			setState(1045);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(1035);
				match(STRING);
				}
				break;
			case MEDIA_ONLY:
			case NOT:
			case AND:
			case OR:
			case FROM:
			case TO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				ident();
				setState(1042);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1037);
						ws();
						setState(1038);
						ident();
						}
						} 
					}
					setState(1044);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureValueBlockContext extends ParserRuleContext {
		public FeatureTypeContext featureType() {
			return getRuleContext(FeatureTypeContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(cssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(cssParser.RBRACE, 0); }
		public List<FeatureValueDefinitionContext> featureValueDefinition() {
			return getRuleContexts(FeatureValueDefinitionContext.class);
		}
		public FeatureValueDefinitionContext featureValueDefinition(int i) {
			return getRuleContext(FeatureValueDefinitionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(cssParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(cssParser.SEMI, i);
		}
		public FeatureValueBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFeatureValueBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFeatureValueBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFeatureValueBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueBlockContext featureValueBlock() throws RecognitionException {
		FeatureValueBlockContext _localctx = new FeatureValueBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_featureValueBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1047);
			featureType();
			setState(1048);
			ws();
			setState(1049);
			match(LBRACE);
			setState(1050);
			ws();
			setState(1052);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854563840L) != 0)) {
				{
				setState(1051);
				featureValueDefinition();
				}
			}

			setState(1062);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4503737066323970L) != 0)) {
				{
				{
				setState(1054);
				ws();
				setState(1055);
				match(SEMI);
				setState(1056);
				ws();
				setState(1058);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854563840L) != 0)) {
					{
					setState(1057);
					featureValueDefinition();
					}
				}

				}
				}
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1065);
			match(RBRACE);
			setState(1066);
			ws();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureTypeContext extends ParserRuleContext {
		public TerminalNode AT_KEYWORD() { return getToken(cssParser.AT_KEYWORD, 0); }
		public FeatureTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFeatureType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFeatureType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFeatureType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureTypeContext featureType() throws RecognitionException {
		FeatureTypeContext _localctx = new FeatureTypeContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_featureType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1068);
			match(AT_KEYWORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FeatureValueDefinitionContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<WsContext> ws() {
			return getRuleContexts(WsContext.class);
		}
		public WsContext ws(int i) {
			return getRuleContext(WsContext.class,i);
		}
		public TerminalNode COLON() { return getToken(cssParser.COLON, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public FeatureValueDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_featureValueDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterFeatureValueDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitFeatureValueDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitFeatureValueDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FeatureValueDefinitionContext featureValueDefinition() throws RecognitionException {
		FeatureValueDefinitionContext _localctx = new FeatureValueDefinitionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_featureValueDefinition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1070);
			ident();
			setState(1071);
			ws();
			setState(1072);
			match(COLON);
			setState(1073);
			ws();
			setState(1074);
			number();
			setState(1080);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1075);
					ws();
					setState(1076);
					number();
					}
					} 
				}
				setState(1082);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(cssParser.IDENT, 0); }
		public TerminalNode MEDIA_ONLY() { return getToken(cssParser.MEDIA_ONLY, 0); }
		public TerminalNode NOT() { return getToken(cssParser.NOT, 0); }
		public TerminalNode AND() { return getToken(cssParser.AND, 0); }
		public TerminalNode OR() { return getToken(cssParser.OR, 0); }
		public TerminalNode FROM() { return getToken(cssParser.FROM, 0); }
		public TerminalNode TO() { return getToken(cssParser.TO, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -9223372036854563840L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WsContext extends ParserRuleContext {
		public List<TerminalNode> COMMENT() { return getTokens(cssParser.COMMENT); }
		public TerminalNode COMMENT(int i) {
			return getToken(cssParser.COMMENT, i);
		}
		public List<TerminalNode> SPACE() { return getTokens(cssParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(cssParser.SPACE, i);
		}
		public WsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ws; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).enterWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof cssParserListener ) ((cssParserListener)listener).exitWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof cssParserVisitor ) return ((cssParserVisitor<? extends T>)visitor).visitWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WsContext ws() throws RecognitionException {
		WsContext _localctx = new WsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_ws);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1085);
					_la = _input.LA(1);
					if ( !(_la==COMMENT || _la==SPACE) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(1090);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,107,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001@\u0444\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u00a2\b\u0000\n\u0000\f\u0000\u00a5\t\u0000\u0005"+
		"\u0000\u00a7\b\u0000\n\u0000\f\u0000\u00aa\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u00ae\b\u0000\n\u0000\f\u0000\u00b1\t\u0000\u0005\u0000\u00b3"+
		"\b\u0000\n\u0000\f\u0000\u00b6\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u00ba\b\u0000\n\u0000\f\u0000\u00bd\t\u0000\u0005\u0000\u00bf\b\u0000"+
		"\n\u0000\f\u0000\u00c2\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000\u00c6"+
		"\b\u0000\n\u0000\f\u0000\u00c9\t\u0000\u0005\u0000\u00cb\b\u0000\n\u0000"+
		"\f\u0000\u00ce\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00d7\b\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u00df\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00e4\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003\u00ed\b\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003\u00f1\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00f5\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u0106\b\u0006\n\u0006"+
		"\f\u0006\u0109\t\u0006\u0003\u0006\u010b\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0003\u0007\u0110\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0119\b\u0007"+
		"\n\u0007\f\u0007\u011c\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u0123\b\u0007\n\u0007\f\u0007\u0126\t\u0007"+
		"\u0003\u0007\u0128\b\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\t\u0133\b\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u013e"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0143\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0148\b\u000b\u0005\u000b"+
		"\u014a\b\u000b\n\u000b\f\u000b\u014d\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0005\r\u015b\b\r\n\r\f\r\u015e\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0166\b\u000e\n"+
		"\u000e\f\u000e\u0169\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0173"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u0177\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u017e\b\u0010"+
		"\n\u0010\f\u0010\u0181\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0004\u0010\u0188\b\u0010\u000b\u0010\f\u0010\u0189"+
		"\u0003\u0010\u018c\b\u0010\u0001\u0011\u0003\u0011\u018f\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u0195\b\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0003\u0014\u019c"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01a6\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01ae"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01b2\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0003\u0017\u01b8\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0003\u0017\u01bc\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u01ca\b\u0019\u0001\u0019"+
		"\u0004\u0019\u01cd\b\u0019\u000b\u0019\f\u0019\u01ce\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01dd"+
		"\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u01e7\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01f2\b\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0003\u001e\u01f8\b\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0005\u001e\u01fe\b\u001e\n\u001e\f\u001e\u0201\t\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0206\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u020b\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u020f\b\u001f\n\u001f\f\u001f\u0212\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0219\b\u001f\u0005"+
		"\u001f\u021b\b\u001f\n\u001f\f\u001f\u021e\t\u001f\u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0003 \u0225\b \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u022c\b \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0004"+
		"\"\u0235\b\"\u000b\"\f\"\u0236\u0001#\u0001#\u0003#\u023b\b#\u0001#\u0005"+
		"#\u023e\b#\n#\f#\u0241\t#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0003$\u025e\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001(\u0003(\u0270"+
		"\b(\u0001(\u0001(\u0001)\u0003)\u0275\b)\u0001)\u0001)\u0001*\u0003*\u027a"+
		"\b*\u0001*\u0001*\u0001+\u0003+\u027f\b+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0005,\u02a5\b,\n,\f,\u02a8\t,\u0001,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u02b1\b,\n,\f,\u02b4\t,\u0001,\u0001,\u0001,\u0001"+
		",\u0001,\u0001,\u0001,\u0005,\u02bd\b,\n,\f,\u02c0\t,\u0001,\u0001,\u0001"+
		",\u0003,\u02c5\b,\u0001-\u0001-\u0001-\u0005-\u02ca\b-\n-\f-\u02cd\t-"+
		"\u0001-\u0001-\u0001-\u0003-\u02d2\b-\u0001.\u0001.\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0001.\u0003.\u02dd\b.\u0001/\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u02e9\b/\n/\f/\u02ec"+
		"\t/\u0001/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u0001"+
		"0\u00010\u00010\u00010\u00030\u02fb\b0\u00011\u00011\u00011\u00051\u0300"+
		"\b1\n1\f1\u0303\t1\u00011\u00011\u00011\u00012\u00012\u00012\u00012\u0001"+
		"2\u00012\u00013\u00013\u00013\u00013\u00033\u0312\b3\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00034\u031c\b4\u00015\u00015\u0001"+
		"5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00046\u032e\b6\u000b6\f6\u032f\u00017\u00017\u0001"+
		"7\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u00047\u033c\b7\u000b"+
		"7\f7\u033d\u00018\u00018\u00018\u00018\u00018\u00019\u00019\u00019\u0005"+
		"9\u0348\b9\n9\f9\u034b\t9\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001"+
		":\u0001:\u0001:\u0003:\u0356\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001"+
		"=\u0001=\u0001=\u0001=\u0001=\u0001=\u0001=\u0005=\u036e\b=\n=\f=\u0371"+
		"\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0001"+
		">\u0005>\u037d\b>\n>\f>\u0380\t>\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001"+
		"?\u0001?\u0001?\u0003?\u0394\b?\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"+
		"@\u039b\b@\u0001@\u0001@\u0001@\u0003@\u03a0\b@\u0005@\u03a2\b@\n@\f@"+
		"\u03a5\t@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0003A\u03b4\bA\u0001B\u0001B\u0001B\u0001"+
		"B\u0001B\u0001B\u0001B\u0001B\u0001B\u0005B\u03bf\bB\nB\fB\u03c2\tB\u0001"+
		"B\u0001B\u0001B\u0001C\u0001C\u0001C\u0001C\u0003C\u03cb\bC\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0005D\u03d7"+
		"\bD\nD\fD\u03da\tD\u0001E\u0001E\u0001E\u0001E\u0001E\u0003E\u03e1\bE"+
		"\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0003F\u03ed\bF\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0001"+
		"G\u0001G\u0001G\u0005G\u03f9\bG\nG\fG\u03fc\tG\u0001G\u0001G\u0001G\u0001"+
		"H\u0001H\u0001H\u0001H\u0001H\u0001H\u0005H\u0407\bH\nH\fH\u040a\tH\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0005I\u0411\bI\nI\fI\u0414\tI\u0003I\u0416"+
		"\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u041d\bJ\u0001J\u0001J\u0001"+
		"J\u0001J\u0003J\u0423\bJ\u0005J\u0425\bJ\nJ\fJ\u0428\tJ\u0001J\u0001J"+
		"\u0001J\u0001K\u0001K\u0001L\u0001L\u0001L\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0005L\u0437\bL\nL\fL\u043a\tL\u0001M\u0001M\u0001N\u0005N\u043f"+
		"\bN\nN\fN\u0442\tN\u0001N\u0000\u0000O\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u0000\b\u0002\u0000\u0001"+
		"\u000146\u0001\u0000\n\u000b\u0002\u0000\u001a\u001a-1\u0001\u0000\u001d"+
		"\u001e\u0002\u0000\u0018\u0018!!\u0002\u0000\u0010\u001177\u0003\u0000"+
		"\n\r\u0010\u0011??\u0002\u0000\u0001\u000144\u04a4\u0000\u009e\u0001\u0000"+
		"\u0000\u0000\u0002\u00d1\u0001\u0000\u0000\u0000\u0004\u00da\u0001\u0000"+
		"\u0000\u0000\u0006\u00e7\u0001\u0000\u0000\u0000\b\u00f8\u0001\u0000\u0000"+
		"\u0000\n\u00fa\u0001\u0000\u0000\u0000\f\u010a\u0001\u0000\u0000\u0000"+
		"\u000e\u0127\u0001\u0000\u0000\u0000\u0010\u0129\u0001\u0000\u0000\u0000"+
		"\u0012\u012b\u0001\u0000\u0000\u0000\u0014\u0137\u0001\u0000\u0000\u0000"+
		"\u0016\u013a\u0001\u0000\u0000\u0000\u0018\u0151\u0001\u0000\u0000\u0000"+
		"\u001a\u0155\u0001\u0000\u0000\u0000\u001c\u015f\u0001\u0000\u0000\u0000"+
		"\u001e\u0172\u0001\u0000\u0000\u0000 \u018b\u0001\u0000\u0000\u0000\""+
		"\u018e\u0001\u0000\u0000\u0000$\u0194\u0001\u0000\u0000\u0000&\u0198\u0001"+
		"\u0000\u0000\u0000(\u019b\u0001\u0000\u0000\u0000*\u019f\u0001\u0000\u0000"+
		"\u0000,\u01a2\u0001\u0000\u0000\u0000.\u01b5\u0001\u0000\u0000\u00000"+
		"\u01bd\u0001\u0000\u0000\u00002\u01cc\u0001\u0000\u0000\u00004\u01d0\u0001"+
		"\u0000\u0000\u00006\u01dc\u0001\u0000\u0000\u00008\u01e6\u0001\u0000\u0000"+
		"\u0000:\u01f1\u0001\u0000\u0000\u0000<\u020a\u0001\u0000\u0000\u0000>"+
		"\u0210\u0001\u0000\u0000\u0000@\u022b\u0001\u0000\u0000\u0000B\u022d\u0001"+
		"\u0000\u0000\u0000D\u0234\u0001\u0000\u0000\u0000F\u0238\u0001\u0000\u0000"+
		"\u0000H\u025d\u0001\u0000\u0000\u0000J\u025f\u0001\u0000\u0000\u0000L"+
		"\u0265\u0001\u0000\u0000\u0000N\u026b\u0001\u0000\u0000\u0000P\u026f\u0001"+
		"\u0000\u0000\u0000R\u0274\u0001\u0000\u0000\u0000T\u0279\u0001\u0000\u0000"+
		"\u0000V\u027e\u0001\u0000\u0000\u0000X\u02c4\u0001\u0000\u0000\u0000Z"+
		"\u02c6\u0001\u0000\u0000\u0000\\\u02dc\u0001\u0000\u0000\u0000^\u02de"+
		"\u0001\u0000\u0000\u0000`\u02fa\u0001\u0000\u0000\u0000b\u02fc\u0001\u0000"+
		"\u0000\u0000d\u0307\u0001\u0000\u0000\u0000f\u0311\u0001\u0000\u0000\u0000"+
		"h\u031b\u0001\u0000\u0000\u0000j\u031d\u0001\u0000\u0000\u0000l\u0323"+
		"\u0001\u0000\u0000\u0000n\u0331\u0001\u0000\u0000\u0000p\u033f\u0001\u0000"+
		"\u0000\u0000r\u0344\u0001\u0000\u0000\u0000t\u0355\u0001\u0000\u0000\u0000"+
		"v\u0357\u0001\u0000\u0000\u0000x\u035e\u0001\u0000\u0000\u0000z\u0364"+
		"\u0001\u0000\u0000\u0000|\u0372\u0001\u0000\u0000\u0000~\u0393\u0001\u0000"+
		"\u0000\u0000\u0080\u0395\u0001\u0000\u0000\u0000\u0082\u03b3\u0001\u0000"+
		"\u0000\u0000\u0084\u03b5\u0001\u0000\u0000\u0000\u0086\u03c6\u0001\u0000"+
		"\u0000\u0000\u0088\u03cf\u0001\u0000\u0000\u0000\u008a\u03db\u0001\u0000"+
		"\u0000\u0000\u008c\u03e5\u0001\u0000\u0000\u0000\u008e\u03f1\u0001\u0000"+
		"\u0000\u0000\u0090\u0400\u0001\u0000\u0000\u0000\u0092\u0415\u0001\u0000"+
		"\u0000\u0000\u0094\u0417\u0001\u0000\u0000\u0000\u0096\u042c\u0001\u0000"+
		"\u0000\u0000\u0098\u042e\u0001\u0000\u0000\u0000\u009a\u043b\u0001\u0000"+
		"\u0000\u0000\u009c\u0440\u0001\u0000\u0000\u0000\u009e\u00a8\u0003\u009c"+
		"N\u0000\u009f\u00a3\u0003\u0002\u0001\u0000\u00a0\u00a2\u0007\u0000\u0000"+
		"\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a6\u009f\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00b4\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00af\u0003\u0004\u0002\u0000\u00ac\u00ae\u0007\u0000\u0000"+
		"\u0000\u00ad\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000"+
		"\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ab\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b5\u00c0\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00bb\u0003\u0006\u0003\u0000\u00b8\u00ba\u0007\u0000\u0000"+
		"\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00be\u00b7\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00cc\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c7\u0003`0\u0000\u00c4\u00c6\u0007\u0000\u0000\u0000\u00c5"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8"+
		"\u00cb\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca"+
		"\u00c3\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd"+
		"\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d0\u0005\u0000\u0000\u0001\u00d0\u0001\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d2\u0005\u0002\u0000\u0000\u00d2\u00d3\u0003\u009cN\u0000\u00d3\u00d4"+
		"\u0005=\u0000\u0000\u00d4\u00d6\u0003\u009cN\u0000\u00d5\u00d7\u0005%"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00d9\u0003\u009c"+
		"N\u0000\u00d9\u0003\u0001\u0000\u0000\u0000\u00da\u00db\u0005\u0003\u0000"+
		"\u0000\u00db\u00de\u0003\u009cN\u0000\u00dc\u00df\u0005=\u0000\u0000\u00dd"+
		"\u00df\u0003t:\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003"+
		"\u009cN\u0000\u00e1\u00e3\u0003\f\u0006\u0000\u00e2\u00e4\u0005%\u0000"+
		"\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0003\u009cN\u0000"+
		"\u00e6\u0005\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000"+
		"\u00e8\u00ec\u0003\u009cN\u0000\u00e9\u00ea\u0003\b\u0004\u0000\u00ea"+
		"\u00eb\u0003\u009cN\u0000\u00eb\u00ed\u0001\u0000\u0000\u0000\u00ec\u00e9"+
		"\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0"+
		"\u0001\u0000\u0000\u0000\u00ee\u00f1\u0005=\u0000\u0000\u00ef\u00f1\u0003"+
		"t:\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000"+
		"\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0003\u009cN\u0000"+
		"\u00f3\u00f5\u0005%\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0003\u009cN\u0000\u00f7\u0007\u0001\u0000\u0000\u0000\u00f8\u00f9"+
		"\u0003\u009aM\u0000\u00f9\t\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0005\u0000\u0000\u00fb\u00fc\u0003\u009cN\u0000\u00fc\u00fd\u0003\f"+
		"\u0006\u0000\u00fd\u00fe\u0003b1\u0000\u00fe\u00ff\u0003\u009cN\u0000"+
		"\u00ff\u000b\u0001\u0000\u0000\u0000\u0100\u0107\u0003\u000e\u0007\u0000"+
		"\u0101\u0102\u0005+\u0000\u0000\u0102\u0103\u0003\u009cN\u0000\u0103\u0104"+
		"\u0003\u000e\u0007\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0101"+
		"\u0001\u0000\u0000\u0000\u0106\u0109\u0001\u0000\u0000\u0000\u0107\u0105"+
		"\u0001\u0000\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u010b"+
		"\u0001\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u010a\u0100"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010c"+
		"\u0001\u0000\u0000\u0000\u010c\u010d\u0003\u009cN\u0000\u010d\r\u0001"+
		"\u0000\u0000\u0000\u010e\u0110\u0007\u0001\u0000\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0003\u009cN\u0000\u0112\u0113\u0003\u0010"+
		"\b\u0000\u0113\u011a\u0003\u009cN\u0000\u0114\u0115\u0005\f\u0000\u0000"+
		"\u0115\u0116\u0003\u009cN\u0000\u0116\u0117\u0003\u0012\t\u0000\u0117"+
		"\u0119\u0001\u0000\u0000\u0000\u0118\u0114\u0001\u0000\u0000\u0000\u0119"+
		"\u011c\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0001\u0000\u0000\u0000\u011b\u0128\u0001\u0000\u0000\u0000\u011c"+
		"\u011a\u0001\u0000\u0000\u0000\u011d\u0124\u0003\u0012\t\u0000\u011e\u011f"+
		"\u0005\f\u0000\u0000\u011f\u0120\u0003\u009cN\u0000\u0120\u0121\u0003"+
		"\u0012\t\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u011e\u0001\u0000"+
		"\u0000\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0128\u0001\u0000"+
		"\u0000\u0000\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u010f\u0001\u0000"+
		"\u0000\u0000\u0127\u011d\u0001\u0000\u0000\u0000\u0128\u000f\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0003\u009aM\u0000\u012a\u0011\u0001\u0000\u0000"+
		"\u0000\u012b\u012c\u0005!\u0000\u0000\u012c\u012d\u0003\u009cN\u0000\u012d"+
		"\u0132\u0003\u0014\n\u0000\u012e\u012f\u0005&\u0000\u0000\u012f\u0130"+
		"\u0003\u009cN\u0000\u0130\u0131\u0003F#\u0000\u0131\u0133\u0001\u0000"+
		"\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0005\"\u0000"+
		"\u0000\u0135\u0136\u0003\u009cN\u0000\u0136\u0013\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0003\u009aM\u0000\u0138\u0139\u0003\u009cN\u0000\u0139\u0015"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0005\u0004\u0000\u0000\u013b\u013d"+
		"\u0003\u009cN\u0000\u013c\u013e\u0003\u0018\f\u0000\u013d\u013c\u0001"+
		"\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u013f\u0001"+
		"\u0000\u0000\u0000\u013f\u0140\u0005#\u0000\u0000\u0140\u0142\u0003\u009c"+
		"N\u0000\u0141\u0143\u0003@ \u0000\u0142\u0141\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0001\u0000\u0000\u0000\u0143\u014b\u0001\u0000\u0000\u0000"+
		"\u0144\u0145\u0005%\u0000\u0000\u0145\u0147\u0003\u009cN\u0000\u0146\u0148"+
		"\u0003@ \u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000"+
		"\u0000\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149\u0144\u0001\u0000"+
		"\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u014e\u0001\u0000"+
		"\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u014f\u0005$\u0000"+
		"\u0000\u014f\u0150\u0003\u009cN\u0000\u0150\u0017\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005&\u0000\u0000\u0152\u0153\u0003\u009aM\u0000\u0153\u0154"+
		"\u0003\u009cN\u0000\u0154\u0019\u0001\u0000\u0000\u0000\u0155\u015c\u0003"+
		"\u001c\u000e\u0000\u0156\u0157\u0005+\u0000\u0000\u0157\u0158\u0003\u009c"+
		"N\u0000\u0158\u0159\u0003\u001c\u000e\u0000\u0159\u015b\u0001\u0000\u0000"+
		"\u0000\u015a\u0156\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000"+
		"\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000"+
		"\u0000\u015d\u001b\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000"+
		"\u0000\u015f\u0160\u0003 \u0010\u0000\u0160\u0167\u0003\u009cN\u0000\u0161"+
		"\u0162\u0003\u001e\u000f\u0000\u0162\u0163\u0003 \u0010\u0000\u0163\u0164"+
		"\u0003\u009cN\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0161\u0001"+
		"\u0000\u0000\u0000\u0166\u0169\u0001\u0000\u0000\u0000\u0167\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u001d\u0001"+
		"\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u016a\u016b\u0005"+
		"\u001d\u0000\u0000\u016b\u0173\u0003\u009cN\u0000\u016c\u016d\u0005*\u0000"+
		"\u0000\u016d\u0173\u0003\u009cN\u0000\u016e\u016f\u0005,\u0000\u0000\u016f"+
		"\u0173\u0003\u009cN\u0000\u0170\u0171\u00054\u0000\u0000\u0171\u0173\u0003"+
		"\u009cN\u0000\u0172\u016a\u0001\u0000\u0000\u0000\u0172\u016c\u0001\u0000"+
		"\u0000\u0000\u0172\u016e\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000"+
		"\u0000\u0000\u0173\u001f\u0001\u0000\u0000\u0000\u0174\u0177\u0003\"\u0011"+
		"\u0000\u0175\u0177\u0003(\u0014\u0000\u0176\u0174\u0001\u0000\u0000\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u017f\u0001\u0000\u0000\u0000"+
		"\u0178\u017e\u00052\u0000\u0000\u0179\u017e\u0003*\u0015\u0000\u017a\u017e"+
		"\u0003,\u0016\u0000\u017b\u017e\u0003.\u0017\u0000\u017c\u017e\u00034"+
		"\u001a\u0000\u017d\u0178\u0001\u0000\u0000\u0000\u017d\u0179\u0001\u0000"+
		"\u0000\u0000\u017d\u017a\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000"+
		"\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000"+
		"\u0000\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000"+
		"\u0000\u0000\u0180\u018c\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0182\u0188\u00052\u0000\u0000\u0183\u0188\u0003*\u0015\u0000"+
		"\u0184\u0188\u0003,\u0016\u0000\u0185\u0188\u0003.\u0017\u0000\u0186\u0188"+
		"\u00034\u001a\u0000\u0187\u0182\u0001\u0000\u0000\u0000\u0187\u0183\u0001"+
		"\u0000\u0000\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0187\u0185\u0001"+
		"\u0000\u0000\u0000\u0187\u0186\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189\u018a\u0001"+
		"\u0000\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0176\u0001"+
		"\u0000\u0000\u0000\u018b\u0187\u0001\u0000\u0000\u0000\u018c!\u0001\u0000"+
		"\u0000\u0000\u018d\u018f\u0003$\u0012\u0000\u018e\u018d\u0001\u0000\u0000"+
		"\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000"+
		"\u0000\u0190\u0191\u0003&\u0013\u0000\u0191#\u0001\u0000\u0000\u0000\u0192"+
		"\u0195\u0003\u009aM\u0000\u0193\u0195\u0005\u001b\u0000\u0000\u0194\u0192"+
		"\u0001\u0000\u0000\u0000\u0194\u0193\u0001\u0000\u0000\u0000\u0194\u0195"+
		"\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0005(\u0000\u0000\u0197%\u0001\u0000\u0000\u0000\u0198\u0199\u0003\u009a"+
		"M\u0000\u0199\'\u0001\u0000\u0000\u0000\u019a\u019c\u0003$\u0012\u0000"+
		"\u019b\u019a\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000"+
		"\u019c\u019d\u0001\u0000\u0000\u0000\u019d\u019e\u0005\u001b\u0000\u0000"+
		"\u019e)\u0001\u0000\u0000\u0000\u019f\u01a0\u0005\'\u0000\u0000\u01a0"+
		"\u01a1\u0003\u009aM\u0000\u01a1+\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005"+
		"\u001f\u0000\u0000\u01a3\u01a5\u0003\u009cN\u0000\u01a4\u01a6\u0003$\u0012"+
		"\u0000\u01a5\u01a4\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0003\u009aM\u0000"+
		"\u01a8\u01b1\u0003\u009cN\u0000\u01a9\u01aa\u0007\u0002\u0000\u0000\u01aa"+
		"\u01ad\u0003\u009cN\u0000\u01ab\u01ae\u0003\u009aM\u0000\u01ac\u01ae\u0005"+
		"=\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ac\u0001\u0000"+
		"\u0000\u0000\u01ae\u01af\u0001\u0000\u0000\u0000\u01af\u01b0\u0003\u009c"+
		"N\u0000\u01b0\u01b2\u0001\u0000\u0000\u0000\u01b1\u01a9\u0001\u0000\u0000"+
		"\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b3\u01b4\u0005 \u0000\u0000\u01b4-\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b7\u0005&\u0000\u0000\u01b6\u01b8\u0005&\u0000\u0000\u01b7\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01bb\u0001"+
		"\u0000\u0000\u0000\u01b9\u01bc\u0003\u009aM\u0000\u01ba\u01bc\u00030\u0018"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01ba\u0001\u0000\u0000"+
		"\u0000\u01bc/\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\u0018\u0000\u0000"+
		"\u01be\u01bf\u0003\u009cN\u0000\u01bf\u01c0\u00032\u0019\u0000\u01c0\u01c1"+
		"\u0005\"\u0000\u0000\u01c11\u0001\u0000\u0000\u0000\u01c2\u01ca\u0005"+
		"\u001d\u0000\u0000\u01c3\u01ca\u0005\u001e\u0000\u0000\u01c4\u01ca\u0005"+
		"9\u0000\u0000\u01c5\u01ca\u0005:\u0000\u0000\u01c6\u01ca\u0005<\u0000"+
		"\u0000\u01c7\u01ca\u0005=\u0000\u0000\u01c8\u01ca\u0003\u009aM\u0000\u01c9"+
		"\u01c2\u0001\u0000\u0000\u0000\u01c9\u01c3\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c4\u0001\u0000\u0000\u0000\u01c9\u01c5\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cd\u0003\u009cN\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cd\u01ce"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cf"+
		"\u0001\u0000\u0000\u0000\u01cf3\u0001\u0000\u0000\u0000\u01d0\u01d1\u0005"+
		"\u0015\u0000\u0000\u01d1\u01d2\u0003\u009cN\u0000\u01d2\u01d3\u00036\u001b"+
		"\u0000\u01d3\u01d4\u0003\u009cN\u0000\u01d4\u01d5\u0005 \u0000\u0000\u01d5"+
		"5\u0001\u0000\u0000\u0000\u01d6\u01dd\u0003\"\u0011\u0000\u01d7\u01dd"+
		"\u0003(\u0014\u0000\u01d8\u01dd\u00052\u0000\u0000\u01d9\u01dd\u0003*"+
		"\u0015\u0000\u01da\u01dd\u0003,\u0016\u0000\u01db\u01dd\u0003.\u0017\u0000"+
		"\u01dc\u01d6\u0001\u0000\u0000\u0000\u01dc\u01d7\u0001\u0000\u0000\u0000"+
		"\u01dc\u01d8\u0001\u0000\u0000\u0000\u01dc\u01d9\u0001\u0000\u0000\u0000"+
		"\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000"+
		"\u01dd7\u0001\u0000\u0000\u0000\u01de\u01df\u0005\u001c\u0000\u0000\u01df"+
		"\u01e7\u0003\u009cN\u0000\u01e0\u01e1\u0005+\u0000\u0000\u01e1\u01e7\u0003"+
		"\u009cN\u0000\u01e2\u01e3\u00054\u0000\u0000\u01e3\u01e7\u0003\u009cN"+
		"\u0000\u01e4\u01e5\u0005\u001a\u0000\u0000\u01e5\u01e7\u0003\u009cN\u0000"+
		"\u01e6\u01de\u0001\u0000\u0000\u0000\u01e6\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e6\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e4\u0001\u0000\u0000\u0000"+
		"\u01e79\u0001\u0000\u0000\u0000\u01e8\u01e9\u0003\u009aM\u0000\u01e9\u01ea"+
		"\u0003\u009cN\u0000\u01ea\u01f2\u0001\u0000\u0000\u0000\u01eb\u01ec\u0005"+
		">\u0000\u0000\u01ec\u01f2\u0003\u009cN\u0000\u01ed\u01ee\u0005\u001b\u0000"+
		"\u0000\u01ee\u01f2\u0003\u009aM\u0000\u01ef\u01f0\u0005)\u0000\u0000\u01f0"+
		"\u01f2\u0003\u009aM\u0000\u01f1\u01e8\u0001\u0000\u0000\u0000\u01f1\u01eb"+
		"\u0001\u0000\u0000\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01ef"+
		"\u0001\u0000\u0000\u0000\u01f2;\u0001\u0000\u0000\u0000\u01f3\u01f4\u0003"+
		"\u001a\r\u0000\u01f4\u01f5\u0005#\u0000\u0000\u01f5\u01f7\u0003\u009c"+
		"N\u0000\u01f6\u01f8\u0003>\u001f\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000"+
		"\u01f9\u01fa\u0005$\u0000\u0000\u01fa\u01fb\u0003\u009cN\u0000\u01fb\u020b"+
		"\u0001\u0000\u0000\u0000\u01fc\u01fe\u0003X,\u0000\u01fd\u01fc\u0001\u0000"+
		"\u0000\u0000\u01fe\u0201\u0001\u0000\u0000\u0000\u01ff\u01fd\u0001\u0000"+
		"\u0000\u0000\u01ff\u0200\u0001\u0000\u0000\u0000\u0200\u0202\u0001\u0000"+
		"\u0000\u0000\u0201\u01ff\u0001\u0000\u0000\u0000\u0202\u0203\u0005#\u0000"+
		"\u0000\u0203\u0205\u0003\u009cN\u0000\u0204\u0206\u0003>\u001f\u0000\u0205"+
		"\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207\u0208\u0005$\u0000\u0000\u0208\u0209"+
		"\u0003\u009cN\u0000\u0209\u020b\u0001\u0000\u0000\u0000\u020a\u01f3\u0001"+
		"\u0000\u0000\u0000\u020a\u01ff\u0001\u0000\u0000\u0000\u020b=\u0001\u0000"+
		"\u0000\u0000\u020c\u020d\u0005%\u0000\u0000\u020d\u020f\u0003\u009cN\u0000"+
		"\u020e\u020c\u0001\u0000\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000"+
		"\u0210\u020e\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000"+
		"\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0210\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0003@ \u0000\u0214\u021c\u0003\u009cN\u0000\u0215\u0216"+
		"\u0005%\u0000\u0000\u0216\u0218\u0003\u009cN\u0000\u0217\u0219\u0003@"+
		" \u0000\u0218\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021b\u0001\u0000\u0000\u0000\u021a\u0215\u0001\u0000\u0000"+
		"\u0000\u021b\u021e\u0001\u0000\u0000\u0000\u021c\u021a\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d?\u0001\u0000\u0000\u0000"+
		"\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0220\u0003:\u001d\u0000\u0220"+
		"\u0221\u0005&\u0000\u0000\u0221\u0222\u0003\u009cN\u0000\u0222\u0224\u0003"+
		"F#\u0000\u0223\u0225\u0003B!\u0000\u0224\u0223\u0001\u0000\u0000\u0000"+
		"\u0224\u0225\u0001\u0000\u0000\u0000\u0225\u022c\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0003:\u001d\u0000\u0227\u0228\u0005&\u0000\u0000\u0228\u0229"+
		"\u0003\u009cN\u0000\u0229\u022a\u0003D\"\u0000\u022a\u022c\u0001\u0000"+
		"\u0000\u0000\u022b\u021f\u0001\u0000\u0000\u0000\u022b\u0226\u0001\u0000"+
		"\u0000\u0000\u022cA\u0001\u0000\u0000\u0000\u022d\u022e\u0005\t\u0000"+
		"\u0000\u022e\u022f\u0003\u009cN\u0000\u022fC\u0001\u0000\u0000\u0000\u0230"+
		"\u0235\u0003X,\u0000\u0231\u0235\u0003^/\u0000\u0232\u0233\u0005\u000e"+
		"\u0000\u0000\u0233\u0235\u0003\u009cN\u0000\u0234\u0230\u0001\u0000\u0000"+
		"\u0000\u0234\u0231\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000"+
		"\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000"+
		"\u0000\u0236\u0237\u0001\u0000\u0000\u0000\u0237E\u0001\u0000\u0000\u0000"+
		"\u0238\u023f\u0003H$\u0000\u0239\u023b\u00038\u001c\u0000\u023a\u0239"+
		"\u0001\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023c"+
		"\u0001\u0000\u0000\u0000\u023c\u023e\u0003H$\u0000\u023d\u023a\u0001\u0000"+
		"\u0000\u0000\u023e\u0241\u0001\u0000\u0000\u0000\u023f\u023d\u0001\u0000"+
		"\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240G\u0001\u0000\u0000"+
		"\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0242\u0243\u0003P(\u0000\u0243"+
		"\u0244\u0003\u009cN\u0000\u0244\u025e\u0001\u0000\u0000\u0000\u0245\u0246"+
		"\u0003R)\u0000\u0246\u0247\u0003\u009cN\u0000\u0247\u025e\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0003T*\u0000\u0249\u024a\u0003\u009cN\u0000"+
		"\u024a\u025e\u0001\u0000\u0000\u0000\u024b\u024c\u0005=\u0000\u0000\u024c"+
		"\u025e\u0003\u009cN\u0000\u024d\u024e\u00058\u0000\u0000\u024e\u025e\u0003"+
		"\u009cN\u0000\u024f\u0250\u0003\u009aM\u0000\u0250\u0251\u0003\u009cN"+
		"\u0000\u0251\u025e\u0001\u0000\u0000\u0000\u0252\u025e\u0003v;\u0000\u0253"+
		"\u0254\u0003t:\u0000\u0254\u0255\u0003\u009cN\u0000\u0255\u025e\u0001"+
		"\u0000\u0000\u0000\u0256\u025e\u0003N\'\u0000\u0257\u025e\u0003x<\u0000"+
		"\u0258\u025e\u0003J%\u0000\u0259\u025a\u0003V+\u0000\u025a\u025b\u0003"+
		"\u009cN\u0000\u025b\u025e\u0001\u0000\u0000\u0000\u025c\u025e\u0003L&"+
		"\u0000\u025d\u0242\u0001\u0000\u0000\u0000\u025d\u0245\u0001\u0000\u0000"+
		"\u0000\u025d\u0248\u0001\u0000\u0000\u0000\u025d\u024b\u0001\u0000\u0000"+
		"\u0000\u025d\u024d\u0001\u0000\u0000\u0000\u025d\u024f\u0001\u0000\u0000"+
		"\u0000\u025d\u0252\u0001\u0000\u0000\u0000\u025d\u0253\u0001\u0000\u0000"+
		"\u0000\u025d\u0256\u0001\u0000\u0000\u0000\u025d\u0257\u0001\u0000\u0000"+
		"\u0000\u025d\u0258\u0001\u0000\u0000\u0000\u025d\u0259\u0001\u0000\u0000"+
		"\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025eI\u0001\u0000\u0000\u0000"+
		"\u025f\u0260\u0005\u0018\u0000\u0000\u0260\u0261\u0003\u009cN\u0000\u0261"+
		"\u0262\u0003F#\u0000\u0262\u0263\u0005\"\u0000\u0000\u0263\u0264\u0003"+
		"\u009cN\u0000\u0264K\u0001\u0000\u0000\u0000\u0265\u0266\u0005;\u0000"+
		"\u0000\u0266\u0267\u0003\u009cN\u0000\u0267\u0268\u0003F#\u0000\u0268"+
		"\u0269\u0005\"\u0000\u0000\u0269\u026a\u0003\u009cN\u0000\u026aM\u0001"+
		"\u0000\u0000\u0000\u026b\u026c\u00052\u0000\u0000\u026c\u026d\u0003\u009c"+
		"N\u0000\u026dO\u0001\u0000\u0000\u0000\u026e\u0270\u0007\u0003\u0000\u0000"+
		"\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000\u0000"+
		"\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005<\u0000\u0000\u0272"+
		"Q\u0001\u0000\u0000\u0000\u0273\u0275\u0007\u0003\u0000\u0000\u0274\u0273"+
		"\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0001\u0000\u0000\u0000\u0276\u0277\u00057\u0000\u0000\u0277S\u0001\u0000"+
		"\u0000\u0000\u0278\u027a\u0007\u0003\u0000\u0000\u0279\u0278\u0001\u0000"+
		"\u0000\u0000\u0279\u027a\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000"+
		"\u0000\u0000\u027b\u027c\u00059\u0000\u0000\u027cU\u0001\u0000\u0000\u0000"+
		"\u027d\u027f\u0007\u0003\u0000\u0000\u027e\u027d\u0001\u0000\u0000\u0000"+
		"\u027e\u027f\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000"+
		"\u0280\u0281\u0005:\u0000\u0000\u0281W\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0003\u009aM\u0000\u0283\u0284\u0003\u009cN\u0000\u0284\u02c5\u0001\u0000"+
		"\u0000\u0000\u0285\u0286\u0003P(\u0000\u0286\u0287\u0003\u009cN\u0000"+
		"\u0287\u02c5\u0001\u0000\u0000\u0000\u0288\u0289\u0003R)\u0000\u0289\u028a"+
		"\u0003\u009cN\u0000\u028a\u02c5\u0001\u0000\u0000\u0000\u028b\u028c\u0003"+
		"T*\u0000\u028c\u028d\u0003\u009cN\u0000\u028d\u02c5\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0003V+\u0000\u028f\u0290\u0003\u009cN\u0000\u0290"+
		"\u02c5\u0001\u0000\u0000\u0000\u0291\u0292\u0005=\u0000\u0000\u0292\u02c5"+
		"\u0003\u009cN\u0000\u0293\u0294\u0003t:\u0000\u0294\u0295\u0003\u009c"+
		"N\u0000\u0295\u02c5\u0001\u0000\u0000\u0000\u0296\u0297\u00052\u0000\u0000"+
		"\u0297\u02c5\u0003\u009cN\u0000\u0298\u0299\u00058\u0000\u0000\u0299\u02c5"+
		"\u0003\u009cN\u0000\u029a\u029b\u00050\u0000\u0000\u029b\u02c5\u0003\u009c"+
		"N\u0000\u029c\u029d\u00051\u0000\u0000\u029d\u02c5\u0003\u009cN\u0000"+
		"\u029e\u029f\u0005&\u0000\u0000\u029f\u02c5\u0003\u009cN\u0000\u02a0\u02a1"+
		"\u0005\u0018\u0000\u0000\u02a1\u02a6\u0003\u009cN\u0000\u02a2\u02a5\u0003"+
		"X,\u0000\u02a3\u02a5\u0003\\.\u0000\u02a4\u02a2\u0001\u0000\u0000\u0000"+
		"\u02a4\u02a3\u0001\u0000\u0000\u0000\u02a5\u02a8\u0001\u0000\u0000\u0000"+
		"\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a7\u0001\u0000\u0000\u0000"+
		"\u02a7\u02a9\u0001\u0000\u0000\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0005\"\u0000\u0000\u02aa\u02ab\u0003\u009cN\u0000\u02ab"+
		"\u02c5\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005!\u0000\u0000\u02ad\u02b2"+
		"\u0003\u009cN\u0000\u02ae\u02b1\u0003X,\u0000\u02af\u02b1\u0003\\.\u0000"+
		"\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02af\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000"+
		"\u02b2\u02b3\u0001\u0000\u0000\u0000\u02b3\u02b5\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b5\u02b6\u0005\"\u0000\u0000\u02b6"+
		"\u02b7\u0003\u009cN\u0000\u02b7\u02c5\u0001\u0000\u0000\u0000\u02b8\u02b9"+
		"\u0005\u001f\u0000\u0000\u02b9\u02be\u0003\u009cN\u0000\u02ba\u02bd\u0003"+
		"X,\u0000\u02bb\u02bd\u0003\\.\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000\u0000"+
		"\u02be\u02bc\u0001\u0000\u0000\u0000\u02be\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bf\u02c1\u0001\u0000\u0000\u0000\u02c0\u02be\u0001\u0000\u0000\u0000"+
		"\u02c1\u02c2\u0005 \u0000\u0000\u02c2\u02c3\u0003\u009cN\u0000\u02c3\u02c5"+
		"\u0001\u0000\u0000\u0000\u02c4\u0282\u0001\u0000\u0000\u0000\u02c4\u0285"+
		"\u0001\u0000\u0000\u0000\u02c4\u0288\u0001\u0000\u0000\u0000\u02c4\u028b"+
		"\u0001\u0000\u0000\u0000\u02c4\u028e\u0001\u0000\u0000\u0000\u02c4\u0291"+
		"\u0001\u0000\u0000\u0000\u02c4\u0293\u0001\u0000\u0000\u0000\u02c4\u0296"+
		"\u0001\u0000\u0000\u0000\u02c4\u0298\u0001\u0000\u0000\u0000\u02c4\u029a"+
		"\u0001\u0000\u0000\u0000\u02c4\u029c\u0001\u0000\u0000\u0000\u02c4\u029e"+
		"\u0001\u0000\u0000\u0000\u02c4\u02a0\u0001\u0000\u0000\u0000\u02c4\u02ac"+
		"\u0001\u0000\u0000\u0000\u02c4\u02b8\u0001\u0000\u0000\u0000\u02c5Y\u0001"+
		"\u0000\u0000\u0000\u02c6\u02c7\u0005\u000e\u0000\u0000\u02c7\u02cb\u0003"+
		"\u009cN\u0000\u02c8\u02ca\u0003X,\u0000\u02c9\u02c8\u0001\u0000\u0000"+
		"\u0000\u02ca\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02d1\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d2\u0003^/\u0000\u02cf"+
		"\u02d0\u0005%\u0000\u0000\u02d0\u02d2\u0003\u009cN\u0000\u02d1\u02ce\u0001"+
		"\u0000\u0000\u0000\u02d1\u02cf\u0001\u0000\u0000\u0000\u02d2[\u0001\u0000"+
		"\u0000\u0000\u02d3\u02dd\u0003^/\u0000\u02d4\u02d5\u0005\u000e\u0000\u0000"+
		"\u02d5\u02dd\u0003\u009cN\u0000\u02d6\u02d7\u0005%\u0000\u0000\u02d7\u02dd"+
		"\u0003\u009cN\u0000\u02d8\u02d9\u00055\u0000\u0000\u02d9\u02dd\u0003\u009c"+
		"N\u0000\u02da\u02db\u00056\u0000\u0000\u02db\u02dd\u0003\u009cN\u0000"+
		"\u02dc\u02d3\u0001\u0000\u0000\u0000\u02dc\u02d4\u0001\u0000\u0000\u0000"+
		"\u02dc\u02d6\u0001\u0000\u0000\u0000\u02dc\u02d8\u0001\u0000\u0000\u0000"+
		"\u02dc\u02da\u0001\u0000\u0000\u0000\u02dd]\u0001\u0000\u0000\u0000\u02de"+
		"\u02df\u0005#\u0000\u0000\u02df\u02ea\u0003\u009cN\u0000\u02e0\u02e9\u0003"+
		">\u001f\u0000\u02e1\u02e9\u0003`0\u0000\u02e2\u02e9\u0003X,\u0000\u02e3"+
		"\u02e9\u0003^/\u0000\u02e4\u02e5\u0005\u000e\u0000\u0000\u02e5\u02e9\u0003"+
		"\u009cN\u0000\u02e6\u02e7\u0005%\u0000\u0000\u02e7\u02e9\u0003\u009cN"+
		"\u0000\u02e8\u02e0\u0001\u0000\u0000\u0000\u02e8\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e2\u0001\u0000\u0000\u0000\u02e8\u02e3\u0001\u0000\u0000"+
		"\u0000\u02e8\u02e4\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000\u02ea\u02e8\u0001\u0000\u0000"+
		"\u0000\u02ea\u02eb\u0001\u0000\u0000\u0000\u02eb\u02ed\u0001\u0000\u0000"+
		"\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005$\u0000\u0000"+
		"\u02ee\u02ef\u0003\u009cN\u0000\u02ef_\u0001\u0000\u0000\u0000\u02f0\u02fb"+
		"\u0003<\u001e\u0000\u02f1\u02fb\u0003\n\u0005\u0000\u02f2\u02fb\u0003"+
		"\u0016\u000b\u0000\u02f3\u02fb\u0003\u0080@\u0000\u02f4\u02fb\u0003\u0084"+
		"B\u0000\u02f5\u02fb\u0003d2\u0000\u02f6\u02fb\u0003\u008aE\u0000\u02f7"+
		"\u02fb\u0003\u008cF\u0000\u02f8\u02fb\u0003\u008eG\u0000\u02f9\u02fb\u0003"+
		"Z-\u0000\u02fa\u02f0\u0001\u0000\u0000\u0000\u02fa\u02f1\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f2\u0001\u0000\u0000\u0000\u02fa\u02f3\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f4\u0001\u0000\u0000\u0000\u02fa\u02f5\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f6\u0001\u0000\u0000\u0000\u02fa\u02f7\u0001\u0000\u0000"+
		"\u0000\u02fa\u02f8\u0001\u0000\u0000\u0000\u02fa\u02f9\u0001\u0000\u0000"+
		"\u0000\u02fba\u0001\u0000\u0000\u0000\u02fc\u02fd\u0005#\u0000\u0000\u02fd"+
		"\u0301\u0003\u009cN\u0000\u02fe\u0300\u0003`0\u0000\u02ff\u02fe\u0001"+
		"\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000\u0301\u02ff\u0001"+
		"\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000\u0302\u0304\u0001"+
		"\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000\u0304\u0305\u0005"+
		"$\u0000\u0000\u0305\u0306\u0003\u009cN\u0000\u0306c\u0001\u0000\u0000"+
		"\u0000\u0307\u0308\u0005\b\u0000\u0000\u0308\u0309\u0003\u009cN\u0000"+
		"\u0309\u030a\u0003f3\u0000\u030a\u030b\u0003\u009cN\u0000\u030b\u030c"+
		"\u0003b1\u0000\u030ce\u0001\u0000\u0000\u0000\u030d\u0312\u0003j5\u0000"+
		"\u030e\u0312\u0003l6\u0000\u030f\u0312\u0003n7\u0000\u0310\u0312\u0003"+
		"h4\u0000\u0311\u030d\u0001\u0000\u0000\u0000\u0311\u030e\u0001\u0000\u0000"+
		"\u0000\u0311\u030f\u0001\u0000\u0000\u0000\u0311\u0310\u0001\u0000\u0000"+
		"\u0000\u0312g\u0001\u0000\u0000\u0000\u0313\u0314\u0005!\u0000\u0000\u0314"+
		"\u0315\u0003\u009cN\u0000\u0315\u0316\u0003f3\u0000\u0316\u0317\u0003"+
		"\u009cN\u0000\u0317\u0318\u0005\"\u0000\u0000\u0318\u031c\u0001\u0000"+
		"\u0000\u0000\u0319\u031c\u0003p8\u0000\u031a\u031c\u0003r9\u0000\u031b"+
		"\u0313\u0001\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b"+
		"\u031a\u0001\u0000\u0000\u0000\u031ci\u0001\u0000\u0000\u0000\u031d\u031e"+
		"\u0005\u000b\u0000\u0000\u031e\u031f\u0003\u009cN\u0000\u031f\u0320\u0005"+
		"4\u0000\u0000\u0320\u0321\u0003\u009cN\u0000\u0321\u0322\u0003h4\u0000"+
		"\u0322k\u0001\u0000\u0000\u0000\u0323\u032d\u0003h4\u0000\u0324\u0325"+
		"\u0003\u009cN\u0000\u0325\u0326\u00054\u0000\u0000\u0326\u0327\u0003\u009c"+
		"N\u0000\u0327\u0328\u0005\f\u0000\u0000\u0328\u0329\u0003\u009cN\u0000"+
		"\u0329\u032a\u00054\u0000\u0000\u032a\u032b\u0003\u009cN\u0000\u032b\u032c"+
		"\u0003h4\u0000\u032c\u032e\u0001\u0000\u0000\u0000\u032d\u0324\u0001\u0000"+
		"\u0000\u0000\u032e\u032f\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000"+
		"\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330m\u0001\u0000\u0000"+
		"\u0000\u0331\u033b\u0003h4\u0000\u0332\u0333\u0003\u009cN\u0000\u0333"+
		"\u0334\u00054\u0000\u0000\u0334\u0335\u0003\u009cN\u0000\u0335\u0336\u0005"+
		"\r\u0000\u0000\u0336\u0337\u0003\u009cN\u0000\u0337\u0338\u00054\u0000"+
		"\u0000\u0338\u0339\u0003\u009cN\u0000\u0339\u033a\u0003h4\u0000\u033a"+
		"\u033c\u0001\u0000\u0000\u0000\u033b\u0332\u0001\u0000\u0000\u0000\u033c"+
		"\u033d\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000\u033d"+
		"\u033e\u0001\u0000\u0000\u0000\u033eo\u0001\u0000\u0000\u0000\u033f\u0340"+
		"\u0005!\u0000\u0000\u0340\u0341\u0003\u009cN\u0000\u0341\u0342\u0003@"+
		" \u0000\u0342\u0343\u0005\"\u0000\u0000\u0343q\u0001\u0000\u0000\u0000"+
		"\u0344\u0349\u0007\u0004\u0000\u0000\u0345\u0348\u0003X,\u0000\u0346\u0348"+
		"\u0003\\.\u0000\u0347\u0345\u0001\u0000\u0000\u0000\u0347\u0346\u0001"+
		"\u0000\u0000\u0000\u0348\u034b\u0001\u0000\u0000\u0000\u0349\u0347\u0001"+
		"\u0000\u0000\u0000\u0349\u034a\u0001\u0000\u0000\u0000\u034a\u034c\u0001"+
		"\u0000\u0000\u0000\u034b\u0349\u0001\u0000\u0000\u0000\u034c\u034d\u0005"+
		"\"\u0000\u0000\u034ds\u0001\u0000\u0000\u0000\u034e\u034f\u0005\u0016"+
		"\u0000\u0000\u034f\u0350\u0003\u009cN\u0000\u0350\u0351\u0005=\u0000\u0000"+
		"\u0351\u0352\u0003\u009cN\u0000\u0352\u0353\u0005\"\u0000\u0000\u0353"+
		"\u0356\u0001\u0000\u0000\u0000\u0354\u0356\u00053\u0000\u0000\u0355\u034e"+
		"\u0001\u0000\u0000\u0000\u0355\u0354\u0001\u0000\u0000\u0000\u0356u\u0001"+
		"\u0000\u0000\u0000\u0357\u0358\u0005\u0017\u0000\u0000\u0358\u0359\u0003"+
		"\u009cN\u0000\u0359\u035a\u0005>\u0000\u0000\u035a\u035b\u0003\u009cN"+
		"\u0000\u035b\u035c\u0005\"\u0000\u0000\u035c\u035d\u0003\u009cN\u0000"+
		"\u035dw\u0001\u0000\u0000\u0000\u035e\u035f\u0005\u0019\u0000\u0000\u035f"+
		"\u0360\u0003\u009cN\u0000\u0360\u0361\u0003z=\u0000\u0361\u0362\u0005"+
		"\"\u0000\u0000\u0362\u0363\u0003\u009cN\u0000\u0363y\u0001\u0000\u0000"+
		"\u0000\u0364\u036f\u0003|>\u0000\u0365\u0366\u00054\u0000\u0000\u0366"+
		"\u0367\u0003\u009cN\u0000\u0367\u0368\u0007\u0003\u0000\u0000\u0368\u0369"+
		"\u0003\u009cN\u0000\u0369\u036a\u00054\u0000\u0000\u036a\u036b\u0003\u009c"+
		"N\u0000\u036b\u036c\u0003|>\u0000\u036c\u036e\u0001\u0000\u0000\u0000"+
		"\u036d\u0365\u0001\u0000\u0000\u0000\u036e\u0371\u0001\u0000\u0000\u0000"+
		"\u036f\u036d\u0001\u0000\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000"+
		"\u0370{\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000\u0372"+
		"\u037e\u0003~?\u0000\u0373\u0374\u0005\u001b\u0000\u0000\u0374\u0375\u0003"+
		"\u009cN\u0000\u0375\u0376\u0003~?\u0000\u0376\u037d\u0001\u0000\u0000"+
		"\u0000\u0377\u0378\u0005\u001c\u0000\u0000\u0378\u0379\u0003\u009cN\u0000"+
		"\u0379\u037a\u0003P(\u0000\u037a\u037b\u0003\u009cN\u0000\u037b\u037d"+
		"\u0001\u0000\u0000\u0000\u037c\u0373\u0001\u0000\u0000\u0000\u037c\u0377"+
		"\u0001\u0000\u0000\u0000\u037d\u0380\u0001\u0000\u0000\u0000\u037e\u037c"+
		"\u0001\u0000\u0000\u0000\u037e\u037f\u0001\u0000\u0000\u0000\u037f}\u0001"+
		"\u0000\u0000\u0000\u0380\u037e\u0001\u0000\u0000\u0000\u0381\u0382\u0003"+
		"P(\u0000\u0382\u0383\u0003\u009cN\u0000\u0383\u0394\u0001\u0000\u0000"+
		"\u0000\u0384\u0385\u0003T*\u0000\u0385\u0386\u0003\u009cN\u0000\u0386"+
		"\u0394\u0001\u0000\u0000\u0000\u0387\u0388\u0003V+\u0000\u0388\u0389\u0003"+
		"\u009cN\u0000\u0389\u0394\u0001\u0000\u0000\u0000\u038a\u038b\u0003R)"+
		"\u0000\u038b\u038c\u0003\u009cN\u0000\u038c\u0394\u0001\u0000\u0000\u0000"+
		"\u038d\u038e\u0005!\u0000\u0000\u038e\u038f\u0003\u009cN\u0000\u038f\u0390"+
		"\u0003z=\u0000\u0390\u0391\u0005\"\u0000\u0000\u0391\u0392\u0003\u009c"+
		"N\u0000\u0392\u0394\u0001\u0000\u0000\u0000\u0393\u0381\u0001\u0000\u0000"+
		"\u0000\u0393\u0384\u0001\u0000\u0000\u0000\u0393\u0387\u0001\u0000\u0000"+
		"\u0000\u0393\u038a\u0001\u0000\u0000\u0000\u0393\u038d\u0001\u0000\u0000"+
		"\u0000\u0394\u007f\u0001\u0000\u0000\u0000\u0395\u0396\u0005\u0007\u0000"+
		"\u0000\u0396\u0397\u0003\u009cN\u0000\u0397\u0398\u0005#\u0000\u0000\u0398"+
		"\u039a\u0003\u009cN\u0000\u0399\u039b\u0003\u0082A\u0000\u039a\u0399\u0001"+
		"\u0000\u0000\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u03a3\u0001"+
		"\u0000\u0000\u0000\u039c\u039d\u0005%\u0000\u0000\u039d\u039f\u0003\u009c"+
		"N\u0000\u039e\u03a0\u0003\u0082A\u0000\u039f\u039e\u0001\u0000\u0000\u0000"+
		"\u039f\u03a0\u0001\u0000\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000"+
		"\u03a1\u039c\u0001\u0000\u0000\u0000\u03a2\u03a5\u0001\u0000\u0000\u0000"+
		"\u03a3\u03a1\u0001\u0000\u0000\u0000\u03a3\u03a4\u0001\u0000\u0000\u0000"+
		"\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u03a3\u0001\u0000\u0000\u0000"+
		"\u03a6\u03a7\u0005$\u0000\u0000\u03a7\u03a8\u0003\u009cN\u0000\u03a8\u0081"+
		"\u0001\u0000\u0000\u0000\u03a9\u03aa\u0003:\u001d\u0000\u03aa\u03ab\u0005"+
		"&\u0000\u0000\u03ab\u03ac\u0003\u009cN\u0000\u03ac\u03ad\u0003F#\u0000"+
		"\u03ad\u03b4\u0001\u0000\u0000\u0000\u03ae\u03af\u0003:\u001d\u0000\u03af"+
		"\u03b0\u0005&\u0000\u0000\u03b0\u03b1\u0003\u009cN\u0000\u03b1\u03b2\u0003"+
		"D\"\u0000\u03b2\u03b4\u0001\u0000\u0000\u0000\u03b3\u03a9\u0001\u0000"+
		"\u0000\u0000\u03b3\u03ae\u0001\u0000\u0000\u0000\u03b4\u0083\u0001\u0000"+
		"\u0000\u0000\u03b5\u03b6\u0005\u000f\u0000\u0000\u03b6\u03b7\u0003\u009c"+
		"N\u0000\u03b7\u03b8\u00054\u0000\u0000\u03b8\u03b9\u0003\u009cN\u0000"+
		"\u03b9\u03ba\u0003\u009aM\u0000\u03ba\u03bb\u0003\u009cN\u0000\u03bb\u03bc"+
		"\u0005#\u0000\u0000\u03bc\u03c0\u0003\u009cN\u0000\u03bd\u03bf\u0003\u0086"+
		"C\u0000\u03be\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c0\u03be\u0001\u0000\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000"+
		"\u0000\u03c1\u03c3\u0001\u0000\u0000\u0000\u03c2\u03c0\u0001\u0000\u0000"+
		"\u0000\u03c3\u03c4\u0005$\u0000\u0000\u03c4\u03c5\u0003\u009cN\u0000\u03c5"+
		"\u0085\u0001\u0000\u0000\u0000\u03c6\u03c7\u0003\u0088D\u0000\u03c7\u03c8"+
		"\u0005#\u0000\u0000\u03c8\u03ca\u0003\u009cN\u0000\u03c9\u03cb\u0003>"+
		"\u001f\u0000\u03ca\u03c9\u0001\u0000\u0000\u0000\u03ca\u03cb\u0001\u0000"+
		"\u0000\u0000\u03cb\u03cc\u0001\u0000\u0000\u0000\u03cc\u03cd\u0005$\u0000"+
		"\u0000\u03cd\u03ce\u0003\u009cN\u0000\u03ce\u0087\u0001\u0000\u0000\u0000"+
		"\u03cf\u03d0\u0007\u0005\u0000\u0000\u03d0\u03d8\u0003\u009cN\u0000\u03d1"+
		"\u03d2\u0005+\u0000\u0000\u03d2\u03d3\u0003\u009cN\u0000\u03d3\u03d4\u0007"+
		"\u0005\u0000\u0000\u03d4\u03d5\u0003\u009cN\u0000\u03d5\u03d7\u0001\u0000"+
		"\u0000\u0000\u03d6\u03d1\u0001\u0000\u0000\u0000\u03d7\u03da\u0001\u0000"+
		"\u0000\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d8\u03d9\u0001\u0000"+
		"\u0000\u0000\u03d9\u0089\u0001\u0000\u0000\u0000\u03da\u03d8\u0001\u0000"+
		"\u0000\u0000\u03db\u03dc\u0005\u0012\u0000\u0000\u03dc\u03dd\u0003\u009c"+
		"N\u0000\u03dd\u03de\u0005#\u0000\u0000\u03de\u03e0\u0003\u009cN\u0000"+
		"\u03df\u03e1\u0003>\u001f\u0000\u03e0\u03df\u0001\u0000\u0000\u0000\u03e0"+
		"\u03e1\u0001\u0000\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2"+
		"\u03e3\u0005$\u0000\u0000\u03e3\u03e4\u0003\u009cN\u0000\u03e4\u008b\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e6\u0005\u0013\u0000\u0000\u03e6\u03e7\u0003"+
		"\u009cN\u0000\u03e7\u03e8\u0003\u009aM\u0000\u03e8\u03e9\u0003\u009cN"+
		"\u0000\u03e9\u03ea\u0005#\u0000\u0000\u03ea\u03ec\u0003\u009cN\u0000\u03eb"+
		"\u03ed\u0003>\u001f\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0001\u0000\u0000\u0000\u03ed\u03ee\u0001\u0000\u0000\u0000\u03ee\u03ef"+
		"\u0005$\u0000\u0000\u03ef\u03f0\u0003\u009cN\u0000\u03f0\u008d\u0001\u0000"+
		"\u0000\u0000\u03f1\u03f2\u0005\u0014\u0000\u0000\u03f2\u03f3\u0003\u009c"+
		"N\u0000\u03f3\u03f4\u0003\u0090H\u0000\u03f4\u03f5\u0003\u009cN\u0000"+
		"\u03f5\u03f6\u0005#\u0000\u0000\u03f6\u03fa\u0003\u009cN\u0000\u03f7\u03f9"+
		"\u0003\u0094J\u0000\u03f8\u03f7\u0001\u0000\u0000\u0000\u03f9\u03fc\u0001"+
		"\u0000\u0000\u0000\u03fa\u03f8\u0001\u0000\u0000\u0000\u03fa\u03fb\u0001"+
		"\u0000\u0000\u0000\u03fb\u03fd\u0001\u0000\u0000\u0000\u03fc\u03fa\u0001"+
		"\u0000\u0000\u0000\u03fd\u03fe\u0005$\u0000\u0000\u03fe\u03ff\u0003\u009c"+
		"N\u0000\u03ff\u008f\u0001\u0000\u0000\u0000\u0400\u0408\u0003\u0092I\u0000"+
		"\u0401\u0402\u0003\u009cN\u0000\u0402\u0403\u0005+\u0000\u0000\u0403\u0404"+
		"\u0003\u009cN\u0000\u0404\u0405\u0003\u0092I\u0000\u0405\u0407\u0001\u0000"+
		"\u0000\u0000\u0406\u0401\u0001\u0000\u0000\u0000\u0407\u040a\u0001\u0000"+
		"\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000\u0408\u0409\u0001\u0000"+
		"\u0000\u0000\u0409\u0091\u0001\u0000\u0000\u0000\u040a\u0408\u0001\u0000"+
		"\u0000\u0000\u040b\u0416\u0005=\u0000\u0000\u040c\u0412\u0003\u009aM\u0000"+
		"\u040d\u040e\u0003\u009cN\u0000\u040e\u040f\u0003\u009aM\u0000\u040f\u0411"+
		"\u0001\u0000\u0000\u0000\u0410\u040d\u0001\u0000\u0000\u0000\u0411\u0414"+
		"\u0001\u0000\u0000\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0412\u0413"+
		"\u0001\u0000\u0000\u0000\u0413\u0416\u0001\u0000\u0000\u0000\u0414\u0412"+
		"\u0001\u0000\u0000\u0000\u0415\u040b\u0001\u0000\u0000\u0000\u0415\u040c"+
		"\u0001\u0000\u0000\u0000\u0416\u0093\u0001\u0000\u0000\u0000\u0417\u0418"+
		"\u0003\u0096K\u0000\u0418\u0419\u0003\u009cN\u0000\u0419\u041a\u0005#"+
		"\u0000\u0000\u041a\u041c\u0003\u009cN\u0000\u041b\u041d\u0003\u0098L\u0000"+
		"\u041c\u041b\u0001\u0000\u0000\u0000\u041c\u041d\u0001\u0000\u0000\u0000"+
		"\u041d\u0426\u0001\u0000\u0000\u0000\u041e\u041f\u0003\u009cN\u0000\u041f"+
		"\u0420\u0005%\u0000\u0000\u0420\u0422\u0003\u009cN\u0000\u0421\u0423\u0003"+
		"\u0098L\u0000\u0422\u0421\u0001\u0000\u0000\u0000\u0422\u0423\u0001\u0000"+
		"\u0000\u0000\u0423\u0425\u0001\u0000\u0000\u0000\u0424\u041e\u0001\u0000"+
		"\u0000\u0000\u0425\u0428\u0001\u0000\u0000\u0000\u0426\u0424\u0001\u0000"+
		"\u0000\u0000\u0426\u0427\u0001\u0000\u0000\u0000\u0427\u0429\u0001\u0000"+
		"\u0000\u0000\u0428\u0426\u0001\u0000\u0000\u0000\u0429\u042a\u0005$\u0000"+
		"\u0000\u042a\u042b\u0003\u009cN\u0000\u042b\u0095\u0001\u0000\u0000\u0000"+
		"\u042c\u042d\u0005\u000e\u0000\u0000\u042d\u0097\u0001\u0000\u0000\u0000"+
		"\u042e\u042f\u0003\u009aM\u0000\u042f\u0430\u0003\u009cN\u0000\u0430\u0431"+
		"\u0005&\u0000\u0000\u0431\u0432\u0003\u009cN\u0000\u0432\u0438\u0003P"+
		"(\u0000\u0433\u0434\u0003\u009cN\u0000\u0434\u0435\u0003P(\u0000\u0435"+
		"\u0437\u0001\u0000\u0000\u0000\u0436\u0433\u0001\u0000\u0000\u0000\u0437"+
		"\u043a\u0001\u0000\u0000\u0000\u0438\u0436\u0001\u0000\u0000\u0000\u0438"+
		"\u0439\u0001\u0000\u0000\u0000\u0439\u0099\u0001\u0000\u0000\u0000\u043a"+
		"\u0438\u0001\u0000\u0000\u0000\u043b\u043c\u0007\u0006\u0000\u0000\u043c"+
		"\u009b\u0001\u0000\u0000\u0000\u043d\u043f\u0007\u0007\u0000\u0000\u043e"+
		"\u043d\u0001\u0000\u0000\u0000\u043f\u0442\u0001\u0000\u0000\u0000\u0440"+
		"\u043e\u0001\u0000\u0000\u0000\u0440\u0441\u0001\u0000\u0000\u0000\u0441"+
		"\u009d\u0001\u0000\u0000\u0000\u0442\u0440\u0001\u0000\u0000\u0000l\u00a3"+
		"\u00a8\u00af\u00b4\u00bb\u00c0\u00c7\u00cc\u00d6\u00de\u00e3\u00ec\u00f0"+
		"\u00f4\u0107\u010a\u010f\u011a\u0124\u0127\u0132\u013d\u0142\u0147\u014b"+
		"\u015c\u0167\u0172\u0176\u017d\u017f\u0187\u0189\u018b\u018e\u0194\u019b"+
		"\u01a5\u01ad\u01b1\u01b7\u01bb\u01c9\u01ce\u01dc\u01e6\u01f1\u01f7\u01ff"+
		"\u0205\u020a\u0210\u0218\u021c\u0224\u022b\u0234\u0236\u023a\u023f\u025d"+
		"\u026f\u0274\u0279\u027e\u02a4\u02a6\u02b0\u02b2\u02bc\u02be\u02c4\u02cb"+
		"\u02d1\u02dc\u02e8\u02ea\u02fa\u0301\u0311\u031b\u032f\u033d\u0347\u0349"+
		"\u0355\u036f\u037c\u037e\u0393\u039a\u039f\u03a3\u03b3\u03c0\u03ca\u03d8"+
		"\u03e0\u03ec\u03fa\u0408\u0412\u0415\u041c\u0422\u0426\u0438\u0440";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}