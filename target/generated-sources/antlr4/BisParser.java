// Generated from Bis.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BisParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NL=1, WS=2, EXPONENT=3, DIGIT=4, FLOAT=5, STRING=6, CHAR=7, BOOLEAN=8, 
		VAR_IDENTIFIER=9, ASS_OPERATOR=10, INT_TYPE=11, FLOAT_TYPE=12, STRING_TYPE=13, 
		CHAR_TYPE=14, BOOLEAN_TYPE=15, VOID_TYPE=16, TERMINATOR=17, IF_CONDITIONAL=18, 
		ELSE_IF_CONDITIONAL=19, ELSE_CONDITIONAL=20, THEN_CONDITIONAL=21, FOR_LOOP=22, 
		WHILE_LOOP=23, DO_WHILE_LOOP=24, OPEN_PAR=25, CLOSE_PAR=26, OPEN_BRE=27, 
		CLOSE_BRE=28, OPEN_BRT=29, CLOSE_BRT=30, COMMENT_BLOCK=31, ADD_OPERATOR=32, 
		SUBTRACT_OPERATOR=33, MULTIPLY_OPERATOR=34, DIVIDE_OPERATOR=35, MODULO_OPERATOR=36, 
		LESS_THAN_OPERATOR=37, LESS_THAN_EQUAL_TO_OPERATOR=38, GREATER_THAN_OPERATOR=39, 
		GREATER_THAN_EQUAL_TO_OPERATOR=40, EQUAL_TO_OPERATOR=41, NOT_EQUAL_TO_OPERATOR=42, 
		AND_OPERATOR=43, OR_OPERATOR=44, NOT_OPERATOR=45, ARRAY_DELIM=46, CONSTANT=47, 
		FUNC_IDENTIFIER=48, COMMA=49, INCREMENT_OPERATOR=50, DECREMENT_OPERATOR=51, 
		FUNC_DEFINITION=52, FUNC_CALL=53, PARAMS_KEYWORD=54, MAIN_FUNC=55, RETURN=56;
	public static final String[] tokenNames = {
		"<INVALID>", "NL", "WS", "EXPONENT", "DIGIT", "FLOAT", "STRING", "CHAR", 
		"BOOLEAN", "VAR_IDENTIFIER", "'='", "'numero'", "'lutaw'", "'pisi'", "'letra'", 
		"'tinoodba'", "'wala'", "';'", "'kung'", "'kungdili'", "'kungwalagyud'", 
		"'di'", "'para'", "'habang'", "'buhata'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", "COMMENT_BLOCK", "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", 
		"'<='", "'>'", "'>='", "'=='", "'<>'", "'ug'", "'o'", "'dili'", "'$'", 
		"'hantodhantod'", "FUNC_IDENTIFIER", "','", "'++'", "'--'", "'>>>'", "'tawaga'", 
		"'>>'", "'sugod_diri'", "'ibalik'"
	};
	public static final int
		RULE_start = 0, RULE_func_define = 1, RULE_main_func = 2, RULE_func = 3, 
		RULE_params = 4, RULE_return_state = 5, RULE_func_call_state = 6, RULE_func_call = 7, 
		RULE_call_params = 8, RULE_codeblock = 9, RULE_statement = 10, RULE_vardec_state = 11, 
		RULE_consvardec_state = 12, RULE_vardec = 13, RULE_func_data_type = 14, 
		RULE_data_type = 15, RULE_arr = 16, RULE_ass_state = 17, RULE_assignment = 18, 
		RULE_val = 19, RULE_ass_state_operator = 20, RULE_ass_operator = 21, RULE_unary_op = 22, 
		RULE_num_val = 23, RULE_expr = 24, RULE_cond_state = 25, RULE_cond_block = 26, 
		RULE_cond_val = 27, RULE_condition = 28, RULE_cond_operator = 29, RULE_while_state = 30, 
		RULE_do_while_state = 31, RULE_for_state = 32;
	public static final String[] ruleNames = {
		"start", "func_define", "main_func", "func", "params", "return_state", 
		"func_call_state", "func_call", "call_params", "codeblock", "statement", 
		"vardec_state", "consvardec_state", "vardec", "func_data_type", "data_type", 
		"arr", "ass_state", "assignment", "val", "ass_state_operator", "ass_operator", 
		"unary_op", "num_val", "expr", "cond_state", "cond_block", "cond_val", 
		"condition", "cond_operator", "while_state", "do_while_state", "for_state"
	};

	@Override
	public String getGrammarFileName() { return "Bis.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BisParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Func_defineContext func_define() {
			return getRuleContext(Func_defineContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BisParser.EOF, 0); }
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66); func_define();
			setState(67); main_func();
			setState(68); match(EOF);
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

	public static class Func_defineContext extends ParserRuleContext {
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public Func_defineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_define; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunc_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunc_define(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunc_define(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_defineContext func_define() throws RecognitionException {
		Func_defineContext _localctx = new Func_defineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(70); func();
				}
				}
				setState(75);
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

	public static class Main_funcContext extends ParserRuleContext {
		public Main_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_func; }
	 
		public Main_funcContext() { }
		public void copyFrom(Main_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainFuncContext extends Main_funcContext {
		public TerminalNode MAIN_FUNC() { return getToken(BisParser.MAIN_FUNC, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public TerminalNode FUNC_DEFINITION() { return getToken(BisParser.FUNC_DEFINITION, 0); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public MainFuncContext(Main_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterMainFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitMainFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitMainFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_func);
		try {
			_localctx = new MainFuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(76); match(MAIN_FUNC);
			setState(77); match(FUNC_DEFINITION);
			setState(78); match(OPEN_BRE);
			setState(79); codeblock();
			setState(80); match(CLOSE_BRE);
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
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public TerminalNode PARAMS_KEYWORD() { return getToken(BisParser.PARAMS_KEYWORD, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public TerminalNode FUNC_DEFINITION() { return getToken(BisParser.FUNC_DEFINITION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public Func_data_typeContext func_data_type() {
			return getRuleContext(Func_data_typeContext.class,0);
		}
		public TerminalNode FUNC_IDENTIFIER() { return getToken(BisParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82); func_data_type();
			setState(83); match(FUNC_IDENTIFIER);
			setState(84); match(PARAMS_KEYWORD);
			setState(93);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(85); params();
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(86); match(COMMA);
					setState(87); params();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(95); match(FUNC_DEFINITION);
			setState(96); match(OPEN_BRE);
			setState(97); codeblock();
			setState(99);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(98); return_state();
				}
			}

			setState(101); match(CLOSE_BRE);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103); data_type();
			setState(104); match(VAR_IDENTIFIER);
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

	public static class Return_stateContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BisParser.RETURN, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Return_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterReturn_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitReturn_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitReturn_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_stateContext return_state() throws RecognitionException {
		Return_stateContext _localctx = new Return_stateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_return_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(RETURN);
			setState(107); val();
			setState(108); match(TERMINATOR);
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

	public static class Func_call_stateContext extends ParserRuleContext {
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_call_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunc_call_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunc_call_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunc_call_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_call_stateContext func_call_state() throws RecognitionException {
		Func_call_stateContext _localctx = new Func_call_stateContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_call_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110); func_call();
			setState(111); match(TERMINATOR);
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

	public static class Func_callContext extends ParserRuleContext {
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public TerminalNode FUNC_CALL() { return getToken(BisParser.FUNC_CALL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode FUNC_IDENTIFIER() { return getToken(BisParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunc_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunc_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113); match(FUNC_CALL);
			setState(114); match(FUNC_IDENTIFIER);
			setState(115); match(OPEN_PAR);
			setState(117);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VAR_IDENTIFIER) | (1L << OPEN_PAR) | (1L << ADD_OPERATOR) | (1L << SUBTRACT_OPERATOR) | (1L << NOT_OPERATOR) | (1L << FUNC_CALL))) != 0)) {
				{
				setState(116); call_params();
				}
			}

			setState(119); match(CLOSE_PAR);
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

	public static class Call_paramsContext extends ParserRuleContext {
		public List<Call_paramsContext> call_params() {
			return getRuleContexts(Call_paramsContext.class);
		}
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public Call_paramsContext call_params(int i) {
			return getRuleContext(Call_paramsContext.class,i);
		}
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
		}
		public Call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCall_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCall_params(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCall_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_call_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121); val();
			setState(126);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(122); match(COMMA);
					setState(123); call_params();
					}
					} 
				}
				setState(128);
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
			exitRule();
		}
		return _localctx;
	}

	public static class CodeblockContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public CodeblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeblock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCodeblock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCodeblock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_IDENTIFIER) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_WHILE_LOOP) | (1L << CONSTANT) | (1L << FUNC_CALL))) != 0)) {
				{
				{
				setState(129); statement();
				}
				}
				setState(134);
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

	public static class StatementContext extends ParserRuleContext {
		public Do_while_stateContext do_while_state() {
			return getRuleContext(Do_while_stateContext.class,0);
		}
		public Cond_stateContext cond_state() {
			return getRuleContext(Cond_stateContext.class,0);
		}
		public Func_call_stateContext func_call_state() {
			return getRuleContext(Func_call_stateContext.class,0);
		}
		public Ass_stateContext ass_state() {
			return getRuleContext(Ass_stateContext.class,0);
		}
		public While_stateContext while_state() {
			return getRuleContext(While_stateContext.class,0);
		}
		public For_stateContext for_state() {
			return getRuleContext(For_stateContext.class,0);
		}
		public Consvardec_stateContext consvardec_state() {
			return getRuleContext(Consvardec_stateContext.class,0);
		}
		public Vardec_stateContext vardec_state() {
			return getRuleContext(Vardec_stateContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(143);
			switch (_input.LA(1)) {
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(135); ass_state();
				}
				break;
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(136); vardec_state();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(137); consvardec_state();
				}
				break;
			case IF_CONDITIONAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(138); cond_state();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(139); while_state();
				}
				break;
			case DO_WHILE_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(140); do_while_state();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(141); for_state();
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(142); func_call_state();
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

	public static class Vardec_stateContext extends ParserRuleContext {
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public Vardec_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterVardec_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitVardec_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitVardec_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Vardec_stateContext vardec_state() throws RecognitionException {
		Vardec_stateContext _localctx = new Vardec_stateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_vardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); vardec(0);
			setState(146); match(TERMINATOR);
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

	public static class Consvardec_stateContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public TerminalNode CONSTANT() { return getToken(BisParser.CONSTANT, 0); }
		public Consvardec_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consvardec_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterConsvardec_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitConsvardec_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitConsvardec_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Consvardec_stateContext consvardec_state() throws RecognitionException {
		Consvardec_stateContext _localctx = new Consvardec_stateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_consvardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(CONSTANT);
			setState(149); data_type();
			setState(150); match(VAR_IDENTIFIER);
			setState(151); assignment();
			setState(152); match(TERMINATOR);
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

	public static class VardecContext extends ParserRuleContext {
		public VardecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec; }
	 
		public VardecContext() { }
		public void copyFrom(VardecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleVarContext extends VardecContext {
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(BisParser.COMMA, 0); }
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public MultipleVarContext(VardecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterMultipleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitMultipleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitMultipleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleVarContext extends VardecContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public SingleVarContext(VardecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterSingleVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitSingleVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitSingleVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayVarContext extends VardecContext {
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public ArrayVarContext(VardecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterArrayVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitArrayVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitArrayVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardecContext vardec() throws RecognitionException {
		return vardec(0);
	}

	private VardecContext vardec(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VardecContext _localctx = new VardecContext(_ctx, _parentState);
		VardecContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_vardec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SingleVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155); data_type();
				setState(156); match(VAR_IDENTIFIER);
				setState(158);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(157); assignment();
					}
					break;
				}
				}
				break;
			case 2:
				{
				_localctx = new ArrayVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160); data_type();
				setState(161); arr();
				setState(162); match(VAR_IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleVarContext(new VardecContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_vardec);
					setState(166);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(167); match(COMMA);
					setState(168); vardec(4);
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class Func_data_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VOID_TYPE() { return getToken(BisParser.VOID_TYPE, 0); }
		public Func_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunc_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunc_data_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunc_data_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_data_typeContext func_data_type() throws RecognitionException {
		Func_data_typeContext _localctx = new Func_data_typeContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_func_data_type);
		try {
			setState(176);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(174); data_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); match(VOID_TYPE);
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
		public TerminalNode INT_TYPE() { return getToken(BisParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(BisParser.FLOAT_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(BisParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(BisParser.BOOLEAN_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(BisParser.STRING_TYPE, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterData_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitData_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ArrContext extends ParserRuleContext {
		public List<TerminalNode> ARRAY_DELIM() { return getTokens(BisParser.ARRAY_DELIM); }
		public TerminalNode DIGIT() { return getToken(BisParser.DIGIT, 0); }
		public TerminalNode ARRAY_DELIM(int i) {
			return getToken(BisParser.ARRAY_DELIM, i);
		}
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitArr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitArr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180); match(ARRAY_DELIM);
			setState(181); match(DIGIT);
			setState(182); match(ARRAY_DELIM);
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

	public static class Ass_stateContext extends ParserRuleContext {
		public Ass_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_state; }
	 
		public Ass_stateContext() { }
		public void copyFrom(Ass_stateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NormalAssignContext extends Ass_stateContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public NormalAssignContext(Ass_stateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterNormalAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitNormalAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitNormalAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperatorAssignContext extends Ass_stateContext {
		public Ass_state_operatorContext ass_state_operator() {
			return getRuleContext(Ass_state_operatorContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public OperatorAssignContext(Ass_stateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterOperatorAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitOperatorAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitOperatorAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ass_stateContext ass_state() throws RecognitionException {
		Ass_stateContext _localctx = new Ass_stateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ass_state);
		int _la;
		try {
			setState(194);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NormalAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(184); match(VAR_IDENTIFIER);
				setState(186);
				_la = _input.LA(1);
				if (_la==ARRAY_DELIM) {
					{
					setState(185); arr();
					}
				}

				setState(188); assignment();
				setState(189); match(TERMINATOR);
				}
				break;
			case 2:
				_localctx = new OperatorAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191); ass_state_operator();
				setState(192); match(TERMINATOR);
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

	public static class AssignmentContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode ASS_OPERATOR() { return getToken(BisParser.ASS_OPERATOR, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196); match(ASS_OPERATOR);
			setState(197); val();
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

	public static class ValContext extends ParserRuleContext {
		public Cond_valContext cond_val() {
			return getRuleContext(Cond_valContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_val);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199); cond_val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200); condition(0);
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

	public static class Ass_state_operatorContext extends ParserRuleContext {
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public Ass_operatorContext ass_operator() {
			return getRuleContext(Ass_operatorContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public Ass_state_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_state_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAss_state_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAss_state_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAss_state_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ass_state_operatorContext ass_state_operator() throws RecognitionException {
		Ass_state_operatorContext _localctx = new Ass_state_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ass_state_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203); match(VAR_IDENTIFIER);
			setState(205);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(204); arr();
				}
			}

			setState(207); ass_operator();
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

	public static class Ass_operatorContext extends ParserRuleContext {
		public TerminalNode INCREMENT_OPERATOR() { return getToken(BisParser.INCREMENT_OPERATOR, 0); }
		public TerminalNode DECREMENT_OPERATOR() { return getToken(BisParser.DECREMENT_OPERATOR, 0); }
		public Ass_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAss_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAss_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAss_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ass_operatorContext ass_operator() throws RecognitionException {
		Ass_operatorContext _localctx = new Ass_operatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ass_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT_OPERATOR || _la==DECREMENT_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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
			if ( listener instanceof BisListener ) ((BisListener)listener).enterUnary_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitUnary_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitUnary_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_opContext unary_op() throws RecognitionException {
		Unary_opContext _localctx = new Unary_opContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_la = _input.LA(1);
			if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class Num_valContext extends ParserRuleContext {
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
	 
		public Num_valContext() { }
		public void copyFrom(Num_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ArrayIdentifierContext extends Num_valContext {
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public ArrayIdentifierContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterArrayIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitArrayIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitArrayIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarIdentifierContext extends Num_valContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public VarIdentifierContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterVarIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitVarIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitVarIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends Num_valContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public FunctionCallContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends Num_valContext {
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public TerminalNode DIGIT() { return getToken(BisParser.DIGIT, 0); }
		public IntegerLiteralContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends Num_valContext {
		public TerminalNode EXPONENT() { return getToken(BisParser.EXPONENT, 0); }
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public TerminalNode FLOAT() { return getToken(BisParser.FLOAT, 0); }
		public FloatLiteralContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CharLiteralContext extends Num_valContext {
		public TerminalNode CHAR() { return getToken(BisParser.CHAR, 0); }
		public CharLiteralContext(Num_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCharLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCharLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCharLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num_val);
		int _la;
		try {
			setState(229);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(213); unary_op();
					}
				}

				setState(216); match(DIGIT);
				}
				break;
			case 2:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(217); unary_op();
					}
				}

				setState(220); match(FLOAT);
				setState(222);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(221); match(EXPONENT);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224); match(CHAR);
				}
				break;
			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(225); func_call();
				}
				break;
			case 5:
				_localctx = new ArrayIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(226); match(VAR_IDENTIFIER);
				setState(227); arr();
				}
				break;
			case 6:
				_localctx = new VarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(228); match(VAR_IDENTIFIER);
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
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(BisParser.MULTIPLY_OPERATOR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DIVIDE_OPERATOR() { return getToken(BisParser.DIVIDE_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(BisParser.MODULO_OPERATOR, 0); }
		public MultOrDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterMultOrDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitMultOrDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitMultOrDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddOrSubtractContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUBTRACT_OPERATOR() { return getToken(BisParser.SUBTRACT_OPERATOR, 0); }
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public AddOrSubtractContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAddOrSubtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAddOrSubtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAddOrSubtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberValueContext extends ExprContext {
		public Num_valContext num_val() {
			return getRuleContext(Num_valContext.class,0);
		}
		public NumberValueContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterNumberValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitNumberValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitNumberValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public ParenExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(232); match(OPEN_PAR);
				setState(233); expr(0);
				setState(234); match(CLOSE_PAR);
				}
				break;
			case DIGIT:
			case FLOAT:
			case CHAR:
			case VAR_IDENTIFIER:
			case ADD_OPERATOR:
			case SUBTRACT_OPERATOR:
			case FUNC_CALL:
				{
				_localctx = new NumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236); num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(247);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(245);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(240);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY_OPERATOR) | (1L << DIVIDE_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(241); expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(243);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(244); expr(3);
						}
						break;
					}
					} 
				}
				setState(249);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class Cond_stateContext extends ParserRuleContext {
		public List<Cond_blockContext> cond_block() {
			return getRuleContexts(Cond_blockContext.class);
		}
		public Cond_blockContext cond_block(int i) {
			return getRuleContext(Cond_blockContext.class,i);
		}
		public TerminalNode ELSE_CONDITIONAL() { return getToken(BisParser.ELSE_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public TerminalNode ELSE_IF_CONDITIONAL(int i) {
			return getToken(BisParser.ELSE_IF_CONDITIONAL, i);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode IF_CONDITIONAL() { return getToken(BisParser.IF_CONDITIONAL, 0); }
		public List<TerminalNode> ELSE_IF_CONDITIONAL() { return getTokens(BisParser.ELSE_IF_CONDITIONAL); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Cond_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCond_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCond_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCond_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stateContext cond_state() throws RecognitionException {
		Cond_stateContext _localctx = new Cond_stateContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cond_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250); match(IF_CONDITIONAL);
			setState(251); cond_block();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_CONDITIONAL) {
				{
				{
				setState(252); match(ELSE_IF_CONDITIONAL);
				setState(253); cond_block();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_la = _input.LA(1);
			if (_la==ELSE_CONDITIONAL) {
				{
				setState(259); match(ELSE_CONDITIONAL);
				setState(260); match(OPEN_BRE);
				setState(261); codeblock();
				setState(262); match(CLOSE_BRE);
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

	public static class Cond_blockContext extends ParserRuleContext {
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode ELSE_IF_CONDITIONAL() { return getToken(BisParser.ELSE_IF_CONDITIONAL, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN_CONDITIONAL() { return getToken(BisParser.THEN_CONDITIONAL, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public Cond_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCond_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCond_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCond_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_blockContext cond_block() throws RecognitionException {
		Cond_blockContext _localctx = new Cond_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cond_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266); match(ELSE_IF_CONDITIONAL);
			setState(267); match(OPEN_PAR);
			setState(268); condition(0);
			setState(269); match(CLOSE_PAR);
			setState(270); match(THEN_CONDITIONAL);
			setState(271); match(OPEN_BRE);
			setState(272); codeblock();
			setState(273); match(CLOSE_BRE);
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

	public static class Cond_valContext extends ParserRuleContext {
		public Cond_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_val; }
	 
		public Cond_valContext() { }
		public void copyFrom(Cond_valContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends Cond_valContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressionContext(Cond_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConcatStringContext extends Cond_valContext {
		public TerminalNode STRING(int i) {
			return getToken(BisParser.STRING, i);
		}
		public List<TerminalNode> STRING() { return getTokens(BisParser.STRING); }
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public StringConcatStringContext(Cond_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStringConcatString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStringConcatString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStringConcatString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends Cond_valContext {
		public TerminalNode STRING() { return getToken(BisParser.STRING, 0); }
		public StringLiteralContext(Cond_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConcatExprContext extends Cond_valContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BisParser.STRING, 0); }
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public StringConcatExprContext(Cond_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStringConcatExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStringConcatExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStringConcatExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends Cond_valContext {
		public TerminalNode BOOLEAN() { return getToken(BisParser.BOOLEAN, 0); }
		public BooleanLiteralContext(Cond_valContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_valContext cond_val() throws RecognitionException {
		Cond_valContext _localctx = new Cond_valContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond_val);
		try {
			setState(284);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(275); expr(0);
				}
				break;
			case 2:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276); match(STRING);
				}
				break;
			case 3:
				_localctx = new StringConcatStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(277); match(STRING);
				setState(278); match(ADD_OPERATOR);
				setState(279); match(STRING);
				}
				break;
			case 4:
				_localctx = new StringConcatExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(280); match(STRING);
				setState(281); match(ADD_OPERATOR);
				setState(282); expr(0);
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(283); match(BOOLEAN);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrConditionContext extends ConditionContext {
		public TerminalNode OR_OPERATOR() { return getToken(BisParser.OR_OPERATOR, 0); }
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public OrConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndConditionContext extends ConditionContext {
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND_OPERATOR() { return getToken(BisParser.AND_OPERATOR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConditionOperatorContext extends ConditionContext {
		public Cond_valContext cond_val(int i) {
			return getRuleContext(Cond_valContext.class,i);
		}
		public Cond_operatorContext cond_operator() {
			return getRuleContext(Cond_operatorContext.class,0);
		}
		public List<Cond_valContext> cond_val() {
			return getRuleContexts(Cond_valContext.class);
		}
		public ConditionOperatorContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterConditionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitConditionOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitConditionOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenConditionContext extends ConditionContext {
		public TerminalNode NOT_OPERATOR() { return getToken(BisParser.NOT_OPERATOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ParenConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterParenCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitParenCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitParenCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParenConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(288);
				_la = _input.LA(1);
				if (_la==NOT_OPERATOR) {
					{
					setState(287); match(NOT_OPERATOR);
					}
				}

				setState(290); match(OPEN_PAR);
				setState(291); condition(0);
				setState(292); match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new ConditionOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294); cond_val();
				setState(295); cond_operator();
				setState(296); cond_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(308);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(306);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(300);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(301); match(AND_OPERATOR);
						setState(302); condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(303);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(304); match(OR_OPERATOR);
						setState(305); condition(3);
						}
						break;
					}
					} 
				}
				setState(310);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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

	public static class Cond_operatorContext extends ParserRuleContext {
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(BisParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(BisParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(BisParser.NOT_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(BisParser.EQUAL_TO_OPERATOR, 0); }
		public Cond_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCond_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCond_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCond_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_operatorContext cond_operator() throws RecognitionException {
		Cond_operatorContext _localctx = new Cond_operatorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_cond_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << NOT_EQUAL_TO_OPERATOR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class While_stateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(BisParser.WHILE_LOOP, 0); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public While_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterWhile_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitWhile_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitWhile_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_stateContext while_state() throws RecognitionException {
		While_stateContext _localctx = new While_stateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313); match(WHILE_LOOP);
			setState(314); match(OPEN_PAR);
			setState(315); condition(0);
			setState(316); match(CLOSE_PAR);
			setState(317); match(OPEN_BRE);
			setState(318); codeblock();
			setState(319); match(CLOSE_BRE);
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

	public static class Do_while_stateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(BisParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode DO_WHILE_LOOP() { return getToken(BisParser.DO_WHILE_LOOP, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Do_while_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterDo_while_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitDo_while_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitDo_while_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_while_stateContext do_while_state() throws RecognitionException {
		Do_while_stateContext _localctx = new Do_while_stateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_do_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321); match(DO_WHILE_LOOP);
			setState(322); match(OPEN_BRE);
			setState(323); codeblock();
			setState(324); match(CLOSE_BRE);
			setState(325); match(WHILE_LOOP);
			setState(326); match(OPEN_PAR);
			setState(327); condition(0);
			setState(328); match(CLOSE_PAR);
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

	public static class For_stateContext extends ParserRuleContext {
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public Ass_stateContext ass_state() {
			return getRuleContext(Ass_stateContext.class,0);
		}
		public TerminalNode FOR_LOOP() { return getToken(BisParser.FOR_LOOP, 0); }
		public Ass_state_operatorContext ass_state_operator() {
			return getRuleContext(Ass_state_operatorContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public For_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterFor_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitFor_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitFor_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_stateContext for_state() throws RecognitionException {
		For_stateContext _localctx = new For_stateContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_for_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330); match(FOR_LOOP);
			setState(331); match(OPEN_PAR);
			setState(332); ass_state();
			setState(333); condition(0);
			setState(334); match(TERMINATOR);
			setState(335); ass_state_operator();
			setState(336); match(CLOSE_PAR);
			setState(337); match(OPEN_BRE);
			setState(338); codeblock();
			setState(339); match(CLOSE_BRE);
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
		case 13: return vardec_sempred((VardecContext)_localctx, predIndex);
		case 24: return expr_sempred((ExprContext)_localctx, predIndex);
		case 28: return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3: return precpred(_ctx, 3);
		case 4: return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean vardec_sempred(VardecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		case 2: return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\7\3J\n\3\f\3\16\3M\13\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\5\5`\n\5\3"+
		"\5\3\5\3\5\3\5\5\5f\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\5\tx\n\t\3\t\3\t\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082"+
		"\13\n\3\13\7\13\u0085\n\13\f\13\16\13\u0088\13\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u0092\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\17\3\17\5\17\u00a7\n\17"+
		"\3\17\3\17\3\17\7\17\u00ac\n\17\f\17\16\17\u00af\13\17\3\20\3\20\5\20"+
		"\u00b3\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00bd\n\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\5\23\u00c5\n\23\3\24\3\24\3\24\3\25\3\25"+
		"\5\25\u00cc\n\25\3\26\3\26\5\26\u00d0\n\26\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\31\5\31\u00d9\n\31\3\31\3\31\5\31\u00dd\n\31\3\31\3\31\5\31\u00e1"+
		"\n\31\3\31\3\31\3\31\3\31\3\31\5\31\u00e8\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u00f0\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00f8\n\32\f"+
		"\32\16\32\u00fb\13\32\3\33\3\33\3\33\3\33\7\33\u0101\n\33\f\33\16\33\u0104"+
		"\13\33\3\33\3\33\3\33\3\33\3\33\5\33\u010b\n\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5"+
		"\35\u011f\n\35\3\36\3\36\5\36\u0123\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u012d\n\36\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u0135\n"+
		"\36\f\36\16\36\u0138\13\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\2\5"+
		"\34\62:#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668"+
		":<>@B\2\7\3\2\r\21\3\2\64\65\3\2\"#\3\2$&\3\2\',\u0161\2D\3\2\2\2\4K\3"+
		"\2\2\2\6N\3\2\2\2\bT\3\2\2\2\ni\3\2\2\2\fl\3\2\2\2\16p\3\2\2\2\20s\3\2"+
		"\2\2\22{\3\2\2\2\24\u0086\3\2\2\2\26\u0091\3\2\2\2\30\u0093\3\2\2\2\32"+
		"\u0096\3\2\2\2\34\u00a6\3\2\2\2\36\u00b2\3\2\2\2 \u00b4\3\2\2\2\"\u00b6"+
		"\3\2\2\2$\u00c4\3\2\2\2&\u00c6\3\2\2\2(\u00cb\3\2\2\2*\u00cd\3\2\2\2,"+
		"\u00d3\3\2\2\2.\u00d5\3\2\2\2\60\u00e7\3\2\2\2\62\u00ef\3\2\2\2\64\u00fc"+
		"\3\2\2\2\66\u010c\3\2\2\28\u011e\3\2\2\2:\u012c\3\2\2\2<\u0139\3\2\2\2"+
		">\u013b\3\2\2\2@\u0143\3\2\2\2B\u014c\3\2\2\2DE\5\4\3\2EF\5\6\4\2FG\7"+
		"\2\2\3G\3\3\2\2\2HJ\5\b\5\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5"+
		"\3\2\2\2MK\3\2\2\2NO\79\2\2OP\7\66\2\2PQ\7\35\2\2QR\5\24\13\2RS\7\36\2"+
		"\2S\7\3\2\2\2TU\5\36\20\2UV\7\62\2\2V_\78\2\2W\\\5\n\6\2XY\7\63\2\2Y["+
		"\5\n\6\2ZX\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]`\3\2\2\2^\\\3\2\2"+
		"\2_W\3\2\2\2_`\3\2\2\2`a\3\2\2\2ab\7\66\2\2bc\7\35\2\2ce\5\24\13\2df\5"+
		"\f\7\2ed\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7\36\2\2h\t\3\2\2\2ij\5 \21\2j"+
		"k\7\13\2\2k\13\3\2\2\2lm\7:\2\2mn\5(\25\2no\7\23\2\2o\r\3\2\2\2pq\5\20"+
		"\t\2qr\7\23\2\2r\17\3\2\2\2st\7\67\2\2tu\7\62\2\2uw\7\33\2\2vx\5\22\n"+
		"\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\34\2\2z\21\3\2\2\2{\u0080\5(\25\2"+
		"|}\7\63\2\2}\177\5\22\n\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\23\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0085\5\26\f"+
		"\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087"+
		"\3\2\2\2\u0087\25\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u0092\5$\23\2\u008a"+
		"\u0092\5\30\r\2\u008b\u0092\5\32\16\2\u008c\u0092\5\64\33\2\u008d\u0092"+
		"\5> \2\u008e\u0092\5@!\2\u008f\u0092\5B\"\2\u0090\u0092\5\16\b\2\u0091"+
		"\u0089\3\2\2\2\u0091\u008a\3\2\2\2\u0091\u008b\3\2\2\2\u0091\u008c\3\2"+
		"\2\2\u0091\u008d\3\2\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\27\3\2\2\2\u0093\u0094\5\34\17\2\u0094\u0095\7\23"+
		"\2\2\u0095\31\3\2\2\2\u0096\u0097\7\61\2\2\u0097\u0098\5 \21\2\u0098\u0099"+
		"\7\13\2\2\u0099\u009a\5&\24\2\u009a\u009b\7\23\2\2\u009b\33\3\2\2\2\u009c"+
		"\u009d\b\17\1\2\u009d\u009e\5 \21\2\u009e\u00a0\7\13\2\2\u009f\u00a1\5"+
		"&\24\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a7\3\2\2\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\u00a4\5\"\22\2\u00a4\u00a5\7\13\2\2\u00a5\u00a7\3"+
		"\2\2\2\u00a6\u009c\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00ad\3\2\2\2\u00a8"+
		"\u00a9\f\5\2\2\u00a9\u00aa\7\63\2\2\u00aa\u00ac\5\34\17\6\u00ab\u00a8"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\35\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b3\5 \21\2\u00b1\u00b3\7\22\2"+
		"\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\37\3\2\2\2\u00b4\u00b5"+
		"\t\2\2\2\u00b5!\3\2\2\2\u00b6\u00b7\7\60\2\2\u00b7\u00b8\7\6\2\2\u00b8"+
		"\u00b9\7\60\2\2\u00b9#\3\2\2\2\u00ba\u00bc\7\13\2\2\u00bb\u00bd\5\"\22"+
		"\2\u00bc\u00bb\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf"+
		"\5&\24\2\u00bf\u00c0\7\23\2\2\u00c0\u00c5\3\2\2\2\u00c1\u00c2\5*\26\2"+
		"\u00c2\u00c3\7\23\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00ba\3\2\2\2\u00c4\u00c1"+
		"\3\2\2\2\u00c5%\3\2\2\2\u00c6\u00c7\7\f\2\2\u00c7\u00c8\5(\25\2\u00c8"+
		"\'\3\2\2\2\u00c9\u00cc\58\35\2\u00ca\u00cc\5:\36\2\u00cb\u00c9\3\2\2\2"+
		"\u00cb\u00ca\3\2\2\2\u00cc)\3\2\2\2\u00cd\u00cf\7\13\2\2\u00ce\u00d0\5"+
		"\"\22\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\5,\27\2\u00d2+\3\2\2\2\u00d3\u00d4\t\3\2\2\u00d4-\3\2\2\2\u00d5"+
		"\u00d6\t\4\2\2\u00d6/\3\2\2\2\u00d7\u00d9\5.\30\2\u00d8\u00d7\3\2\2\2"+
		"\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e8\7\6\2\2\u00db\u00dd"+
		"\5.\30\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00e0\7\7\2\2\u00df\u00e1\7\5\2\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00e8\3\2\2\2\u00e2\u00e8\7\t\2\2\u00e3\u00e8\5\20\t\2\u00e4"+
		"\u00e5\7\13\2\2\u00e5\u00e8\5\"\22\2\u00e6\u00e8\7\13\2\2\u00e7\u00d8"+
		"\3\2\2\2\u00e7\u00dc\3\2\2\2\u00e7\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e7"+
		"\u00e4\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\b\32\1"+
		"\2\u00ea\u00eb\7\33\2\2\u00eb\u00ec\5\62\32\2\u00ec\u00ed\7\34\2\2\u00ed"+
		"\u00f0\3\2\2\2\u00ee\u00f0\5\60\31\2\u00ef\u00e9\3\2\2\2\u00ef\u00ee\3"+
		"\2\2\2\u00f0\u00f9\3\2\2\2\u00f1\u00f2\f\5\2\2\u00f2\u00f3\t\5\2\2\u00f3"+
		"\u00f8\5\62\32\6\u00f4\u00f5\f\4\2\2\u00f5\u00f6\t\4\2\2\u00f6\u00f8\5"+
		"\62\32\5\u00f7\u00f1\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\63\3\2\2\2\u00fb\u00f9\3\2\2"+
		"\2\u00fc\u00fd\7\24\2\2\u00fd\u0102\5\66\34\2\u00fe\u00ff\7\25\2\2\u00ff"+
		"\u0101\5\66\34\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3"+
		"\2\2\2\u0102\u0103\3\2\2\2\u0103\u010a\3\2\2\2\u0104\u0102\3\2\2\2\u0105"+
		"\u0106\7\26\2\2\u0106\u0107\7\35\2\2\u0107\u0108\5\24\13\2\u0108\u0109"+
		"\7\36\2\2\u0109\u010b\3\2\2\2\u010a\u0105\3\2\2\2\u010a\u010b\3\2\2\2"+
		"\u010b\65\3\2\2\2\u010c\u010d\7\25\2\2\u010d\u010e\7\33\2\2\u010e\u010f"+
		"\5:\36\2\u010f\u0110\7\34\2\2\u0110\u0111\7\27\2\2\u0111\u0112\7\35\2"+
		"\2\u0112\u0113\5\24\13\2\u0113\u0114\7\36\2\2\u0114\67\3\2\2\2\u0115\u011f"+
		"\5\62\32\2\u0116\u011f\7\b\2\2\u0117\u0118\7\b\2\2\u0118\u0119\7\"\2\2"+
		"\u0119\u011f\7\b\2\2\u011a\u011b\7\b\2\2\u011b\u011c\7\"\2\2\u011c\u011f"+
		"\5\62\32\2\u011d\u011f\7\n\2\2\u011e\u0115\3\2\2\2\u011e\u0116\3\2\2\2"+
		"\u011e\u0117\3\2\2\2\u011e\u011a\3\2\2\2\u011e\u011d\3\2\2\2\u011f9\3"+
		"\2\2\2\u0120\u0122\b\36\1\2\u0121\u0123\7/\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7\33\2\2\u0125\u0126\5"+
		":\36\2\u0126\u0127\7\34\2\2\u0127\u012d\3\2\2\2\u0128\u0129\58\35\2\u0129"+
		"\u012a\5<\37\2\u012a\u012b\58\35\2\u012b\u012d\3\2\2\2\u012c\u0120\3\2"+
		"\2\2\u012c\u0128\3\2\2\2\u012d\u0136\3\2\2\2\u012e\u012f\f\5\2\2\u012f"+
		"\u0130\7-\2\2\u0130\u0135\5:\36\6\u0131\u0132\f\4\2\2\u0132\u0133\7.\2"+
		"\2\u0133\u0135\5:\36\5\u0134\u012e\3\2\2\2\u0134\u0131\3\2\2\2\u0135\u0138"+
		"\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137;\3\2\2\2\u0138"+
		"\u0136\3\2\2\2\u0139\u013a\t\6\2\2\u013a=\3\2\2\2\u013b\u013c\7\31\2\2"+
		"\u013c\u013d\7\33\2\2\u013d\u013e\5:\36\2\u013e\u013f\7\34\2\2\u013f\u0140"+
		"\7\35\2\2\u0140\u0141\5\24\13\2\u0141\u0142\7\36\2\2\u0142?\3\2\2\2\u0143"+
		"\u0144\7\32\2\2\u0144\u0145\7\35\2\2\u0145\u0146\5\24\13\2\u0146\u0147"+
		"\7\36\2\2\u0147\u0148\7\31\2\2\u0148\u0149\7\33\2\2\u0149\u014a\5:\36"+
		"\2\u014a\u014b\7\34\2\2\u014bA\3\2\2\2\u014c\u014d\7\30\2\2\u014d\u014e"+
		"\7\33\2\2\u014e\u014f\5$\23\2\u014f\u0150\5:\36\2\u0150\u0151\7\23\2\2"+
		"\u0151\u0152\5*\26\2\u0152\u0153\7\34\2\2\u0153\u0154\7\35\2\2\u0154\u0155"+
		"\5\24\13\2\u0155\u0156\7\36\2\2\u0156C\3\2\2\2 K\\_ew\u0080\u0086\u0091"+
		"\u00a0\u00a6\u00ad\u00b2\u00bc\u00c4\u00cb\u00cf\u00d8\u00dc\u00e0\u00e7"+
		"\u00ef\u00f7\u00f9\u0102\u010a\u011e\u0122\u012c\u0134\u0136";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}