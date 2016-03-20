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
		NL=1, WS=2, DIGIT=3, FLOAT=4, STRING=5, CHAR=6, BOOLEAN=7, VAR_IDENTIFIER=8, 
		ASS_OPERATOR=9, INT_TYPE=10, FLOAT_TYPE=11, STRING_TYPE=12, CHAR_TYPE=13, 
		BOOLEAN_TYPE=14, VOID_TYPE=15, TERMINATOR=16, IF_CONDITIONAL=17, ELSE_IF_CONDITIONAL=18, 
		ELSE_CONDITIONAL=19, THEN_CONDITIONAL=20, FOR_LOOP=21, WHILE_LOOP=22, 
		DO_WHILE_LOOP=23, OPEN_PAR=24, CLOSE_PAR=25, OPEN_BRE=26, CLOSE_BRE=27, 
		OPEN_BRT=28, CLOSE_BRT=29, COMMENT_BLOCK=30, ADD_OPERATOR=31, SUBTRACT_OPERATOR=32, 
		MULTIPLY_OPERATOR=33, DIVIDE_OPERATOR=34, MODULO_OPERATOR=35, LESS_THAN_OPERATOR=36, 
		LESS_THAN_EQUAL_TO_OPERATOR=37, GREATER_THAN_OPERATOR=38, GREATER_THAN_EQUAL_TO_OPERATOR=39, 
		EQUAL_TO_OPERATOR=40, NOT_EQUAL_TO_OPERATOR=41, AND_OPERATOR=42, OR_OPERATOR=43, 
		NOT_OPERATOR=44, ARRAY_DELIM=45, CONSTANT=46, FUNC_IDENTIFIER=47, COMMA=48, 
		INCREMENT_OPERATOR=49, DECREMENT_OPERATOR=50, FUNC_DEFINITION=51, FUNC_CALL=52, 
		PARAMS_KEYWORD=53, MAIN_FUNC=54, RETURN=55;
	public static final int
		RULE_start = 0, RULE_func_define = 1, RULE_main_func = 2, RULE_func = 3, 
		RULE_params = 4, RULE_func_call_state = 5, RULE_func_call = 6, RULE_call_params = 7, 
		RULE_codeblock = 8, RULE_statement = 9, RULE_vardec_state = 10, RULE_consvardec_state = 11, 
		RULE_var = 12, RULE_func_data_type = 13, RULE_data_type = 14, RULE_arr = 15, 
		RULE_ass_state = 16, RULE_assignment = 17, RULE_val = 18, RULE_ass_state_operator = 19, 
		RULE_ass_operator = 20, RULE_num_val = 21, RULE_expr = 22, RULE_cond_state = 23, 
		RULE_else_block = 24, RULE_cond_val = 25, RULE_condition = 26, RULE_cond_operator = 27, 
		RULE_logical_operator = 28, RULE_while_state = 29, RULE_do_while_state = 30, 
		RULE_for_state = 31;
	public static final String[] ruleNames = {
		"start", "func_define", "main_func", "func", "params", "func_call_state", 
		"func_call", "call_params", "codeblock", "statement", "vardec_state", 
		"consvardec_state", "var", "func_data_type", "data_type", "arr", "ass_state", 
		"assignment", "val", "ass_state_operator", "ass_operator", "num_val", 
		"expr", "cond_state", "else_block", "cond_val", "condition", "cond_operator", 
		"logical_operator", "while_state", "do_while_state", "for_state"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "'numero'", 
		"'lutaw'", "'pisi'", "'letra'", "'tinoodba'", "'wala'", "';'", "'kung'", 
		"'kungdili'", "'kungwalagyud'", "'di'", "'para'", "'habang'", "'buhata'", 
		"'('", "')'", "'{'", "'}'", "'['", "']'", null, "'+'", "'-'", "'*'", "'/'", 
		"'%'", "'<'", "'<='", "'>'", "'>='", null, "'<>'", "'ug'", "'o'", "'dili'", 
		"'$'", "'hantodhantod'", null, "','", "'++'", "'--'", "'>>>'", "'tawaga'", 
		"'>>'", "'sugod_diri'", "'ibalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NL", "WS", "DIGIT", "FLOAT", "STRING", "CHAR", "BOOLEAN", "VAR_IDENTIFIER", 
		"ASS_OPERATOR", "INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "CHAR_TYPE", 
		"BOOLEAN_TYPE", "VOID_TYPE", "TERMINATOR", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", 
		"ELSE_CONDITIONAL", "THEN_CONDITIONAL", "FOR_LOOP", "WHILE_LOOP", "DO_WHILE_LOOP", 
		"OPEN_PAR", "CLOSE_PAR", "OPEN_BRE", "CLOSE_BRE", "OPEN_BRT", "CLOSE_BRT", 
		"COMMENT_BLOCK", "ADD_OPERATOR", "SUBTRACT_OPERATOR", "MULTIPLY_OPERATOR", 
		"DIVIDE_OPERATOR", "MODULO_OPERATOR", "LESS_THAN_OPERATOR", "LESS_THAN_EQUAL_TO_OPERATOR", 
		"GREATER_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", "EQUAL_TO_OPERATOR", 
		"NOT_EQUAL_TO_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "NOT_OPERATOR", 
		"ARRAY_DELIM", "CONSTANT", "FUNC_IDENTIFIER", "COMMA", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "FUNC_DEFINITION", "FUNC_CALL", "PARAMS_KEYWORD", 
		"MAIN_FUNC", "RETURN"
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
		public Func_defineContext func_define() {
			return getRuleContext(Func_defineContext.class,0);
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
			setState(64);
			func_define();
			setState(65);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFunc_define(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFunc_define(this);
		}
	}

	public final Func_defineContext func_define() throws RecognitionException {
		Func_defineContext _localctx = new Func_defineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_func_define);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << VOID_TYPE))) != 0)) {
				{
				{
				setState(67);
				func();
				}
				}
				setState(72);
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
		public TerminalNode MAIN_FUNC() { return getToken(ExpCalculatorParser.MAIN_FUNC, 0); }
		public TerminalNode PARAMS_KEYWORD() { return getToken(ExpCalculatorParser.PARAMS_KEYWORD, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode FUNC_DEFINITION() { return getToken(ExpCalculatorParser.FUNC_DEFINITION, 0); }
		public List<TerminalNode> OPEN_BRE() { return getTokens(ExpCalculatorParser.OPEN_BRE); }
		public TerminalNode OPEN_BRE(int i) {
			return getToken(ExpCalculatorParser.OPEN_BRE, i);
		}
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
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
			setState(73);
			match(MAIN_FUNC);
			setState(74);
			match(PARAMS_KEYWORD);
			setState(75);
			params();
			setState(76);
			match(FUNC_DEFINITION);
			setState(77);
			match(OPEN_BRE);
			setState(78);
			codeblock();
			setState(79);
			match(OPEN_BRE);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FUNC_IDENTIFIER() { return getToken(ExpCalculatorParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode PARAMS_KEYWORD() { return getToken(ExpCalculatorParser.PARAMS_KEYWORD, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode FUNC_DEFINITION() { return getToken(ExpCalculatorParser.FUNC_DEFINITION, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
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
		enterRule(_localctx, 6, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			func_data_type();
			setState(82);
			match(FUNC_IDENTIFIER);
			setState(83);
			match(PARAMS_KEYWORD);
			setState(84);
			params();
			setState(85);
			match(FUNC_DEFINITION);
			setState(86);
			match(OPEN_BRE);
			setState(87);
			codeblock();
			setState(88);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ExpCalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpCalculatorParser.COMMA, i);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitParams(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			data_type();
			setState(91);
			match(VAR_IDENTIFIER);
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(COMMA);
					setState(93);
					params();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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

	public static class Func_call_stateContext extends ParserRuleContext {
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public Func_call_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFunc_call_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFunc_call_state(this);
		}
	}

	public final Func_call_stateContext func_call_state() throws RecognitionException {
		Func_call_stateContext _localctx = new Func_call_stateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_func_call_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			func_call();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode FUNC_CALL() { return getToken(ExpCalculatorParser.FUNC_CALL, 0); }
		public TerminalNode FUNC_IDENTIFIER() { return getToken(ExpCalculatorParser.FUNC_IDENTIFIER, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public Call_paramsContext call_params() {
			return getRuleContext(Call_paramsContext.class,0);
		}
		public Func_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFunc_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFunc_call(this);
		}
	}

	public final Func_callContext func_call() throws RecognitionException {
		Func_callContext _localctx = new Func_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(FUNC_CALL);
			setState(102);
			match(FUNC_IDENTIFIER);
			setState(103);
			match(OPEN_PAR);
			setState(105);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << VAR_IDENTIFIER) | (1L << OPEN_PAR) | (1L << NOT_OPERATOR) | (1L << FUNC_CALL))) != 0)) {
				{
				setState(104);
				call_params();
				}
			}

			setState(107);
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
		public List<TerminalNode> COMMA() { return getTokens(ExpCalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpCalculatorParser.COMMA, i);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCall_params(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCall_params(this);
		}
	}

	public final Call_paramsContext call_params() throws RecognitionException {
		Call_paramsContext _localctx = new Call_paramsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_call_params);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			val();
			setState(114);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(110);
					match(COMMA);
					setState(111);
					call_params();
					}
					} 
				}
				setState(116);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCodeblock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCodeblock(this);
		}
	}

	public final CodeblockContext codeblock() throws RecognitionException {
		CodeblockContext _localctx = new CodeblockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_codeblock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR_IDENTIFIER) | (1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE) | (1L << IF_CONDITIONAL) | (1L << FOR_LOOP) | (1L << WHILE_LOOP) | (1L << DO_WHILE_LOOP) | (1L << FUNC_CALL))) != 0)) {
				{
				{
				setState(117);
				statement();
				}
				}
				setState(122);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(130);
			switch (_input.LA(1)) {
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
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
				setState(124);
				vardec_state();
				}
				break;
			case IF_CONDITIONAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				cond_state();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				while_state();
				}
				break;
			case DO_WHILE_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(127);
				do_while_state();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				for_state();
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 7);
				{
				setState(129);
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
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public Vardec_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardec_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterVardec_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitVardec_state(this);
		}
	}

	public final Vardec_stateContext vardec_state() throws RecognitionException {
		Vardec_stateContext _localctx = new Vardec_stateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_vardec_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			data_type();
			setState(134);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(133);
				arr();
				}
			}

			setState(136);
			var(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode CONSTANT() { return getToken(ExpCalculatorParser.CONSTANT, 0); }
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public Consvardec_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consvardec_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterConsvardec_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitConsvardec_state(this);
		}
	}

	public final Consvardec_stateContext consvardec_state() throws RecognitionException {
		Consvardec_stateContext _localctx = new Consvardec_stateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_consvardec_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(CONSTANT);
			setState(140);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(139);
				arr();
				}
			}

			setState(142);
			match(VAR_IDENTIFIER);
			setState(143);
			assignment();
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpCalculatorParser.COMMA, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitVar(this);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_var, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(146);
			match(VAR_IDENTIFIER);
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(147);
				assignment();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_var);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					match(COMMA);
					setState(152);
					var(3);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
		public TerminalNode VOID_TYPE() { return getToken(ExpCalculatorParser.VOID_TYPE, 0); }
		public Func_data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_data_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFunc_data_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFunc_data_type(this);
		}
	}

	public final Func_data_typeContext func_data_type() throws RecognitionException {
		Func_data_typeContext _localctx = new Func_data_typeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_func_data_type);
		try {
			setState(160);
			switch (_input.LA(1)) {
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				data_type();
				}
				break;
			case VOID_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
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
		public TerminalNode INT_TYPE() { return getToken(ExpCalculatorParser.INT_TYPE, 0); }
		public TerminalNode FLOAT_TYPE() { return getToken(ExpCalculatorParser.FLOAT_TYPE, 0); }
		public TerminalNode STRING_TYPE() { return getToken(ExpCalculatorParser.STRING_TYPE, 0); }
		public TerminalNode CHAR_TYPE() { return getToken(ExpCalculatorParser.CHAR_TYPE, 0); }
		public TerminalNode BOOLEAN_TYPE() { return getToken(ExpCalculatorParser.BOOLEAN_TYPE, 0); }
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
		enterRule(_localctx, 28, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public List<TerminalNode> ARRAY_DELIM() { return getTokens(ExpCalculatorParser.ARRAY_DELIM); }
		public TerminalNode ARRAY_DELIM(int i) {
			return getToken(ExpCalculatorParser.ARRAY_DELIM, i);
		}
		public TerminalNode DIGIT() { return getToken(ExpCalculatorParser.DIGIT, 0); }
		public ArrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterArr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitArr(this);
		}
	}

	public final ArrContext arr() throws RecognitionException {
		ArrContext _localctx = new ArrContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(ARRAY_DELIM);
			setState(165);
			match(DIGIT);
			setState(166);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public ArrContext arr() {
			return getRuleContext(ArrContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Ass_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterAss_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitAss_state(this);
		}
	}

	public final Ass_stateContext ass_state() throws RecognitionException {
		Ass_stateContext _localctx = new Ass_stateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ass_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(VAR_IDENTIFIER);
			setState(170);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(169);
				arr();
				}
			}

			setState(173);
			_la = _input.LA(1);
			if (_la==ASS_OPERATOR) {
				{
				setState(172);
				assignment();
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASS_OPERATOR() { return getToken(ExpCalculatorParser.ASS_OPERATOR, 0); }
		public ValContext val() {
			return getRuleContext(ValContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(ASS_OPERATOR);
			setState(176);
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
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitVal(this);
		}
	}

	public final ValContext val() throws RecognitionException {
		ValContext _localctx = new ValContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_val);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				cond_val();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public Ass_operatorContext ass_operator() {
			return getRuleContext(Ass_operatorContext.class,0);
		}
		public Ass_state_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_state_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterAss_state_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitAss_state_operator(this);
		}
	}

	public final Ass_state_operatorContext ass_state_operator() throws RecognitionException {
		Ass_state_operatorContext _localctx = new Ass_state_operatorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ass_state_operator);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(VAR_IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(VAR_IDENTIFIER);
				setState(184);
				ass_operator();
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

	public static class Ass_operatorContext extends ParserRuleContext {
		public TerminalNode INCREMENT_OPERATOR() { return getToken(ExpCalculatorParser.INCREMENT_OPERATOR, 0); }
		public TerminalNode DECREMENT_OPERATOR() { return getToken(ExpCalculatorParser.DECREMENT_OPERATOR, 0); }
		public Ass_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ass_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterAss_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitAss_operator(this);
		}
	}

	public final Ass_operatorContext ass_operator() throws RecognitionException {
		Ass_operatorContext _localctx = new Ass_operatorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ass_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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

	public static class Num_valContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ExpCalculatorParser.DIGIT, 0); }
		public TerminalNode FLOAT() { return getToken(ExpCalculatorParser.FLOAT, 0); }
		public TerminalNode CHAR() { return getToken(ExpCalculatorParser.CHAR, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(ExpCalculatorParser.VAR_IDENTIFIER, 0); }
		public Num_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterNum_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitNum_val(this);
		}
	}

	public final Num_valContext num_val() throws RecognitionException {
		Num_valContext _localctx = new Num_valContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_num_val);
		try {
			setState(194);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(DIGIT);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(FLOAT);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(191);
				match(CHAR);
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 4);
				{
				setState(192);
				func_call();
				}
				break;
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(193);
				match(VAR_IDENTIFIER);
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
		public TerminalNode MULTIPLY_OPERATOR() { return getToken(ExpCalculatorParser.MULTIPLY_OPERATOR, 0); }
		public TerminalNode DIVIDE_OPERATOR() { return getToken(ExpCalculatorParser.DIVIDE_OPERATOR, 0); }
		public TerminalNode MODULO_OPERATOR() { return getToken(ExpCalculatorParser.MODULO_OPERATOR, 0); }
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
		public Num_valContext num_val() {
			return getRuleContext(Num_valContext.class,0);
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
		public TerminalNode ADD_OPERATOR() { return getToken(ExpCalculatorParser.ADD_OPERATOR, 0); }
		public TerminalNode SUBTRACT_OPERATOR() { return getToken(ExpCalculatorParser.SUBTRACT_OPERATOR, 0); }
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
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197);
				match(OPEN_PAR);
				setState(198);
				expr(0);
				setState(199);
				match(CLOSE_PAR);
				}
				break;
			case DIGIT:
			case FLOAT:
			case CHAR:
			case VAR_IDENTIFIER:
			case FUNC_CALL:
				{
				_localctx = new IntLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(201);
				num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(204);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(205);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY_OPERATOR) | (1L << DIVIDE_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(206);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(207);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(208);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(209);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
		public TerminalNode IF_CONDITIONAL() { return getToken(ExpCalculatorParser.IF_CONDITIONAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public TerminalNode THEN_CONDITIONAL() { return getToken(ExpCalculatorParser.THEN_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public Cond_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCond_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCond_state(this);
		}
	}

	public final Cond_stateContext cond_state() throws RecognitionException {
		Cond_stateContext _localctx = new Cond_stateContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cond_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(IF_CONDITIONAL);
			setState(216);
			match(OPEN_PAR);
			setState(217);
			condition(0);
			setState(218);
			match(CLOSE_PAR);
			setState(219);
			match(THEN_CONDITIONAL);
			setState(220);
			match(OPEN_BRE);
			setState(221);
			codeblock();
			setState(222);
			match(CLOSE_BRE);
			setState(224);
			_la = _input.LA(1);
			if (_la==ELSE_IF_CONDITIONAL || _la==ELSE_CONDITIONAL) {
				{
				setState(223);
				else_block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE_IF_CONDITIONAL() { return getToken(ExpCalculatorParser.ELSE_IF_CONDITIONAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public TerminalNode THEN_CONDITIONAL() { return getToken(ExpCalculatorParser.THEN_CONDITIONAL, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public TerminalNode ELSE_CONDITIONAL() { return getToken(ExpCalculatorParser.ELSE_CONDITIONAL, 0); }
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitElse_block(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_else_block);
		int _la;
		try {
			setState(242);
			switch (_input.LA(1)) {
			case ELSE_IF_CONDITIONAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ELSE_IF_CONDITIONAL);
				setState(227);
				match(OPEN_PAR);
				setState(228);
				condition(0);
				setState(229);
				match(CLOSE_PAR);
				setState(230);
				match(THEN_CONDITIONAL);
				setState(231);
				match(OPEN_BRE);
				setState(232);
				codeblock();
				setState(233);
				match(CLOSE_BRE);
				setState(235);
				_la = _input.LA(1);
				if (_la==ELSE_IF_CONDITIONAL || _la==ELSE_CONDITIONAL) {
					{
					setState(234);
					else_block();
					}
				}

				}
				break;
			case ELSE_CONDITIONAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(ELSE_CONDITIONAL);
				setState(238);
				match(OPEN_BRE);
				setState(239);
				codeblock();
				setState(240);
				match(CLOSE_BRE);
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

	public static class Cond_valContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ExpCalculatorParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(ExpCalculatorParser.BOOLEAN, 0); }
		public Cond_valContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_val; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCond_val(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCond_val(this);
		}
	}

	public final Cond_valContext cond_val() throws RecognitionException {
		Cond_valContext _localctx = new Cond_valContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cond_val);
		try {
			setState(247);
			switch (_input.LA(1)) {
			case DIGIT:
			case FLOAT:
			case CHAR:
			case VAR_IDENTIFIER:
			case OPEN_PAR:
			case FUNC_CALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				expr(0);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(STRING);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(246);
				match(BOOLEAN);
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

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public TerminalNode NOT_OPERATOR() { return getToken(ExpCalculatorParser.NOT_OPERATOR, 0); }
		public List<Cond_valContext> cond_val() {
			return getRuleContexts(Cond_valContext.class);
		}
		public Cond_valContext cond_val(int i) {
			return getRuleContext(Cond_valContext.class,i);
		}
		public Cond_operatorContext cond_operator() {
			return getRuleContext(Cond_operatorContext.class,0);
		}
		public Logical_operatorContext logical_operator() {
			return getRuleContext(Logical_operatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCondition(this);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(251);
				_la = _input.LA(1);
				if (_la==NOT_OPERATOR) {
					{
					setState(250);
					match(NOT_OPERATOR);
					}
				}

				setState(253);
				match(OPEN_PAR);
				setState(254);
				condition(0);
				setState(255);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(257);
				cond_val();
				setState(258);
				cond_operator();
				setState(259);
				cond_val();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(269);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(263);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(264);
					logical_operator();
					setState(265);
					condition(3);
					}
					} 
				}
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(ExpCalculatorParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(ExpCalculatorParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(ExpCalculatorParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(ExpCalculatorParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(ExpCalculatorParser.EQUAL_TO_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(ExpCalculatorParser.NOT_EQUAL_TO_OPERATOR, 0); }
		public Cond_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterCond_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitCond_operator(this);
		}
	}

	public final Cond_operatorContext cond_operator() throws RecognitionException {
		Cond_operatorContext _localctx = new Cond_operatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_cond_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
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

	public static class Logical_operatorContext extends ParserRuleContext {
		public TerminalNode AND_OPERATOR() { return getToken(ExpCalculatorParser.AND_OPERATOR, 0); }
		public TerminalNode OR_OPERATOR() { return getToken(ExpCalculatorParser.OR_OPERATOR, 0); }
		public Logical_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterLogical_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitLogical_operator(this);
		}
	}

	public final Logical_operatorContext logical_operator() throws RecognitionException {
		Logical_operatorContext _localctx = new Logical_operatorContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_logical_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(_la==AND_OPERATOR || _la==OR_OPERATOR) ) {
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
		public TerminalNode WHILE_LOOP() { return getToken(ExpCalculatorParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
		public While_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterWhile_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitWhile_state(this);
		}
	}

	public final While_stateContext while_state() throws RecognitionException {
		While_stateContext _localctx = new While_stateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(WHILE_LOOP);
			setState(277);
			match(OPEN_PAR);
			setState(278);
			condition(0);
			setState(279);
			match(CLOSE_PAR);
			setState(280);
			match(OPEN_BRE);
			setState(281);
			codeblock();
			setState(282);
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
		public TerminalNode DO_WHILE_LOOP() { return getToken(ExpCalculatorParser.DO_WHILE_LOOP, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
		public TerminalNode WHILE_LOOP() { return getToken(ExpCalculatorParser.WHILE_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public Do_while_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterDo_while_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitDo_while_state(this);
		}
	}

	public final Do_while_stateContext do_while_state() throws RecognitionException {
		Do_while_stateContext _localctx = new Do_while_stateContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_do_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DO_WHILE_LOOP);
			setState(285);
			match(OPEN_BRE);
			setState(286);
			codeblock();
			setState(287);
			match(CLOSE_BRE);
			setState(288);
			match(WHILE_LOOP);
			setState(289);
			match(OPEN_PAR);
			setState(290);
			condition(0);
			setState(291);
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
		public TerminalNode FOR_LOOP() { return getToken(ExpCalculatorParser.FOR_LOOP, 0); }
		public TerminalNode OPEN_PAR() { return getToken(ExpCalculatorParser.OPEN_PAR, 0); }
		public Ass_stateContext ass_state() {
			return getRuleContext(Ass_stateContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode TERMINATOR() { return getToken(ExpCalculatorParser.TERMINATOR, 0); }
		public Ass_state_operatorContext ass_state_operator() {
			return getRuleContext(Ass_state_operatorContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(ExpCalculatorParser.CLOSE_PAR, 0); }
		public TerminalNode OPEN_BRE() { return getToken(ExpCalculatorParser.OPEN_BRE, 0); }
		public CodeblockContext codeblock() {
			return getRuleContext(CodeblockContext.class,0);
		}
		public TerminalNode CLOSE_BRE() { return getToken(ExpCalculatorParser.CLOSE_BRE, 0); }
		public For_stateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).enterFor_state(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpCalculatorListener ) ((ExpCalculatorListener)listener).exitFor_state(this);
		}
	}

	public final For_stateContext for_state() throws RecognitionException {
		For_stateContext _localctx = new For_stateContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_for_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(FOR_LOOP);
			setState(294);
			match(OPEN_PAR);
			setState(295);
			ass_state();
			setState(296);
			condition(0);
			setState(297);
			match(TERMINATOR);
			setState(298);
			ass_state_operator();
			setState(299);
			match(CLOSE_PAR);
			setState(300);
			match(OPEN_BRE);
			setState(301);
			codeblock();
			setState(302);
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
			return var_sempred((VarContext)_localctx, predIndex);
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 26:
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
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\39\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\3\7\3G\n\3\f\3\16\3J\13\3\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6a\n\6\f"+
		"\6\16\6d\13\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\t\3\t\3\t\7\t"+
		"s\n\t\f\t\16\tv\13\t\3\n\7\ny\n\n\f\n\16\n|\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u0085\n\13\3\f\3\f\5\f\u0089\n\f\3\f\3\f\3\r\3\r\5"+
		"\r\u008f\n\r\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u0097\n\16\3\16\3\16\3\16"+
		"\7\16\u009c\n\16\f\16\16\16\u009f\13\16\3\17\3\17\5\17\u00a3\n\17\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00ad\n\22\3\22\5\22\u00b0\n"+
		"\22\3\23\3\23\3\23\3\24\3\24\5\24\u00b7\n\24\3\25\3\25\3\25\5\25\u00bc"+
		"\n\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00c5\n\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\5\30\u00cd\n\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u00d5"+
		"\n\30\f\30\16\30\u00d8\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\5\31\u00e3\n\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32"+
		"\u00ee\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u00f5\n\32\3\33\3\33\3\33\5"+
		"\33\u00fa\n\33\3\34\3\34\5\34\u00fe\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0108\n\34\3\34\3\34\3\34\3\34\7\34\u010e\n\34\f\34\16"+
		"\34\u0111\13\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\2"+
		"\5\32.\66\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@\2\b\3\2\f\20\3\2\63\64\3\2#%\3\2!\"\3\2&+\3\2,-\u0135\2B\3\2\2\2"+
		"\4H\3\2\2\2\6K\3\2\2\2\bS\3\2\2\2\n\\\3\2\2\2\fe\3\2\2\2\16g\3\2\2\2\20"+
		"o\3\2\2\2\22z\3\2\2\2\24\u0084\3\2\2\2\26\u0086\3\2\2\2\30\u008c\3\2\2"+
		"\2\32\u0093\3\2\2\2\34\u00a2\3\2\2\2\36\u00a4\3\2\2\2 \u00a6\3\2\2\2\""+
		"\u00aa\3\2\2\2$\u00b1\3\2\2\2&\u00b6\3\2\2\2(\u00bb\3\2\2\2*\u00bd\3\2"+
		"\2\2,\u00c4\3\2\2\2.\u00cc\3\2\2\2\60\u00d9\3\2\2\2\62\u00f4\3\2\2\2\64"+
		"\u00f9\3\2\2\2\66\u0107\3\2\2\28\u0112\3\2\2\2:\u0114\3\2\2\2<\u0116\3"+
		"\2\2\2>\u011e\3\2\2\2@\u0127\3\2\2\2BC\5\4\3\2CD\5\6\4\2D\3\3\2\2\2EG"+
		"\5\b\5\2FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2I\5\3\2\2\2JH\3\2\2\2"+
		"KL\78\2\2LM\7\67\2\2MN\5\n\6\2NO\7\65\2\2OP\7\34\2\2PQ\5\22\n\2QR\7\34"+
		"\2\2R\7\3\2\2\2ST\5\34\17\2TU\7\61\2\2UV\7\67\2\2VW\5\n\6\2WX\7\65\2\2"+
		"XY\7\34\2\2YZ\5\22\n\2Z[\7\35\2\2[\t\3\2\2\2\\]\5\36\20\2]b\7\n\2\2^_"+
		"\7\62\2\2_a\5\n\6\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\13\3\2\2"+
		"\2db\3\2\2\2ef\5\16\b\2f\r\3\2\2\2gh\7\66\2\2hi\7\61\2\2ik\7\32\2\2jl"+
		"\5\20\t\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\33\2\2n\17\3\2\2\2ot\5&\24"+
		"\2pq\7\62\2\2qs\5\20\t\2rp\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\21\3"+
		"\2\2\2vt\3\2\2\2wy\5\24\13\2xw\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{"+
		"\23\3\2\2\2|z\3\2\2\2}\u0085\5\"\22\2~\u0085\5\26\f\2\177\u0085\5\60\31"+
		"\2\u0080\u0085\5<\37\2\u0081\u0085\5> \2\u0082\u0085\5@!\2\u0083\u0085"+
		"\5\f\7\2\u0084}\3\2\2\2\u0084~\3\2\2\2\u0084\177\3\2\2\2\u0084\u0080\3"+
		"\2\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\25\3\2\2\2\u0086\u0088\5\36\20\2\u0087\u0089\5 \21\2\u0088\u0087\3\2"+
		"\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\5\32\16\2\u008b"+
		"\27\3\2\2\2\u008c\u008e\7\60\2\2\u008d\u008f\5 \21\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\n\2\2\u0091\u0092"+
		"\5$\23\2\u0092\31\3\2\2\2\u0093\u0094\b\16\1\2\u0094\u0096\7\n\2\2\u0095"+
		"\u0097\5$\23\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009d\3\2"+
		"\2\2\u0098\u0099\f\4\2\2\u0099\u009a\7\62\2\2\u009a\u009c\5\32\16\5\u009b"+
		"\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\33\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a3\5\36\20\2\u00a1"+
		"\u00a3\7\21\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\35\3\2\2"+
		"\2\u00a4\u00a5\t\2\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8"+
		"\7\5\2\2\u00a8\u00a9\7/\2\2\u00a9!\3\2\2\2\u00aa\u00ac\7\n\2\2\u00ab\u00ad"+
		"\5 \21\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00b0\5$\23\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0#\3\2\2\2"+
		"\u00b1\u00b2\7\13\2\2\u00b2\u00b3\5&\24\2\u00b3%\3\2\2\2\u00b4\u00b7\5"+
		"\64\33\2\u00b5\u00b7\5\66\34\2\u00b6\u00b4\3\2\2\2\u00b6\u00b5\3\2\2\2"+
		"\u00b7\'\3\2\2\2\u00b8\u00bc\7\n\2\2\u00b9\u00ba\7\n\2\2\u00ba\u00bc\5"+
		"*\26\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc)\3\2\2\2\u00bd\u00be"+
		"\t\3\2\2\u00be+\3\2\2\2\u00bf\u00c5\7\5\2\2\u00c0\u00c5\7\6\2\2\u00c1"+
		"\u00c5\7\b\2\2\u00c2\u00c5\5\16\b\2\u00c3\u00c5\7\n\2\2\u00c4\u00bf\3"+
		"\2\2\2\u00c4\u00c0\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c3\3\2\2\2\u00c5-\3\2\2\2\u00c6\u00c7\b\30\1\2\u00c7\u00c8\7\32\2"+
		"\2\u00c8\u00c9\5.\30\2\u00c9\u00ca\7\33\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00cd\5,\27\2\u00cc\u00c6\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00d6\3\2"+
		"\2\2\u00ce\u00cf\f\5\2\2\u00cf\u00d0\t\4\2\2\u00d0\u00d5\5.\30\6\u00d1"+
		"\u00d2\f\4\2\2\u00d2\u00d3\t\5\2\2\u00d3\u00d5\5.\30\5\u00d4\u00ce\3\2"+
		"\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7/\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da\7\23\2\2"+
		"\u00da\u00db\7\32\2\2\u00db\u00dc\5\66\34\2\u00dc\u00dd\7\33\2\2\u00dd"+
		"\u00de\7\26\2\2\u00de\u00df\7\34\2\2\u00df\u00e0\5\22\n\2\u00e0\u00e2"+
		"\7\35\2\2\u00e1\u00e3\5\62\32\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2"+
		"\2\u00e3\61\3\2\2\2\u00e4\u00e5\7\24\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7"+
		"\5\66\34\2\u00e7\u00e8\7\33\2\2\u00e8\u00e9\7\26\2\2\u00e9\u00ea\7\34"+
		"\2\2\u00ea\u00eb\5\22\n\2\u00eb\u00ed\7\35\2\2\u00ec\u00ee\5\62\32\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f5\3\2\2\2\u00ef\u00f0\7\25"+
		"\2\2\u00f0\u00f1\7\34\2\2\u00f1\u00f2\5\22\n\2\u00f2\u00f3\7\35\2\2\u00f3"+
		"\u00f5\3\2\2\2\u00f4\u00e4\3\2\2\2\u00f4\u00ef\3\2\2\2\u00f5\63\3\2\2"+
		"\2\u00f6\u00fa\5.\30\2\u00f7\u00fa\7\7\2\2\u00f8\u00fa\7\t\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00f8\3\2\2\2\u00fa\65\3\2\2\2\u00fb"+
		"\u00fd\b\34\1\2\u00fc\u00fe\7.\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2"+
		"\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\7\32\2\2\u0100\u0101\5\66\34\2\u0101"+
		"\u0102\7\33\2\2\u0102\u0108\3\2\2\2\u0103\u0104\5\64\33\2\u0104\u0105"+
		"\58\35\2\u0105\u0106\5\64\33\2\u0106\u0108\3\2\2\2\u0107\u00fb\3\2\2\2"+
		"\u0107\u0103\3\2\2\2\u0108\u010f\3\2\2\2\u0109\u010a\f\4\2\2\u010a\u010b"+
		"\5:\36\2\u010b\u010c\5\66\34\5\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\67"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0113\t\6\2\2\u01139\3\2\2\2\u0114"+
		"\u0115\t\7\2\2\u0115;\3\2\2\2\u0116\u0117\7\30\2\2\u0117\u0118\7\32\2"+
		"\2\u0118\u0119\5\66\34\2\u0119\u011a\7\33\2\2\u011a\u011b\7\34\2\2\u011b"+
		"\u011c\5\22\n\2\u011c\u011d\7\35\2\2\u011d=\3\2\2\2\u011e\u011f\7\31\2"+
		"\2\u011f\u0120\7\34\2\2\u0120\u0121\5\22\n\2\u0121\u0122\7\35\2\2\u0122"+
		"\u0123\7\30\2\2\u0123\u0124\7\32\2\2\u0124\u0125\5\66\34\2\u0125\u0126"+
		"\7\33\2\2\u0126?\3\2\2\2\u0127\u0128\7\27\2\2\u0128\u0129\7\32\2\2\u0129"+
		"\u012a\5\"\22\2\u012a\u012b\5\66\34\2\u012b\u012c\7\22\2\2\u012c\u012d"+
		"\5(\25\2\u012d\u012e\7\33\2\2\u012e\u012f\7\34\2\2\u012f\u0130\5\22\n"+
		"\2\u0130\u0131\7\35\2\2\u0131A\3\2\2\2\34Hbktz\u0084\u0088\u008e\u0096"+
		"\u009d\u00a2\u00ac\u00af\u00b6\u00bb\u00c4\u00cc\u00d4\u00d6\u00e2\u00ed"+
		"\u00f4\u00f9\u00fd\u0107\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}