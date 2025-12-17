// Generated from D:/Compiler_1/Compiler - Copy/Compiler_1/src/antlr/HtmlJinjaParser.g4 by ANTLR 4.13.2
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
public class HtmlJinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HTML_COMMENT=1, JINJA_COMMENT=2, SCRIPTLET=3, SEA_WS=4, TAG_OPEN=5, SCRIPT_OPEN=6, 
		STYLE_OPEN=7, JINJA_VAR_START=8, JINJA_BLOCK_START=9, HTML_TEXT=10, TAG_JINJA_BLOCK=11, 
		TAG_JINJA_VAR=12, TAG_CLOSE=13, TAG_SLASH_CLOSE=14, TAG_SLASH=15, TAG_EQUALS=16, 
		TAG_NAME=17, TAG_WHITESPACE=18, SCRIPT_BODY=19, STYLE_BODY=20, ATTVALUE_VALUE=21, 
		ATTRIBUTE=22, JINJA_WS=23, JINJA_BLOCK_END=24, JINJA_VAR_END=25, JINJA_IF=26, 
		JINJA_ELIF=27, JINJA_ELSE=28, JINJA_ENDIF=29, JINJA_FOR=30, JINJA_IN=31, 
		JINJA_ENDFOR=32, JINJA_SET=33, JINJA_WHILE=34, JINJA_ENDWHILE=35, JINJA_ADD=36, 
		JINJA_SUB=37, JINJA_MUL=38, JINJA_DIV=39, JINJA_SEQ=40, JINJA_EQ=41, JINJA_NEQ=42, 
		JINJA_GT=43, JINJA_LT=44, JINJA_GTEQ=45, JINJA_LTEQ=46, JINJA_DQ=47, JINJA_SQ=48, 
		JINJA_LP=49, JINJA_RP=50, JINJA_LSP=51, JINJA_RSP=52, JINJA_DOT=53, JINJA_PIP=54, 
		JINJA_COMA=55, JINJA_ID=56, JINJA_INT=57, JINJA_DOUBLE=58, JINJA_STRING=59, 
		JINJA_BOOL=60;
	public static final int
		RULE_htmlDocument = 0, RULE_scriptletOrSeaWs = 1, RULE_htmlElement = 2, 
		RULE_htmlContent = 3, RULE_htmlAttribute = 4, RULE_htmlChardata = 5, RULE_htmlMisc = 6, 
		RULE_htmlComment = 7, RULE_jinjaComment = 8, RULE_jinjaExpression = 9, 
		RULE_expression = 10, RULE_jinja_statement = 11, RULE_assignment_statement = 12, 
		RULE_if_statement = 13, RULE_if_fragment = 14, RULE_elif_statement = 15, 
		RULE_elif_fragment = 16, RULE_else_statement = 17, RULE_else_fragment = 18, 
		RULE_endif_fragment = 19, RULE_while_statement = 20, RULE_while_fragment = 21, 
		RULE_endwhile_fragment = 22, RULE_for_statement = 23, RULE_for_fragment = 24, 
		RULE_for_target = 25, RULE_endfor_fragment = 26, RULE_script = 27, RULE_style = 28, 
		RULE_templateContent = 29, RULE_htmlTagContent = 30, RULE_tagJinjaBlock = 31, 
		RULE_tagIfBlock = 32, RULE_tagElifBlock = 33, RULE_tagElseBlock = 34, 
		RULE_tagForBlock = 35, RULE_tagWhileBlock = 36;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "scriptletOrSeaWs", "htmlElement", "htmlContent", "htmlAttribute", 
			"htmlChardata", "htmlMisc", "htmlComment", "jinjaComment", "jinjaExpression", 
			"expression", "jinja_statement", "assignment_statement", "if_statement", 
			"if_fragment", "elif_statement", "elif_fragment", "else_statement", "else_fragment", 
			"endif_fragment", "while_statement", "while_fragment", "endwhile_fragment", 
			"for_statement", "for_fragment", "for_target", "endfor_fragment", "script", 
			"style", "templateContent", "htmlTagContent", "tagJinjaBlock", "tagIfBlock", 
			"tagElifBlock", "tagElseBlock", "tagForBlock", "tagWhileBlock"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'{{'", "'{%'", null, 
			null, null, null, "'/>'", null, null, null, null, null, null, null, null, 
			null, "'%}'", "'}}'", "'if'", "'elif'", "'else'", "'endif'", "'for'", 
			"'in'", "'endfor'", "'set'", "'while'", "'endwhile'", "'+'", "'-'", "'*'", 
			null, null, "'=='", "'!='", null, null, "'>='", "'<='", "'\"'", "'''", 
			"'('", "')'", "'['", "']'", "'.'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "JINJA_COMMENT", "SCRIPTLET", "SEA_WS", "TAG_OPEN", 
			"SCRIPT_OPEN", "STYLE_OPEN", "JINJA_VAR_START", "JINJA_BLOCK_START", 
			"HTML_TEXT", "TAG_JINJA_BLOCK", "TAG_JINJA_VAR", "TAG_CLOSE", "TAG_SLASH_CLOSE", 
			"TAG_SLASH", "TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", 
			"STYLE_BODY", "ATTVALUE_VALUE", "ATTRIBUTE", "JINJA_WS", "JINJA_BLOCK_END", 
			"JINJA_VAR_END", "JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", "JINJA_ENDIF", 
			"JINJA_FOR", "JINJA_IN", "JINJA_ENDFOR", "JINJA_SET", "JINJA_WHILE", 
			"JINJA_ENDWHILE", "JINJA_ADD", "JINJA_SUB", "JINJA_MUL", "JINJA_DIV", 
			"JINJA_SEQ", "JINJA_EQ", "JINJA_NEQ", "JINJA_GT", "JINJA_LT", "JINJA_GTEQ", 
			"JINJA_LTEQ", "JINJA_DQ", "JINJA_SQ", "JINJA_LP", "JINJA_RP", "JINJA_LSP", 
			"JINJA_RSP", "JINJA_DOT", "JINJA_PIP", "JINJA_COMA", "JINJA_ID", "JINJA_INT", 
			"JINJA_DOUBLE", "JINJA_STRING", "JINJA_BOOL"
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
	public String getGrammarFileName() { return "HtmlJinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HtmlJinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HtmlDocumentContext extends ParserRuleContext {
		public List<ScriptletOrSeaWsContext> scriptletOrSeaWs() {
			return getRuleContexts(ScriptletOrSeaWsContext.class);
		}
		public ScriptletOrSeaWsContext scriptletOrSeaWs(int i) {
			return getRuleContext(ScriptletOrSeaWsContext.class,i);
		}
		public List<HtmlMiscContext> htmlMisc() {
			return getRuleContexts(HtmlMiscContext.class);
		}
		public HtmlMiscContext htmlMisc(int i) {
			return getRuleContext(HtmlMiscContext.class,i);
		}
		public List<HtmlElementContext> htmlElement() {
			return getRuleContexts(HtmlElementContext.class);
		}
		public HtmlElementContext htmlElement(int i) {
			return getRuleContext(HtmlElementContext.class,i);
		}
		public HtmlDocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlDocument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlDocument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlDocument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlDocumentContext htmlDocument() throws RecognitionException {
		HtmlDocumentContext _localctx = new HtmlDocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_htmlDocument);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(74);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(82);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HTML_COMMENT:
				case JINJA_COMMENT:
				case SEA_WS:
					{
					setState(80);
					htmlMisc();
					}
					break;
				case SCRIPTLET:
				case TAG_OPEN:
				case SCRIPT_OPEN:
				case STYLE_OPEN:
				case JINJA_VAR_START:
				case JINJA_BLOCK_START:
					{
					setState(81);
					htmlElement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(86);
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
	public static class ScriptletOrSeaWsContext extends ParserRuleContext {
		public TerminalNode SCRIPTLET() { return getToken(HtmlJinjaParser.SCRIPTLET, 0); }
		public TerminalNode SEA_WS() { return getToken(HtmlJinjaParser.SEA_WS, 0); }
		public ScriptletOrSeaWsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scriptletOrSeaWs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScriptletOrSeaWs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScriptletOrSeaWs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScriptletOrSeaWs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptletOrSeaWsContext scriptletOrSeaWs() throws RecognitionException {
		ScriptletOrSeaWsContext _localctx = new ScriptletOrSeaWsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !(_la==SCRIPTLET || _la==SEA_WS) ) {
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
	public static class HtmlElementContext extends ParserRuleContext {
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public Jinja_statementContext jinja_statement() {
			return getRuleContext(Jinja_statementContext.class,0);
		}
		public List<TerminalNode> TAG_OPEN() { return getTokens(HtmlJinjaParser.TAG_OPEN); }
		public TerminalNode TAG_OPEN(int i) {
			return getToken(HtmlJinjaParser.TAG_OPEN, i);
		}
		public List<TerminalNode> TAG_NAME() { return getTokens(HtmlJinjaParser.TAG_NAME); }
		public TerminalNode TAG_NAME(int i) {
			return getToken(HtmlJinjaParser.TAG_NAME, i);
		}
		public List<TerminalNode> TAG_CLOSE() { return getTokens(HtmlJinjaParser.TAG_CLOSE); }
		public TerminalNode TAG_CLOSE(int i) {
			return getToken(HtmlJinjaParser.TAG_CLOSE, i);
		}
		public TerminalNode TAG_SLASH_CLOSE() { return getToken(HtmlJinjaParser.TAG_SLASH_CLOSE, 0); }
		public List<HtmlTagContentContext> htmlTagContent() {
			return getRuleContexts(HtmlTagContentContext.class);
		}
		public HtmlTagContentContext htmlTagContent(int i) {
			return getRuleContext(HtmlTagContentContext.class,i);
		}
		public HtmlContentContext htmlContent() {
			return getRuleContext(HtmlContentContext.class,0);
		}
		public TerminalNode TAG_SLASH() { return getToken(HtmlJinjaParser.TAG_SLASH, 0); }
		public TerminalNode SCRIPTLET() { return getToken(HtmlJinjaParser.SCRIPTLET, 0); }
		public ScriptContext script() {
			return getRuleContext(ScriptContext.class,0);
		}
		public StyleContext style() {
			return getRuleContext(StyleContext.class,0);
		}
		public HtmlElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlElementContext htmlElement() throws RecognitionException {
		HtmlElementContext _localctx = new HtmlElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_htmlElement);
		int _la;
		try {
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				jinjaExpression();
				}
				break;
			case JINJA_BLOCK_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				jinja_statement();
				}
				break;
			case TAG_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				match(TAG_OPEN);
				setState(92);
				match(TAG_NAME);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137472L) != 0)) {
					{
					{
					setState(93);
					htmlTagContent();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(99);
					match(TAG_CLOSE);
					setState(106);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(100);
						htmlContent();
						setState(101);
						match(TAG_OPEN);
						setState(102);
						match(TAG_SLASH);
						setState(103);
						match(TAG_NAME);
						setState(104);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(108);
					match(TAG_SLASH_CLOSE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case SCRIPTLET:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				style();
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
	public static class HtmlContentContext extends ParserRuleContext {
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public HtmlContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContentContext htmlContent() throws RecognitionException {
		HtmlContentContext _localctx = new HtmlContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					templateContent();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
	public static class HtmlAttributeContext extends ParserRuleContext {
		public TerminalNode TAG_NAME() { return getToken(HtmlJinjaParser.TAG_NAME, 0); }
		public TerminalNode TAG_EQUALS() { return getToken(HtmlJinjaParser.TAG_EQUALS, 0); }
		public TerminalNode ATTVALUE_VALUE() { return getToken(HtmlJinjaParser.ATTVALUE_VALUE, 0); }
		public HtmlAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlAttributeContext htmlAttribute() throws RecognitionException {
		HtmlAttributeContext _localctx = new HtmlAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(TAG_NAME);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(123);
				match(TAG_EQUALS);
				setState(124);
				match(ATTVALUE_VALUE);
				}
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
	public static class HtmlChardataContext extends ParserRuleContext {
		public TerminalNode HTML_TEXT() { return getToken(HtmlJinjaParser.HTML_TEXT, 0); }
		public TerminalNode SEA_WS() { return getToken(HtmlJinjaParser.SEA_WS, 0); }
		public HtmlChardataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlChardata; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlChardata(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlChardata(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlChardata(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlChardataContext htmlChardata() throws RecognitionException {
		HtmlChardataContext _localctx = new HtmlChardataContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_la = _input.LA(1);
			if ( !(_la==SEA_WS || _la==HTML_TEXT) ) {
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
	public static class HtmlMiscContext extends ParserRuleContext {
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public TerminalNode SEA_WS() { return getToken(HtmlJinjaParser.SEA_WS, 0); }
		public HtmlMiscContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlMisc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlMisc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlMisc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlMisc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlMiscContext htmlMisc() throws RecognitionException {
		HtmlMiscContext _localctx = new HtmlMiscContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_htmlMisc);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				htmlComment();
				}
				break;
			case JINJA_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				jinjaComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(SEA_WS);
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
	public static class HtmlCommentContext extends ParserRuleContext {
		public TerminalNode HTML_COMMENT() { return getToken(HtmlJinjaParser.HTML_COMMENT, 0); }
		public HtmlCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlCommentContext htmlComment() throws RecognitionException {
		HtmlCommentContext _localctx = new HtmlCommentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(HTML_COMMENT);
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
	public static class JinjaCommentContext extends ParserRuleContext {
		public TerminalNode JINJA_COMMENT() { return getToken(HtmlJinjaParser.JINJA_COMMENT, 0); }
		public JinjaCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinjaComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinjaComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinjaComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaCommentContext jinjaComment() throws RecognitionException {
		JinjaCommentContext _localctx = new JinjaCommentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jinjaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(JINJA_COMMENT);
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
	public static class JinjaExpressionContext extends ParserRuleContext {
		public TerminalNode JINJA_VAR_START() { return getToken(HtmlJinjaParser.JINJA_VAR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_VAR_END() { return getToken(HtmlJinjaParser.JINJA_VAR_END, 0); }
		public JinjaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinjaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinjaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinjaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinjaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JinjaExpressionContext jinjaExpression() throws RecognitionException {
		JinjaExpressionContext _localctx = new JinjaExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(JINJA_VAR_START);
			setState(139);
			expression(0);
			setState(140);
			match(JINJA_VAR_END);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqIntContext extends ExpressionContext {
		public TerminalNode JINJA_INT() { return getToken(HtmlJinjaParser.JINJA_INT, 0); }
		public EqIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqFilterContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JINJA_PIP() { return getToken(HtmlJinjaParser.JINJA_PIP, 0); }
		public TerminalNode JINJA_ID() { return getToken(HtmlJinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_LP() { return getToken(HtmlJinjaParser.JINJA_LP, 0); }
		public TerminalNode JINJA_RP() { return getToken(HtmlJinjaParser.JINJA_RP, 0); }
		public EqFilterContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqParContext extends ExpressionContext {
		public TerminalNode JINJA_LP() { return getToken(HtmlJinjaParser.JINJA_LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_RP() { return getToken(HtmlJinjaParser.JINJA_RP, 0); }
		public EqParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqAddContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JINJA_ADD() { return getToken(HtmlJinjaParser.JINJA_ADD, 0); }
		public TerminalNode JINJA_SUB() { return getToken(HtmlJinjaParser.JINJA_SUB, 0); }
		public EqAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqIndexContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JINJA_LSP() { return getToken(HtmlJinjaParser.JINJA_LSP, 0); }
		public TerminalNode JINJA_RSP() { return getToken(HtmlJinjaParser.JINJA_RSP, 0); }
		public EqIndexContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqIdContext extends ExpressionContext {
		public TerminalNode JINJA_ID() { return getToken(HtmlJinjaParser.JINJA_ID, 0); }
		public EqIdContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqMulContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JINJA_MUL() { return getToken(HtmlJinjaParser.JINJA_MUL, 0); }
		public TerminalNode JINJA_DIV() { return getToken(HtmlJinjaParser.JINJA_DIV, 0); }
		public EqMulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqStringContext extends ExpressionContext {
		public TerminalNode JINJA_STRING() { return getToken(HtmlJinjaParser.JINJA_STRING, 0); }
		public EqStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqAttrContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_DOT() { return getToken(HtmlJinjaParser.JINJA_DOT, 0); }
		public TerminalNode JINJA_ID() { return getToken(HtmlJinjaParser.JINJA_ID, 0); }
		public EqAttrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqAttr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqAttr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqCompareContext extends ExpressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode JINJA_EQ() { return getToken(HtmlJinjaParser.JINJA_EQ, 0); }
		public TerminalNode JINJA_NEQ() { return getToken(HtmlJinjaParser.JINJA_NEQ, 0); }
		public TerminalNode JINJA_GT() { return getToken(HtmlJinjaParser.JINJA_GT, 0); }
		public TerminalNode JINJA_LT() { return getToken(HtmlJinjaParser.JINJA_LT, 0); }
		public TerminalNode JINJA_GTEQ() { return getToken(HtmlJinjaParser.JINJA_GTEQ, 0); }
		public TerminalNode JINJA_LTEQ() { return getToken(HtmlJinjaParser.JINJA_LTEQ, 0); }
		public EqCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqDoubleContext extends ExpressionContext {
		public TerminalNode JINJA_DOUBLE() { return getToken(HtmlJinjaParser.JINJA_DOUBLE, 0); }
		public EqDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEqDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEqDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEqDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_LP:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(143);
				match(JINJA_LP);
				setState(144);
				expression(0);
				setState(145);
				match(JINJA_RP);
				}
				break;
			case JINJA_DOUBLE:
				{
				_localctx = new EqDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(JINJA_DOUBLE);
				}
				break;
			case JINJA_INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(JINJA_INT);
				}
				break;
			case JINJA_STRING:
				{
				_localctx = new EqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(JINJA_STRING);
				}
				break;
			case JINJA_ID:
				{
				_localctx = new EqIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(JINJA_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(183);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqMulContext(new ExpressionContext(_parentctx, _parentState));
						((EqMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(154);
						((EqMulContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==JINJA_MUL || _la==JINJA_DIV) ) {
							((EqMulContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(155);
						((EqMulContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new ExpressionContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(157);
						((EqAddContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==JINJA_ADD || _la==JINJA_SUB) ) {
							((EqAddContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						((EqAddContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new EqCompareContext(new ExpressionContext(_parentctx, _parentState));
						((EqCompareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(160);
						((EqCompareContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 138538465099776L) != 0)) ) {
							((EqCompareContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(161);
						((EqCompareContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new EqAttrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(163);
						match(JINJA_DOT);
						setState(164);
						match(JINJA_ID);
						}
						break;
					case 5:
						{
						_localctx = new EqIndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(165);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(166);
						match(JINJA_LSP);
						setState(167);
						expression(0);
						setState(168);
						match(JINJA_RSP);
						}
						break;
					case 6:
						{
						_localctx = new EqFilterContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(170);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(171);
						match(JINJA_PIP);
						setState(172);
						match(JINJA_ID);
						setState(181);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(173);
							match(JINJA_LP);
							setState(177);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081426860522340352L) != 0)) {
								{
								{
								setState(174);
								expression(0);
								}
								}
								setState(179);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(180);
							match(JINJA_RP);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Jinja_statementContext extends ParserRuleContext {
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public For_statementContext for_statement() {
			return getRuleContext(For_statementContext.class,0);
		}
		public Jinja_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jinja_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterJinja_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitJinja_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitJinja_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jinja_statementContext jinja_statement() throws RecognitionException {
		Jinja_statementContext _localctx = new Jinja_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_jinja_statement);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(191);
				for_statement();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_SET() { return getToken(HtmlJinjaParser.JINJA_SET, 0); }
		public TerminalNode JINJA_ID() { return getToken(HtmlJinjaParser.JINJA_ID, 0); }
		public TerminalNode JINJA_SEQ() { return getToken(HtmlJinjaParser.JINJA_SEQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(JINJA_BLOCK_START);
			setState(195);
			match(JINJA_SET);
			setState(196);
			match(JINJA_ID);
			setState(197);
			match(JINJA_SEQ);
			setState(198);
			expression(0);
			setState(199);
			match(JINJA_BLOCK_END);
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
	public static class If_statementContext extends ParserRuleContext {
		public If_fragmentContext if_fragment() {
			return getRuleContext(If_fragmentContext.class,0);
		}
		public Endif_fragmentContext endif_fragment() {
			return getRuleContext(Endif_fragmentContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			if_fragment();
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(202);
					templateContent();
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(208);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(209);
				else_statement();
				}
				break;
			}
			setState(212);
			endif_fragment();
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
	public static class If_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_IF() { return getToken(HtmlJinjaParser.JINJA_IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public If_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterIf_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitIf_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitIf_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_fragmentContext if_fragment() throws RecognitionException {
		If_fragmentContext _localctx = new If_fragmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_if_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(JINJA_BLOCK_START);
			setState(215);
			match(JINJA_IF);
			setState(216);
			expression(0);
			setState(217);
			match(JINJA_BLOCK_END);
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
	public static class Elif_statementContext extends ParserRuleContext {
		public Elif_fragmentContext elif_fragment() {
			return getRuleContext(Elif_fragmentContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitElif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elif_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			elif_fragment();
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(220);
					templateContent();
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(226);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(227);
				else_statement();
				}
				break;
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
	public static class Elif_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ELIF() { return getToken(HtmlJinjaParser.JINJA_ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Elif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterElif_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitElif_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitElif_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_fragmentContext elif_fragment() throws RecognitionException {
		Elif_fragmentContext _localctx = new Elif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(JINJA_BLOCK_START);
			setState(231);
			match(JINJA_ELIF);
			setState(232);
			expression(0);
			setState(233);
			match(JINJA_BLOCK_END);
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_else_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			else_fragment();
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(236);
					templateContent();
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class Else_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ELSE() { return getToken(HtmlJinjaParser.JINJA_ELSE, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Else_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterElse_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitElse_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitElse_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_fragmentContext else_fragment() throws RecognitionException {
		Else_fragmentContext _localctx = new Else_fragmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(JINJA_BLOCK_START);
			setState(243);
			match(JINJA_ELSE);
			setState(244);
			match(JINJA_BLOCK_END);
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
	public static class Endif_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ENDIF() { return getToken(HtmlJinjaParser.JINJA_ENDIF, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Endif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEndif_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEndif_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEndif_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_fragmentContext endif_fragment() throws RecognitionException {
		Endif_fragmentContext _localctx = new Endif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_endif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(JINJA_BLOCK_START);
			setState(247);
			match(JINJA_ENDIF);
			setState(248);
			match(JINJA_BLOCK_END);
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
	public static class While_statementContext extends ParserRuleContext {
		public While_fragmentContext while_fragment() {
			return getRuleContext(While_fragmentContext.class,0);
		}
		public Endwhile_fragmentContext endwhile_fragment() {
			return getRuleContext(Endwhile_fragmentContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_while_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			while_fragment();
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(251);
					templateContent();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(257);
			endwhile_fragment();
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
	public static class While_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_WHILE() { return getToken(HtmlJinjaParser.JINJA_WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public While_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterWhile_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitWhile_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitWhile_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_fragmentContext while_fragment() throws RecognitionException {
		While_fragmentContext _localctx = new While_fragmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_while_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(JINJA_BLOCK_START);
			setState(260);
			match(JINJA_WHILE);
			setState(261);
			expression(0);
			setState(262);
			match(JINJA_BLOCK_END);
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
	public static class Endwhile_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ENDWHILE() { return getToken(HtmlJinjaParser.JINJA_ENDWHILE, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Endwhile_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endwhile_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEndwhile_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEndwhile_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEndwhile_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endwhile_fragmentContext endwhile_fragment() throws RecognitionException {
		Endwhile_fragmentContext _localctx = new Endwhile_fragmentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_endwhile_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(JINJA_BLOCK_START);
			setState(265);
			match(JINJA_ENDWHILE);
			setState(266);
			match(JINJA_BLOCK_END);
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
	public static class For_statementContext extends ParserRuleContext {
		public For_fragmentContext for_fragment() {
			return getRuleContext(For_fragmentContext.class,0);
		}
		public Endfor_fragmentContext endfor_fragment() {
			return getRuleContext(Endfor_fragmentContext.class,0);
		}
		public List<TemplateContentContext> templateContent() {
			return getRuleContexts(TemplateContentContext.class);
		}
		public TemplateContentContext templateContent(int i) {
			return getRuleContext(TemplateContentContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_for_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			for_fragment();
			setState(272);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					templateContent();
					}
					} 
				}
				setState(274);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(275);
			endfor_fragment();
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
	public static class For_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_FOR() { return getToken(HtmlJinjaParser.JINJA_FOR, 0); }
		public For_targetContext for_target() {
			return getRuleContext(For_targetContext.class,0);
		}
		public TerminalNode JINJA_IN() { return getToken(HtmlJinjaParser.JINJA_IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public For_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterFor_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitFor_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitFor_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_fragmentContext for_fragment() throws RecognitionException {
		For_fragmentContext _localctx = new For_fragmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_for_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(JINJA_BLOCK_START);
			setState(278);
			match(JINJA_FOR);
			setState(279);
			for_target();
			setState(280);
			match(JINJA_IN);
			setState(281);
			expression(0);
			setState(282);
			match(JINJA_BLOCK_END);
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
	public static class For_targetContext extends ParserRuleContext {
		public List<TerminalNode> JINJA_ID() { return getTokens(HtmlJinjaParser.JINJA_ID); }
		public TerminalNode JINJA_ID(int i) {
			return getToken(HtmlJinjaParser.JINJA_ID, i);
		}
		public TerminalNode JINJA_COMA() { return getToken(HtmlJinjaParser.JINJA_COMA, 0); }
		public For_targetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_target; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterFor_target(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitFor_target(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitFor_target(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_targetContext for_target() throws RecognitionException {
		For_targetContext _localctx = new For_targetContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_for_target);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(JINJA_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(JINJA_ID);
				setState(286);
				match(JINJA_COMA);
				setState(287);
				match(JINJA_ID);
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
	public static class Endfor_fragmentContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_ENDFOR() { return getToken(HtmlJinjaParser.JINJA_ENDFOR, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Endfor_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endfor_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterEndfor_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitEndfor_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitEndfor_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endfor_fragmentContext endfor_fragment() throws RecognitionException {
		Endfor_fragmentContext _localctx = new Endfor_fragmentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_endfor_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(JINJA_BLOCK_START);
			setState(291);
			match(JINJA_ENDFOR);
			setState(292);
			match(JINJA_BLOCK_END);
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
	public static class ScriptContext extends ParserRuleContext {
		public TerminalNode SCRIPT_OPEN() { return getToken(HtmlJinjaParser.SCRIPT_OPEN, 0); }
		public TerminalNode SCRIPT_BODY() { return getToken(HtmlJinjaParser.SCRIPT_BODY, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(SCRIPT_OPEN);
			setState(295);
			match(SCRIPT_BODY);
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
	public static class StyleContext extends ParserRuleContext {
		public TerminalNode STYLE_OPEN() { return getToken(HtmlJinjaParser.STYLE_OPEN, 0); }
		public TerminalNode STYLE_BODY() { return getToken(HtmlJinjaParser.STYLE_BODY, 0); }
		public StyleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_style; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterStyle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitStyle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitStyle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StyleContext style() throws RecognitionException {
		StyleContext _localctx = new StyleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(STYLE_OPEN);
			setState(298);
			match(STYLE_BODY);
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
	public static class TemplateContentContext extends ParserRuleContext {
		public HtmlChardataContext htmlChardata() {
			return getRuleContext(HtmlChardataContext.class,0);
		}
		public HtmlElementContext htmlElement() {
			return getRuleContext(HtmlElementContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public Jinja_statementContext jinja_statement() {
			return getRuleContext(Jinja_statementContext.class,0);
		}
		public HtmlCommentContext htmlComment() {
			return getRuleContext(HtmlCommentContext.class,0);
		}
		public JinjaCommentContext jinjaComment() {
			return getRuleContext(JinjaCommentContext.class,0);
		}
		public TemplateContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_templateContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTemplateContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTemplateContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTemplateContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemplateContentContext templateContent() throws RecognitionException {
		TemplateContentContext _localctx = new TemplateContentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_templateContent);
		try {
			setState(306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				htmlChardata();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(301);
				htmlElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				jinjaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				jinja_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(304);
				htmlComment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				jinjaComment();
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
	public static class HtmlTagContentContext extends ParserRuleContext {
		public HtmlAttributeContext htmlAttribute() {
			return getRuleContext(HtmlAttributeContext.class,0);
		}
		public JinjaExpressionContext jinjaExpression() {
			return getRuleContext(JinjaExpressionContext.class,0);
		}
		public TagJinjaBlockContext tagJinjaBlock() {
			return getRuleContext(TagJinjaBlockContext.class,0);
		}
		public TerminalNode TAG_JINJA_VAR() { return getToken(HtmlJinjaParser.TAG_JINJA_VAR, 0); }
		public HtmlTagContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmlTagContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterHtmlTagContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitHtmlTagContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitHtmlTagContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlTagContentContext htmlTagContent() throws RecognitionException {
		HtmlTagContentContext _localctx = new HtmlTagContentContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_htmlTagContent);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				htmlAttribute();
				}
				break;
			case JINJA_VAR_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				jinjaExpression();
				}
				break;
			case TAG_JINJA_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				tagJinjaBlock();
				}
				break;
			case TAG_JINJA_VAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(311);
				match(TAG_JINJA_VAR);
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
	public static class TagJinjaBlockContext extends ParserRuleContext {
		public TagIfBlockContext tagIfBlock() {
			return getRuleContext(TagIfBlockContext.class,0);
		}
		public TagForBlockContext tagForBlock() {
			return getRuleContext(TagForBlockContext.class,0);
		}
		public TagWhileBlockContext tagWhileBlock() {
			return getRuleContext(TagWhileBlockContext.class,0);
		}
		public TagJinjaBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagJinjaBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagJinjaBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagJinjaBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagJinjaBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagJinjaBlockContext tagJinjaBlock() throws RecognitionException {
		TagJinjaBlockContext _localctx = new TagJinjaBlockContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tagJinjaBlock);
		try {
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				tagIfBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				tagForBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(316);
				tagWhileBlock();
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
	public static class TagIfBlockContext extends ParserRuleContext {
		public List<TerminalNode> TAG_JINJA_BLOCK() { return getTokens(HtmlJinjaParser.TAG_JINJA_BLOCK); }
		public TerminalNode TAG_JINJA_BLOCK(int i) {
			return getToken(HtmlJinjaParser.TAG_JINJA_BLOCK, i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public List<TagElifBlockContext> tagElifBlock() {
			return getRuleContexts(TagElifBlockContext.class);
		}
		public TagElifBlockContext tagElifBlock(int i) {
			return getRuleContext(TagElifBlockContext.class,i);
		}
		public TagElseBlockContext tagElseBlock() {
			return getRuleContext(TagElseBlockContext.class,0);
		}
		public TagIfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagIfBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagIfBlockContext tagIfBlock() throws RecognitionException {
		TagIfBlockContext _localctx = new TagIfBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_tagIfBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(TAG_JINJA_BLOCK);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(320);
				htmlAttribute();
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(326);
					tagElifBlock();
					}
					} 
				}
				setState(331);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(332);
				tagElseBlock();
				}
				break;
			}
			setState(335);
			match(TAG_JINJA_BLOCK);
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
	public static class TagElifBlockContext extends ParserRuleContext {
		public TerminalNode TAG_JINJA_BLOCK() { return getToken(HtmlJinjaParser.TAG_JINJA_BLOCK, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TagElifBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagElifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagElifBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagElifBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagElifBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagElifBlockContext tagElifBlock() throws RecognitionException {
		TagElifBlockContext _localctx = new TagElifBlockContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_tagElifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(TAG_JINJA_BLOCK);
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(338);
				htmlAttribute();
				}
				}
				setState(343);
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
	public static class TagElseBlockContext extends ParserRuleContext {
		public TerminalNode TAG_JINJA_BLOCK() { return getToken(HtmlJinjaParser.TAG_JINJA_BLOCK, 0); }
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TagElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagElseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagElseBlockContext tagElseBlock() throws RecognitionException {
		TagElseBlockContext _localctx = new TagElseBlockContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tagElseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(344);
			match(TAG_JINJA_BLOCK);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(345);
				htmlAttribute();
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
	public static class TagForBlockContext extends ParserRuleContext {
		public List<TerminalNode> TAG_JINJA_BLOCK() { return getTokens(HtmlJinjaParser.TAG_JINJA_BLOCK); }
		public TerminalNode TAG_JINJA_BLOCK(int i) {
			return getToken(HtmlJinjaParser.TAG_JINJA_BLOCK, i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TagForBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagForBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagForBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagForBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagForBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagForBlockContext tagForBlock() throws RecognitionException {
		TagForBlockContext _localctx = new TagForBlockContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_tagForBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(TAG_JINJA_BLOCK);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(352);
				htmlAttribute();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(TAG_JINJA_BLOCK);
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
	public static class TagWhileBlockContext extends ParserRuleContext {
		public List<TerminalNode> TAG_JINJA_BLOCK() { return getTokens(HtmlJinjaParser.TAG_JINJA_BLOCK); }
		public TerminalNode TAG_JINJA_BLOCK(int i) {
			return getToken(HtmlJinjaParser.TAG_JINJA_BLOCK, i);
		}
		public List<HtmlAttributeContext> htmlAttribute() {
			return getRuleContexts(HtmlAttributeContext.class);
		}
		public HtmlAttributeContext htmlAttribute(int i) {
			return getRuleContext(HtmlAttributeContext.class,i);
		}
		public TagWhileBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagWhileBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterTagWhileBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitTagWhileBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitTagWhileBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagWhileBlockContext tagWhileBlock() throws RecognitionException {
		TagWhileBlockContext _localctx = new TagWhileBlockContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tagWhileBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(TAG_JINJA_BLOCK);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAG_NAME) {
				{
				{
				setState(361);
				htmlAttribute();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
			match(TAG_JINJA_BLOCK);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001<\u0172\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0001\u0000\u0005\u0000L\b\u0000\n\u0000\f\u0000"+
		"O\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000S\b\u0000\n\u0000\f\u0000"+
		"V\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002_\b\u0002\n\u0002\f\u0002b\t\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002k\b\u0002\u0001\u0002\u0003\u0002n\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002s\b\u0002\u0001\u0003\u0005"+
		"\u0003v\b\u0003\n\u0003\f\u0003y\t\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004~\b\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u0085\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0098\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u00b0\b\n\n\n\f\n\u00b3\t\n\u0001\n\u0003\n"+
		"\u00b6\b\n\u0005\n\u00b8\b\n\n\n\f\n\u00bb\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00c1\b\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0005\r\u00cc\b\r\n"+
		"\r\f\r\u00cf\t\r\u0001\r\u0001\r\u0003\r\u00d3\b\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u00de\b\u000f\n\u000f\f\u000f\u00e1\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u00e5\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00ee\b\u0011"+
		"\n\u0011\f\u0011\u00f1\t\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00fd\b\u0014\n\u0014\f\u0014\u0100\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u010f\b\u0017\n\u0017\f\u0017\u0112\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0121\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u0133\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u0139\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u013e"+
		"\b\u001f\u0001 \u0001 \u0005 \u0142\b \n \f \u0145\t \u0001 \u0005 \u0148"+
		"\b \n \f \u014b\t \u0001 \u0003 \u014e\b \u0001 \u0001 \u0001!\u0001!"+
		"\u0005!\u0154\b!\n!\f!\u0157\t!\u0001\"\u0001\"\u0005\"\u015b\b\"\n\""+
		"\f\"\u015e\t\"\u0001#\u0001#\u0005#\u0162\b#\n#\f#\u0165\t#\u0001#\u0001"+
		"#\u0001$\u0001$\u0005$\u016b\b$\n$\f$\u016e\t$\u0001$\u0001$\u0001$\u0000"+
		"\u0001\u0014%\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFH\u0000\u0005\u0001\u0000"+
		"\u0003\u0004\u0002\u0000\u0004\u0004\n\n\u0001\u0000&\'\u0001\u0000$%"+
		"\u0001\u0000).\u0185\u0000M\u0001\u0000\u0000\u0000\u0002W\u0001\u0000"+
		"\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006w\u0001\u0000\u0000\u0000"+
		"\bz\u0001\u0000\u0000\u0000\n\u007f\u0001\u0000\u0000\u0000\f\u0084\u0001"+
		"\u0000\u0000\u0000\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u0088\u0001"+
		"\u0000\u0000\u0000\u0012\u008a\u0001\u0000\u0000\u0000\u0014\u0097\u0001"+
		"\u0000\u0000\u0000\u0016\u00c0\u0001\u0000\u0000\u0000\u0018\u00c2\u0001"+
		"\u0000\u0000\u0000\u001a\u00c9\u0001\u0000\u0000\u0000\u001c\u00d6\u0001"+
		"\u0000\u0000\u0000\u001e\u00db\u0001\u0000\u0000\u0000 \u00e6\u0001\u0000"+
		"\u0000\u0000\"\u00eb\u0001\u0000\u0000\u0000$\u00f2\u0001\u0000\u0000"+
		"\u0000&\u00f6\u0001\u0000\u0000\u0000(\u00fa\u0001\u0000\u0000\u0000*"+
		"\u0103\u0001\u0000\u0000\u0000,\u0108\u0001\u0000\u0000\u0000.\u010c\u0001"+
		"\u0000\u0000\u00000\u0115\u0001\u0000\u0000\u00002\u0120\u0001\u0000\u0000"+
		"\u00004\u0122\u0001\u0000\u0000\u00006\u0126\u0001\u0000\u0000\u00008"+
		"\u0129\u0001\u0000\u0000\u0000:\u0132\u0001\u0000\u0000\u0000<\u0138\u0001"+
		"\u0000\u0000\u0000>\u013d\u0001\u0000\u0000\u0000@\u013f\u0001\u0000\u0000"+
		"\u0000B\u0151\u0001\u0000\u0000\u0000D\u0158\u0001\u0000\u0000\u0000F"+
		"\u015f\u0001\u0000\u0000\u0000H\u0168\u0001\u0000\u0000\u0000JL\u0003"+
		"\u0002\u0001\u0000KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NT\u0001\u0000\u0000"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0003\f\u0006\u0000QS\u0003\u0004\u0002"+
		"\u0000RP\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\u0001"+
		"\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000WX\u0007\u0000\u0000"+
		"\u0000X\u0003\u0001\u0000\u0000\u0000Ys\u0003\u0012\t\u0000Zs\u0003\u0016"+
		"\u000b\u0000[\\\u0005\u0005\u0000\u0000\\`\u0005\u0011\u0000\u0000]_\u0003"+
		"<\u001e\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000am\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000cj\u0005\r\u0000\u0000de\u0003\u0006\u0003\u0000"+
		"ef\u0005\u0005\u0000\u0000fg\u0005\u000f\u0000\u0000gh\u0005\u0011\u0000"+
		"\u0000hi\u0005\r\u0000\u0000ik\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000"+
		"\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000ln\u0005\u000e"+
		"\u0000\u0000mc\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000ns\u0001"+
		"\u0000\u0000\u0000os\u0005\u0003\u0000\u0000ps\u00036\u001b\u0000qs\u0003"+
		"8\u001c\u0000rY\u0001\u0000\u0000\u0000rZ\u0001\u0000\u0000\u0000r[\u0001"+
		"\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"rq\u0001\u0000\u0000\u0000s\u0005\u0001\u0000\u0000\u0000tv\u0003:\u001d"+
		"\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0007\u0001\u0000\u0000\u0000"+
		"yw\u0001\u0000\u0000\u0000z}\u0005\u0011\u0000\u0000{|\u0005\u0010\u0000"+
		"\u0000|~\u0005\u0015\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000"+
		"\u0000\u0000~\t\u0001\u0000\u0000\u0000\u007f\u0080\u0007\u0001\u0000"+
		"\u0000\u0080\u000b\u0001\u0000\u0000\u0000\u0081\u0085\u0003\u000e\u0007"+
		"\u0000\u0082\u0085\u0003\u0010\b\u0000\u0083\u0085\u0005\u0004\u0000\u0000"+
		"\u0084\u0081\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0083\u0001\u0000\u0000\u0000\u0085\r\u0001\u0000\u0000\u0000\u0086"+
		"\u0087\u0005\u0001\u0000\u0000\u0087\u000f\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\u0002\u0000\u0000\u0089\u0011\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0005\b\u0000\u0000\u008b\u008c\u0003\u0014\n\u0000\u008c\u008d"+
		"\u0005\u0019\u0000\u0000\u008d\u0013\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0006\n\uffff\uffff\u0000\u008f\u0090\u00051\u0000\u0000\u0090\u0091"+
		"\u0003\u0014\n\u0000\u0091\u0092\u00052\u0000\u0000\u0092\u0098\u0001"+
		"\u0000\u0000\u0000\u0093\u0098\u0005:\u0000\u0000\u0094\u0098\u00059\u0000"+
		"\u0000\u0095\u0098\u0005;\u0000\u0000\u0096\u0098\u00058\u0000\u0000\u0097"+
		"\u008e\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000\u0000\u0097"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000\u0000\u0000\u0097"+
		"\u0096\u0001\u0000\u0000\u0000\u0098\u00b9\u0001\u0000\u0000\u0000\u0099"+
		"\u009a\n\n\u0000\u0000\u009a\u009b\u0007\u0002\u0000\u0000\u009b\u00b8"+
		"\u0003\u0014\n\u000b\u009c\u009d\n\t\u0000\u0000\u009d\u009e\u0007\u0003"+
		"\u0000\u0000\u009e\u00b8\u0003\u0014\n\n\u009f\u00a0\n\b\u0000\u0000\u00a0"+
		"\u00a1\u0007\u0004\u0000\u0000\u00a1\u00b8\u0003\u0014\n\t\u00a2\u00a3"+
		"\n\u0007\u0000\u0000\u00a3\u00a4\u00055\u0000\u0000\u00a4\u00b8\u0005"+
		"8\u0000\u0000\u00a5\u00a6\n\u0006\u0000\u0000\u00a6\u00a7\u00053\u0000"+
		"\u0000\u00a7\u00a8\u0003\u0014\n\u0000\u00a8\u00a9\u00054\u0000\u0000"+
		"\u00a9\u00b8\u0001\u0000\u0000\u0000\u00aa\u00ab\n\u0005\u0000\u0000\u00ab"+
		"\u00ac\u00056\u0000\u0000\u00ac\u00b5\u00058\u0000\u0000\u00ad\u00b1\u0005"+
		"1\u0000\u0000\u00ae\u00b0\u0003\u0014\n\u0000\u00af\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b0\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000"+
		"\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000\u00b2\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b4\u00b6\u00052\u0000"+
		"\u0000\u00b5\u00ad\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b8\u0001\u0000\u0000\u0000\u00b7\u0099\u0001\u0000\u0000"+
		"\u0000\u00b7\u009c\u0001\u0000\u0000\u0000\u00b7\u009f\u0001\u0000\u0000"+
		"\u0000\u00b7\u00a2\u0001\u0000\u0000\u0000\u00b7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00b7\u00aa\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u0015\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00c1\u0003\u0018\f\u0000\u00bd\u00c1\u0003\u001a\r\u0000"+
		"\u00be\u00c1\u0003(\u0014\u0000\u00bf\u00c1\u0003.\u0017\u0000\u00c0\u00bc"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u0017"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005\t\u0000\u0000\u00c3\u00c4\u0005"+
		"!\u0000\u0000\u00c4\u00c5\u00058\u0000\u0000\u00c5\u00c6\u0005(\u0000"+
		"\u0000\u00c6\u00c7\u0003\u0014\n\u0000\u00c7\u00c8\u0005\u0018\u0000\u0000"+
		"\u00c8\u0019\u0001\u0000\u0000\u0000\u00c9\u00cd\u0003\u001c\u000e\u0000"+
		"\u00ca\u00cc\u0003:\u001d\u0000\u00cb\u00ca\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d3\u0003\u001e\u000f\u0000\u00d1"+
		"\u00d3\u0003\"\u0011\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003&\u0013\u0000\u00d5\u001b\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d7\u0005\t\u0000\u0000\u00d7\u00d8\u0005\u001a"+
		"\u0000\u0000\u00d8\u00d9\u0003\u0014\n\u0000\u00d9\u00da\u0005\u0018\u0000"+
		"\u0000\u00da\u001d\u0001\u0000\u0000\u0000\u00db\u00df\u0003 \u0010\u0000"+
		"\u00dc\u00de\u0003:\u001d\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de"+
		"\u00e1\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e0\u00e4\u0001\u0000\u0000\u0000\u00e1"+
		"\u00df\u0001\u0000\u0000\u0000\u00e2\u00e5\u0003\u001e\u000f\u0000\u00e3"+
		"\u00e5\u0003\"\u0011\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e3"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u001f"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\t\u0000\u0000\u00e7\u00e8\u0005"+
		"\u001b\u0000\u0000\u00e8\u00e9\u0003\u0014\n\u0000\u00e9\u00ea\u0005\u0018"+
		"\u0000\u0000\u00ea!\u0001\u0000\u0000\u0000\u00eb\u00ef\u0003$\u0012\u0000"+
		"\u00ec\u00ee\u0003:\u001d\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee"+
		"\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0#\u0001\u0000\u0000\u0000\u00f1\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005\t\u0000\u0000\u00f3\u00f4\u0005"+
		"\u001c\u0000\u0000\u00f4\u00f5\u0005\u0018\u0000\u0000\u00f5%\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005\t\u0000\u0000\u00f7\u00f8\u0005\u001d\u0000"+
		"\u0000\u00f8\u00f9\u0005\u0018\u0000\u0000\u00f9\'\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fe\u0003*\u0015\u0000\u00fb\u00fd\u0003:\u001d\u0000\u00fc\u00fb"+
		"\u0001\u0000\u0000\u0000\u00fd\u0100\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff\u0101"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0101\u0102"+
		"\u0003,\u0016\u0000\u0102)\u0001\u0000\u0000\u0000\u0103\u0104\u0005\t"+
		"\u0000\u0000\u0104\u0105\u0005\"\u0000\u0000\u0105\u0106\u0003\u0014\n"+
		"\u0000\u0106\u0107\u0005\u0018\u0000\u0000\u0107+\u0001\u0000\u0000\u0000"+
		"\u0108\u0109\u0005\t\u0000\u0000\u0109\u010a\u0005#\u0000\u0000\u010a"+
		"\u010b\u0005\u0018\u0000\u0000\u010b-\u0001\u0000\u0000\u0000\u010c\u0110"+
		"\u00030\u0018\u0000\u010d\u010f\u0003:\u001d\u0000\u010e\u010d\u0001\u0000"+
		"\u0000\u0000\u010f\u0112\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0113\u0001\u0000"+
		"\u0000\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0113\u0114\u00034\u001a"+
		"\u0000\u0114/\u0001\u0000\u0000\u0000\u0115\u0116\u0005\t\u0000\u0000"+
		"\u0116\u0117\u0005\u001e\u0000\u0000\u0117\u0118\u00032\u0019\u0000\u0118"+
		"\u0119\u0005\u001f\u0000\u0000\u0119\u011a\u0003\u0014\n\u0000\u011a\u011b"+
		"\u0005\u0018\u0000\u0000\u011b1\u0001\u0000\u0000\u0000\u011c\u0121\u0005"+
		"8\u0000\u0000\u011d\u011e\u00058\u0000\u0000\u011e\u011f\u00057\u0000"+
		"\u0000\u011f\u0121\u00058\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000"+
		"\u0120\u011d\u0001\u0000\u0000\u0000\u01213\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\t\u0000\u0000\u0123\u0124\u0005 \u0000\u0000\u0124\u0125"+
		"\u0005\u0018\u0000\u0000\u01255\u0001\u0000\u0000\u0000\u0126\u0127\u0005"+
		"\u0006\u0000\u0000\u0127\u0128\u0005\u0013\u0000\u0000\u01287\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0005\u0007\u0000\u0000\u012a\u012b\u0005\u0014"+
		"\u0000\u0000\u012b9\u0001\u0000\u0000\u0000\u012c\u0133\u0003\n\u0005"+
		"\u0000\u012d\u0133\u0003\u0004\u0002\u0000\u012e\u0133\u0003\u0012\t\u0000"+
		"\u012f\u0133\u0003\u0016\u000b\u0000\u0130\u0133\u0003\u000e\u0007\u0000"+
		"\u0131\u0133\u0003\u0010\b\u0000\u0132\u012c\u0001\u0000\u0000\u0000\u0132"+
		"\u012d\u0001\u0000\u0000\u0000\u0132\u012e\u0001\u0000\u0000\u0000\u0132"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000\u0000\u0000\u0132"+
		"\u0131\u0001\u0000\u0000\u0000\u0133;\u0001\u0000\u0000\u0000\u0134\u0139"+
		"\u0003\b\u0004\u0000\u0135\u0139\u0003\u0012\t\u0000\u0136\u0139\u0003"+
		">\u001f\u0000\u0137\u0139\u0005\f\u0000\u0000\u0138\u0134\u0001\u0000"+
		"\u0000\u0000\u0138\u0135\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139=\u0001\u0000\u0000"+
		"\u0000\u013a\u013e\u0003@ \u0000\u013b\u013e\u0003F#\u0000\u013c\u013e"+
		"\u0003H$\u0000\u013d\u013a\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000"+
		"\u0000\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013e?\u0001\u0000\u0000"+
		"\u0000\u013f\u0143\u0005\u000b\u0000\u0000\u0140\u0142\u0003\b\u0004\u0000"+
		"\u0141\u0140\u0001\u0000\u0000\u0000\u0142\u0145\u0001\u0000\u0000\u0000"+
		"\u0143\u0141\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000"+
		"\u0144\u0149\u0001\u0000\u0000\u0000\u0145\u0143\u0001\u0000\u0000\u0000"+
		"\u0146\u0148\u0003B!\u0000\u0147\u0146\u0001\u0000\u0000\u0000\u0148\u014b"+
		"\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a"+
		"\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014c\u014e\u0003D\"\u0000\u014d\u014c\u0001"+
		"\u0000\u0000\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014f\u0001"+
		"\u0000\u0000\u0000\u014f\u0150\u0005\u000b\u0000\u0000\u0150A\u0001\u0000"+
		"\u0000\u0000\u0151\u0155\u0005\u000b\u0000\u0000\u0152\u0154\u0003\b\u0004"+
		"\u0000\u0153\u0152\u0001\u0000\u0000\u0000\u0154\u0157\u0001\u0000\u0000"+
		"\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0155\u0156\u0001\u0000\u0000"+
		"\u0000\u0156C\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000"+
		"\u0158\u015c\u0005\u000b\u0000\u0000\u0159\u015b\u0003\b\u0004\u0000\u015a"+
		"\u0159\u0001\u0000\u0000\u0000\u015b\u015e\u0001\u0000\u0000\u0000\u015c"+
		"\u015a\u0001\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d"+
		"E\u0001\u0000\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0163"+
		"\u0005\u000b\u0000\u0000\u0160\u0162\u0003\b\u0004\u0000\u0161\u0160\u0001"+
		"\u0000\u0000\u0000\u0162\u0165\u0001\u0000\u0000\u0000\u0163\u0161\u0001"+
		"\u0000\u0000\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001"+
		"\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0166\u0167\u0005"+
		"\u000b\u0000\u0000\u0167G\u0001\u0000\u0000\u0000\u0168\u016c\u0005\u000b"+
		"\u0000\u0000\u0169\u016b\u0003\b\u0004\u0000\u016a\u0169\u0001\u0000\u0000"+
		"\u0000\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u016f\u0001\u0000\u0000"+
		"\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0005\u000b\u0000"+
		"\u0000\u0170I\u0001\u0000\u0000\u0000\"MRT`jmrw}\u0084\u0097\u00b1\u00b5"+
		"\u00b7\u00b9\u00c0\u00cd\u00d2\u00df\u00e4\u00ef\u00fe\u0110\u0120\u0132"+
		"\u0138\u013d\u0143\u0149\u014d\u0155\u015c\u0163\u016c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}