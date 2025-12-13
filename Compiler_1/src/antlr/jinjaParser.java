// Generated from D:/UY Things/Compiler/Compiler_1/src/antlr/jinjaParser.g4 by ANTLR 4.13.2
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
		TEXT=1, COMMENT=2, WS=3, BLOCK_START=4, VAR_START=5, WS_EXPR=6, BLOCK_END=7, 
		VAR_END=8, IF=9, ELIF=10, ELSE=11, ENDIF=12, FOR=13, IN=14, END_FOR=15, 
		SET=16, WHILE=17, END_WHILE=18, ADD=19, SUB=20, MUL=21, DIV=22, EQUALS=23, 
		EQ=24, NEQ=25, GT=26, LT=27, GTEQ=28, LTEQ=29, LP=30, RP=31, DOT=32, ID=33, 
		INT=34, DOUBLE=35, STRING=36, BOOL=37;
	public static final int
		RULE_program = 0, RULE_text_or_eval = 1, RULE_statement = 2, RULE_assignment_statement = 3, 
		RULE_expression = 4, RULE_boolean_expression = 5, RULE_evaluation_statement = 6, 
		RULE_if_statement = 7, RULE_if_fragment = 8, RULE_elif_statement = 9, 
		RULE_else_statement = 10, RULE_elif_fragment = 11, RULE_else_fragment = 12, 
		RULE_endif_fragment = 13, RULE_while_statement = 14, RULE_while_fragment = 15, 
		RULE_endwhile_fragment = 16, RULE_for_statement = 17, RULE_for_fragment = 18, 
		RULE_endfor_fragment = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "text_or_eval", "statement", "assignment_statement", "expression", 
			"boolean_expression", "evaluation_statement", "if_statement", "if_fragment", 
			"elif_statement", "else_statement", "elif_fragment", "else_fragment", 
			"endif_fragment", "while_statement", "while_fragment", "endwhile_fragment", 
			"for_statement", "for_fragment", "endfor_fragment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'{%'", "'{{'", null, "'%}'", "'}}'", "'if'", 
			"'elif'", "'else'", "'endif'", "'for'", "'in'", "'endfor'", "'set'", 
			"'while'", "'endwhile'", "'+'", "'-'", "'*'", "'/'", "'='", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TEXT", "COMMENT", "WS", "BLOCK_START", "VAR_START", "WS_EXPR", 
			"BLOCK_END", "VAR_END", "IF", "ELIF", "ELSE", "ENDIF", "FOR", "IN", "END_FOR", 
			"SET", "WHILE", "END_WHILE", "ADD", "SUB", "MUL", "DIV", "EQUALS", "EQ", 
			"NEQ", "GT", "LT", "GTEQ", "LTEQ", "LP", "RP", "DOT", "ID", "INT", "DOUBLE", 
			"STRING", "BOOL"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50L) != 0)) {
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
	public static class Text_or_evalContext extends ParserRuleContext {
		public List<TerminalNode> TEXT() { return getTokens(jinjaParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(jinjaParser.TEXT, i);
		}
		public List<Evaluation_statementContext> evaluation_statement() {
			return getRuleContexts(Evaluation_statementContext.class);
		}
		public Evaluation_statementContext evaluation_statement(int i) {
			return getRuleContext(Evaluation_statementContext.class,i);
		}
		public Text_or_evalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text_or_eval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterText_or_eval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitText_or_eval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitText_or_eval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text_or_evalContext text_or_eval() throws RecognitionException {
		Text_or_evalContext _localctx = new Text_or_evalContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text_or_eval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(50); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(50);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXT:
						{
						setState(48);
						match(TEXT);
						}
						break;
					case VAR_START:
						{
						setState(49);
						evaluation_statement();
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
				setState(52); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class StatementContext extends ParserRuleContext {
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
		public Text_or_evalContext text_or_eval() {
			return getRuleContext(Text_or_evalContext.class,0);
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
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				assignment_statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				if_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				while_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				for_statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				text_or_eval();
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode SET() { return getToken(jinjaParser.SET, 0); }
		public TerminalNode ID() { return getToken(jinjaParser.ID, 0); }
		public TerminalNode EQUALS() { return getToken(jinjaParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 6, RULE_assignment_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(BLOCK_START);
			setState(62);
			match(SET);
			setState(63);
			match(ID);
			setState(64);
			match(EQUALS);
			setState(65);
			expression(0);
			setState(66);
			match(BLOCK_END);
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
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP:
				{
				_localctx = new EqParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(69);
				match(LP);
				setState(70);
				expression(0);
				setState(71);
				match(RP);
				}
				break;
			case DOUBLE:
				{
				_localctx = new EqDoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(73);
				match(DOUBLE);
				}
				break;
			case INT:
				{
				_localctx = new EqIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(74);
				match(INT);
				}
				break;
			case STRING:
				{
				_localctx = new EqStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(STRING);
				}
				break;
			case ID:
				{
				_localctx = new EqVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(87);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(85);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new EqMulContext(new ExpressionContext(_parentctx, _parentState));
						((EqMulContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(80);
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
						setState(81);
						((EqMulContext)_localctx).right = expression(7);
						}
						break;
					case 2:
						{
						_localctx = new EqAddContext(new ExpressionContext(_parentctx, _parentState));
						((EqAddContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(82);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(83);
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
						setState(84);
						((EqAddContext)_localctx).right = expression(6);
						}
						break;
					}
					} 
				}
				setState(89);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		enterRule(_localctx, 10, RULE_boolean_expression);
		int _la;
		try {
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new EqBoolParContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(LP);
				setState(91);
				boolean_expression();
				setState(92);
				match(RP);
				}
				break;
			case 2:
				_localctx = new RelationExprContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				((RelationExprContext)_localctx).left = expression(0);
				setState(95);
				((RelationExprContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1006632960L) != 0)) ) {
					((RelationExprContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				((RelationExprContext)_localctx).right = expression(0);
				}
				break;
			case 3:
				_localctx = new BoolEqContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				((BoolEqContext)_localctx).left = expression(0);
				setState(99);
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
				setState(100);
				((BoolEqContext)_localctx).right = expression(0);
				}
				break;
			case 4:
				_localctx = new EqBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(102);
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
		enterRule(_localctx, 12, RULE_evaluation_statement);
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(VAR_START);
				setState(106);
				expression(0);
				setState(107);
				match(VAR_END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(VAR_START);
				setState(110);
				boolean_expression();
				setState(111);
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
		public Endif_fragmentContext endif_fragment() {
			return getRuleContext(Endif_fragmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 14, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			if_fragment();
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					statement();
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(122);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(123);
				else_statement();
				}
				break;
			}
			setState(126);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode IF() { return getToken(jinjaParser.IF, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 16, RULE_if_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(BLOCK_START);
			setState(129);
			match(IF);
			setState(130);
			boolean_expression();
			setState(131);
			match(BLOCK_END);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 18, RULE_elif_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			elif_fragment();
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					statement();
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(140);
				elif_statement();
				}
				break;
			case 2:
				{
				setState(141);
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_fragmentContext else_fragment() {
			return getRuleContext(Else_fragmentContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 20, RULE_else_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			else_fragment();
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145);
					statement();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode ELIF() { return getToken(jinjaParser.ELIF, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 22, RULE_elif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(BLOCK_START);
			setState(152);
			match(ELIF);
			setState(153);
			boolean_expression();
			setState(154);
			match(BLOCK_END);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode ELSE() { return getToken(jinjaParser.ELSE, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 24, RULE_else_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(BLOCK_START);
			setState(157);
			match(ELSE);
			setState(158);
			match(BLOCK_END);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode ENDIF() { return getToken(jinjaParser.ENDIF, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 26, RULE_endif_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(BLOCK_START);
			setState(161);
			match(ENDIF);
			setState(162);
			match(BLOCK_END);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			while_fragment();
			setState(168);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					statement();
					}
					} 
				}
				setState(170);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			setState(171);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode WHILE() { return getToken(jinjaParser.WHILE, 0); }
		public Boolean_expressionContext boolean_expression() {
			return getRuleContext(Boolean_expressionContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(BLOCK_START);
			setState(174);
			match(WHILE);
			setState(175);
			boolean_expression();
			setState(176);
			match(BLOCK_END);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode END_WHILE() { return getToken(jinjaParser.END_WHILE, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(BLOCK_START);
			setState(179);
			match(END_WHILE);
			setState(180);
			match(BLOCK_END);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public For_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterFor_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitFor_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitFor_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_statementContext for_statement() throws RecognitionException {
		For_statementContext _localctx = new For_statementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_for_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			for_fragment();
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(183);
					statement();
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(189);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode FOR() { return getToken(jinjaParser.FOR, 0); }
		public List<TerminalNode> ID() { return getTokens(jinjaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(jinjaParser.ID, i);
		}
		public TerminalNode IN() { return getToken(jinjaParser.IN, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public For_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterFor_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitFor_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitFor_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_fragmentContext for_fragment() throws RecognitionException {
		For_fragmentContext _localctx = new For_fragmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_for_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BLOCK_START);
			setState(192);
			match(FOR);
			setState(193);
			match(ID);
			setState(194);
			match(IN);
			setState(195);
			match(ID);
			setState(196);
			match(BLOCK_END);
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
		public TerminalNode BLOCK_START() { return getToken(jinjaParser.BLOCK_START, 0); }
		public TerminalNode END_FOR() { return getToken(jinjaParser.END_FOR, 0); }
		public TerminalNode BLOCK_END() { return getToken(jinjaParser.BLOCK_END, 0); }
		public Endfor_fragmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endfor_fragment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).enterEndfor_fragment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof jinjaParserListener ) ((jinjaParserListener)listener).exitEndfor_fragment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof jinjaParserVisitor ) return ((jinjaParserVisitor<? extends T>)visitor).visitEndfor_fragment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Endfor_fragmentContext endfor_fragment() throws RecognitionException {
		Endfor_fragmentContext _localctx = new Endfor_fragmentContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_endfor_fragment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(BLOCK_START);
			setState(199);
			match(END_FOR);
			setState(200);
			match(BLOCK_END);
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
		case 4:
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
		"\u0004\u0001%\u00cb\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000\f\u0000"+
		"-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0004\u0001"+
		"3\b\u0001\u000b\u0001\f\u00014\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004N\b\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004"+
		"\f\u0004Y\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005h\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006r\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007v\b\u0007"+
		"\n\u0007\f\u0007y\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007}\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0005\t\u0088\b\t\n\t\f\t\u008b\t\t\u0001\t\u0001\t\u0003\t"+
		"\u008f\b\t\u0001\n\u0001\n\u0005\n\u0093\b\n\n\n\f\n\u0096\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011"+
		"\u00b9\b\u0011\n\u0011\f\u0011\u00bc\t\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000"+
		"\u0001\b\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&\u0000\u0004\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u0013\u0014\u0001\u0000\u001a\u001d\u0001\u0000\u0018\u0019\u00d0"+
		"\u0000+\u0001\u0000\u0000\u0000\u00022\u0001\u0000\u0000\u0000\u0004;"+
		"\u0001\u0000\u0000\u0000\u0006=\u0001\u0000\u0000\u0000\bM\u0001\u0000"+
		"\u0000\u0000\ng\u0001\u0000\u0000\u0000\fq\u0001\u0000\u0000\u0000\u000e"+
		"s\u0001\u0000\u0000\u0000\u0010\u0080\u0001\u0000\u0000\u0000\u0012\u0085"+
		"\u0001\u0000\u0000\u0000\u0014\u0090\u0001\u0000\u0000\u0000\u0016\u0097"+
		"\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00a0"+
		"\u0001\u0000\u0000\u0000\u001c\u00a4\u0001\u0000\u0000\u0000\u001e\u00ad"+
		"\u0001\u0000\u0000\u0000 \u00b2\u0001\u0000\u0000\u0000\"\u00b6\u0001"+
		"\u0000\u0000\u0000$\u00bf\u0001\u0000\u0000\u0000&\u00c6\u0001\u0000\u0000"+
		"\u0000(*\u0003\u0004\u0002\u0000)(\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000\u0000\u0001"+
		"/\u0001\u0001\u0000\u0000\u000003\u0005\u0001\u0000\u000013\u0003\f\u0006"+
		"\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000"+
		"\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0003"+
		"\u0001\u0000\u0000\u00006<\u0003\u0006\u0003\u00007<\u0003\u000e\u0007"+
		"\u00008<\u0003\u001c\u000e\u00009<\u0003\"\u0011\u0000:<\u0003\u0002\u0001"+
		"\u0000;6\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000;8\u0001\u0000"+
		"\u0000\u0000;9\u0001\u0000\u0000\u0000;:\u0001\u0000\u0000\u0000<\u0005"+
		"\u0001\u0000\u0000\u0000=>\u0005\u0004\u0000\u0000>?\u0005\u0010\u0000"+
		"\u0000?@\u0005!\u0000\u0000@A\u0005\u0017\u0000\u0000AB\u0003\b\u0004"+
		"\u0000BC\u0005\u0007\u0000\u0000C\u0007\u0001\u0000\u0000\u0000DE\u0006"+
		"\u0004\uffff\uffff\u0000EF\u0005\u001e\u0000\u0000FG\u0003\b\u0004\u0000"+
		"GH\u0005\u001f\u0000\u0000HN\u0001\u0000\u0000\u0000IN\u0005#\u0000\u0000"+
		"JN\u0005\"\u0000\u0000KN\u0005$\u0000\u0000LN\u0005!\u0000\u0000MD\u0001"+
		"\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000NW\u0001\u0000\u0000"+
		"\u0000OP\n\u0006\u0000\u0000PQ\u0007\u0000\u0000\u0000QV\u0003\b\u0004"+
		"\u0007RS\n\u0005\u0000\u0000ST\u0007\u0001\u0000\u0000TV\u0003\b\u0004"+
		"\u0006UO\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\t\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0005\u001e\u0000\u0000"+
		"[\\\u0003\n\u0005\u0000\\]\u0005\u001f\u0000\u0000]h\u0001\u0000\u0000"+
		"\u0000^_\u0003\b\u0004\u0000_`\u0007\u0002\u0000\u0000`a\u0003\b\u0004"+
		"\u0000ah\u0001\u0000\u0000\u0000bc\u0003\b\u0004\u0000cd\u0007\u0003\u0000"+
		"\u0000de\u0003\b\u0004\u0000eh\u0001\u0000\u0000\u0000fh\u0005%\u0000"+
		"\u0000gZ\u0001\u0000\u0000\u0000g^\u0001\u0000\u0000\u0000gb\u0001\u0000"+
		"\u0000\u0000gf\u0001\u0000\u0000\u0000h\u000b\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0005\u0000\u0000jk\u0003\b\u0004\u0000kl\u0005\b\u0000\u0000"+
		"lr\u0001\u0000\u0000\u0000mn\u0005\u0005\u0000\u0000no\u0003\n\u0005\u0000"+
		"op\u0005\b\u0000\u0000pr\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000\u0000"+
		"qm\u0001\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000sw\u0003\u0010\b"+
		"\u0000tv\u0003\u0004\u0002\u0000ut\u0001\u0000\u0000\u0000vy\u0001\u0000"+
		"\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x|\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z}\u0003\u0012\t\u0000{}\u0003"+
		"\u0014\n\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000|}\u0001"+
		"\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0003\u001a\r\u0000"+
		"\u007f\u000f\u0001\u0000\u0000\u0000\u0080\u0081\u0005\u0004\u0000\u0000"+
		"\u0081\u0082\u0005\t\u0000\u0000\u0082\u0083\u0003\n\u0005\u0000\u0083"+
		"\u0084\u0005\u0007\u0000\u0000\u0084\u0011\u0001\u0000\u0000\u0000\u0085"+
		"\u0089\u0003\u0016\u000b\u0000\u0086\u0088\u0003\u0004\u0002\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008e\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008f\u0003\u0012\t\u0000\u008d\u008f\u0003\u0014\n\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0013\u0001\u0000\u0000\u0000\u0090\u0094"+
		"\u0003\u0018\f\u0000\u0091\u0093\u0003\u0004\u0002\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0015\u0001"+
		"\u0000\u0000\u0000\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u0098\u0005"+
		"\u0004\u0000\u0000\u0098\u0099\u0005\n\u0000\u0000\u0099\u009a\u0003\n"+
		"\u0005\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u0017\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0005\u0004\u0000\u0000\u009d\u009e\u0005\u000b"+
		"\u0000\u0000\u009e\u009f\u0005\u0007\u0000\u0000\u009f\u0019\u0001\u0000"+
		"\u0000\u0000\u00a0\u00a1\u0005\u0004\u0000\u0000\u00a1\u00a2\u0005\f\u0000"+
		"\u0000\u00a2\u00a3\u0005\u0007\u0000\u0000\u00a3\u001b\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a8\u0003\u001e\u000f\u0000\u00a5\u00a7\u0003\u0004\u0002"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0003 \u0010\u0000\u00ac\u001d\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0005\u0004\u0000\u0000\u00ae\u00af\u0005\u0011\u0000\u0000"+
		"\u00af\u00b0\u0003\n\u0005\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000\u00b1"+
		"\u001f\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005\u0004\u0000\u0000\u00b3"+
		"\u00b4\u0005\u0012\u0000\u0000\u00b4\u00b5\u0005\u0007\u0000\u0000\u00b5"+
		"!\u0001\u0000\u0000\u0000\u00b6\u00ba\u0003$\u0012\u0000\u00b7\u00b9\u0003"+
		"\u0004\u0002\u0000\u00b8\u00b7\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0003&\u0013\u0000\u00be#\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0004\u0000\u0000\u00c0\u00c1\u0005\r\u0000\u0000"+
		"\u00c1\u00c2\u0005!\u0000\u0000\u00c2\u00c3\u0005\u000e\u0000\u0000\u00c3"+
		"\u00c4\u0005!\u0000\u0000\u00c4\u00c5\u0005\u0007\u0000\u0000\u00c5%\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0005\u0004\u0000\u0000\u00c7\u00c8\u0005"+
		"\u000f\u0000\u0000\u00c8\u00c9\u0005\u0007\u0000\u0000\u00c9\'\u0001\u0000"+
		"\u0000\u0000\u0010+24;MUWgqw|\u0089\u008e\u0094\u00a8\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}