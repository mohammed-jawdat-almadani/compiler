// Generated from D:/Compiler_1/Compiler/Compiler_1/src/antlr/HtmlJinjaParser.g4 by ANTLR 4.13.2
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
		STYLE_OPEN=7, JINJA_VAR_START=8, JINJA_BLOCK_START=9, HTML_TEXT=10, TAG_JINJA_VAR=11, 
		TAG_CLOSE=12, TAG_SLASH_CLOSE=13, TAG_SLASH=14, TAG_EQUALS=15, TAG_NAME=16, 
		TAG_WHITESPACE=17, SCRIPT_BODY=18, STYLE_BODY=19, ATTVALUE_VALUE=20, ATTRIBUTE=21, 
		JINJA_WS=22, JINJA_BLOCK_END=23, JINJA_VAR_END=24, JINJA_IF=25, JINJA_ELIF=26, 
		JINJA_ELSE=27, JINJA_ENDIF=28, JINJA_FOR=29, JINJA_IN=30, JINJA_ENDFOR=31, 
		JINJA_SET=32, JINJA_WHILE=33, JINJA_ENDWHILE=34, JINJA_EXTENDS=35, JINJA_ADD=36, 
		JINJA_SUB=37, JINJA_MUL=38, JINJA_DIV=39, JINJA_SEQ=40, JINJA_EQ=41, JINJA_NEQ=42, 
		JINJA_GT=43, JINJA_LT=44, JINJA_GTEQ=45, JINJA_LTEQ=46, JINJA_DQ=47, JINJA_SQ=48, 
		JINJA_LP=49, JINJA_RP=50, JINJA_LSP=51, JINJA_RSP=52, JINJA_DOT=53, JINJA_PIP=54, 
		JINJA_COMA=55, JINJA_ID=56, JINJA_INT=57, JINJA_DOUBLE=58, JINJA_STRING=59, 
		JINJA_BOOL=60;
	public static final int
		RULE_htmlDocument = 0, RULE_extends_statement = 1, RULE_scriptletOrSeaWs = 2, 
		RULE_htmlElement = 3, RULE_htmlContent = 4, RULE_htmlAttribute = 5, RULE_htmlChardata = 6, 
		RULE_htmlMisc = 7, RULE_htmlComment = 8, RULE_jinjaComment = 9, RULE_jinjaExpression = 10, 
		RULE_expression = 11, RULE_jinja_statement = 12, RULE_assignment_statement = 13, 
		RULE_if_statement = 14, RULE_if_fragment = 15, RULE_elif_statement = 16, 
		RULE_elif_fragment = 17, RULE_else_statement = 18, RULE_else_fragment = 19, 
		RULE_endif_fragment = 20, RULE_while_statement = 21, RULE_while_fragment = 22, 
		RULE_endwhile_fragment = 23, RULE_for_statement = 24, RULE_for_fragment = 25, 
		RULE_for_target = 26, RULE_endfor_fragment = 27, RULE_script = 28, RULE_style = 29, 
		RULE_templateContent = 30, RULE_htmlTagContent = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"htmlDocument", "extends_statement", "scriptletOrSeaWs", "htmlElement", 
			"htmlContent", "htmlAttribute", "htmlChardata", "htmlMisc", "htmlComment", 
			"jinjaComment", "jinjaExpression", "expression", "jinja_statement", "assignment_statement", 
			"if_statement", "if_fragment", "elif_statement", "elif_fragment", "else_statement", 
			"else_fragment", "endif_fragment", "while_statement", "while_fragment", 
			"endwhile_fragment", "for_statement", "for_fragment", "for_target", "endfor_fragment", 
			"script", "style", "templateContent", "htmlTagContent"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'{{'", "'{%'", null, 
			null, null, "'/>'", null, null, null, null, null, null, null, null, null, 
			"'%}'", "'}}'", "'if'", "'elif'", "'else'", "'endif'", "'for'", "'in'", 
			"'endfor'", "'set'", "'while'", "'endwhile'", "'extends'", "'+'", "'-'", 
			"'*'", null, null, "'=='", "'!='", null, null, "'>='", "'<='", "'\"'", 
			"'''", "'('", "')'", "'['", "']'", "'.'", "'|'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HTML_COMMENT", "JINJA_COMMENT", "SCRIPTLET", "SEA_WS", "TAG_OPEN", 
			"SCRIPT_OPEN", "STYLE_OPEN", "JINJA_VAR_START", "JINJA_BLOCK_START", 
			"HTML_TEXT", "TAG_JINJA_VAR", "TAG_CLOSE", "TAG_SLASH_CLOSE", "TAG_SLASH", 
			"TAG_EQUALS", "TAG_NAME", "TAG_WHITESPACE", "SCRIPT_BODY", "STYLE_BODY", 
			"ATTVALUE_VALUE", "ATTRIBUTE", "JINJA_WS", "JINJA_BLOCK_END", "JINJA_VAR_END", 
			"JINJA_IF", "JINJA_ELIF", "JINJA_ELSE", "JINJA_ENDIF", "JINJA_FOR", "JINJA_IN", 
			"JINJA_ENDFOR", "JINJA_SET", "JINJA_WHILE", "JINJA_ENDWHILE", "JINJA_EXTENDS", 
			"JINJA_ADD", "JINJA_SUB", "JINJA_MUL", "JINJA_DIV", "JINJA_SEQ", "JINJA_EQ", 
			"JINJA_NEQ", "JINJA_GT", "JINJA_LT", "JINJA_GTEQ", "JINJA_LTEQ", "JINJA_DQ", 
			"JINJA_SQ", "JINJA_LP", "JINJA_RP", "JINJA_LSP", "JINJA_RSP", "JINJA_DOT", 
			"JINJA_PIP", "JINJA_COMA", "JINJA_ID", "JINJA_INT", "JINJA_DOUBLE", "JINJA_STRING", 
			"JINJA_BOOL"
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
		public List<Extends_statementContext> extends_statement() {
			return getRuleContexts(Extends_statementContext.class);
		}
		public Extends_statementContext extends_statement(int i) {
			return getRuleContext(Extends_statementContext.class,i);
		}
		public List<JinjaCommentContext> jinjaComment() {
			return getRuleContexts(JinjaCommentContext.class);
		}
		public JinjaCommentContext jinjaComment(int i) {
			return getRuleContext(JinjaCommentContext.class,i);
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
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(64);
					scriptletOrSeaWs();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1022L) != 0)) {
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(70);
					extends_statement();
					}
					break;
				case 2:
					{
					setState(71);
					jinjaComment();
					}
					break;
				case 3:
					{
					setState(72);
					htmlMisc();
					}
					break;
				case 4:
					{
					setState(73);
					htmlElement();
					}
					break;
				}
				}
				setState(78);
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
	public static class Extends_statementContext extends ParserRuleContext {
		public TerminalNode JINJA_BLOCK_START() { return getToken(HtmlJinjaParser.JINJA_BLOCK_START, 0); }
		public TerminalNode JINJA_EXTENDS() { return getToken(HtmlJinjaParser.JINJA_EXTENDS, 0); }
		public TerminalNode JINJA_STRING() { return getToken(HtmlJinjaParser.JINJA_STRING, 0); }
		public TerminalNode JINJA_BLOCK_END() { return getToken(HtmlJinjaParser.JINJA_BLOCK_END, 0); }
		public Extends_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extends_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).enterExtends_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof HtmlJinjaParserListener ) ((HtmlJinjaParserListener)listener).exitExtends_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HtmlJinjaParserVisitor ) return ((HtmlJinjaParserVisitor<? extends T>)visitor).visitExtends_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Extends_statementContext extends_statement() throws RecognitionException {
		Extends_statementContext _localctx = new Extends_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_extends_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(JINJA_BLOCK_START);
			setState(80);
			match(JINJA_EXTENDS);
			setState(81);
			match(JINJA_STRING);
			setState(82);
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
		enterRule(_localctx, 4, RULE_scriptletOrSeaWs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
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
		enterRule(_localctx, 6, RULE_htmlElement);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_VAR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				jinjaExpression();
				}
				break;
			case JINJA_BLOCK_START:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				jinja_statement();
				}
				break;
			case TAG_OPEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(TAG_OPEN);
				setState(89);
				match(TAG_NAME);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TAG_JINJA_VAR || _la==TAG_NAME) {
					{
					{
					setState(90);
					htmlTagContent();
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TAG_CLOSE:
					{
					setState(96);
					match(TAG_CLOSE);
					setState(103);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						setState(97);
						htmlContent();
						setState(98);
						match(TAG_OPEN);
						setState(99);
						match(TAG_SLASH);
						setState(100);
						match(TAG_NAME);
						setState(101);
						match(TAG_CLOSE);
						}
						break;
					}
					}
					break;
				case TAG_SLASH_CLOSE:
					{
					setState(105);
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
				setState(108);
				match(SCRIPTLET);
				}
				break;
			case SCRIPT_OPEN:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				script();
				}
				break;
			case STYLE_OPEN:
				enterOuterAlt(_localctx, 6);
				{
				setState(110);
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
		enterRule(_localctx, 8, RULE_htmlContent);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(113);
					templateContent();
					}
					} 
				}
				setState(118);
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
		enterRule(_localctx, 10, RULE_htmlAttribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(TAG_NAME);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TAG_EQUALS) {
				{
				setState(120);
				match(TAG_EQUALS);
				setState(121);
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
		enterRule(_localctx, 12, RULE_htmlChardata);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
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
		enterRule(_localctx, 14, RULE_htmlMisc);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_COMMENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				htmlComment();
				}
				break;
			case JINJA_COMMENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				jinjaComment();
				}
				break;
			case SEA_WS:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
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
		enterRule(_localctx, 16, RULE_htmlComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 18, RULE_jinjaComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
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
		enterRule(_localctx, 20, RULE_jinjaExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(JINJA_VAR_START);
			setState(136);
			expression(0);
			setState(137);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JINJA_LP:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(140);
				match(JINJA_LP);
				setState(141);
				expression(0);
				setState(142);
				match(JINJA_RP);
				}
				break;
			case JINJA_DOUBLE:
				{
				_localctx = new EqDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				match(JINJA_DOUBLE);
				}
				break;
			case JINJA_INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(145);
				match(JINJA_INT);
				}
				break;
			case JINJA_STRING:
				{
				_localctx = new EqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(146);
				match(JINJA_STRING);
				}
				break;
			case JINJA_ID:
				{
				_localctx = new EqIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(JINJA_ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(182);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(180);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new EqMulContext(new ExpressionContext(_parentctx, _parentState));
						((EqMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(150);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(151);
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
						setState(152);
						((EqMulContext)_localctx).right = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new ExpressionContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(153);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(154);
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
						setState(155);
						((EqAddContext)_localctx).right = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new EqCompareContext(new ExpressionContext(_parentctx, _parentState));
						((EqCompareContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(156);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(157);
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
						setState(158);
						((EqCompareContext)_localctx).right = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new EqAttrContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(159);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(160);
						match(JINJA_DOT);
						setState(161);
						match(JINJA_ID);
						}
						break;
					case 5:
						{
						_localctx = new EqIndexContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(162);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(163);
						match(JINJA_LSP);
						setState(164);
						expression(0);
						setState(165);
						match(JINJA_RSP);
						}
						break;
					case 6:
						{
						_localctx = new EqFilterContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(167);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(168);
						match(JINJA_PIP);
						setState(169);
						match(JINJA_ID);
						setState(178);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
						case 1:
							{
							setState(170);
							match(JINJA_LP);
							setState(174);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1081426860522340352L) != 0)) {
								{
								{
								setState(171);
								expression(0);
								}
								}
								setState(176);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							setState(177);
							match(JINJA_RP);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(184);
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
		enterRule(_localctx, 24, RULE_jinja_statement);
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
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
		enterRule(_localctx, 26, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(JINJA_BLOCK_START);
			setState(192);
			match(JINJA_SET);
			setState(193);
			match(JINJA_ID);
			setState(194);
			match(JINJA_SEQ);
			setState(195);
			expression(0);
			setState(196);
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
		enterRule(_localctx, 28, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			if_fragment();
			setState(202);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(199);
					templateContent();
					}
					} 
				}
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(205);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(206);
				else_statement();
				}
				break;
			}
			setState(209);
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
		enterRule(_localctx, 30, RULE_if_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(JINJA_BLOCK_START);
			setState(212);
			match(JINJA_IF);
			setState(213);
			expression(0);
			setState(214);
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
		enterRule(_localctx, 32, RULE_elif_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			elif_fragment();
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					templateContent();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(223);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(224);
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
		enterRule(_localctx, 34, RULE_elif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(JINJA_BLOCK_START);
			setState(228);
			match(JINJA_ELIF);
			setState(229);
			expression(0);
			setState(230);
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
		enterRule(_localctx, 36, RULE_else_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			else_fragment();
			setState(236);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(233);
					templateContent();
					}
					} 
				}
				setState(238);
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
		enterRule(_localctx, 38, RULE_else_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(JINJA_BLOCK_START);
			setState(240);
			match(JINJA_ELSE);
			setState(241);
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
		enterRule(_localctx, 40, RULE_endif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(JINJA_BLOCK_START);
			setState(244);
			match(JINJA_ENDIF);
			setState(245);
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
		enterRule(_localctx, 42, RULE_while_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			while_fragment();
			setState(251);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					templateContent();
					}
					} 
				}
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(254);
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
		enterRule(_localctx, 44, RULE_while_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(JINJA_BLOCK_START);
			setState(257);
			match(JINJA_WHILE);
			setState(258);
			expression(0);
			setState(259);
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
		enterRule(_localctx, 46, RULE_endwhile_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(JINJA_BLOCK_START);
			setState(262);
			match(JINJA_ENDWHILE);
			setState(263);
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
		enterRule(_localctx, 48, RULE_for_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			for_fragment();
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(266);
					templateContent();
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(272);
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
		enterRule(_localctx, 50, RULE_for_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(JINJA_BLOCK_START);
			setState(275);
			match(JINJA_FOR);
			setState(276);
			for_target();
			setState(277);
			match(JINJA_IN);
			setState(278);
			expression(0);
			setState(279);
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
		enterRule(_localctx, 52, RULE_for_target);
		try {
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				match(JINJA_ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(JINJA_ID);
				setState(283);
				match(JINJA_COMA);
				setState(284);
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
		enterRule(_localctx, 54, RULE_endfor_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(JINJA_BLOCK_START);
			setState(288);
			match(JINJA_ENDFOR);
			setState(289);
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
		enterRule(_localctx, 56, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(SCRIPT_OPEN);
			setState(292);
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
		enterRule(_localctx, 58, RULE_style);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(STYLE_OPEN);
			setState(295);
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
		enterRule(_localctx, 60, RULE_templateContent);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				htmlChardata();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				htmlElement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				jinjaExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				jinja_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				htmlComment();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
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
		enterRule(_localctx, 62, RULE_htmlTagContent);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TAG_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(305);
				htmlAttribute();
				}
				break;
			case TAG_JINJA_VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(306);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
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
		"\u0004\u0001<\u0136\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0005\u0000B\b\u0000\n\u0000\f\u0000"+
		"E\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"K\b\u0000\n\u0000\f\u0000N\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\\\b\u0003\n\u0003\f\u0003"+
		"_\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003h\b\u0003\u0001\u0003\u0003\u0003"+
		"k\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003p\b\u0003\u0001"+
		"\u0004\u0005\u0004s\b\u0004\n\u0004\f\u0004v\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0082\b\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0095\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00ad\b\u000b\n\u000b\f\u000b\u00b0\t\u000b\u0001"+
		"\u000b\u0003\u000b\u00b3\b\u000b\u0005\u000b\u00b5\b\u000b\n\u000b\f\u000b"+
		"\u00b8\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00be\b\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00c9\b\u000e\n\u000e\f\u000e\u00cc\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00d0\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00db\b\u0010\n\u0010\f\u0010\u00de\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e2\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u00eb\b\u0012\n\u0012"+
		"\f\u0012\u00ee\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u00fa\b\u0015\n\u0015\f\u0015\u00fd\t\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0005"+
		"\u0018\u010c\b\u0018\n\u0018\f\u0018\u010f\t\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u011e\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u0130\b\u001e\u0001\u001f\u0001\u001f\u0003\u001f\u0134\b\u001f\u0001"+
		"\u001f\u0000\u0001\u0016 \u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>\u0000\u0005\u0001"+
		"\u0000\u0003\u0004\u0002\u0000\u0004\u0004\n\n\u0001\u0000&\'\u0001\u0000"+
		"$%\u0001\u0000).\u0145\u0000C\u0001\u0000\u0000\u0000\u0002O\u0001\u0000"+
		"\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006o\u0001\u0000\u0000\u0000"+
		"\bt\u0001\u0000\u0000\u0000\nw\u0001\u0000\u0000\u0000\f|\u0001\u0000"+
		"\u0000\u0000\u000e\u0081\u0001\u0000\u0000\u0000\u0010\u0083\u0001\u0000"+
		"\u0000\u0000\u0012\u0085\u0001\u0000\u0000\u0000\u0014\u0087\u0001\u0000"+
		"\u0000\u0000\u0016\u0094\u0001\u0000\u0000\u0000\u0018\u00bd\u0001\u0000"+
		"\u0000\u0000\u001a\u00bf\u0001\u0000\u0000\u0000\u001c\u00c6\u0001\u0000"+
		"\u0000\u0000\u001e\u00d3\u0001\u0000\u0000\u0000 \u00d8\u0001\u0000\u0000"+
		"\u0000\"\u00e3\u0001\u0000\u0000\u0000$\u00e8\u0001\u0000\u0000\u0000"+
		"&\u00ef\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*\u00f7"+
		"\u0001\u0000\u0000\u0000,\u0100\u0001\u0000\u0000\u0000.\u0105\u0001\u0000"+
		"\u0000\u00000\u0109\u0001\u0000\u0000\u00002\u0112\u0001\u0000\u0000\u0000"+
		"4\u011d\u0001\u0000\u0000\u00006\u011f\u0001\u0000\u0000\u00008\u0123"+
		"\u0001\u0000\u0000\u0000:\u0126\u0001\u0000\u0000\u0000<\u012f\u0001\u0000"+
		"\u0000\u0000>\u0133\u0001\u0000\u0000\u0000@B\u0003\u0004\u0002\u0000"+
		"A@\u0001\u0000\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000CD\u0001\u0000\u0000\u0000DL\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000FK\u0003\u0002\u0001\u0000GK\u0003\u0012\t\u0000HK\u0003\u000e"+
		"\u0007\u0000IK\u0003\u0006\u0003\u0000JF\u0001\u0000\u0000\u0000JG\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000M\u0001\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000OP\u0005"+
		"\t\u0000\u0000PQ\u0005#\u0000\u0000QR\u0005;\u0000\u0000RS\u0005\u0017"+
		"\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TU\u0007\u0000\u0000\u0000"+
		"U\u0005\u0001\u0000\u0000\u0000Vp\u0003\u0014\n\u0000Wp\u0003\u0018\f"+
		"\u0000XY\u0005\u0005\u0000\u0000Y]\u0005\u0010\u0000\u0000Z\\\u0003>\u001f"+
		"\u0000[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]^\u0001\u0000\u0000\u0000^j\u0001\u0000\u0000\u0000_]\u0001"+
		"\u0000\u0000\u0000`g\u0005\f\u0000\u0000ab\u0003\b\u0004\u0000bc\u0005"+
		"\u0005\u0000\u0000cd\u0005\u000e\u0000\u0000de\u0005\u0010\u0000\u0000"+
		"ef\u0005\f\u0000\u0000fh\u0001\u0000\u0000\u0000ga\u0001\u0000\u0000\u0000"+
		"gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ik\u0005\r\u0000\u0000"+
		"j`\u0001\u0000\u0000\u0000ji\u0001\u0000\u0000\u0000kp\u0001\u0000\u0000"+
		"\u0000lp\u0005\u0003\u0000\u0000mp\u00038\u001c\u0000np\u0003:\u001d\u0000"+
		"oV\u0001\u0000\u0000\u0000oW\u0001\u0000\u0000\u0000oX\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000p\u0007\u0001\u0000\u0000\u0000qs\u0003<\u001e\u0000rq\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000u\t\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wz\u0005\u0010\u0000\u0000xy\u0005\u000f\u0000\u0000y{\u0005\u0014"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u000b"+
		"\u0001\u0000\u0000\u0000|}\u0007\u0001\u0000\u0000}\r\u0001\u0000\u0000"+
		"\u0000~\u0082\u0003\u0010\b\u0000\u007f\u0082\u0003\u0012\t\u0000\u0080"+
		"\u0082\u0005\u0004\u0000\u0000\u0081~\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u000f"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0001\u0000\u0000\u0084\u0011"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u0002\u0000\u0000\u0086\u0013"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0005\b\u0000\u0000\u0088\u0089\u0003"+
		"\u0016\u000b\u0000\u0089\u008a\u0005\u0018\u0000\u0000\u008a\u0015\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0006\u000b\uffff\uffff\u0000\u008c\u008d"+
		"\u00051\u0000\u0000\u008d\u008e\u0003\u0016\u000b\u0000\u008e\u008f\u0005"+
		"2\u0000\u0000\u008f\u0095\u0001\u0000\u0000\u0000\u0090\u0095\u0005:\u0000"+
		"\u0000\u0091\u0095\u00059\u0000\u0000\u0092\u0095\u0005;\u0000\u0000\u0093"+
		"\u0095\u00058\u0000\u0000\u0094\u008b\u0001\u0000\u0000\u0000\u0094\u0090"+
		"\u0001\u0000\u0000\u0000\u0094\u0091\u0001\u0000\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000\u0000\u0000\u0095\u00b6"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\n\n\u0000\u0000\u0097\u0098\u0007"+
		"\u0002\u0000\u0000\u0098\u00b5\u0003\u0016\u000b\u000b\u0099\u009a\n\t"+
		"\u0000\u0000\u009a\u009b\u0007\u0003\u0000\u0000\u009b\u00b5\u0003\u0016"+
		"\u000b\n\u009c\u009d\n\b\u0000\u0000\u009d\u009e\u0007\u0004\u0000\u0000"+
		"\u009e\u00b5\u0003\u0016\u000b\t\u009f\u00a0\n\u0007\u0000\u0000\u00a0"+
		"\u00a1\u00055\u0000\u0000\u00a1\u00b5\u00058\u0000\u0000\u00a2\u00a3\n"+
		"\u0006\u0000\u0000\u00a3\u00a4\u00053\u0000\u0000\u00a4\u00a5\u0003\u0016"+
		"\u000b\u0000\u00a5\u00a6\u00054\u0000\u0000\u00a6\u00b5\u0001\u0000\u0000"+
		"\u0000\u00a7\u00a8\n\u0005\u0000\u0000\u00a8\u00a9\u00056\u0000\u0000"+
		"\u00a9\u00b2\u00058\u0000\u0000\u00aa\u00ae\u00051\u0000\u0000\u00ab\u00ad"+
		"\u0003\u0016\u000b\u0000\u00ac\u00ab\u0001\u0000\u0000\u0000\u00ad\u00b0"+
		"\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0001\u0000\u0000\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b3\u00052\u0000\u0000\u00b2\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b4\u0096\u0001\u0000\u0000\u0000\u00b4\u0099\u0001"+
		"\u0000\u0000\u0000\u00b4\u009c\u0001\u0000\u0000\u0000\u00b4\u009f\u0001"+
		"\u0000\u0000\u0000\u00b4\u00a2\u0001\u0000\u0000\u0000\u00b4\u00a7\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b8\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u0017\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00be\u0003"+
		"\u001a\r\u0000\u00ba\u00be\u0003\u001c\u000e\u0000\u00bb\u00be\u0003*"+
		"\u0015\u0000\u00bc\u00be\u00030\u0018\u0000\u00bd\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bd\u00ba\u0001\u0000\u0000\u0000\u00bd\u00bb\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bc\u0001\u0000\u0000\u0000\u00be\u0019\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\t\u0000\u0000\u00c0\u00c1\u0005 \u0000\u0000"+
		"\u00c1\u00c2\u00058\u0000\u0000\u00c2\u00c3\u0005(\u0000\u0000\u00c3\u00c4"+
		"\u0003\u0016\u000b\u0000\u00c4\u00c5\u0005\u0017\u0000\u0000\u00c5\u001b"+
		"\u0001\u0000\u0000\u0000\u00c6\u00ca\u0003\u001e\u000f\u0000\u00c7\u00c9"+
		"\u0003<\u001e\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc\u0001"+
		"\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cf\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cd\u00d0\u0003 \u0010\u0000\u00ce\u00d0\u0003$\u0012"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0003(\u0014\u0000\u00d2\u001d\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0005\t\u0000\u0000\u00d4\u00d5\u0005\u0019\u0000\u0000\u00d5"+
		"\u00d6\u0003\u0016\u000b\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000\u00d7"+
		"\u001f\u0001\u0000\u0000\u0000\u00d8\u00dc\u0003\"\u0011\u0000\u00d9\u00db"+
		"\u0003<\u001e\u0000\u00da\u00d9\u0001\u0000\u0000\u0000\u00db\u00de\u0001"+
		"\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001"+
		"\u0000\u0000\u0000\u00dd\u00e1\u0001\u0000\u0000\u0000\u00de\u00dc\u0001"+
		"\u0000\u0000\u0000\u00df\u00e2\u0003 \u0010\u0000\u00e0\u00e2\u0003$\u0012"+
		"\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2!\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e4\u0005\t\u0000\u0000\u00e4\u00e5\u0005\u001a\u0000\u0000\u00e5"+
		"\u00e6\u0003\u0016\u000b\u0000\u00e6\u00e7\u0005\u0017\u0000\u0000\u00e7"+
		"#\u0001\u0000\u0000\u0000\u00e8\u00ec\u0003&\u0013\u0000\u00e9\u00eb\u0003"+
		"<\u001e\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ed%\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\t\u0000\u0000\u00f0\u00f1\u0005\u001b\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0017\u0000\u0000\u00f2\'\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0005\t\u0000\u0000\u00f4\u00f5\u0005\u001c\u0000\u0000\u00f5\u00f6"+
		"\u0005\u0017\u0000\u0000\u00f6)\u0001\u0000\u0000\u0000\u00f7\u00fb\u0003"+
		",\u0016\u0000\u00f8\u00fa\u0003<\u001e\u0000\u00f9\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fd\u0001\u0000\u0000\u0000\u00fb\u00f9\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fe\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fe\u00ff\u0003.\u0017\u0000"+
		"\u00ff+\u0001\u0000\u0000\u0000\u0100\u0101\u0005\t\u0000\u0000\u0101"+
		"\u0102\u0005!\u0000\u0000\u0102\u0103\u0003\u0016\u000b\u0000\u0103\u0104"+
		"\u0005\u0017\u0000\u0000\u0104-\u0001\u0000\u0000\u0000\u0105\u0106\u0005"+
		"\t\u0000\u0000\u0106\u0107\u0005\"\u0000\u0000\u0107\u0108\u0005\u0017"+
		"\u0000\u0000\u0108/\u0001\u0000\u0000\u0000\u0109\u010d\u00032\u0019\u0000"+
		"\u010a\u010c\u0003<\u001e\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010c"+
		"\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d"+
		"\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f"+
		"\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u00036\u001b\u0000\u01111\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000\u0000\u0113\u0114\u0005\u001d"+
		"\u0000\u0000\u0114\u0115\u00034\u001a\u0000\u0115\u0116\u0005\u001e\u0000"+
		"\u0000\u0116\u0117\u0003\u0016\u000b\u0000\u0117\u0118\u0005\u0017\u0000"+
		"\u0000\u01183\u0001\u0000\u0000\u0000\u0119\u011e\u00058\u0000\u0000\u011a"+
		"\u011b\u00058\u0000\u0000\u011b\u011c\u00057\u0000\u0000\u011c\u011e\u0005"+
		"8\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011d\u011a\u0001\u0000"+
		"\u0000\u0000\u011e5\u0001\u0000\u0000\u0000\u011f\u0120\u0005\t\u0000"+
		"\u0000\u0120\u0121\u0005\u001f\u0000\u0000\u0121\u0122\u0005\u0017\u0000"+
		"\u0000\u01227\u0001\u0000\u0000\u0000\u0123\u0124\u0005\u0006\u0000\u0000"+
		"\u0124\u0125\u0005\u0012\u0000\u0000\u01259\u0001\u0000\u0000\u0000\u0126"+
		"\u0127\u0005\u0007\u0000\u0000\u0127\u0128\u0005\u0013\u0000\u0000\u0128"+
		";\u0001\u0000\u0000\u0000\u0129\u0130\u0003\f\u0006\u0000\u012a\u0130"+
		"\u0003\u0006\u0003\u0000\u012b\u0130\u0003\u0014\n\u0000\u012c\u0130\u0003"+
		"\u0018\f\u0000\u012d\u0130\u0003\u0010\b\u0000\u012e\u0130\u0003\u0012"+
		"\t\u0000\u012f\u0129\u0001\u0000\u0000\u0000\u012f\u012a\u0001\u0000\u0000"+
		"\u0000\u012f\u012b\u0001\u0000\u0000\u0000\u012f\u012c\u0001\u0000\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u012e\u0001\u0000\u0000"+
		"\u0000\u0130=\u0001\u0000\u0000\u0000\u0131\u0134\u0003\n\u0005\u0000"+
		"\u0132\u0134\u0005\u000b\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134?\u0001\u0000\u0000\u0000\u001a"+
		"CJL]gjotz\u0081\u0094\u00ae\u00b2\u00b4\u00b6\u00bd\u00ca\u00cf\u00dc"+
		"\u00e1\u00ec\u00fb\u010d\u011d\u012f\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}