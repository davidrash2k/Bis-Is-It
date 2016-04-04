// Generated from Bis.g4 by ANTLR 4.5.2
package bis.is.it;
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
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

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
	public static final int
		RULE_start = 0, RULE_func_define = 1, RULE_main_func = 2, RULE_func = 3, 
		RULE_params = 4, RULE_return_state = 5, RULE_func_call_state = 6, RULE_func_call = 7, 
		RULE_call_params = 8, RULE_codeblock = 9, RULE_statement = 10, RULE_vardec_state = 11, 
		RULE_consvardec_state = 12, RULE_var = 13, RULE_func_data_type = 14, RULE_data_type = 15, 
		RULE_arr = 16, RULE_ass_state = 17, RULE_assignment = 18, RULE_val = 19, 
		RULE_ass_state_operator = 20, RULE_ass_operator = 21, RULE_unary_op = 22, 
		RULE_num_val = 23, RULE_expr = 24, RULE_cond_state = 25, RULE_else_if_block = 26, 
		RULE_else_block = 27, RULE_cond_val = 28, RULE_condition = 29, RULE_cond_operator = 30, 
		RULE_while_state = 31, RULE_do_while_state = 32, RULE_for_state = 33;
	public static final String[] ruleNames = {
		"start", "func_define", "main_func", "func", "params", "return_state", 
		"func_call_state", "func_call", "call_params", "codeblock", "statement", 
		"vardec_state", "consvardec_state", "var", "func_data_type", "data_type", 
		"arr", "ass_state", "assignment", "val", "ass_state_operator", "ass_operator", 
		"unary_op", "num_val", "expr", "cond_state", "else_if_block", "else_block", 
		"cond_val", "condition", "cond_operator", "while_state", "do_while_state", 
		"for_state"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'='", "'numero'", 
		"'lutaw'", "'pisi'", "'letra'", "'tinoodba'", "'wala'", "';'", "'kung'", 
		"'kungdili'", "'kungwalagyud'", "'di'", "'para'", "'habang'", "'buhata'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'<>'", "'ug'", "'o'", "'dili'", 
		"'$'", "'hantodhantod'", null, "','", "'++'", "'--'", "'>>>'", "'tawaga'", 
		"'>>'", "'sugod_diri'", "'ibalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NL", "WS", "EXPONENT", "DIGIT", "FLOAT", "STRING", "CHAR", "BOOLEAN", 
		"VAR_IDENTIFIER", "ASS_OPERATOR", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", 
		"CHAR_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "TERMINATOR", "IF_CONDITIONAL", 
		"ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", "THEN_CONDITIONAL", "FOR_LOOP", 
		"WHILE_LOOP", "DO_WHILE_LOOP", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRE", "CLOSE_BRE", 
		"OPEN_BRT", "CLOSE_BRT", "COMMENT_BLOCK", "ADD_OPERATOR", "SUBTRACT_OPERATOR", 
		"MULTIPLY_OPERATOR", "DIVIDE_OPERATOR", "MODULO_OPERATOR", "LESS_THAN_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "GREATER_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", 
		"EQUAL_TO_OPERATOR", "NOT_EQUAL_TO_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", 
		"NOT_OPERATOR", "ARRAY_DELIM", "CONSTANT", "FUNC_IDENTIFIER", "COMMA", 
		"INCREMENT_OPERATOR", "DECREMENT_OPERATOR", "FUNC_DEFINITION", "FUNC_CALL", 
		"PARAMS_KEYWORD", "MAIN_FUNC", "RETURN"
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
	public String getGrammarFileName() { return "Bis.g4"; }

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
		public Main_funcContext main_func() {
			return getRuleContext(Main_funcContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BisParser.EOF, 0); }
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
			setState(68);
			func_define();
			setState(69);
			main_func();
			setState(70);
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
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(72);
				func();
				}
				}
				setState(77);
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
	public static class Main_FuncContext extends Main_funcContext {
		public TerminalNode MAIN_FUNC() { return getToken(BisParser.MAIN_FUNC, 0); }
		public TerminalNode FUNC_DEFINITION() { return getToken(BisParser.FUNC_DEFINITION, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public Main_FuncContext(Main_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterMain_Func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitMain_Func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitMain_Func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_funcContext main_func() throws RecognitionException {
		Main_funcContext _localctx = new Main_funcContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main_func);
		try {
			_localctx = new Main_FuncContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(MAIN_FUNC);
			setState(79);
			match(FUNC_DEFINITION);
			setState(80);
			match(OPEN_BRE);
			setState(81);
			codeblock();
			setState(82);
			match(CLOSE_BRE);
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
		public Func_data_typeContext func_data_type() {
			return getRuleContext(Func_data_typeContext.class,0);
		}
		public TerminalNode FUNC_IDENTIFIER() { return getToken(BisParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode PARAMS_KEYWORD() { return getToken(BisParser.PARAMS_KEYWORD, 0); }
		public TerminalNode FUNC_DEFINITION() { return getToken(BisParser.FUNC_DEFINITION, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
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
			setState(84);
			func_data_type();
			setState(85);
			match(FUNC_IDENTIFIER);
			setState(86);
			match(PARAMS_KEYWORD);
			setState(88);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(87);
				params();
				}
			}

			setState(90);
			match(FUNC_DEFINITION);
			setState(91);
			match(OPEN_BRE);
			setState(92);
			codeblock();
			setState(94);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(93);
				return_state();
				}
			}

			setState(96);
			match(CLOSE_BRE);
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
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
		}
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			data_type();
			setState(99);
			match(VAR_IDENTIFIER);
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(100);
					match(COMMA);
					setState(101);
					params();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class Return_stateContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(BisParser.RETURN, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
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
			setState(107);
			match(RETURN);
			setState(108);
			val();
			setState(109);
			match(TERMINATOR);
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
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
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
			setState(111);
			func_call();
			setState(112);
			match(TERMINATOR);
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
		public TerminalNode FUNC_CALL() { return getToken(BisParser.FUNC_CALL, 0); }
		public TerminalNode FUNC_IDENTIFIER() { return getToken(BisParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
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
			setState(114);
			match(FUNC_CALL);
			setState(115);
			match(FUNC_IDENTIFIER);
			setState(116);
			match(OPEN_PAR);
			setState(118);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VAR_IDENTIFIER) | (1L << OPEN_PAR) | (1L << ADD_OPERATOR) | (1L << SUBTRACT_OPERATOR) | (1L << NOT_OPERATOR) | (1L << FUNC_CALL))) != 0)) {
				{
				setState(117);
				call_params();
				}
			}

			setState(120);
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

	public static class Call_paramsContext extends ParserRuleContext {
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
		}
		public List<Call_paramsContext> call_params() {
			return getRuleContexts(Call_paramsContext.class);
		}
		public Call_paramsContext call_params(int i) {
			return getRuleContext(Call_paramsContext.class,i);
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
			setState(122);
			val();
			setState(127);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(123);
					match(COMMA);
					setState(124);
					call_params();
					}
					} 
				}
				setState(129);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(130);
					statement();
					}
					} 
				}
				setState(135);
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
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public Ass_stateContext ass_state() {
			return getRuleContext(Ass_stateContext.class,0);
		}
		public Vardec_stateContext vardec_state() {
			return getRuleContext(Vardec_stateContext.class,0);
		}
		public Consvardec_stateContext consvardec_state() {
			return getRuleContext(Consvardec_stateContext.class,0);
		}
		public Cond_stateContext cond_state() {
			return getRuleContext(Cond_stateContext.class,0);
		}
		public While_stateContext while_state() {
			return getRuleContext(While_stateContext.class,0);
		}
		public Do_while_stateContext do_while_state() {
			return getRuleContext(Do_while_stateContext.class,0);
		}
		public For_stateContext for_state() {
			return getRuleContext(For_stateContext.class,0);
		}
		public Func_call_stateContext func_call_state() {
			return getRuleContext(Func_call_stateContext.class,0);
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
			setState(144);
			switch (_input.LA(1)) {
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				ass_state();
				}
				break;
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				vardec_state();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				consvardec_state();
				}
				break;
			case IF_CONDITIONAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(139);
				cond_state();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				while_state();
				}
				break;
			case DO_WHILE_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(141);
				do_while_state();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(142);
				for_state();
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				func_call_state();
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			data_type();
			setState(148);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(147);
				arr();
				}
			}

			setState(150);
			var(0);
			setState(151);
			match(TERMINATOR);
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
		public TerminalNode CONSTANT() { return getToken(BisParser.CONSTANT, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
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
			setState(153);
			match(CONSTANT);
			setState(154);
			data_type();
			setState(155);
			match(VAR_IDENTIFIER);
			setState(156);
			assignment();
			setState(157);
			match(TERMINATOR);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(BisParser.COMMA, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		return var(0);
	}

	private VarContext var(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarContext _localctx = new VarContext(_ctx, _parentState);
		VarContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			match(VAR_IDENTIFIER);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(161);
				assignment();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(164);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(165);
					match(COMMA);
					setState(166);
					var(3);
					}
					} 
				}
				setState(171);
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
			setState(174);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				data_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(VOID_TYPE);
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
		public TerminalNode STRING_TYPE() { return getToken(BisParser.STRING_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(BisParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(BisParser.BOOLEAN_TYPE, 0); }
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
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) ) {
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

	public static class ArrContext extends ParserRuleContext {
		public List<TerminalNode> ARRAY_DELIM() { return getTokens(BisParser.ARRAY_DELIM); }
		public TerminalNode ARRAY_DELIM(int i) {
			return getToken(BisParser.ARRAY_DELIM, i);
		}
		public TerminalNode DIGIT() { return getToken(BisParser.DIGIT, 0); }
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
			setState(178);
			match(ARRAY_DELIM);
			setState(179);
			match(DIGIT);
			setState(180);
			match(ARRAY_DELIM);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public Ass_state_operatorContext ass_state_operator() {
			return getRuleContext(Ass_state_operatorContext.class,0);
		}
		public Ass_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterAss_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitAss_state(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitAss_state(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ass_stateContext ass_state() throws RecognitionException {
		Ass_stateContext _localctx = new Ass_stateContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ass_state);
		int _la;
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(VAR_IDENTIFIER);
				setState(184);
				_la = _input.LA(1);
				if (_la==ARRAY_DELIM) {
					{
					setState(183);
					arr();
					}
				}

				setState(186);
				assignment();
				setState(187);
				match(TERMINATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				ass_state_operator();
				setState(190);
				match(TERMINATOR);
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
		public TerminalNode ASS_OPERATOR() { return getToken(BisParser.ASS_OPERATOR, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
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
			setState(194);
			match(ASS_OPERATOR);
			setState(195);
			val();
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				cond_val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				condition(0);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public Ass_operatorContext ass_operator() {
			return getRuleContext(Ass_operatorContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
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
			setState(201);
			match(VAR_IDENTIFIER);
			setState(203);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(202);
				arr();
				}
			}

			setState(205);
			ass_operator();
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
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT_OPERATOR || _la==DECREMENT_OPERATOR) ) {
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
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
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

	public static class Num_valContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(BisParser.DIGIT, 0); }
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public TerminalNode EXPONENT() { return getToken(BisParser.EXPONENT, 0); }
		public TerminalNode FLOAT() { return getToken(BisParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(BisParser.CHAR, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterNum_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitNum_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitNum_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num_val);
		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(212);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(211);
					unary_op();
					}
				}

				setState(214);
				match(DIGIT);
				setState(216);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(215);
					match(EXPONENT);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(218);
					unary_op();
					}
				}

				setState(221);
				match(FLOAT);
				setState(223);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(222);
					match(EXPONENT);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(225);
				match(CHAR);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(226);
				func_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(227);
				match(VAR_IDENTIFIER);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(BisParser.MULTIPLY_OPERATOR, 0); }
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
	public static class IntLiteralContext extends ExprContext {
		public Num_valContext num_val() {
			return getRuleContext(Num_valContext.class,0);
		}
		public IntLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitIntLiteral(this);
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
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public TerminalNode SUBTRACT_OPERATOR() { return getToken(BisParser.SUBTRACT_OPERATOR, 0); }
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
	public static class ParenExprContext extends ExprContext {
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(236);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(231);
				match(OPEN_PAR);
				setState(232);
				expr(0);
				setState(233);
				match(CLOSE_PAR);
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
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(246);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(244);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(238);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(239);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY_OPERATOR) | (1L << DIVIDE_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(240);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(241);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(242);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(243);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(248);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
		public TerminalNode IF_CONDITIONAL() { return getToken(BisParser.IF_CONDITIONAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode THEN_CONDITIONAL() { return getToken(BisParser.THEN_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public List<Else_if_blockContext> else_if_block() {
			return getRuleContexts(Else_if_blockContext.class);
		}
		public Else_if_blockContext else_if_block(int i) {
			return getRuleContext(Else_if_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(IF_CONDITIONAL);
			setState(250);
			match(OPEN_PAR);
			setState(251);
			condition(0);
			setState(252);
			match(CLOSE_PAR);
			setState(253);
			match(THEN_CONDITIONAL);
			setState(254);
			match(OPEN_BRE);
			setState(255);
			codeblock();
			setState(256);
			match(CLOSE_BRE);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					else_if_block();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(263);
				else_block();
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

	public static class Else_if_blockContext extends ParserRuleContext {
		public TerminalNode ELSE_IF_CONDITIONAL() { return getToken(BisParser.ELSE_IF_CONDITIONAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode THEN_CONDITIONAL() { return getToken(BisParser.THEN_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public Else_if_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterElse_if_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitElse_if_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitElse_if_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_if_blockContext else_if_block() throws RecognitionException {
		Else_if_blockContext _localctx = new Else_if_blockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_else_if_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(ELSE_IF_CONDITIONAL);
			setState(267);
			match(OPEN_PAR);
			setState(268);
			condition(0);
			setState(269);
			match(CLOSE_PAR);
			setState(270);
			match(THEN_CONDITIONAL);
			setState(271);
			match(OPEN_BRE);
			setState(272);
			codeblock();
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(273);
				match(CLOSE_BRE);
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE_CONDITIONAL() { return getToken(BisParser.ELSE_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ELSE_CONDITIONAL);
			setState(277);
			match(OPEN_BRE);
			setState(278);
			codeblock();
			setState(279);
			match(CLOSE_BRE);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(BisParser.STRING, 0); }
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public TerminalNode BOOLEAN() { return getToken(BisParser.BOOLEAN, 0); }
		public Cond_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCond_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCond_val(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCond_val(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_valContext cond_val() throws RecognitionException {
		Cond_valContext _localctx = new Cond_valContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cond_val);
		try {
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				match(STRING);
				setState(284);
				match(ADD_OPERATOR);
				setState(285);
				expr(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(286);
				match(BOOLEAN);
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
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_OPERATOR() { return getToken(BisParser.NOT_OPERATOR, 0); }
		public List<Cond_valContext> cond_val() {
			return getRuleContexts(Cond_valContext.class);
		}
		public Cond_valContext cond_val(int i) {
			return getRuleContext(Cond_valContext.class,i);
		}
		public Cond_operatorContext cond_operator() {
			return getRuleContext(Cond_operatorContext.class,0);
		}
		public TerminalNode AND_OPERATOR() { return getToken(BisParser.AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(BisParser.OR_OPERATOR, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitCondition(this);
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
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(291);
				_la = _input.LA(1);
				if (_la==NOT_OPERATOR) {
					{
					setState(290);
					match(NOT_OPERATOR);
					}
				}

				setState(293);
				match(OPEN_PAR);
				setState(294);
				condition(0);
				setState(295);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(297);
				cond_val();
				setState(298);
				cond_operator();
				setState(299);
				cond_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(309);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(303);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(304);
						match(AND_OPERATOR);
						setState(305);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(306);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(307);
						match(OR_OPERATOR);
						setState(308);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(BisParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(BisParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(BisParser.EQUAL_TO_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(BisParser.NOT_EQUAL_TO_OPERATOR, 0); }
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
		enterRule(_localctx, 60, RULE_cond_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << NOT_EQUAL_TO_OPERATOR))) != 0)) ) {
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

	public static class While_stateContext extends ParserRuleContext {
		public TerminalNode WHILE_LOOP() { return getToken(BisParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
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
		enterRule(_localctx, 62, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(WHILE_LOOP);
			setState(317);
			match(OPEN_PAR);
			setState(318);
			condition(0);
			setState(319);
			match(CLOSE_PAR);
			setState(320);
			match(OPEN_BRE);
			setState(321);
			codeblock();
			setState(322);
			match(CLOSE_BRE);
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
		public TerminalNode DO_WHILE_LOOP() { return getToken(BisParser.DO_WHILE_LOOP, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(BisParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
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
		enterRule(_localctx, 64, RULE_do_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(DO_WHILE_LOOP);
			setState(325);
			match(OPEN_BRE);
			setState(326);
			codeblock();
			setState(327);
			match(CLOSE_BRE);
			setState(328);
			match(WHILE_LOOP);
			setState(329);
			match(OPEN_PAR);
			setState(330);
			condition(0);
			setState(331);
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

	public static class For_stateContext extends ParserRuleContext {
		public TerminalNode FOR_LOOP() { return getToken(BisParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public Ass_stateContext ass_state() {
			return getRuleContext(Ass_stateContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public Ass_state_operatorContext ass_state_operator() {
			return getRuleContext(Ass_state_operatorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
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
		enterRule(_localctx, 66, RULE_for_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(FOR_LOOP);
			setState(334);
			match(OPEN_PAR);
			setState(335);
			ass_state();
			setState(336);
			condition(0);
			setState(337);
			match(TERMINATOR);
			setState(338);
			ass_state_operator();
			setState(339);
			match(CLOSE_PAR);
			setState(340);
			match(OPEN_BRE);
			setState(341);
			codeblock();
			setState(342);
			match(CLOSE_BRE);
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
		case 13:
			return var_sempred((VarContext)_localctx, predIndex);
		case 24:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 29:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean var_sempred(VarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u015b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5[\n\5\3\5\3\5\3\5\3\5\5\5a\n\5\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\7\6i\n\6\f\6\16\6l\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\3\n\3\n\3\n\7\n\u0080\n\n\f\n\16\n"+
		"\u0083\13\n\3\13\7\13\u0086\n\13\f\13\16\13\u0089\13\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u0093\n\f\3\r\3\r\5\r\u0097\n\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00a5\n\17\3\17\3\17\3\17"+
		"\7\17\u00aa\n\17\f\17\16\17\u00ad\13\17\3\20\3\20\5\20\u00b1\n\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\5\23\u00bb\n\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u00c3\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u00ca\n\25\3"+
		"\26\3\26\5\26\u00ce\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\5\31\u00d7"+
		"\n\31\3\31\3\31\5\31\u00db\n\31\3\31\5\31\u00de\n\31\3\31\3\31\5\31\u00e2"+
		"\n\31\3\31\3\31\3\31\5\31\u00e7\n\31\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00ef\n\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u00f7\n\32\f\32\16\32\u00fa"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u0105\n\33\f"+
		"\33\16\33\u0108\13\33\3\33\5\33\u010b\n\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0115\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0122\n\36\3\37\3\37\5\37\u0126\n\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\5\37\u0130\n\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\7\37\u0138\n\37\f\37\16\37\u013b\13\37\3 \3 \3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\2\5\34\62<$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BD\2\7\3\2\r\21\3\2\64\65\3\2\"#\3\2$&\3\2\',\u0163\2F\3"+
		"\2\2\2\4M\3\2\2\2\6P\3\2\2\2\bV\3\2\2\2\nd\3\2\2\2\fm\3\2\2\2\16q\3\2"+
		"\2\2\20t\3\2\2\2\22|\3\2\2\2\24\u0087\3\2\2\2\26\u0092\3\2\2\2\30\u0094"+
		"\3\2\2\2\32\u009b\3\2\2\2\34\u00a1\3\2\2\2\36\u00b0\3\2\2\2 \u00b2\3\2"+
		"\2\2\"\u00b4\3\2\2\2$\u00c2\3\2\2\2&\u00c4\3\2\2\2(\u00c9\3\2\2\2*\u00cb"+
		"\3\2\2\2,\u00d1\3\2\2\2.\u00d3\3\2\2\2\60\u00e6\3\2\2\2\62\u00ee\3\2\2"+
		"\2\64\u00fb\3\2\2\2\66\u010c\3\2\2\28\u0116\3\2\2\2:\u0121\3\2\2\2<\u012f"+
		"\3\2\2\2>\u013c\3\2\2\2@\u013e\3\2\2\2B\u0146\3\2\2\2D\u014f\3\2\2\2F"+
		"G\5\4\3\2GH\5\6\4\2HI\7\2\2\3I\3\3\2\2\2JL\5\b\5\2KJ\3\2\2\2LO\3\2\2\2"+
		"MK\3\2\2\2MN\3\2\2\2N\5\3\2\2\2OM\3\2\2\2PQ\79\2\2QR\7\66\2\2RS\7\35\2"+
		"\2ST\5\24\13\2TU\7\36\2\2U\7\3\2\2\2VW\5\36\20\2WX\7\62\2\2XZ\78\2\2Y"+
		"[\5\n\6\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\66\2\2]^\7\35\2\2^`\5\24"+
		"\13\2_a\5\f\7\2`_\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\7\36\2\2c\t\3\2\2\2de"+
		"\5 \21\2ej\7\13\2\2fg\7\63\2\2gi\5\n\6\2hf\3\2\2\2il\3\2\2\2jh\3\2\2\2"+
		"jk\3\2\2\2k\13\3\2\2\2lj\3\2\2\2mn\7:\2\2no\5(\25\2op\7\23\2\2p\r\3\2"+
		"\2\2qr\5\20\t\2rs\7\23\2\2s\17\3\2\2\2tu\7\67\2\2uv\7\62\2\2vx\7\33\2"+
		"\2wy\5\22\n\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\34\2\2{\21\3\2\2\2|\u0081"+
		"\5(\25\2}~\7\63\2\2~\u0080\5\22\n\2\177}\3\2\2\2\u0080\u0083\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2"+
		"\u0084\u0086\5\26\f\2\u0085\u0084\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u0087\3\2\2\2\u008a"+
		"\u0093\5$\23\2\u008b\u0093\5\30\r\2\u008c\u0093\5\32\16\2\u008d\u0093"+
		"\5\64\33\2\u008e\u0093\5@!\2\u008f\u0093\5B\"\2\u0090\u0093\5D#\2\u0091"+
		"\u0093\5\16\b\2\u0092\u008a\3\2\2\2\u0092\u008b\3\2\2\2\u0092\u008c\3"+
		"\2\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0092"+
		"\u0090\3\2\2\2\u0092\u0091\3\2\2\2\u0093\27\3\2\2\2\u0094\u0096\5 \21"+
		"\2\u0095\u0097\5\"\22\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\5\34\17\2\u0099\u009a\7\23\2\2\u009a\31\3\2"+
		"\2\2\u009b\u009c\7\61\2\2\u009c\u009d\5 \21\2\u009d\u009e\7\13\2\2\u009e"+
		"\u009f\5&\24\2\u009f\u00a0\7\23\2\2\u00a0\33\3\2\2\2\u00a1\u00a2\b\17"+
		"\1\2\u00a2\u00a4\7\13\2\2\u00a3\u00a5\5&\24\2\u00a4\u00a3\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00ab\3\2\2\2\u00a6\u00a7\f\4\2\2\u00a7\u00a8\7\63"+
		"\2\2\u00a8\u00aa\5\34\17\5\u00a9\u00a6\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\35\3\2\2\2\u00ad\u00ab\3\2\2"+
		"\2\u00ae\u00b1\5 \21\2\u00af\u00b1\7\22\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\37\3\2\2\2\u00b2\u00b3\t\2\2\2\u00b3!\3\2\2\2\u00b4"+
		"\u00b5\7\60\2\2\u00b5\u00b6\7\6\2\2\u00b6\u00b7\7\60\2\2\u00b7#\3\2\2"+
		"\2\u00b8\u00ba\7\13\2\2\u00b9\u00bb\5\"\22\2\u00ba\u00b9\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\5&\24\2\u00bd\u00be\7\23"+
		"\2\2\u00be\u00c3\3\2\2\2\u00bf\u00c0\5*\26\2\u00c0\u00c1\7\23\2\2\u00c1"+
		"\u00c3\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c2\u00bf\3\2\2\2\u00c3%\3\2\2\2"+
		"\u00c4\u00c5\7\f\2\2\u00c5\u00c6\5(\25\2\u00c6\'\3\2\2\2\u00c7\u00ca\5"+
		":\36\2\u00c8\u00ca\5<\37\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		")\3\2\2\2\u00cb\u00cd\7\13\2\2\u00cc\u00ce\5\"\22\2\u00cd\u00cc\3\2\2"+
		"\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\5,\27\2\u00d0+"+
		"\3\2\2\2\u00d1\u00d2\t\3\2\2\u00d2-\3\2\2\2\u00d3\u00d4\t\4\2\2\u00d4"+
		"/\3\2\2\2\u00d5\u00d7\5.\30\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\6\2\2\u00d9\u00db\7\5\2\2\u00da\u00d9"+
		"\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e7\3\2\2\2\u00dc\u00de\5.\30\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\7"+
		"\2\2\u00e0\u00e2\7\5\2\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e7\3\2\2\2\u00e3\u00e7\7\t\2\2\u00e4\u00e7\5\20\t\2\u00e5\u00e7\7"+
		"\13\2\2\u00e6\u00d6\3\2\2\2\u00e6\u00dd\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\61\3\2\2\2\u00e8\u00e9\b\32\1"+
		"\2\u00e9\u00ea\7\33\2\2\u00ea\u00eb\5\62\32\2\u00eb\u00ec\7\34\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00ef\5\60\31\2\u00ee\u00e8\3\2\2\2\u00ee\u00ed\3"+
		"\2\2\2\u00ef\u00f8\3\2\2\2\u00f0\u00f1\f\5\2\2\u00f1\u00f2\t\5\2\2\u00f2"+
		"\u00f7\5\62\32\6\u00f3\u00f4\f\4\2\2\u00f4\u00f5\t\4\2\2\u00f5\u00f7\5"+
		"\62\32\5\u00f6\u00f0\3\2\2\2\u00f6\u00f3\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8"+
		"\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\63\3\2\2\2\u00fa\u00f8\3\2\2"+
		"\2\u00fb\u00fc\7\24\2\2\u00fc\u00fd\7\33\2\2\u00fd\u00fe\5<\37\2\u00fe"+
		"\u00ff\7\34\2\2\u00ff\u0100\7\27\2\2\u0100\u0101\7\35\2\2\u0101\u0102"+
		"\5\24\13\2\u0102\u0106\7\36\2\2\u0103\u0105\5\66\34\2\u0104\u0103\3\2"+
		"\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010b\58\35\2\u010a\u0109\3\2"+
		"\2\2\u010a\u010b\3\2\2\2\u010b\65\3\2\2\2\u010c\u010d\7\25\2\2\u010d\u010e"+
		"\7\33\2\2\u010e\u010f\5<\37\2\u010f\u0110\7\34\2\2\u0110\u0111\7\27\2"+
		"\2\u0111\u0112\7\35\2\2\u0112\u0114\5\24\13\2\u0113\u0115\7\36\2\2\u0114"+
		"\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\67\3\2\2\2\u0116\u0117\7\26\2"+
		"\2\u0117\u0118\7\35\2\2\u0118\u0119\5\24\13\2\u0119\u011a\7\36\2\2\u011a"+
		"9\3\2\2\2\u011b\u0122\5\62\32\2\u011c\u0122\7\b\2\2\u011d\u011e\7\b\2"+
		"\2\u011e\u011f\7\"\2\2\u011f\u0122\5\62\32\2\u0120\u0122\7\n\2\2\u0121"+
		"\u011b\3\2\2\2\u0121\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u0120\3\2"+
		"\2\2\u0122;\3\2\2\2\u0123\u0125\b\37\1\2\u0124\u0126\7/\2\2\u0125\u0124"+
		"\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\33\2\2"+
		"\u0128\u0129\5<\37\2\u0129\u012a\7\34\2\2\u012a\u0130\3\2\2\2\u012b\u012c"+
		"\5:\36\2\u012c\u012d\5> \2\u012d\u012e\5:\36\2\u012e\u0130\3\2\2\2\u012f"+
		"\u0123\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0139\3\2\2\2\u0131\u0132\f\5"+
		"\2\2\u0132\u0133\7-\2\2\u0133\u0138\5<\37\6\u0134\u0135\f\4\2\2\u0135"+
		"\u0136\7.\2\2\u0136\u0138\5<\37\5\u0137\u0131\3\2\2\2\u0137\u0134\3\2"+
		"\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"=\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\t\6\2\2\u013d?\3\2\2\2\u013e"+
		"\u013f\7\31\2\2\u013f\u0140\7\33\2\2\u0140\u0141\5<\37\2\u0141\u0142\7"+
		"\34\2\2\u0142\u0143\7\35\2\2\u0143\u0144\5\24\13\2\u0144\u0145\7\36\2"+
		"\2\u0145A\3\2\2\2\u0146\u0147\7\32\2\2\u0147\u0148\7\35\2\2\u0148\u0149"+
		"\5\24\13\2\u0149\u014a\7\36\2\2\u014a\u014b\7\31\2\2\u014b\u014c\7\33"+
		"\2\2\u014c\u014d\5<\37\2\u014d\u014e\7\34\2\2\u014eC\3\2\2\2\u014f\u0150"+
		"\7\30\2\2\u0150\u0151\7\33\2\2\u0151\u0152\5$\23\2\u0152\u0153\5<\37\2"+
		"\u0153\u0154\7\23\2\2\u0154\u0155\5*\26\2\u0155\u0156\7\34\2\2\u0156\u0157"+
		"\7\35\2\2\u0157\u0158\5\24\13\2\u0158\u0159\7\36\2\2\u0159E\3\2\2\2\""+
		"MZ`jx\u0081\u0087\u0092\u0096\u00a4\u00ab\u00b0\u00ba\u00c2\u00c9\u00cd"+
		"\u00d6\u00da\u00dd\u00e1\u00e6\u00ee\u00f6\u00f8\u0106\u010a\u0114\u0121"+
		"\u0125\u012f\u0137\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}