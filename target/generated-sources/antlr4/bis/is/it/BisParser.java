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
		FUNC_CALL=9, VAR_IDENTIFIER=10, ASS_OPERATOR=11, INPUT=12, OUTPUT=13, 
		OUTPUTNL=14, INT_TYPE=15, FLOAT_TYPE=16, STRING_TYPE=17, CHAR_TYPE=18, 
		BOOLEAN_TYPE=19, VOID_TYPE=20, TERMINATOR=21, IF_CONDITIONAL=22, ELSE_IF_CONDITIONAL=23, 
		ELSE_CONDITIONAL=24, THEN_CONDITIONAL=25, FOR_LOOP=26, WHILE_LOOP=27, 
		DO_WHILE_LOOP=28, OPEN_PAR=29, CLOSE_PAR=30, OPEN_BRE=31, CLOSE_BRE=32, 
		OPEN_BRT=33, CLOSE_BRT=34, COMMENT_BLOCK=35, ADD_OPERATOR=36, SUBTRACT_OPERATOR=37, 
		MULTIPLY_OPERATOR=38, DIVIDE_OPERATOR=39, MODULO_OPERATOR=40, LESS_THAN_OPERATOR=41, 
		LESS_THAN_EQUAL_TO_OPERATOR=42, GREATER_THAN_OPERATOR=43, GREATER_THAN_EQUAL_TO_OPERATOR=44, 
		EQUAL_TO_OPERATOR=45, NOT_EQUAL_TO_OPERATOR=46, AND_OPERATOR=47, OR_OPERATOR=48, 
		NOT_OPERATOR=49, ARRAY_DELIM=50, CONSTANT=51, FUNC_IDENTIFIER=52, COMMA=53, 
		INCREMENT_OPERATOR=54, DECREMENT_OPERATOR=55, FUNC_DEFINITION=56, PARAMS_KEYWORD=57, 
		MAIN_FUNC=58, RETURN=59;
	public static final int
		RULE_start = 0, RULE_func_define = 1, RULE_main_func = 2, RULE_scan = 3, 
		RULE_print = 4, RULE_printnl = 5, RULE_func = 6, RULE_params = 7, RULE_return_state = 8, 
		RULE_func_call_state = 9, RULE_func_call = 10, RULE_codeblock = 11, RULE_statement = 12, 
		RULE_vardec_state = 13, RULE_consvardec_state = 14, RULE_vardec = 15, 
		RULE_data_type = 16, RULE_arr = 17, RULE_ass_state = 18, RULE_assignment = 19, 
		RULE_val = 20, RULE_ass_state_operator = 21, RULE_ass_operator = 22, RULE_unary_op = 23, 
		RULE_num_val = 24, RULE_expr = 25, RULE_stringParty = 26, RULE_cond_state = 27, 
		RULE_cond_block = 28, RULE_cond_val = 29, RULE_condition = 30, RULE_while_state = 31, 
		RULE_do_while_state = 32, RULE_for_state = 33;
	public static final String[] ruleNames = {
		"start", "func_define", "main_func", "scan", "print", "printnl", "func", 
		"params", "return_state", "func_call_state", "func_call", "codeblock", 
		"statement", "vardec_state", "consvardec_state", "vardec", "data_type", 
		"arr", "ass_state", "assignment", "val", "ass_state_operator", "ass_operator", 
		"unary_op", "num_val", "expr", "stringParty", "cond_state", "cond_block", 
		"cond_val", "condition", "while_state", "do_while_state", "for_state"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'tawaga'", null, 
		"'='", "'basaha'", "'suwata'", "'suwataBL'", "'numero'", "'lutaw'", "'pisi'", 
		"'letra'", "'tinoodba'", "'wala'", "';'", "'kung'", "'kungdili'", "'kungwalagyud'", 
		"'di'", "'para'", "'habang'", "'buhata'", "'('", "')'", "'{'", "'}'", 
		"'['", "']'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'<'", "'<='", 
		"'>'", "'>='", "'=='", "'<>'", "'ug'", "'o'", "'dili'", "'$'", "'hantodhantod'", 
		null, "','", "'++'", "'--'", "'>>>'", "'>>'", "'sugod_diri'", "'ibalik'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NL", "WS", "EXPONENT", "DIGIT", "FLOAT", "STRING", "CHAR", "BOOLEAN", 
		"FUNC_CALL", "VAR_IDENTIFIER", "ASS_OPERATOR", "INPUT", "OUTPUT", "OUTPUTNL", 
		"INT_TYPE", "FLOAT_TYPE", "STRING_TYPE", "CHAR_TYPE", "BOOLEAN_TYPE", 
		"VOID_TYPE", "TERMINATOR", "IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", 
		"THEN_CONDITIONAL", "FOR_LOOP", "WHILE_LOOP", "DO_WHILE_LOOP", "OPEN_PAR", 
		"CLOSE_PAR", "OPEN_BRE", "CLOSE_BRE", "OPEN_BRT", "CLOSE_BRT", "COMMENT_BLOCK", 
		"ADD_OPERATOR", "SUBTRACT_OPERATOR", "MULTIPLY_OPERATOR", "DIVIDE_OPERATOR", 
		"MODULO_OPERATOR", "LESS_THAN_OPERATOR", "LESS_THAN_EQUAL_TO_OPERATOR", 
		"GREATER_THAN_OPERATOR", "GREATER_THAN_EQUAL_TO_OPERATOR", "EQUAL_TO_OPERATOR", 
		"NOT_EQUAL_TO_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", "NOT_OPERATOR", 
		"ARRAY_DELIM", "CONSTANT", "FUNC_IDENTIFIER", "COMMA", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "FUNC_DEFINITION", "PARAMS_KEYWORD", "MAIN_FUNC", 
		"RETURN"
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

	public static class ScanContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(BisParser.INPUT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VAR_IDENTIFIER() { return getToken(BisParser.VAR_IDENTIFIER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public ScanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterScan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitScan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitScan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanContext scan() throws RecognitionException {
		ScanContext _localctx = new ScanContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INPUT);
			setState(85);
			match(OPEN_PAR);
			setState(86);
			data_type();
			setState(87);
			match(VAR_IDENTIFIER);
			setState(88);
			match(CLOSE_PAR);
			setState(89);
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(BisParser.OUTPUT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public StringPartyContext stringParty() {
			return getRuleContext(StringPartyContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(OUTPUT);
			setState(92);
			match(OPEN_PAR);
			setState(93);
			stringParty(0);
			setState(94);
			match(CLOSE_PAR);
			setState(95);
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

	public static class PrintnlContext extends ParserRuleContext {
		public TerminalNode OUTPUTNL() { return getToken(BisParser.OUTPUTNL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(BisParser.OPEN_PAR, 0); }
		public StringPartyContext stringParty() {
			return getRuleContext(StringPartyContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(BisParser.CLOSE_PAR, 0); }
		public TerminalNode TERMINATOR() { return getToken(BisParser.TERMINATOR, 0); }
		public PrintnlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printnl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterPrintnl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitPrintnl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitPrintnl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintnlContext printnl() throws RecognitionException {
		PrintnlContext _localctx = new PrintnlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_printnl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(OUTPUTNL);
			setState(98);
			match(OPEN_PAR);
			setState(99);
			stringParty(0);
			setState(100);
			match(CLOSE_PAR);
			setState(101);
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

	public static class FuncContext extends ParserRuleContext {
		public TerminalNode VOID_TYPE() { return getToken(BisParser.VOID_TYPE, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(BisParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(BisParser.COMMA, i);
		}
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
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
		enterRule(_localctx, 12, RULE_func);
		int _la;
		try {
			setState(140);
			switch (_input.LA(1)) {
			case VOID_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(VOID_TYPE);
				setState(104);
				match(FUNC_IDENTIFIER);
				setState(105);
				match(PARAMS_KEYWORD);
				setState(114);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
					{
					setState(106);
					params();
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(107);
						match(COMMA);
						setState(108);
						params();
						}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(116);
				match(FUNC_DEFINITION);
				setState(117);
				match(OPEN_BRE);
				setState(118);
				codeblock();
				setState(119);
				match(CLOSE_BRE);
				}
				break;
			case INT_TYPE:
			case FLOAT_TYPE:
			case STRING_TYPE:
			case CHAR_TYPE:
			case BOOLEAN_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				data_type();
				setState(122);
				match(FUNC_IDENTIFIER);
				setState(123);
				match(PARAMS_KEYWORD);
				setState(132);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT_TYPE) | (1L << FLOAT_TYPE) | (1L << STRING_TYPE) | (1L << CHAR_TYPE) | (1L << BOOLEAN_TYPE))) != 0)) {
					{
					setState(124);
					params();
					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(125);
						match(COMMA);
						setState(126);
						params();
						}
						}
						setState(131);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(134);
				match(FUNC_DEFINITION);
				setState(135);
				match(OPEN_BRE);
				setState(136);
				codeblock();
				setState(137);
				return_state();
				setState(138);
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
		enterRule(_localctx, 14, RULE_params);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			data_type();
			setState(143);
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
		enterRule(_localctx, 16, RULE_return_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(RETURN);
			setState(146);
			val();
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
		enterRule(_localctx, 18, RULE_func_call_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			func_call();
			setState(150);
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
		enterRule(_localctx, 20, RULE_func_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(FUNC_CALL);
			setState(153);
			match(FUNC_IDENTIFIER);
			setState(154);
			match(OPEN_PAR);
			setState(163);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DIGIT) | (1L << FLOAT) | (1L << STRING) | (1L << CHAR) | (1L << BOOLEAN) | (1L << FUNC_CALL) | (1L << VAR_IDENTIFIER) | (1L << OPEN_PAR) | (1L << ADD_OPERATOR) | (1L << SUBTRACT_OPERATOR) | (1L << NOT_OPERATOR))) != 0)) {
				{
				setState(155);
				val();
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(156);
					match(COMMA);
					setState(157);
					val();
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(165);
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
		enterRule(_localctx, 22, RULE_codeblock);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					statement();
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
		public ScanContext scan() {
			return getRuleContext(ScanContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public Return_stateContext return_state() {
			return getRuleContext(Return_stateContext.class,0);
		}
		public PrintnlContext printnl() {
			return getRuleContext(PrintnlContext.class,0);
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
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(185);
			switch (_input.LA(1)) {
			case VAR_IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
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
				setState(174);
				vardec_state();
				}
				break;
			case CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				consvardec_state();
				}
				break;
			case IF_CONDITIONAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(176);
				cond_state();
				}
				break;
			case WHILE_LOOP:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				while_state();
				}
				break;
			case DO_WHILE_LOOP:
				enterOuterAlt(_localctx, 6);
				{
				setState(178);
				do_while_state();
				}
				break;
			case FOR_LOOP:
				enterOuterAlt(_localctx, 7);
				{
				setState(179);
				for_state();
				}
				break;
			case FUNC_CALL:
				enterOuterAlt(_localctx, 8);
				{
				setState(180);
				func_call_state();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 9);
				{
				setState(181);
				scan();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 10);
				{
				setState(182);
				print();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 11);
				{
				setState(183);
				return_state();
				}
				break;
			case OUTPUTNL:
				enterOuterAlt(_localctx, 12);
				{
				setState(184);
				printnl();
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
		enterRule(_localctx, 26, RULE_vardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			vardec(0);
			setState(188);
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
		enterRule(_localctx, 28, RULE_consvardec_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CONSTANT);
			setState(191);
			data_type();
			setState(192);
			match(VAR_IDENTIFIER);
			setState(193);
			assignment();
			setState(194);
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
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_vardec, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new SingleVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(197);
				data_type();
				setState(198);
				match(VAR_IDENTIFIER);
				setState(200);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(199);
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
				setState(202);
				data_type();
				setState(203);
				arr();
				setState(204);
				match(VAR_IDENTIFIER);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultipleVarContext(new VardecContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_vardec);
					setState(208);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(209);
					match(COMMA);
					setState(210);
					vardec(4);
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 32, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
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
		enterRule(_localctx, 34, RULE_arr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(ARRAY_DELIM);
			setState(219);
			match(DIGIT);
			setState(220);
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
		enterRule(_localctx, 36, RULE_ass_state);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new NormalAssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(VAR_IDENTIFIER);
				setState(224);
				_la = _input.LA(1);
				if (_la==ARRAY_DELIM) {
					{
					setState(223);
					arr();
					}
				}

				setState(226);
				assignment();
				setState(227);
				match(TERMINATOR);
				}
				break;
			case 2:
				_localctx = new OperatorAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				ass_state_operator();
				setState(230);
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
		enterRule(_localctx, 38, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(ASS_OPERATOR);
			setState(235);
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
		enterRule(_localctx, 40, RULE_val);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(239);
				match(STRING);
				setState(240);
				match(ADD_OPERATOR);
				setState(241);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(STRING);
				setState(243);
				match(ADD_OPERATOR);
				setState(244);
				expr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(245);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(246);
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
		enterRule(_localctx, 42, RULE_ass_state_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(VAR_IDENTIFIER);
			setState(251);
			_la = _input.LA(1);
			if (_la==ARRAY_DELIM) {
				{
				setState(250);
				arr();
				}
			}

			setState(253);
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
		enterRule(_localctx, 44, RULE_ass_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
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
		enterRule(_localctx, 46, RULE_unary_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 48, RULE_num_val);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(259);
					unary_op();
					}
				}

				setState(262);
				match(DIGIT);
				}
				break;
			case 2:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				_la = _input.LA(1);
				if (_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) {
					{
					setState(263);
					unary_op();
					}
				}

				setState(266);
				match(FLOAT);
				setState(268);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(267);
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
				setState(270);
				match(CHAR);
				}
				break;
			case 4:
				_localctx = new FunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				func_call();
				}
				break;
			case 5:
				_localctx = new ArrayIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(272);
				match(VAR_IDENTIFIER);
				setState(273);
				arr();
				}
				break;
			case 6:
				_localctx = new VarIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(278);
				match(OPEN_PAR);
				setState(279);
				expr(0);
				setState(280);
				match(CLOSE_PAR);
				}
				break;
			case DIGIT:
			case FLOAT:
			case CHAR:
			case FUNC_CALL:
			case VAR_IDENTIFIER:
			case ADD_OPERATOR:
			case SUBTRACT_OPERATOR:
				{
				_localctx = new NumberValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(282);
				num_val();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(291);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new MultOrDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULTIPLY_OPERATOR) | (1L << DIVIDE_OPERATOR) | (1L << MODULO_OPERATOR))) != 0)) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(287);
						expr(4);
						}
						break;
					case 2:
						{
						_localctx = new AddOrSubtractContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(288);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(289);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUBTRACT_OPERATOR) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(290);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(295);
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

	public static class StringPartyContext extends ParserRuleContext {
		public StringPartyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringParty; }
	 
		public StringPartyContext() { }
		public void copyFrom(StringPartyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringConcatStringContext extends StringPartyContext {
		public List<StringPartyContext> stringParty() {
			return getRuleContexts(StringPartyContext.class);
		}
		public StringPartyContext stringParty(int i) {
			return getRuleContext(StringPartyContext.class,i);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public StringConcatStringContext(StringPartyContext ctx) { copyFrom(ctx); }
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
	public static class SoloerStringContext extends StringPartyContext {
		public TerminalNode STRING() { return getToken(BisParser.STRING, 0); }
		public SoloerStringContext(StringPartyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterSoloerString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitSoloerString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitSoloerString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringConcatExprContext extends StringPartyContext {
		public StringPartyContext stringParty() {
			return getRuleContext(StringPartyContext.class,0);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringConcatExprContext(StringPartyContext ctx) { copyFrom(ctx); }
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
	public static class StringConcatFuncCallContext extends StringPartyContext {
		public StringPartyContext stringParty() {
			return getRuleContext(StringPartyContext.class,0);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(BisParser.ADD_OPERATOR, 0); }
		public Func_callContext func_call() {
			return getRuleContext(Func_callContext.class,0);
		}
		public StringConcatFuncCallContext(StringPartyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStringConcatFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStringConcatFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStringConcatFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringPartyContext stringParty() throws RecognitionException {
		return stringParty(0);
	}

	private StringPartyContext stringParty(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StringPartyContext _localctx = new StringPartyContext(_ctx, _parentState);
		StringPartyContext _prevctx = _localctx;
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_stringParty, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SoloerStringContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(297);
			match(STRING);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new StringConcatStringContext(new StringPartyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringParty);
						setState(299);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(300);
						match(ADD_OPERATOR);
						setState(301);
						stringParty(4);
						}
						break;
					case 2:
						{
						_localctx = new StringConcatExprContext(new StringPartyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringParty);
						setState(302);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(303);
						match(ADD_OPERATOR);
						setState(304);
						expr(0);
						}
						break;
					case 3:
						{
						_localctx = new StringConcatFuncCallContext(new StringPartyContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_stringParty);
						setState(305);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(306);
						match(ADD_OPERATOR);
						setState(307);
						func_call();
						}
						break;
					}
					} 
				}
				setState(312);
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
		enterRule(_localctx, 54, RULE_cond_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(IF_CONDITIONAL);
			setState(314);
			cond_block();
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSE_IF_CONDITIONAL) {
				{
				{
				setState(315);
				match(ELSE_IF_CONDITIONAL);
				setState(316);
				cond_block();
				}
				}
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(327);
			_la = _input.LA(1);
			if (_la==ELSE_CONDITIONAL) {
				{
				setState(322);
				match(ELSE_CONDITIONAL);
				setState(323);
				match(OPEN_BRE);
				setState(324);
				codeblock();
				setState(325);
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
		enterRule(_localctx, 56, RULE_cond_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPEN_PAR);
			setState(330);
			condition(0);
			setState(331);
			match(CLOSE_PAR);
			setState(332);
			match(THEN_CONDITIONAL);
			setState(333);
			match(OPEN_BRE);
			setState(334);
			codeblock();
			setState(335);
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
		enterRule(_localctx, 58, RULE_cond_val);
		try {
			setState(340);
			switch (_input.LA(1)) {
			case DIGIT:
			case FLOAT:
			case CHAR:
			case FUNC_CALL:
			case VAR_IDENTIFIER:
			case OPEN_PAR:
			case ADD_OPERATOR:
			case SUBTRACT_OPERATOR:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				expr(0);
				}
				break;
			case STRING:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(STRING);
				}
				break;
			case BOOLEAN:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
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
	public static class StringVsStringContext extends ConditionContext {
		public List<StringPartyContext> stringParty() {
			return getRuleContexts(StringPartyContext.class);
		}
		public StringPartyContext stringParty(int i) {
			return getRuleContext(StringPartyContext.class,i);
		}
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(BisParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(BisParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.LESS_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_EQUAL_TO_OPERATOR() { return getToken(BisParser.GREATER_THAN_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_TO_OPERATOR() { return getToken(BisParser.NOT_EQUAL_TO_OPERATOR, 0); }
		public TerminalNode EQUAL_TO_OPERATOR() { return getToken(BisParser.EQUAL_TO_OPERATOR, 0); }
		public StringVsStringContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).enterStringVsString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BisListener ) ((BisListener)listener).exitStringVsString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BisVisitor ) return ((BisVisitor<? extends T>)visitor).visitStringVsString(this);
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
		int _startState = 60;
		enterRecursionRule(_localctx, 60, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				_localctx = new ParenConditionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(344);
				_la = _input.LA(1);
				if (_la==NOT_OPERATOR) {
					{
					setState(343);
					match(NOT_OPERATOR);
					}
				}

				setState(346);
				match(OPEN_PAR);
				setState(347);
				condition(0);
				setState(348);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new ConditionOperatorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(350);
				cond_val();
				setState(351);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << NOT_EQUAL_TO_OPERATOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(352);
				cond_val();
				}
				break;
			case 3:
				{
				_localctx = new StringVsStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				stringParty(0);
				setState(355);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN_OPERATOR) | (1L << LESS_THAN_EQUAL_TO_OPERATOR) | (1L << GREATER_THAN_OPERATOR) | (1L << GREATER_THAN_EQUAL_TO_OPERATOR) | (1L << EQUAL_TO_OPERATOR) | (1L << NOT_EQUAL_TO_OPERATOR))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(356);
				stringParty(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(368);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(366);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new AndConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(360);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(361);
						match(AND_OPERATOR);
						setState(362);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new OrConditionContext(new ConditionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(363);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(364);
						match(OR_OPERATOR);
						setState(365);
						condition(4);
						}
						break;
					}
					} 
				}
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 62, RULE_while_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			match(WHILE_LOOP);
			setState(372);
			match(OPEN_PAR);
			setState(373);
			condition(0);
			setState(374);
			match(CLOSE_PAR);
			setState(375);
			match(OPEN_BRE);
			setState(376);
			codeblock();
			setState(377);
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
			setState(379);
			match(DO_WHILE_LOOP);
			setState(380);
			match(OPEN_BRE);
			setState(381);
			codeblock();
			setState(382);
			match(CLOSE_BRE);
			setState(383);
			match(WHILE_LOOP);
			setState(384);
			match(OPEN_PAR);
			setState(385);
			condition(0);
			setState(386);
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
			setState(388);
			match(FOR_LOOP);
			setState(389);
			match(OPEN_PAR);
			setState(390);
			ass_state();
			setState(391);
			condition(0);
			setState(392);
			match(TERMINATOR);
			setState(393);
			ass_state_operator();
			setState(394);
			match(CLOSE_PAR);
			setState(395);
			match(OPEN_BRE);
			setState(396);
			codeblock();
			setState(397);
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
		case 15:
			return vardec_sempred((VardecContext)_localctx, predIndex);
		case 25:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 26:
			return stringParty_sempred((StringPartyContext)_localctx, predIndex);
		case 30:
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
	private boolean stringParty_sempred(StringPartyContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3=\u0192\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\2\3\2\3\3\7\3L\n\3\f\3\16\3O\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b"+
		"\5\bu\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u0082\n\b\f"+
		"\b\16\b\u0085\13\b\5\b\u0087\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u008f\n\b"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00a1\n\f\f\f\16\f\u00a4\13\f\5\f\u00a6\n\f\3\f\3\f\3\r\7\r\u00ab\n"+
		"\r\f\r\16\r\u00ae\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\5\16\u00bc\n\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u00cb\n\21\3\21\3\21\3\21\3\21\5\21\u00d1"+
		"\n\21\3\21\3\21\3\21\7\21\u00d6\n\21\f\21\16\21\u00d9\13\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\5\24\u00e3\n\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00eb\n\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\5\26\u00fa\n\26\3\27\3\27\5\27\u00fe\n\27\3\27\3\27\3"+
		"\30\3\30\3\31\3\31\3\32\5\32\u0107\n\32\3\32\3\32\5\32\u010b\n\32\3\32"+
		"\3\32\5\32\u010f\n\32\3\32\3\32\3\32\3\32\3\32\5\32\u0116\n\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u011e\n\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\7\33\u0126\n\33\f\33\16\33\u0129\13\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0137\n\34\f\34\16\34\u013a\13\34"+
		"\3\35\3\35\3\35\3\35\7\35\u0140\n\35\f\35\16\35\u0143\13\35\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u014a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\37\3\37\3\37\5\37\u0157\n\37\3 \3 \5 \u015b\n \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \5 \u0169\n \3 \3 \3 \3 \3 \3 \7 \u0171\n \f \16 \u0174"+
		"\13 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\2\6 \64\66>$\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\7\3\2\21\25\3\289\3\2&\'\3"+
		"\2(*\3\2+\60\u01a5\2F\3\2\2\2\4M\3\2\2\2\6P\3\2\2\2\bV\3\2\2\2\n]\3\2"+
		"\2\2\fc\3\2\2\2\16\u008e\3\2\2\2\20\u0090\3\2\2\2\22\u0093\3\2\2\2\24"+
		"\u0097\3\2\2\2\26\u009a\3\2\2\2\30\u00ac\3\2\2\2\32\u00bb\3\2\2\2\34\u00bd"+
		"\3\2\2\2\36\u00c0\3\2\2\2 \u00d0\3\2\2\2\"\u00da\3\2\2\2$\u00dc\3\2\2"+
		"\2&\u00ea\3\2\2\2(\u00ec\3\2\2\2*\u00f9\3\2\2\2,\u00fb\3\2\2\2.\u0101"+
		"\3\2\2\2\60\u0103\3\2\2\2\62\u0115\3\2\2\2\64\u011d\3\2\2\2\66\u012a\3"+
		"\2\2\28\u013b\3\2\2\2:\u014b\3\2\2\2<\u0156\3\2\2\2>\u0168\3\2\2\2@\u0175"+
		"\3\2\2\2B\u017d\3\2\2\2D\u0186\3\2\2\2FG\5\4\3\2GH\5\6\4\2HI\7\2\2\3I"+
		"\3\3\2\2\2JL\5\16\b\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\5\3\2\2"+
		"\2OM\3\2\2\2PQ\7<\2\2QR\7:\2\2RS\7!\2\2ST\5\30\r\2TU\7\"\2\2U\7\3\2\2"+
		"\2VW\7\16\2\2WX\7\37\2\2XY\5\"\22\2YZ\7\f\2\2Z[\7 \2\2[\\\7\27\2\2\\\t"+
		"\3\2\2\2]^\7\17\2\2^_\7\37\2\2_`\5\66\34\2`a\7 \2\2ab\7\27\2\2b\13\3\2"+
		"\2\2cd\7\20\2\2de\7\37\2\2ef\5\66\34\2fg\7 \2\2gh\7\27\2\2h\r\3\2\2\2"+
		"ij\7\26\2\2jk\7\66\2\2kt\7;\2\2lq\5\20\t\2mn\7\67\2\2np\5\20\t\2om\3\2"+
		"\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2"+
		"\2\2uv\3\2\2\2vw\7:\2\2wx\7!\2\2xy\5\30\r\2yz\7\"\2\2z\u008f\3\2\2\2{"+
		"|\5\"\22\2|}\7\66\2\2}\u0086\7;\2\2~\u0083\5\20\t\2\177\u0080\7\67\2\2"+
		"\u0080\u0082\5\20\t\2\u0081\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0086"+
		"~\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7:\2\2\u0089"+
		"\u008a\7!\2\2\u008a\u008b\5\30\r\2\u008b\u008c\5\22\n\2\u008c\u008d\7"+
		"\"\2\2\u008d\u008f\3\2\2\2\u008ei\3\2\2\2\u008e{\3\2\2\2\u008f\17\3\2"+
		"\2\2\u0090\u0091\5\"\22\2\u0091\u0092\7\f\2\2\u0092\21\3\2\2\2\u0093\u0094"+
		"\7=\2\2\u0094\u0095\5*\26\2\u0095\u0096\7\27\2\2\u0096\23\3\2\2\2\u0097"+
		"\u0098\5\26\f\2\u0098\u0099\7\27\2\2\u0099\25\3\2\2\2\u009a\u009b\7\13"+
		"\2\2\u009b\u009c\7\66\2\2\u009c\u00a5\7\37\2\2\u009d\u00a2\5*\26\2\u009e"+
		"\u009f\7\67\2\2\u009f\u00a1\5*\26\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3"+
		"\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\7 \2\2\u00a8\27\3\2\2\2\u00a9\u00ab\5\32\16\2\u00aa\u00a9"+
		"\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\31\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00bc\5&\24\2\u00b0\u00bc\5\34\17"+
		"\2\u00b1\u00bc\5\36\20\2\u00b2\u00bc\58\35\2\u00b3\u00bc\5@!\2\u00b4\u00bc"+
		"\5B\"\2\u00b5\u00bc\5D#\2\u00b6\u00bc\5\24\13\2\u00b7\u00bc\5\b\5\2\u00b8"+
		"\u00bc\5\n\6\2\u00b9\u00bc\5\22\n\2\u00ba\u00bc\5\f\7\2\u00bb\u00af\3"+
		"\2\2\2\u00bb\u00b0\3\2\2\2\u00bb\u00b1\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb"+
		"\u00b3\3\2\2\2\u00bb\u00b4\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb\u00b6\3\2"+
		"\2\2\u00bb\u00b7\3\2\2\2\u00bb\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\33\3\2\2\2\u00bd\u00be\5 \21\2\u00be\u00bf\7\27\2"+
		"\2\u00bf\35\3\2\2\2\u00c0\u00c1\7\65\2\2\u00c1\u00c2\5\"\22\2\u00c2\u00c3"+
		"\7\f\2\2\u00c3\u00c4\5(\25\2\u00c4\u00c5\7\27\2\2\u00c5\37\3\2\2\2\u00c6"+
		"\u00c7\b\21\1\2\u00c7\u00c8\5\"\22\2\u00c8\u00ca\7\f\2\2\u00c9\u00cb\5"+
		"(\25\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc"+
		"\u00cd\5\"\22\2\u00cd\u00ce\5$\23\2\u00ce\u00cf\7\f\2\2\u00cf\u00d1\3"+
		"\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1\u00d7\3\2\2\2\u00d2"+
		"\u00d3\f\5\2\2\u00d3\u00d4\7\67\2\2\u00d4\u00d6\5 \21\6\u00d5\u00d2\3"+
		"\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"!\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\t\2\2\2\u00db#\3\2\2\2\u00dc"+
		"\u00dd\7\64\2\2\u00dd\u00de\7\6\2\2\u00de\u00df\7\64\2\2\u00df%\3\2\2"+
		"\2\u00e0\u00e2\7\f\2\2\u00e1\u00e3\5$\23\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\7\27\2\2"+
		"\u00e6\u00eb\3\2\2\2\u00e7\u00e8\5,\27\2\u00e8\u00e9\7\27\2\2\u00e9\u00eb"+
		"\3\2\2\2\u00ea\u00e0\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\'\3\2\2\2\u00ec"+
		"\u00ed\7\r\2\2\u00ed\u00ee\5*\26\2\u00ee)\3\2\2\2\u00ef\u00fa\5\64\33"+
		"\2\u00f0\u00fa\7\b\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7&\2\2\u00f3\u00fa"+
		"\7\b\2\2\u00f4\u00f5\7\b\2\2\u00f5\u00f6\7&\2\2\u00f6\u00fa\5\64\33\2"+
		"\u00f7\u00fa\7\n\2\2\u00f8\u00fa\5> \2\u00f9\u00ef\3\2\2\2\u00f9\u00f0"+
		"\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f4\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00f8\3\2\2\2\u00fa+\3\2\2\2\u00fb\u00fd\7\f\2\2\u00fc\u00fe\5$\23\2"+
		"\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100"+
		"\5.\30\2\u0100-\3\2\2\2\u0101\u0102\t\3\2\2\u0102/\3\2\2\2\u0103\u0104"+
		"\t\4\2\2\u0104\61\3\2\2\2\u0105\u0107\5\60\31\2\u0106\u0105\3\2\2\2\u0106"+
		"\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u0116\7\6\2\2\u0109\u010b\5\60"+
		"\31\2\u010a\u0109\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010e\7\7\2\2\u010d\u010f\7\5\2\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0116\3\2\2\2\u0110\u0116\7\t\2\2\u0111\u0116\5\26\f\2\u0112"+
		"\u0113\7\f\2\2\u0113\u0116\5$\23\2\u0114\u0116\7\f\2\2\u0115\u0106\3\2"+
		"\2\2\u0115\u010a\3\2\2\2\u0115\u0110\3\2\2\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0112\3\2\2\2\u0115\u0114\3\2\2\2\u0116\63\3\2\2\2\u0117\u0118\b\33\1"+
		"\2\u0118\u0119\7\37\2\2\u0119\u011a\5\64\33\2\u011a\u011b\7 \2\2\u011b"+
		"\u011e\3\2\2\2\u011c\u011e\5\62\32\2\u011d\u0117\3\2\2\2\u011d\u011c\3"+
		"\2\2\2\u011e\u0127\3\2\2\2\u011f\u0120\f\5\2\2\u0120\u0121\t\5\2\2\u0121"+
		"\u0126\5\64\33\6\u0122\u0123\f\4\2\2\u0123\u0124\t\4\2\2\u0124\u0126\5"+
		"\64\33\5\u0125\u011f\3\2\2\2\u0125\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127"+
		"\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\65\3\2\2\2\u0129\u0127\3\2\2"+
		"\2\u012a\u012b\b\34\1\2\u012b\u012c\7\b\2\2\u012c\u0138\3\2\2\2\u012d"+
		"\u012e\f\5\2\2\u012e\u012f\7&\2\2\u012f\u0137\5\66\34\6\u0130\u0131\f"+
		"\4\2\2\u0131\u0132\7&\2\2\u0132\u0137\5\64\33\2\u0133\u0134\f\3\2\2\u0134"+
		"\u0135\7&\2\2\u0135\u0137\5\26\f\2\u0136\u012d\3\2\2\2\u0136\u0130\3\2"+
		"\2\2\u0136\u0133\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\67\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u013c\7\30\2"+
		"\2\u013c\u0141\5:\36\2\u013d\u013e\7\31\2\2\u013e\u0140\5:\36\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u0149\3\2\2\2\u0143\u0141\3\2\2\2\u0144\u0145\7\32\2\2\u0145"+
		"\u0146\7!\2\2\u0146\u0147\5\30\r\2\u0147\u0148\7\"\2\2\u0148\u014a\3\2"+
		"\2\2\u0149\u0144\3\2\2\2\u0149\u014a\3\2\2\2\u014a9\3\2\2\2\u014b\u014c"+
		"\7\37\2\2\u014c\u014d\5> \2\u014d\u014e\7 \2\2\u014e\u014f\7\33\2\2\u014f"+
		"\u0150\7!\2\2\u0150\u0151\5\30\r\2\u0151\u0152\7\"\2\2\u0152;\3\2\2\2"+
		"\u0153\u0157\5\64\33\2\u0154\u0157\7\b\2\2\u0155\u0157\7\n\2\2\u0156\u0153"+
		"\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0155\3\2\2\2\u0157=\3\2\2\2\u0158"+
		"\u015a\b \1\2\u0159\u015b\7\63\2\2\u015a\u0159\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\7\37\2\2\u015d\u015e\5> \2\u015e"+
		"\u015f\7 \2\2\u015f\u0169\3\2\2\2\u0160\u0161\5<\37\2\u0161\u0162\t\6"+
		"\2\2\u0162\u0163\5<\37\2\u0163\u0169\3\2\2\2\u0164\u0165\5\66\34\2\u0165"+
		"\u0166\t\6\2\2\u0166\u0167\5\66\34\2\u0167\u0169\3\2\2\2\u0168\u0158\3"+
		"\2\2\2\u0168\u0160\3\2\2\2\u0168\u0164\3\2\2\2\u0169\u0172\3\2\2\2\u016a"+
		"\u016b\f\6\2\2\u016b\u016c\7\61\2\2\u016c\u0171\5> \7\u016d\u016e\f\5"+
		"\2\2\u016e\u016f\7\62\2\2\u016f\u0171\5> \6\u0170\u016a\3\2\2\2\u0170"+
		"\u016d\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2"+
		"\2\2\u0173?\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7\35\2\2\u0176\u0177"+
		"\7\37\2\2\u0177\u0178\5> \2\u0178\u0179\7 \2\2\u0179\u017a\7!\2\2\u017a"+
		"\u017b\5\30\r\2\u017b\u017c\7\"\2\2\u017cA\3\2\2\2\u017d\u017e\7\36\2"+
		"\2\u017e\u017f\7!\2\2\u017f\u0180\5\30\r\2\u0180\u0181\7\"\2\2\u0181\u0182"+
		"\7\35\2\2\u0182\u0183\7\37\2\2\u0183\u0184\5> \2\u0184\u0185\7 \2\2\u0185"+
		"C\3\2\2\2\u0186\u0187\7\34\2\2\u0187\u0188\7\37\2\2\u0188\u0189\5&\24"+
		"\2\u0189\u018a\5> \2\u018a\u018b\7\27\2\2\u018b\u018c\5,\27\2\u018c\u018d"+
		"\7 \2\2\u018d\u018e\7!\2\2\u018e\u018f\5\30\r\2\u018f\u0190\7\"\2\2\u0190"+
		"E\3\2\2\2#Mqt\u0083\u0086\u008e\u00a2\u00a5\u00ac\u00bb\u00ca\u00d0\u00d7"+
		"\u00e2\u00ea\u00f9\u00fd\u0106\u010a\u010e\u0115\u011d\u0125\u0127\u0136"+
		"\u0138\u0141\u0149\u0156\u015a\u0168\u0170\u0172";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}