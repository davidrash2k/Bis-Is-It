// Generated from Bis.g4 by ANTLR 4.5.2
package bis.is.it;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BisLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"NL", "WS", "EXPONENT", "DIGIT", "FLOAT", "STRING", "CHAR", "BOOLEAN", 
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


	public BisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bis.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2=\u01c0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\5"+
		"\2{\n\2\3\2\3\2\3\2\3\2\3\3\6\3\u0082\n\3\r\3\16\3\u0083\3\3\3\3\3\4\3"+
		"\4\6\4\u008a\n\4\r\4\16\4\u008b\3\5\6\5\u008f\n\5\r\5\16\5\u0090\3\6\3"+
		"\6\3\6\5\6\u0096\n\6\3\6\3\6\5\6\u009a\n\6\3\7\3\7\7\7\u009e\n\7\f\7\16"+
		"\7\u00a1\13\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13\13\3\13\7\13\u00c9\n\13"+
		"\f\13\16\13\u00cc\13\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3"+
		"#\3$\3$\3$\3$\7$\u0150\n$\f$\16$\u0153\13$\3$\3$\3$\3$\3$\3%\3%\3&\3&"+
		"\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3"+
		"\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\65\3\65\7\65\u0195\n\65\f\65\16\65\u0198\13\65\3\65\7"+
		"\65\u019b\n\65\f\65\16\65\u019e\13\65\3\66\3\66\3\67\3\67\3\67\38\38\3"+
		"8\39\39\39\39\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3"+
		"<\3<\3<\3\u0151\2=\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=\3\2\5\4\2\13\13\"\"\3\2c|\3\2C|\u01cc\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\3z\3\2\2\2\5\u0081"+
		"\3\2\2\2\7\u0087\3\2\2\2\t\u008e\3\2\2\2\13\u0099\3\2\2\2\r\u009b\3\2"+
		"\2\2\17\u00a4\3\2\2\2\21\u00b6\3\2\2\2\23\u00b8\3\2\2\2\25\u00bf\3\2\2"+
		"\2\27\u00cd\3\2\2\2\31\u00cf\3\2\2\2\33\u00d6\3\2\2\2\35\u00dd\3\2\2\2"+
		"\37\u00e6\3\2\2\2!\u00ed\3\2\2\2#\u00f3\3\2\2\2%\u00f8\3\2\2\2\'\u00fe"+
		"\3\2\2\2)\u0107\3\2\2\2+\u010c\3\2\2\2-\u010e\3\2\2\2/\u0113\3\2\2\2\61"+
		"\u011c\3\2\2\2\63\u0129\3\2\2\2\65\u012c\3\2\2\2\67\u0131\3\2\2\29\u0138"+
		"\3\2\2\2;\u013f\3\2\2\2=\u0141\3\2\2\2?\u0143\3\2\2\2A\u0145\3\2\2\2C"+
		"\u0147\3\2\2\2E\u0149\3\2\2\2G\u014b\3\2\2\2I\u0159\3\2\2\2K\u015b\3\2"+
		"\2\2M\u015d\3\2\2\2O\u015f\3\2\2\2Q\u0161\3\2\2\2S\u0163\3\2\2\2U\u0165"+
		"\3\2\2\2W\u0168\3\2\2\2Y\u016a\3\2\2\2[\u016d\3\2\2\2]\u0170\3\2\2\2_"+
		"\u0173\3\2\2\2a\u0176\3\2\2\2c\u0178\3\2\2\2e\u017d\3\2\2\2g\u017f\3\2"+
		"\2\2i\u018c\3\2\2\2k\u019f\3\2\2\2m\u01a1\3\2\2\2o\u01a4\3\2\2\2q\u01a7"+
		"\3\2\2\2s\u01ab\3\2\2\2u\u01ae\3\2\2\2w\u01b9\3\2\2\2y{\7\17\2\2zy\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\7\f\2\2}~\3\2\2\2~\177\b\2\2\2\177\4\3\2\2"+
		"\2\u0080\u0082\t\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0081"+
		"\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\b\3\2\2\u0086"+
		"\6\3\2\2\2\u0087\u0089\7`\2\2\u0088\u008a\4\62;\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\b\3"+
		"\2\2\2\u008d\u008f\4\62;\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\n\3\2\2\2\u0092\u0095\5\t\5\2"+
		"\u0093\u0094\7\60\2\2\u0094\u0096\5\t\5\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u009a\3\2\2\2\u0097\u0098\7\60\2\2\u0098\u009a\5\t\5\2"+
		"\u0099\u0092\3\2\2\2\u0099\u0097\3\2\2\2\u009a\f\3\2\2\2\u009b\u009f\7"+
		"$\2\2\u009c\u009e\4\"\u0080\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3\16\3\2\2\2\u00a4\u00a5\7)\2\2\u00a5"+
		"\u00a6\13\2\2\2\u00a6\u00a7\7)\2\2\u00a7\20\3\2\2\2\u00a8\u00a9\7v\2\2"+
		"\u00a9\u00aa\7k\2\2\u00aa\u00ab\7p\2\2\u00ab\u00ac\7q\2\2\u00ac\u00ad"+
		"\7q\2\2\u00ad\u00b7\7f\2\2\u00ae\u00af\7f\2\2\u00af\u00b0\7k\2\2\u00b0"+
		"\u00b1\7v\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7p\2\2\u00b3\u00b4\7q\2\2"+
		"\u00b4\u00b5\7q\2\2\u00b5\u00b7\7f\2\2\u00b6\u00a8\3\2\2\2\u00b6\u00ae"+
		"\3\2\2\2\u00b7\22\3\2\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba"+
		"\u00bb\7y\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7i\2\2\u00bd\u00be\7c\2\2"+
		"\u00be\24\3\2\2\2\u00bf\u00c0\7a\2\2\u00c0\u00c4\t\3\2\2\u00c1\u00c3\t"+
		"\4\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00ca\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\5\t"+
		"\5\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\26\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7?\2\2"+
		"\u00ce\30\3\2\2\2\u00cf\u00d0\7d\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2\7"+
		"u\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7j\2\2\u00d4\u00d5\7c\2\2\u00d5\32"+
		"\3\2\2\2\u00d6\u00d7\7u\2\2\u00d7\u00d8\7w\2\2\u00d8\u00d9\7y\2\2\u00d9"+
		"\u00da\7c\2\2\u00da\u00db\7v\2\2\u00db\u00dc\7c\2\2\u00dc\34\3\2\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7w\2\2\u00df\u00e0\7y\2\2\u00e0\u00e1\7c\2\2"+
		"\u00e1\u00e2\7v\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7D\2\2\u00e4\u00e5"+
		"\7N\2\2\u00e5\36\3\2\2\2\u00e6\u00e7\7p\2\2\u00e7\u00e8\7w\2\2\u00e8\u00e9"+
		"\7o\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7q\2\2\u00ec"+
		" \3\2\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7w\2\2\u00ef\u00f0\7v\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7y\2\2\u00f2\"\3\2\2\2\u00f3\u00f4\7r\2\2\u00f4"+
		"\u00f5\7k\2\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7k\2\2\u00f7$\3\2\2\2\u00f8"+
		"\u00f9\7n\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7t\2\2"+
		"\u00fc\u00fd\7c\2\2\u00fd&\3\2\2\2\u00fe\u00ff\7v\2\2\u00ff\u0100\7k\2"+
		"\2\u0100\u0101\7p\2\2\u0101\u0102\7q\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7f\2\2\u0104\u0105\7d\2\2\u0105\u0106\7c\2\2\u0106(\3\2\2\2\u0107\u0108"+
		"\7y\2\2\u0108\u0109\7c\2\2\u0109\u010a\7n\2\2\u010a\u010b\7c\2\2\u010b"+
		"*\3\2\2\2\u010c\u010d\7=\2\2\u010d,\3\2\2\2\u010e\u010f\7m\2\2\u010f\u0110"+
		"\7w\2\2\u0110\u0111\7p\2\2\u0111\u0112\7i\2\2\u0112.\3\2\2\2\u0113\u0114"+
		"\7m\2\2\u0114\u0115\7w\2\2\u0115\u0116\7p\2\2\u0116\u0117\7i\2\2\u0117"+
		"\u0118\7f\2\2\u0118\u0119\7k\2\2\u0119\u011a\7n\2\2\u011a\u011b\7k\2\2"+
		"\u011b\60\3\2\2\2\u011c\u011d\7m\2\2\u011d\u011e\7w\2\2\u011e\u011f\7"+
		"p\2\2\u011f\u0120\7i\2\2\u0120\u0121\7y\2\2\u0121\u0122\7c\2\2\u0122\u0123"+
		"\7n\2\2\u0123\u0124\7c\2\2\u0124\u0125\7i\2\2\u0125\u0126\7{\2\2\u0126"+
		"\u0127\7w\2\2\u0127\u0128\7f\2\2\u0128\62\3\2\2\2\u0129\u012a\7f\2\2\u012a"+
		"\u012b\7k\2\2\u012b\64\3\2\2\2\u012c\u012d\7r\2\2\u012d\u012e\7c\2\2\u012e"+
		"\u012f\7t\2\2\u012f\u0130\7c\2\2\u0130\66\3\2\2\2\u0131\u0132\7j\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7d\2\2\u0134\u0135\7c\2\2\u0135\u0136\7p\2\2"+
		"\u0136\u0137\7i\2\2\u01378\3\2\2\2\u0138\u0139\7d\2\2\u0139\u013a\7w\2"+
		"\2\u013a\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u013d\7v\2\2\u013d\u013e"+
		"\7c\2\2\u013e:\3\2\2\2\u013f\u0140\7*\2\2\u0140<\3\2\2\2\u0141\u0142\7"+
		"+\2\2\u0142>\3\2\2\2\u0143\u0144\7}\2\2\u0144@\3\2\2\2\u0145\u0146\7\177"+
		"\2\2\u0146B\3\2\2\2\u0147\u0148\7]\2\2\u0148D\3\2\2\2\u0149\u014a\7_\2"+
		"\2\u014aF\3\2\2\2\u014b\u014c\7\61\2\2\u014c\u014d\7,\2\2\u014d\u0151"+
		"\3\2\2\2\u014e\u0150\13\2\2\2\u014f\u014e\3\2\2\2\u0150\u0153\3\2\2\2"+
		"\u0151\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0154\u0155\7,\2\2\u0155\u0156\7\61\2\2\u0156\u0157\3\2\2\2\u0157"+
		"\u0158\b$\2\2\u0158H\3\2\2\2\u0159\u015a\7-\2\2\u015aJ\3\2\2\2\u015b\u015c"+
		"\7/\2\2\u015cL\3\2\2\2\u015d\u015e\7,\2\2\u015eN\3\2\2\2\u015f\u0160\7"+
		"\61\2\2\u0160P\3\2\2\2\u0161\u0162\7\'\2\2\u0162R\3\2\2\2\u0163\u0164"+
		"\7>\2\2\u0164T\3\2\2\2\u0165\u0166\7>\2\2\u0166\u0167\7?\2\2\u0167V\3"+
		"\2\2\2\u0168\u0169\7@\2\2\u0169X\3\2\2\2\u016a\u016b\7@\2\2\u016b\u016c"+
		"\7?\2\2\u016cZ\3\2\2\2\u016d\u016e\7?\2\2\u016e\u016f\7?\2\2\u016f\\\3"+
		"\2\2\2\u0170\u0171\7>\2\2\u0171\u0172\7@\2\2\u0172^\3\2\2\2\u0173\u0174"+
		"\7w\2\2\u0174\u0175\7i\2\2\u0175`\3\2\2\2\u0176\u0177\7q\2\2\u0177b\3"+
		"\2\2\2\u0178\u0179\7f\2\2\u0179\u017a\7k\2\2\u017a\u017b\7n\2\2\u017b"+
		"\u017c\7k\2\2\u017cd\3\2\2\2\u017d\u017e\7&\2\2\u017ef\3\2\2\2\u017f\u0180"+
		"\7j\2\2\u0180\u0181\7c\2\2\u0181\u0182\7p\2\2\u0182\u0183\7v\2\2\u0183"+
		"\u0184\7q\2\2\u0184\u0185\7f\2\2\u0185\u0186\7j\2\2\u0186\u0187\7c\2\2"+
		"\u0187\u0188\7p\2\2\u0188\u0189\7v\2\2\u0189\u018a\7q\2\2\u018a\u018b"+
		"\7f\2\2\u018bh\3\2\2\2\u018c\u018d\7h\2\2\u018d\u018e\7w\2\2\u018e\u018f"+
		"\7p\2\2\u018f\u0190\7e\2\2\u0190\u0191\7\60\2\2\u0191\u0192\3\2\2\2\u0192"+
		"\u0196\t\3\2\2\u0193\u0195\t\4\2\2\u0194\u0193\3\2\2\2\u0195\u0198\3\2"+
		"\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u019c\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019b\5\t\5\2\u019a\u0199\3\2\2\2\u019b\u019e\3\2"+
		"\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019dj\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019f\u01a0\7.\2\2\u01a0l\3\2\2\2\u01a1\u01a2\7-\2\2\u01a2\u01a3"+
		"\7-\2\2\u01a3n\3\2\2\2\u01a4\u01a5\7/\2\2\u01a5\u01a6\7/\2\2\u01a6p\3"+
		"\2\2\2\u01a7\u01a8\7@\2\2\u01a8\u01a9\7@\2\2\u01a9\u01aa\7@\2\2\u01aa"+
		"r\3\2\2\2\u01ab\u01ac\7@\2\2\u01ac\u01ad\7@\2\2\u01adt\3\2\2\2\u01ae\u01af"+
		"\7u\2\2\u01af\u01b0\7w\2\2\u01b0\u01b1\7i\2\2\u01b1\u01b2\7q\2\2\u01b2"+
		"\u01b3\7f\2\2\u01b3\u01b4\7a\2\2\u01b4\u01b5\7f\2\2\u01b5\u01b6\7k\2\2"+
		"\u01b6\u01b7\7t\2\2\u01b7\u01b8\7k\2\2\u01b8v\3\2\2\2\u01b9\u01ba\7k\2"+
		"\2\u01ba\u01bb\7d\2\2\u01bb\u01bc\7c\2\2\u01bc\u01bd\7n\2\2\u01bd\u01be"+
		"\7k\2\2\u01be\u01bf\7m\2\2\u01bfx\3\2\2\2\20\2z\u0083\u008b\u0090\u0095"+
		"\u0099\u009f\u00b6\u00c4\u00ca\u0151\u0196\u019c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}