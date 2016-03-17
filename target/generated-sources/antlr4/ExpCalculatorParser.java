// Generated from ExpCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpCalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, NL=8, WS=9, DIGIT=10, 
		STIRNG=11, BOOLEAN=12, VAR_IDENTIFIER=13, ASS_OPERATOR=14, INT_TYPE=15, 
		FLOAT_TYPE=16, STRING_TYPE=17, CHAR_TYPE=18, BOOLEAN_TYPE=19, VOID_TYPE=20, 
		TERMINATOR=21, IF_CONDITIONAL=22, ELSE_IF_CONDITIONAL=23, ELSE_CONDITIONAL=24, 
		THEN_CONDITIONAL=25, FOR_LOOP=26, WHILE_LOOP=27, DO_WHILE_LOOP=28, OPEN_PAR=29, 
		CLOSE_PAR=30, OPEN_BRE=31, CLOSE_BRE=32, OPEN_BRT=33, COMMENT_BLOCK=34, 
		ADD_OPERATOR=35, SUBTRACT_OPERATOR=36, MULTIPLY_OPERATOR=37, DIVIDE_OPERATOR=38, 
		MODULO_OPERATOR=39, LESS_THAN_OPERATOR=40, LESS_THAN_EQUAL_TO_OPERATOR=41, 
		GREATER_THAN_OPERATOR=42, GREATER_THAN_EQAUL_TO_OPERATOR=43, EQUAL_TO_OPERATOR=44, 
		NOT_EQUAL_TO_OPERATOR=45, AND_OPERATOR=46, OR_OPERATOR=47, NOT_OPERATOR=48, 
		ARRAY_SIZE_DELIMITER=49, CONSTANT=50, COMMA=51, INCREMENT_OPERATOR=52, 
		DECREMENT_OPERATOR=53, FUNC_DEFINITION=54, FUNC_CALL=55, PARAMETER_ENUMERATION=56, 
		MAIN_FUNC=57, RETURN=58, FUNC_IDENTIFIER=59, PARAM_ENUMERATION=60;
	public static final int
		RULE_start = 0, RULE_func = 1, RULE_main_func = 2, RULE_params = 3, RULE_params2 = 4, 
		RULE_data_type = 5, RULE_statement = 6, RULE_integer = 7, RULE_unary_op = 8, 
		RULE_expr = 9;
	public static final String[] ruleNames = {
		"start", "func", "main_func", "params", "params2", "data_type", "statement", 
		"integer", "unary_op", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'('", "')'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "NL", "WS", "DIGIT", "STIRNG", 
		"BOOLEAN", "VAR_IDENTIFIER", "ASS_OPERATOR", "INT_TYPE", "FLOAT_TYPE", 
		"STRING_TYPE", "CHAR_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "TERMINATOR", 
		"IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", "THEN_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_WHILE_LOOP", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRE", 
		"CLOSE_BRE", "OPEN_BRT", "COMMENT_BLOCK", "ADD_OPERATOR", "SUBTRACT_OPERATOR", 
		"MULTIPLY_OPERATOR", "DIVIDE_OPERATOR", "MODULO_OPERATOR", "LESS_THAN_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "GREATER_THAN_OPERATOR", "GREATER_THAN_EQAUL_TO_OPERATOR", 
		"EQUAL_TO_OPERATOR", "NOT_EQUAL_TO_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", 
		"NOT_OPERATOR", "ARRAY_SIZE_DELIMITER", "CONSTANT", "COMMA", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "FUNC_DEFINITION", "FUNC_CALL", "PARAMETER_ENUMERATION", 
		"MAIN_FUNC", "RETURN", "FUNC_IDENTIFIER", "PARAM_ENUMERATION"
	};
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
	public String getGrammarFileName() { return "ExpCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpCalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public FuncContext func() {
			return getRuleContext(FuncContext.class,0);
		}
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			func();
			setState(21);
			main_func();
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

	public static class FuncContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode FUNC_IDENTIFIER() { return getToken(ExpCalculatorParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode PARAMETER_ENUMERATION() { return getToken(ExpCalculatorParser.PARAMETER_ENUMERATION, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode FUNC_DEFINITION() { return getToken(ExpCalculatorParser.FUNC_DEFINITION, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			data_type();
			setState(24);
			match(FUNC_IDENTIFIER);
			setState(25);
			match(PARAMETER_ENUMERATION);
			setState(26);
			params();
			setState(27);
			match(FUNC_DEFINITION);
			setState(28);
			match(OPEN_PAR);
			setState(29);
			match(CLOSE_PAR);
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

	public static class Main_funcContext extends ParserRuleContext {
		public TerminalNode MAIN_FUNC() { return getToken(ExpCalculatorParser.MAIN_FUNC, 0); }
		public TerminalNode PARAM_ENUMERATION() { return getToken(ExpCalculatorParser.PARAM_ENUMERATION, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterMain_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitMain_func(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(MAIN_FUNC);
			setState(32);
			match(PARAM_ENUMERATION);
			setState(33);
			params();
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

	public static class ParamsContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public Params2Context params2() {
			return getRuleContext(Params2Context.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpCalculatorParser.EOF, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_params);
		try {
			setState(40);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				data_type();
				setState(36);
				match(VAR_IDENTIFIER);
				setState(37);
				params2();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				match(EOF);
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

	public static class Params2Context extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ExpCalculatorParser.COMMA, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public Params2Context params2() {
			return getRuleContext(Params2Context.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpCalculatorParser.EOF, 0); }
		public Params2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterParams2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitParams2(this);
		}
	}

	public final Params2Context params2() throws RecognitionException {
		Params2Context _localctx = new Params2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_params2);
		try {
			setState(48);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(COMMA);
				setState(43);
				data_type();
				setState(44);
				match(VAR_IDENTIFIER);
				setState(45);
				params2();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				match(EOF);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode INT_TYPE() { return getToken(ExpCalculatorParser.INT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ExpCalculatorParser.STRING_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ExpCalculatorParser.FLOAT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExpCalculatorParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ExpCalculatorParser.BOOLEAN_TYPE, 0); }
		public TerminalNode VOID_TYPE() { return getToken(ExpCalculatorParser.VOID_TYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitData_type(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << VOID_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NL() { return getToken(ExpCalculatorParser.NL, 0); }
		public TerminalNode EOF() { return getToken(ExpCalculatorParser.EOF, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				expr(0);
				setState(53);
				match(NL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				expr(0);
				setState(56);
				match(EOF);
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

	public static class IntegerContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ExpCalculatorParser.DIGIT, 0); }
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public IntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitInteger(this);
		}
	}

	public final IntegerContext integer() throws RecognitionException {
		IntegerContext _localctx = new IntegerContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_integer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(60);
				unary_op();
				}
			}

			setState(63);
			match(DIGIT);
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

	public static class Unary_opContext extends ParserRuleContext {
		public Unary_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitUnary_op(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultOrDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultOrDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterMultOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitMultOrDiv(this);
		}
	}
	public static class IntLiteralContext extends ExprContext {
		public IntegerContext integer() {
			return getRuleContext(IntegerContext.class,0);
		}
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitIntLiteral(this);
		}
	}
	public static class AddOrSubtractContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddOrSubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterAddOrSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitAddOrSubtract(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitParenExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			switch (_input.LA(1)) {
			case T__2:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(68);
				match(T__2);
				setState(69);
				expr(0);
				setState(70);
				match(T__3);
				}
				break;
			case T__0:
			case T__1:
			case DIGIT:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(72);
				integer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(83);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(81);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(75);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(76);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(77);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(78);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(79);
						_la = _input.LA(1);
						if ( !(_la==T__0 || _la==T__1) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(80);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(85);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3>Y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\5\5+\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\63\n\6\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\5\b=\n\b\3\t\5\t@\n\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13L\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13T\n\13\f\13\16"+
		"\13W\13\13\3\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\5\3\2\21\26\3\2\3\4"+
		"\3\2\7\tU\2\26\3\2\2\2\4\31\3\2\2\2\6!\3\2\2\2\b*\3\2\2\2\n\62\3\2\2\2"+
		"\f\64\3\2\2\2\16<\3\2\2\2\20?\3\2\2\2\22C\3\2\2\2\24K\3\2\2\2\26\27\5"+
		"\4\3\2\27\30\5\6\4\2\30\3\3\2\2\2\31\32\5\f\7\2\32\33\7=\2\2\33\34\7:"+
		"\2\2\34\35\5\b\5\2\35\36\78\2\2\36\37\7\37\2\2\37 \7 \2\2 \5\3\2\2\2!"+
		"\"\7;\2\2\"#\7>\2\2#$\5\b\5\2$\7\3\2\2\2%&\5\f\7\2&\'\7\17\2\2\'(\5\n"+
		"\6\2(+\3\2\2\2)+\7\2\2\3*%\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,-\7\65\2\2-.\5"+
		"\f\7\2./\7\17\2\2/\60\5\n\6\2\60\63\3\2\2\2\61\63\7\2\2\3\62,\3\2\2\2"+
		"\62\61\3\2\2\2\63\13\3\2\2\2\64\65\t\2\2\2\65\r\3\2\2\2\66\67\5\24\13"+
		"\2\678\7\n\2\28=\3\2\2\29:\5\24\13\2:;\7\2\2\3;=\3\2\2\2<\66\3\2\2\2<"+
		"9\3\2\2\2=\17\3\2\2\2>@\5\22\n\2?>\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\f\2"+
		"\2B\21\3\2\2\2CD\t\3\2\2D\23\3\2\2\2EF\b\13\1\2FG\7\5\2\2GH\5\24\13\2"+
		"HI\7\6\2\2IL\3\2\2\2JL\5\20\t\2KE\3\2\2\2KJ\3\2\2\2LU\3\2\2\2MN\f\5\2"+
		"\2NO\t\4\2\2OT\5\24\13\6PQ\f\4\2\2QR\t\3\2\2RT\5\24\13\5SM\3\2\2\2SP\3"+
		"\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V\25\3\2\2\2WU\3\2\2\2\t*\62<?KSU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}