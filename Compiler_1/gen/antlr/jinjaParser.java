// Generated from D:/Compiler/Compiler_1/src/antlr/jinjaParser.g4 by ANTLR 4.13.2
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
public class jinjaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELIF=2, ELSE=3, ENDIF=4, WHILE=5, END_WHILE=6, SET=7, TRUE=8, FALSE=9, 
		EQUALS=10, ADD=11, SUB=12, MUL=13, DIV=14, EQ=15, NEQ=16, GT=17, LT=18, 
		GTEQ=19, LTEQ=20, LP=21, RP=22, US=23, SCOL=24, DQ=25, BLOCK_START=26, 
		VAR_START=27, BLOCK_END=28, VAR_END=29, HTML_TAG_OPEN=30, HTML_TAG_CLOSE=31, 
		ID=32, INT=33, DOUBLE=34, STRING=35, BOOL=36, TEXT=37, NEWLINE=38, COMMENT=39, 
		SEA_WS=40;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_assignment_statement = 2, RULE_expression = 3, 
		RULE_boolean_expression = 4, RULE_evaluation_statement = 5, RULE_if_statement = 6, 
		RULE_elif_statement = 7, RULE_else_statement = 8, RULE_if_fragment = 9, 
		RULE_elif_fragment = 10, RULE_else_fragment = 11, RULE_endif_fragment = 12, 
		RULE_code_block = 13, RULE_while_statement = 14, RULE_while_fragment = 15, 
		RULE_endwhile_fragment = 16, RULE_body = 17, RULE_contents = 18, RULE_html_element = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "assignment_statement", "expression", "boolean_expression", 
			"evaluation_statement", "if_statement", "elif_statement", "else_statement", 
			"if_fragment", "elif_fragment", "else_fragment", "endif_fragment", "code_block", 
			"while_statement", "while_fragment", "endwhile_fragment", "body", "contents", 
			"html_element"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'elif'", "'else'", "'endif'", "'while'", "'endwhile'", 
			"'set'", "'True'", "'False'", "'='", "'+'", "'-'", "'*'", "'/'", "'=='", 
			"'!='", "'>'", "'<'", "'>='", "'<='", "'('", "')'", "'_'", "';'", "'\"'", 
			"'{%'", "'{{'", "'%}'", "'}}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELIF", "ELSE", "ENDIF", "WHILE", "END_WHILE", "SET", "TRUE", 
			"FALSE", "EQUALS", "ADD", "SUB", "MUL", "DIV", "EQ", "NEQ", "GT", "LT", 
			"GTEQ", "LTEQ", "LP", "RP", "US", "SCOL", "DQ", "BLOCK_START", "VAR_START", 
			"BLOCK_END", "VAR_END", "HTML_TAG_OPEN", "HTML_TAG_CLOSE", "ID", "INT", 
			"DOUBLE", "STRING", "BOOL", "TEXT", "NEWLINE", "COMMENT", "SEA_WS"
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
	public String getGrammarFileName() { return "jinjaParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public jinjaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(jinjaParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138714021922L) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
	public static class StatementContext extends ParserRuleContext {
		public Evaluation_statementContext evaluation_statement() {
			return getRuleContext(Evaluation_statementContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public Assignment_statementContext assignment_statement() {
			return getRuleContext(Assignment_statementContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				evaluation_statement();
				}
				break;
			case HTML_TAG_OPEN:
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				body();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				if_statement();
				}
				break;
			case BLOCK_START:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				assignment_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				while_statement();
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
	public static class Assignment_statementContext extends ParserRuleContext {
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode SET() { return getToken(jinjaParser.SET, 0); }
		public TerminalNode ID() { return getToken(jinjaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(jinjaParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public Assignment_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterAssignment_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitAssignment_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitAssignment_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assignment_statementContext assignment_statement() throws RecognitionException {
		Assignment_statementContext _localctx = new Assignment_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignment_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(BLOCK_START);
			setState(56);
			match(SET);
			setState(57);
			match(ID);
			setState(58);
			match(EQUALS);
			setState(59);
			expression(0);
			setState(60);
			match(BLOCK_END);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(61);
				match(NEWLINE);
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
		public TerminalNode INT() { return getToken(jinjaParser.INT, 0); }
		public EqIntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqParContext extends ExpressionContext {
		public TerminalNode LP() { return getToken(jinjaParser.LP, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(jinjaParser.RP, 0); }
		public EqParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqPar(this);
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
		public TerminalNode ADD() { return getToken(jinjaParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(jinjaParser.SUB, 0); }
		public EqAddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqVarContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(jinjaParser.ID, 0); }
		public EqVarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqVar(this);
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
		public TerminalNode MUL() { return getToken(jinjaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(jinjaParser.DIV, 0); }
		public EqMulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqMul(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqStringContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(jinjaParser.STRING, 0); }
		public EqStringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqDoubleContext extends ExpressionContext {
		public TerminalNode DOUBLE() { return getToken(jinjaParser.DOUBLE, 0); }
		public EqDoubleContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqDouble(this);
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
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(65);
				match(LP);
				setState(66);
				expression(0);
				setState(67);
				match(RP);
				}
				break;
			case DOUBLE:
				{
				_localctx = new EqDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(69);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new EqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new EqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new EqMulContext(new ExpressionContext(_parentctx, _parentState));
						((EqMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(75);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(76);
						((EqMulContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((EqMulContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(77);
						((EqMulContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new ExpressionContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(78);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(79);
						((EqAddContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((EqAddContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(80);
						((EqAddContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
	public static class Boolean_expressionContext extends ParserRuleContext {
		public Boolean_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_expression; }
	 
		public Boolean_expressionContext() { }
		public void copyFrom(Boolean_expressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBoolParContext extends Boolean_expressionContext {
		public TerminalNode LP() { return getToken(jinjaParser.LP, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(jinjaParser.RP, 0); }
		public EqBoolParContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqBoolPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqBoolPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqBoolPar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqBoolContext extends Boolean_expressionContext {
		public TerminalNode BOOL() { return getToken(jinjaParser.BOOL, 0); }
		public EqBoolContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEqBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEqBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEqBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolEqContext extends Boolean_expressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(jinjaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(jinjaParser.NEQ, 0); }
		public BoolEqContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterBoolEq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitBoolEq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitBoolEq(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationExprContext extends Boolean_expressionContext {
		public ExpressionContext left;
		public Token operator;
		public ExpressionContext right;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode GT() { return getToken(jinjaParser.GT, 0); }
		public TerminalNode GTEQ() { return getToken(jinjaParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(jinjaParser.LT, 0); }
		public TerminalNode LTEQ() { return getToken(jinjaParser.LTEQ, 0); }
		public RelationExprContext(Boolean_expressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterRelationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitRelationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitRelationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_expressionContext boolean_expression() throws RecognitionException {
		Boolean_expressionContext _localctx = new Boolean_expressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_boolean_expression);
		int _la;
		try {
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new EqBoolParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(LP);
				setState(87);
				boolean_expression();
				setState(88);
				match(RP);
				}
				break;
			case 2:
				_localctx = new RelationExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				((RelationExprContext)_localctx).left = expression(0);
				setState(91);
				((RelationExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1966080L) != 0)) ) {
					((RelationExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(92);
				((RelationExprContext)_localctx).right = expression(0);
				}
				break;
			case 3:
				_localctx = new BoolEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((BoolEqContext)_localctx).left = expression(0);
				setState(95);
				((BoolEqContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==EQ || _la==NEQ) ) {
					((BoolEqContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				((BoolEqContext)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new EqBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				match(BOOL);
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
	public static class Evaluation_statementContext extends ParserRuleContext {
		public TerminalNode VAR_START() { return getToken(jinjaParser.VAR_START, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR_END() { return getToken(jinjaParser.VAR_END, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public Evaluation_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_evaluation_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEvaluation_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEvaluation_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEvaluation_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Evaluation_statementContext evaluation_statement() throws RecognitionException {
		Evaluation_statementContext _localctx = new Evaluation_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_evaluation_statement);
		try {
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(VAR_START);
				setState(102);
				expression(0);
				setState(103);
				match(VAR_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(VAR_START);
				setState(106);
				boolean_expression();
				setState(107);
				match(VAR_END);
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
	public static class If_statementContext extends ParserRuleContext {
		public If_fragmentContext if_fragment() {
			return getRuleContext(If_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Endif_fragmentContext endif_fragment() {
			return getRuleContext(Endif_fragmentContext.class,0);
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
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			if_fragment();
			setState(112);
			code_block();
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(113);
				elif_statement();
				}
				break;
			case ELSE:
				{
				setState(114);
				else_statement();
				}
				break;
			case ENDIF:
				break;
			default:
				break;
			}
			setState(117);
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
	public static class Elif_statementContext extends ParserRuleContext {
		public Elif_fragmentContext elif_fragment() {
			return getRuleContext(Elif_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
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
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElif_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElif_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			elif_fragment();
			setState(120);
			code_block();
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ELIF:
				{
				setState(121);
				elif_statement();
				}
				break;
			case ELSE:
				{
				setState(122);
				else_statement();
				}
				break;
			case ENDIF:
				break;
			default:
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public Code_blockContext code_block() {
			return getRuleContext(Code_blockContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElse_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			else_fragment();
			setState(126);
			code_block();
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
		public TerminalNode IF() { return getToken(jinjaParser.IF, 0); }
		public TerminalNode LP() { return getToken(jinjaParser.LP, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(jinjaParser.RP, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public If_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterIf_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitIf_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitIf_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_fragmentContext if_fragment() throws RecognitionException {
		If_fragmentContext _localctx = new If_fragmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(IF);
			setState(129);
			match(LP);
			setState(130);
			boolean_expression();
			setState(131);
			match(RP);
			setState(132);
			match(BLOCK_END);
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(133);
				match(NEWLINE);
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
		public TerminalNode ELIF() { return getToken(jinjaParser.ELIF, 0); }
		public TerminalNode LP() { return getToken(jinjaParser.LP, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(jinjaParser.RP, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public Elif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElif_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElif_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElif_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elif_fragmentContext elif_fragment() throws RecognitionException {
		Elif_fragmentContext _localctx = new Elif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ELIF);
			setState(137);
			match(LP);
			setState(138);
			boolean_expression();
			setState(139);
			match(RP);
			setState(140);
			match(BLOCK_END);
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(141);
				match(NEWLINE);
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
	public static class Else_fragmentContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(jinjaParser.ELSE, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public Else_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterElse_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitElse_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitElse_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_fragmentContext else_fragment() throws RecognitionException {
		Else_fragmentContext _localctx = new Else_fragmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_else_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(ELSE);
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(145);
				match(NEWLINE);
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
	public static class Endif_fragmentContext extends ParserRuleContext {
		public TerminalNode ENDIF() { return getToken(jinjaParser.ENDIF, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public Endif_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endif_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEndif_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEndif_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEndif_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endif_fragmentContext endif_fragment() throws RecognitionException {
		Endif_fragmentContext _localctx = new Endif_fragmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endif_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ENDIF);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(149);
				match(NEWLINE);
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
	public static class Code_blockContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(jinjaParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(jinjaParser.NEWLINE, i);
		}
		public Code_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterCode_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitCode_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitCode_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Code_blockContext code_block() throws RecognitionException {
		Code_blockContext _localctx = new Code_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_code_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(152);
				match(NEWLINE);
				}
			}

			setState(155);
			body();
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(156);
				match(NEWLINE);
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
	public static class While_statementContext extends ParserRuleContext {
		public While_fragmentContext while_fragment() {
			return getRuleContext(While_fragmentContext.class,0);
		}
		public Endwhile_fragmentContext endwhile_fragment() {
			return getRuleContext(Endwhile_fragmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterWhile_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitWhile_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_while_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			while_fragment();
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138714021922L) != 0)) {
				{
				{
				setState(160);
				statement();
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
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
		public TerminalNode WHILE() { return getToken(jinjaParser.WHILE, 0); }
		public TerminalNode LP() { return getToken(jinjaParser.LP, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(jinjaParser.RP, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public While_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterWhile_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitWhile_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitWhile_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_fragmentContext while_fragment() throws RecognitionException {
		While_fragmentContext _localctx = new While_fragmentContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(WHILE);
			setState(169);
			match(LP);
			setState(170);
			boolean_expression();
			setState(171);
			match(RP);
			setState(172);
			match(BLOCK_END);
			setState(174);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(173);
				match(NEWLINE);
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
	public static class Endwhile_fragmentContext extends ParserRuleContext {
		public TerminalNode END_WHILE() { return getToken(jinjaParser.END_WHILE, 0); }
		public TerminalNode NEWLINE() { return getToken(jinjaParser.NEWLINE, 0); }
		public Endwhile_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endwhile_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEndwhile_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEndwhile_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEndwhile_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endwhile_fragmentContext endwhile_fragment() throws RecognitionException {
		Endwhile_fragmentContext _localctx = new Endwhile_fragmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_endwhile_fragment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(END_WHILE);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(177);
				match(NEWLINE);
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
	public static class BodyContext extends ParserRuleContext {
		public ContentsContext contents() {
			return getRuleContext(ContentsContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			contents();
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
	public static class ContentsContext extends ParserRuleContext {
		public Html_elementContext html_element() {
			return getRuleContext(Html_elementContext.class,0);
		}
		public List<TerminalNode> TEXT() { return getTokens(jinjaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(jinjaParser.TEXT, i);
		}
		public ContentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contents; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterContents(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitContents(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitContents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentsContext contents() throws RecognitionException {
		ContentsContext _localctx = new ContentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_contents);
		try {
			int _alt;
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HTML_TAG_OPEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				html_element();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(184); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(183);
						match(TEXT);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(186); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Html_elementContext extends ParserRuleContext {
		public TerminalNode HTML_TAG_OPEN() { return getToken(jinjaParser.HTML_TAG_OPEN, 0); }
		public TerminalNode HTML_TAG_CLOSE() { return getToken(jinjaParser.HTML_TAG_CLOSE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Html_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterHtml_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitHtml_element(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitHtml_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Html_elementContext html_element() throws RecognitionException {
		Html_elementContext _localctx = new Html_elementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_html_element);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(HTML_TAG_OPEN);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138714021922L) != 0)) {
				{
				{
				setState(191);
				statement();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(HTML_TAG_CLOSE);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u00c8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"?\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003J\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003R\b\u0003\n\u0003\f\u0003U\t\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"d\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005n\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006t\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"|\b\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0087\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0003\n\u008f\b\n\u0001\u000b\u0001\u000b\u0003\u000b\u0093\b\u000b"+
		"\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\r\u0003\r\u009a\b\r\u0001\r\u0001"+
		"\r\u0003\r\u009e\b\r\u0001\u000e\u0001\u000e\u0005\u000e\u00a2\b\u000e"+
		"\n\u000e\f\u000e\u00a5\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00af"+
		"\b\u000f\u0001\u0010\u0001\u0010\u0003\u0010\u00b3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0004\u0012\u00b9\b\u0012\u000b\u0012"+
		"\f\u0012\u00ba\u0003\u0012\u00bd\b\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00c1\b\u0013\n\u0013\f\u0013\u00c4\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0000\u0001\u0006\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001"+
		"\u0000\r\u000e\u0001\u0000\u000b\f\u0001\u0000\u0011\u0014\u0001\u0000"+
		"\u000f\u0010\u00d3\u0000+\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000"+
		"\u0000\u00047\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\b"+
		"c\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\fo\u0001\u0000\u0000"+
		"\u0000\u000ew\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000\u0012"+
		"\u0080\u0001\u0000\u0000\u0000\u0014\u0088\u0001\u0000\u0000\u0000\u0016"+
		"\u0090\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000\u0000\u0000\u001a"+
		"\u0099\u0001\u0000\u0000\u0000\u001c\u009f\u0001\u0000\u0000\u0000\u001e"+
		"\u00a8\u0001\u0000\u0000\u0000 \u00b0\u0001\u0000\u0000\u0000\"\u00b4"+
		"\u0001\u0000\u0000\u0000$\u00bc\u0001\u0000\u0000\u0000&\u00be\u0001\u0000"+
		"\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000"+
		"\u0001/\u0001\u0001\u0000\u0000\u000006\u0003\n\u0005\u000016\u0003\""+
		"\u0011\u000026\u0003\f\u0006\u000036\u0003\u0004\u0002\u000046\u0003\u001c"+
		"\u000e\u000050\u0001\u0000\u0000\u000051\u0001\u0000\u0000\u000052\u0001"+
		"\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u0000"+
		"6\u0003\u0001\u0000\u0000\u000078\u0005\u001a\u0000\u000089\u0005\u0007"+
		"\u0000\u00009:\u0005 \u0000\u0000:;\u0005\n\u0000\u0000;<\u0003\u0006"+
		"\u0003\u0000<>\u0005\u001c\u0000\u0000=?\u0005&\u0000\u0000>=\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000"+
		"@A\u0006\u0003\uffff\uffff\u0000AB\u0005\u0015\u0000\u0000BC\u0003\u0006"+
		"\u0003\u0000CD\u0005\u0016\u0000\u0000DJ\u0001\u0000\u0000\u0000EJ\u0005"+
		"\"\u0000\u0000FJ\u0005!\u0000\u0000GJ\u0005#\u0000\u0000HJ\u0005 \u0000"+
		"\u0000I@\u0001\u0000\u0000\u0000IE\u0001\u0000\u0000\u0000IF\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IH\u0001\u0000\u0000\u0000JS\u0001"+
		"\u0000\u0000\u0000KL\n\u0006\u0000\u0000LM\u0007\u0000\u0000\u0000MR\u0003"+
		"\u0006\u0003\u0007NO\n\u0005\u0000\u0000OP\u0007\u0001\u0000\u0000PR\u0003"+
		"\u0006\u0003\u0006QK\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000"+
		"RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000"+
		"\u0000T\u0007\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000VW\u0005"+
		"\u0015\u0000\u0000WX\u0003\b\u0004\u0000XY\u0005\u0016\u0000\u0000Yd\u0001"+
		"\u0000\u0000\u0000Z[\u0003\u0006\u0003\u0000[\\\u0007\u0002\u0000\u0000"+
		"\\]\u0003\u0006\u0003\u0000]d\u0001\u0000\u0000\u0000^_\u0003\u0006\u0003"+
		"\u0000_`\u0007\u0003\u0000\u0000`a\u0003\u0006\u0003\u0000ad\u0001\u0000"+
		"\u0000\u0000bd\u0005$\u0000\u0000cV\u0001\u0000\u0000\u0000cZ\u0001\u0000"+
		"\u0000\u0000c^\u0001\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000d\t\u0001"+
		"\u0000\u0000\u0000ef\u0005\u001b\u0000\u0000fg\u0003\u0006\u0003\u0000"+
		"gh\u0005\u001d\u0000\u0000hn\u0001\u0000\u0000\u0000ij\u0005\u001b\u0000"+
		"\u0000jk\u0003\b\u0004\u0000kl\u0005\u001d\u0000\u0000ln\u0001\u0000\u0000"+
		"\u0000me\u0001\u0000\u0000\u0000mi\u0001\u0000\u0000\u0000n\u000b\u0001"+
		"\u0000\u0000\u0000op\u0003\u0012\t\u0000ps\u0003\u001a\r\u0000qt\u0003"+
		"\u000e\u0007\u0000rt\u0003\u0010\b\u0000sq\u0001\u0000\u0000\u0000sr\u0001"+
		"\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000"+
		"uv\u0003\u0018\f\u0000v\r\u0001\u0000\u0000\u0000wx\u0003\u0014\n\u0000"+
		"x{\u0003\u001a\r\u0000y|\u0003\u000e\u0007\u0000z|\u0003\u0010\b\u0000"+
		"{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000"+
		"\u0000|\u000f\u0001\u0000\u0000\u0000}~\u0003\u0016\u000b\u0000~\u007f"+
		"\u0003\u001a\r\u0000\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"\u0001\u0000\u0000\u0081\u0082\u0005\u0015\u0000\u0000\u0082\u0083\u0003"+
		"\b\u0004\u0000\u0083\u0084\u0005\u0016\u0000\u0000\u0084\u0086\u0005\u001c"+
		"\u0000\u0000\u0085\u0087\u0005&\u0000\u0000\u0086\u0085\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0013\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005\u0002\u0000\u0000\u0089\u008a\u0005\u0015\u0000"+
		"\u0000\u008a\u008b\u0003\b\u0004\u0000\u008b\u008c\u0005\u0016\u0000\u0000"+
		"\u008c\u008e\u0005\u001c\u0000\u0000\u008d\u008f\u0005&\u0000\u0000\u008e"+
		"\u008d\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f"+
		"\u0015\u0001\u0000\u0000\u0000\u0090\u0092\u0005\u0003\u0000\u0000\u0091"+
		"\u0093\u0005&\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000\u0000\u0094\u0096"+
		"\u0005\u0004\u0000\u0000\u0095\u0097\u0005&\u0000\u0000\u0096\u0095\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0019\u0001"+
		"\u0000\u0000\u0000\u0098\u009a\u0005&\u0000\u0000\u0099\u0098\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009d\u0003\"\u0011\u0000\u009c\u009e\u0005&\u0000"+
		"\u0000\u009d\u009c\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000"+
		"\u0000\u009e\u001b\u0001\u0000\u0000\u0000\u009f\u00a3\u0003\u001e\u000f"+
		"\u0000\u00a0\u00a2\u0003\u0002\u0001\u0000\u00a1\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a6\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00a7\u0003 \u0010\u0000"+
		"\u00a7\u001d\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\u0005\u0000\u0000"+
		"\u00a9\u00aa\u0005\u0015\u0000\u0000\u00aa\u00ab\u0003\b\u0004\u0000\u00ab"+
		"\u00ac\u0005\u0016\u0000\u0000\u00ac\u00ae\u0005\u001c\u0000\u0000\u00ad"+
		"\u00af\u0005&\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00ae\u00af"+
		"\u0001\u0000\u0000\u0000\u00af\u001f\u0001\u0000\u0000\u0000\u00b0\u00b2"+
		"\u0005\u0006\u0000\u0000\u00b1\u00b3\u0005&\u0000\u0000\u00b2\u00b1\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3!\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0003$\u0012\u0000\u00b5#\u0001\u0000\u0000\u0000"+
		"\u00b6\u00bd\u0003&\u0013\u0000\u00b7\u00b9\u0005%\u0000\u0000\u00b8\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8"+
		"\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bd"+
		"\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b8"+
		"\u0001\u0000\u0000\u0000\u00bd%\u0001\u0000\u0000\u0000\u00be\u00c2\u0005"+
		"\u001e\u0000\u0000\u00bf\u00c1\u0003\u0002\u0001\u0000\u00c0\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"\u001f\u0000\u0000\u00c6\'\u0001\u0000\u0000\u0000\u0016+5>IQScms{\u0086"+
		"\u008e\u0092\u0096\u0099\u009d\u00a3\u00ae\u00b2\u00ba\u00bc\u00c2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}