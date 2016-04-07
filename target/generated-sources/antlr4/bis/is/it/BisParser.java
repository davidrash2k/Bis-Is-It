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
		RULE_codeblock = 8, RULE_statement = 9, RULE_vardec_state = 10, RULE_consvardec_state = 11, 
		RULE_vardec = 12, RULE_func_data_type = 13, RULE_data_type = 14, RULE_arr = 15, 
		RULE_ass_state = 16, RULE_assignment = 17, RULE_val = 18, RULE_ass_state_operator = 19, 
		RULE_ass_operator = 20, RULE_unary_op = 21, RULE_num_val = 22, RULE_expr = 23, 
		RULE_cond_state = 24, RULE_cond_block = 25, RULE_cond_val = 26, RULE_condition = 27, 
		RULE_while_state = 28, RULE_do_while_state = 29, RULE_for_state = 30;
	public static final String[] ruleNames = {
		"start", "func_define", "main_func", "func", "params", "return_state", 
		"func_call_state", "func_call", "codeblock", "statement", "vardec_state", 
		"consvardec_state", "vardec", "func_data_type", "data_type", "arr", "ass_state", 
		"assignment", "val", "ass_state_operator", "ass_operator", "unary_op", 
		"num_val", "expr", "cond_state", "cond_block", "cond_val", "condition", 
		"while_state", "do_while_state", "for_state"
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
			setState(62);
			func_define();
			setState(63);
			main_func();
			setState(64);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(66);
				func();
				}
				}
				setState(71);
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
		public TerminalNode FUNC_DEFINITION() { return getToken(BisParser.FUNC_DEFINITION, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
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
			setState(72);
			match(MAIN_FUNC);
			setState(73);
			match(FUNC_DEFINITION);
			setState(74);
			match(OPEN_BRE);
			setState(75);
			codeblock();
			setState(76);
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
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
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
			setState(78);
			func_data_type();
			setState(79);
			match(FUNC_IDENTIFIER);
			setState(80);
			match(PARAMS_KEYWORD);
			setState(89);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
				{
				setState(81);
				params();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(82);
					match(COMMA);
					setState(83);
					params();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(91);
			match(FUNC_DEFINITION);
			setState(92);
			match(OPEN_BRE);
			setState(93);
			codeblock();
			setState(95);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(94);
				return_state();
				}
			}

			setState(97);
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
			setState(99);
			data_type();
			setState(100);
			match(VAR_IDENTIFIER);
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
			setState(102);
			match(RETURN);
			setState(103);
			val();
			setState(104);
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
			setState(106);
			func_call();
			setState(107);
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
		public List<ValContext> val() {
			return getRuleContexts(ValContext.class);
		}
		public ValContext val(int i) {
			return getRuleContext(ValContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
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
			setState(109);
			match(FUNC_CALL);
			setState(110);
			match(FUNC_IDENTIFIER);
			setState(111);
			match(OPEN_PAR);
			setState(120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VAR_IDENTIFIER) | (1L << OPEN_PAR) | (1L << ADD_OPERATOR) | (1L << SUBTRACT_OPERATOR) | (1L << NOT_OPERATOR) | (1L << FUNC_CALL))) != 0)) {
				{
				setState(112);
				val();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(113);
					match(COMMA);
					setState(114);
					val();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(122);
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
		enterRule(_localctx, 16, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_IDENTIFIER) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_WHILE_LOOP) | (1L << CONSTANT) | (1L << FUNC_CALL))) != 0)) {
				{
				{
				setState(124);
				statement();
				}
				}
				setState(129);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(138);
			switch (_input.LA(1)) {
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
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
				setState(131);
				vardec_state();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(132);
				consvardec_state();
				}
				break;
			case IF_CONDITIONAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
				cond_state();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(134);
				while_state();
				}
				break;
			case DO_WHILE_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(135);
				do_while_state();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(136);
				for_state();
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(137);
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
		public VardecContext vardec() {
			return getRuleContext(VardecContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
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
		enterRule(_localctx, 20, RULE_vardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			vardec(0);
			setState(141);
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
		enterRule(_localctx, 22, RULE_consvardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(CONSTANT);
			setState(144);
			data_type();
			setState(145);
			match(VAR_IDENTIFIER);
			setState(146);
			assignment();
			setState(147);
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
		public List<VardecContext> vardec() {
			return getRuleContexts(VardecContext.class);
		}
		public VardecContext vardec(int i) {
			return getRuleContext(VardecContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(BisParser.COMMA, 0); }
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
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
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_vardec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new SingleVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(150);
				data_type();
				setState(151);
				match(VAR_IDENTIFIER);
				setState(153);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(152);
					assignment();
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
				setState(155);
				data_type();
				setState(156);
				arr();
				setState(157);
				match(VAR_IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
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
					setState(161);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(162);
					match(COMMA);
					setState(163);
					vardec(4);
					}
					} 
				}
				setState(168);
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
		enterRule(_localctx, 26, RULE_func_data_type);
		try {
			setState(171);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				data_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
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
		enterRule(_localctx, 28, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 30, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ARRAY_DELIM);
			setState(176);
			match(DIGIT);
			setState(177);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
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
		enterRule(_localctx, 32, RULE_ass_state);
		int _la;
		try {
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new NormalAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(VAR_IDENTIFIER);
				setState(181);
				_la = _input.LA(1);
				if (_la==ARRAY_DELIM) {
					{
					setState(180);
					arr();
					}
				}

				setState(183);
				assignment();
				setState(184);
				match(TERMINATOR);
				}
				break;
			case 2:
				_localctx = new OperatorAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				ass_state_operator();
				setState(187);
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
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(ASS_OPERATOR);
			setState(192);
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(BisParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BisParser.STRING, i);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public TerminalNode BOOLEAN() { return getToken(BisParser.BOOLEAN, 0); }
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
		enterRule(_localctx, 36, RULE_val);
		try {
			setState(204);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				match(STRING);
				setState(197);
				match(ADD_OPERATOR);
				setState(198);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(199);
				match(STRING);
				setState(200);
				match(ADD_OPERATOR);
				setState(201);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(202);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(203);
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
		enterRule(_localctx, 38, RULE_ass_state_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(VAR_IDENTIFIER);
			setState(208);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(207);
				arr();
				}
			}

			setState(210);
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
		enterRule(_localctx, 40, RULE_ass_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 42, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
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
		public TerminalNode DIGIT() { return getToken(BisParser.DIGIT, 0); }
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
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
		public TerminalNode FLOAT() { return getToken(BisParser.FLOAT, 0); }
		public Unary_opContext unary_op() {
			return getRuleContext(Unary_opContext.class,0);
		}
		public TerminalNode EXPONENT() { return getToken(BisParser.EXPONENT, 0); }
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
		enterRule(_localctx, 44, RULE_num_val);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(216);
					unary_op();
					}
				}

				setState(219);
				match(DIGIT);
				}
				break;
			case 2:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(220);
					unary_op();
					}
				}

				setState(223);
				match(FLOAT);
				setState(225);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(224);
					match(EXPONENT);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new CharLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(CHAR);
				}
				break;
			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(228);
				func_call();
				}
				break;
			case 5:
				_localctx = new ArrayIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
				match(VAR_IDENTIFIER);
				setState(230);
				arr();
				}
				break;
			case 6:
				_localctx = new VarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(231);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(235);
				match(OPEN_PAR);
				setState(236);
				expr(0);
				setState(237);
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
				_localctx = new NumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(239);
				num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(250);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(248);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(243);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY_OPERATOR) | (1L << DIVIDE_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(244);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(246);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(247);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(252);
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
		public TerminalNode IF_CONDITIONAL() { return getToken(BisParser.IF_CONDITIONAL, 0); }
		public List<Cond_blockContext> cond_block() {
			return getRuleContexts(Cond_blockContext.class);
		}
		public Cond_blockContext cond_block(int i) {
			return getRuleContext(Cond_blockContext.class,i);
		}
		public List<TerminalNode> ELSE_IF_CONDITIONAL() { return getTokens(BisParser.ELSE_IF_CONDITIONAL); }
		public TerminalNode ELSE_IF_CONDITIONAL(int i) {
			return getToken(BisParser.ELSE_IF_CONDITIONAL, i);
		}
		public TerminalNode ELSE_CONDITIONAL() { return getToken(BisParser.ELSE_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(BisParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(BisParser.CLOSE_BRE, 0); }
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
		enterRule(_localctx, 48, RULE_cond_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(IF_CONDITIONAL);
			setState(254);
			cond_block();
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_CONDITIONAL) {
				{
				{
				setState(255);
				match(ELSE_IF_CONDITIONAL);
				setState(256);
				cond_block();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			_la = _input.LA(1);
			if (_la==ELSE_CONDITIONAL) {
				{
				setState(262);
				match(ELSE_CONDITIONAL);
				setState(263);
				match(OPEN_BRE);
				setState(264);
				codeblock();
				setState(265);
				match(CLOSE_BRE);
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
		enterRule(_localctx, 50, RULE_cond_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(OPEN_PAR);
			setState(270);
			condition(0);
			setState(271);
			match(CLOSE_PAR);
			setState(272);
			match(THEN_CONDITIONAL);
			setState(273);
			match(OPEN_BRE);
			setState(274);
			codeblock();
			setState(275);
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
		public List<TerminalNode> STRING() { return getTokens(BisParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(BisParser.STRING, i);
		}
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
		public TerminalNode STRING() { return getToken(BisParser.STRING, 0); }
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
		enterRule(_localctx, 52, RULE_cond_val);
		try {
			setState(286);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				expr(0);
				}
				break;
			case 2:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(STRING);
				}
				break;
			case 3:
				_localctx = new StringConcatStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(STRING);
				setState(280);
				match(ADD_OPERATOR);
				setState(281);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new StringConcatExprContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(282);
				match(STRING);
				setState(283);
				match(ADD_OPERATOR);
				setState(284);
				expr(0);
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode OR_OPERATOR() { return getToken(BisParser.OR_OPERATOR, 0); }
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
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode AND_OPERATOR() { return getToken(BisParser.AND_OPERATOR, 0); }
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
		public List<Cond_valContext> cond_val() {
			return getRuleContexts(Cond_valContext.class);
		}
		public Cond_valContext cond_val(int i) {
			return getRuleContext(Cond_valContext.class,i);
		}
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(BisParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(BisParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(BisParser.NOT_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(BisParser.EQUAL_TO_OPERATOR, 0); }
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
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_OPERATOR() { return getToken(BisParser.NOT_OPERATOR, 0); }
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				_localctx = new ParenConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(290);
				_la = _input.LA(1);
				if (_la==NOT_OPERATOR) {
					{
					setState(289);
					match(NOT_OPERATOR);
					}
				}

				setState(292);
				match(OPEN_PAR);
				setState(293);
				condition(0);
				setState(294);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new ConditionOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				cond_val();
				setState(297);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << NOT_EQUAL_TO_OPERATOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(298);
				cond_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(302);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(303);
						match(AND_OPERATOR);
						setState(304);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(305);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(306);
						match(OR_OPERATOR);
						setState(307);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(312);
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
		enterRule(_localctx, 56, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHILE_LOOP);
			setState(314);
			match(OPEN_PAR);
			setState(315);
			condition(0);
			setState(316);
			match(CLOSE_PAR);
			setState(317);
			match(OPEN_BRE);
			setState(318);
			codeblock();
			setState(319);
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
		enterRule(_localctx, 58, RULE_do_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(DO_WHILE_LOOP);
			setState(322);
			match(OPEN_BRE);
			setState(323);
			codeblock();
			setState(324);
			match(CLOSE_BRE);
			setState(325);
			match(WHILE_LOOP);
			setState(326);
			match(OPEN_PAR);
			setState(327);
			condition(0);
			setState(328);
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
		enterRule(_localctx, 60, RULE_for_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(FOR_LOOP);
			setState(331);
			match(OPEN_PAR);
			setState(332);
			ass_state();
			setState(333);
			condition(0);
			setState(334);
			match(TERMINATOR);
			setState(335);
			ass_state_operator();
			setState(336);
			match(CLOSE_PAR);
			setState(337);
			match(OPEN_BRE);
			setState(338);
			codeblock();
			setState(339);
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
		case 12:
			return vardec_sempred((VardecContext)_localctx, predIndex);
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 27:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean vardec_sempred(VardecContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3:\u0158\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\7\3F\n\3\f\3\16\3I\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\7\5W\n\5\f\5\16\5Z\13\5\5\5\\\n\5\3\5\3\5\3\5\3\5\5"+
		"\5b\n\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t\5\t{\n\t\3\t\3\t\3\n\7\n\u0080\n\n"+
		"\f\n\16\n\u0083\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d"+
		"\n\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u009c"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u00a2\n\16\3\16\3\16\3\16\7\16\u00a7\n"+
		"\16\f\16\16\16\u00aa\13\16\3\17\3\17\5\17\u00ae\n\17\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\5\22\u00b8\n\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\5\22\u00c0\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00cf\n\24\3\25\3\25\5\25\u00d3\n\25\3\25\3\25\3\26\3"+
		"\26\3\27\3\27\3\30\5\30\u00dc\n\30\3\30\3\30\5\30\u00e0\n\30\3\30\3\30"+
		"\5\30\u00e4\n\30\3\30\3\30\3\30\3\30\3\30\5\30\u00eb\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u00f3\n\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31"+
		"\u00fb\n\31\f\31\16\31\u00fe\13\31\3\32\3\32\3\32\3\32\7\32\u0104\n\32"+
		"\f\32\16\32\u0107\13\32\3\32\3\32\3\32\3\32\3\32\5\32\u010e\n\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0121\n\34\3\35\3\35\5\35\u0125\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\5\35\u012f\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u0137\n\35\f\35\16\35\u013a\13\35\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \2\5\32\608!\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>\2\7\3\2\r\21\3\2\64\65\3\2\"#\3\2$&\3\2\'"+
		",\u0167\2@\3\2\2\2\4G\3\2\2\2\6J\3\2\2\2\bP\3\2\2\2\ne\3\2\2\2\fh\3\2"+
		"\2\2\16l\3\2\2\2\20o\3\2\2\2\22\u0081\3\2\2\2\24\u008c\3\2\2\2\26\u008e"+
		"\3\2\2\2\30\u0091\3\2\2\2\32\u00a1\3\2\2\2\34\u00ad\3\2\2\2\36\u00af\3"+
		"\2\2\2 \u00b1\3\2\2\2\"\u00bf\3\2\2\2$\u00c1\3\2\2\2&\u00ce\3\2\2\2(\u00d0"+
		"\3\2\2\2*\u00d6\3\2\2\2,\u00d8\3\2\2\2.\u00ea\3\2\2\2\60\u00f2\3\2\2\2"+
		"\62\u00ff\3\2\2\2\64\u010f\3\2\2\2\66\u0120\3\2\2\28\u012e\3\2\2\2:\u013b"+
		"\3\2\2\2<\u0143\3\2\2\2>\u014c\3\2\2\2@A\5\4\3\2AB\5\6\4\2BC\7\2\2\3C"+
		"\3\3\2\2\2DF\5\b\5\2ED\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2"+
		"\2IG\3\2\2\2JK\79\2\2KL\7\66\2\2LM\7\35\2\2MN\5\22\n\2NO\7\36\2\2O\7\3"+
		"\2\2\2PQ\5\34\17\2QR\7\62\2\2R[\78\2\2SX\5\n\6\2TU\7\63\2\2UW\5\n\6\2"+
		"VT\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2[S\3\2\2"+
		"\2[\\\3\2\2\2\\]\3\2\2\2]^\7\66\2\2^_\7\35\2\2_a\5\22\n\2`b\5\f\7\2a`"+
		"\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\36\2\2d\t\3\2\2\2ef\5\36\20\2fg\7\13"+
		"\2\2g\13\3\2\2\2hi\7:\2\2ij\5&\24\2jk\7\23\2\2k\r\3\2\2\2lm\5\20\t\2m"+
		"n\7\23\2\2n\17\3\2\2\2op\7\67\2\2pq\7\62\2\2qz\7\33\2\2rw\5&\24\2st\7"+
		"\63\2\2tv\5&\24\2us\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw"+
		"\3\2\2\2zr\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\7\34\2\2}\21\3\2\2\2~\u0080\5"+
		"\24\13\2\177~\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\23\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u008d\5\"\22\2\u0085"+
		"\u008d\5\26\f\2\u0086\u008d\5\30\r\2\u0087\u008d\5\62\32\2\u0088\u008d"+
		"\5:\36\2\u0089\u008d\5<\37\2\u008a\u008d\5> \2\u008b\u008d\5\16\b\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008c\u0086\3\2\2\2\u008c\u0087\3\2"+
		"\2\2\u008c\u0088\3\2\2\2\u008c\u0089\3\2\2\2\u008c\u008a\3\2\2\2\u008c"+
		"\u008b\3\2\2\2\u008d\25\3\2\2\2\u008e\u008f\5\32\16\2\u008f\u0090\7\23"+
		"\2\2\u0090\27\3\2\2\2\u0091\u0092\7\61\2\2\u0092\u0093\5\36\20\2\u0093"+
		"\u0094\7\13\2\2\u0094\u0095\5$\23\2\u0095\u0096\7\23\2\2\u0096\31\3\2"+
		"\2\2\u0097\u0098\b\16\1\2\u0098\u0099\5\36\20\2\u0099\u009b\7\13\2\2\u009a"+
		"\u009c\5$\23\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u00a2\3\2"+
		"\2\2\u009d\u009e\5\36\20\2\u009e\u009f\5 \21\2\u009f\u00a0\7\13\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u0097\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a8\3\2"+
		"\2\2\u00a3\u00a4\f\5\2\2\u00a4\u00a5\7\63\2\2\u00a5\u00a7\5\32\16\6\u00a6"+
		"\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2"+
		"\2\2\u00a9\33\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u00ae\5\36\20\2\u00ac"+
		"\u00ae\7\22\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2"+
		"\2\u00af\u00b0\t\2\2\2\u00b0\37\3\2\2\2\u00b1\u00b2\7\60\2\2\u00b2\u00b3"+
		"\7\6\2\2\u00b3\u00b4\7\60\2\2\u00b4!\3\2\2\2\u00b5\u00b7\7\13\2\2\u00b6"+
		"\u00b8\5 \21\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\23\2\2\u00bb\u00c0\3\2\2\2\u00bc"+
		"\u00bd\5(\25\2\u00bd\u00be\7\23\2\2\u00be\u00c0\3\2\2\2\u00bf\u00b5\3"+
		"\2\2\2\u00bf\u00bc\3\2\2\2\u00c0#\3\2\2\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3"+
		"\5&\24\2\u00c3%\3\2\2\2\u00c4\u00cf\5\60\31\2\u00c5\u00cf\7\b\2\2\u00c6"+
		"\u00c7\7\b\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00cf\7\b\2\2\u00c9\u00ca\7\b"+
		"\2\2\u00ca\u00cb\7\"\2\2\u00cb\u00cf\5\60\31\2\u00cc\u00cf\7\n\2\2\u00cd"+
		"\u00cf\58\35\2\u00ce\u00c4\3\2\2\2\u00ce\u00c5\3\2\2\2\u00ce\u00c6\3\2"+
		"\2\2\u00ce\u00c9\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\'\3\2\2\2\u00d0\u00d2\7\13\2\2\u00d1\u00d3\5 \21\2\u00d2\u00d1\3\2\2"+
		"\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\5*\26\2\u00d5)"+
		"\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7+\3\2\2\2\u00d8\u00d9\t\4\2\2\u00d9"+
		"-\3\2\2\2\u00da\u00dc\5,\27\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00eb\7\6\2\2\u00de\u00e0\5,\27\2\u00df\u00de"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\7\7\2\2\u00e2"+
		"\u00e4\7\5\2\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00eb\3\2"+
		"\2\2\u00e5\u00eb\7\t\2\2\u00e6\u00eb\5\20\t\2\u00e7\u00e8\7\13\2\2\u00e8"+
		"\u00eb\5 \21\2\u00e9\u00eb\7\13\2\2\u00ea\u00db\3\2\2\2\u00ea\u00df\3"+
		"\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb/\3\2\2\2\u00ec\u00ed\b\31\1\2\u00ed\u00ee\7\33\2"+
		"\2\u00ee\u00ef\5\60\31\2\u00ef\u00f0\7\34\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00f3\5.\30\2\u00f2\u00ec\3\2\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00fc\3\2"+
		"\2\2\u00f4\u00f5\f\5\2\2\u00f5\u00f6\t\5\2\2\u00f6\u00fb\5\60\31\6\u00f7"+
		"\u00f8\f\4\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fb\5\60\31\5\u00fa\u00f4\3"+
		"\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\61\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0100\7\24\2"+
		"\2\u0100\u0105\5\64\33\2\u0101\u0102\7\25\2\2\u0102\u0104\5\64\33\2\u0103"+
		"\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2"+
		"\2\2\u0106\u010d\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u0109\7\26\2\2\u0109"+
		"\u010a\7\35\2\2\u010a\u010b\5\22\n\2\u010b\u010c\7\36\2\2\u010c\u010e"+
		"\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u010e\3\2\2\2\u010e\63\3\2\2\2\u010f"+
		"\u0110\7\33\2\2\u0110\u0111\58\35\2\u0111\u0112\7\34\2\2\u0112\u0113\7"+
		"\27\2\2\u0113\u0114\7\35\2\2\u0114\u0115\5\22\n\2\u0115\u0116\7\36\2\2"+
		"\u0116\65\3\2\2\2\u0117\u0121\5\60\31\2\u0118\u0121\7\b\2\2\u0119\u011a"+
		"\7\b\2\2\u011a\u011b\7\"\2\2\u011b\u0121\7\b\2\2\u011c\u011d\7\b\2\2\u011d"+
		"\u011e\7\"\2\2\u011e\u0121\5\60\31\2\u011f\u0121\7\n\2\2\u0120\u0117\3"+
		"\2\2\2\u0120\u0118\3\2\2\2\u0120\u0119\3\2\2\2\u0120\u011c\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121\67\3\2\2\2\u0122\u0124\b\35\1\2\u0123\u0125\7/\2"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0127"+
		"\7\33\2\2\u0127\u0128\58\35\2\u0128\u0129\7\34\2\2\u0129\u012f\3\2\2\2"+
		"\u012a\u012b\5\66\34\2\u012b\u012c\t\6\2\2\u012c\u012d\5\66\34\2\u012d"+
		"\u012f\3\2\2\2\u012e\u0122\3\2\2\2\u012e\u012a\3\2\2\2\u012f\u0138\3\2"+
		"\2\2\u0130\u0131\f\5\2\2\u0131\u0132\7-\2\2\u0132\u0137\58\35\6\u0133"+
		"\u0134\f\4\2\2\u0134\u0135\7.\2\2\u0135\u0137\58\35\5\u0136\u0130\3\2"+
		"\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u01399\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\31\2\2"+
		"\u013c\u013d\7\33\2\2\u013d\u013e\58\35\2\u013e\u013f\7\34\2\2\u013f\u0140"+
		"\7\35\2\2\u0140\u0141\5\22\n\2\u0141\u0142\7\36\2\2\u0142;\3\2\2\2\u0143"+
		"\u0144\7\32\2\2\u0144\u0145\7\35\2\2\u0145\u0146\5\22\n\2\u0146\u0147"+
		"\7\36\2\2\u0147\u0148\7\31\2\2\u0148\u0149\7\33\2\2\u0149\u014a\58\35"+
		"\2\u014a\u014b\7\34\2\2\u014b=\3\2\2\2\u014c\u014d\7\30\2\2\u014d\u014e"+
		"\7\33\2\2\u014e\u014f\5\"\22\2\u014f\u0150\58\35\2\u0150\u0151\7\23\2"+
		"\2\u0151\u0152\5(\25\2\u0152\u0153\7\34\2\2\u0153\u0154\7\35\2\2\u0154"+
		"\u0155\5\22\n\2\u0155\u0156\7\36\2\2\u0156?\3\2\2\2 GX[awz\u0081\u008c"+
		"\u009b\u00a1\u00a8\u00ad\u00b7\u00bf\u00ce\u00d2\u00db\u00df\u00e3\u00ea"+
		"\u00f2\u00fa\u00fc\u0105\u010d\u0120\u0124\u012e\u0136\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}