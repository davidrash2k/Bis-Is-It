// Generated from ExpCalculator.g4 by ANTLR 4.5.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpCalculatorLexer extends Lexer {
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
		MAIN_FUNC=57, RETURN=58;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "NL", "WS", "DIGIT", 
		"STIRNG", "BOOLEAN", "VAR_IDENTIFIER", "ASS_OPERATOR", "INT_TYPE", "FLOAT_TYPE", 
		"STRING_TYPE", "CHAR_TYPE", "BOOLEAN_TYPE", "VOID_TYPE", "TERMINATOR", 
		"IF_CONDITIONAL", "ELSE_IF_CONDITIONAL", "ELSE_CONDITIONAL", "THEN_CONDITIONAL", 
		"FOR_LOOP", "WHILE_LOOP", "DO_WHILE_LOOP", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRE", 
		"CLOSE_BRE", "OPEN_BRT", "COMMENT_BLOCK", "ADD_OPERATOR", "SUBTRACT_OPERATOR", 
		"MULTIPLY_OPERATOR", "DIVIDE_OPERATOR", "MODULO_OPERATOR", "LESS_THAN_OPERATOR", 
		"LESS_THAN_EQUAL_TO_OPERATOR", "GREATER_THAN_OPERATOR", "GREATER_THAN_EQAUL_TO_OPERATOR", 
		"EQUAL_TO_OPERATOR", "NOT_EQUAL_TO_OPERATOR", "AND_OPERATOR", "OR_OPERATOR", 
		"NOT_OPERATOR", "ARRAY_SIZE_DELIMITER", "CONSTANT", "COMMA", "INCREMENT_OPERATOR", 
		"DECREMENT_OPERATOR", "FUNC_DEFINITION", "FUNC_CALL", "PARAMETER_ENUMERATION", 
		"MAIN_FUNC", "RETURN"
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


	public ExpCalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpCalculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2<\u0101\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\3\2\3\2\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\5\t\u0087\n\t\3\t\3\t"+
		"\3\n\6\n\u008c\n\n\r\n\16\n\u008d\3\n\3\n\3\13\6\13\u0093\n\13\r\13\16"+
		"\13\u0094\3\f\3\f\3\r\3\r\3\16\3\16\3\16\6\16\u009e\n\16\r\16\16\16\u009f"+
		"\3\16\7\16\u00a3\n\16\f\16\16\16\u00a6\13\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37"+
		"\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)"+
		"\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63"+
		"\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;"+
		"\2\2<\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<\3\2\61\4\2\13\13\"\"\3\2\62;\5\2$$--\60\60\7\2ffkkpqvv~~\3"+
		"\2aa\3\2c|\3\2C|\3\2??\6\2ggoqttww\6\2ccnnvwyy\5\2kkrruu\7\2ccggnnttv"+
		"v\7\2cdffkkpqvv\5\2ccnnyy\3\2==\6\2iimmppww\b\2ffiikkmnppww\n\2ccffii"+
		"mnppwwyy{{\4\2ffkk\5\2ccrrtt\5\2cdijpp\5\2cdjjvw\3\2**\3\2++\3\2}}\3\2"+
		"\177\177\3\2]]\4\2,,\60\61\3\2--\3\2//\3\2,,\3\2\61\61\3\2\'\'\3\2>>\3"+
		"\2>?\3\2@@\3\2?@\4\2>>@@\4\2iiww\3\2qq\5\2ffkknn\3\2&&\7\2ccffjjpqvv\3"+
		"\2..\6\2cciivvyy\t\2aaffiikkqqtuww\5\2cdkkmn\u0105\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\3w\3\2\2\2\5y\3\2\2\2\7{\3\2\2\2\t}\3\2\2\2\13"+
		"\177\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0086\3\2\2\2\23\u008b"+
		"\3\2\2\2\25\u0092\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009a\3"+
		"\2\2\2\35\u00a7\3\2\2\2\37\u00a9\3\2\2\2!\u00ab\3\2\2\2#\u00ad\3\2\2\2"+
		"%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3\2\2\2-\u00b7\3"+
		"\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2\65\u00bf\3\2\2"+
		"\2\67\u00c1\3\2\2\29\u00c3\3\2\2\2;\u00c5\3\2\2\2=\u00c7\3\2\2\2?\u00c9"+
		"\3\2\2\2A\u00cb\3\2\2\2C\u00cd\3\2\2\2E\u00cf\3\2\2\2G\u00d1\3\2\2\2I"+
		"\u00d3\3\2\2\2K\u00d5\3\2\2\2M\u00d7\3\2\2\2O\u00d9\3\2\2\2Q\u00db\3\2"+
		"\2\2S\u00dd\3\2\2\2U\u00df\3\2\2\2W\u00e1\3\2\2\2Y\u00e3\3\2\2\2[\u00e5"+
		"\3\2\2\2]\u00e7\3\2\2\2_\u00e9\3\2\2\2a\u00eb\3\2\2\2c\u00ed\3\2\2\2e"+
		"\u00ef\3\2\2\2g\u00f1\3\2\2\2i\u00f3\3\2\2\2k\u00f5\3\2\2\2m\u00f7\3\2"+
		"\2\2o\u00f9\3\2\2\2q\u00fb\3\2\2\2s\u00fd\3\2\2\2u\u00ff\3\2\2\2wx\7-"+
		"\2\2x\4\3\2\2\2yz\7/\2\2z\6\3\2\2\2{|\7*\2\2|\b\3\2\2\2}~\7+\2\2~\n\3"+
		"\2\2\2\177\u0080\7,\2\2\u0080\f\3\2\2\2\u0081\u0082\7\61\2\2\u0082\16"+
		"\3\2\2\2\u0083\u0084\7\'\2\2\u0084\20\3\2\2\2\u0085\u0087\7\17\2\2\u0086"+
		"\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\f"+
		"\2\2\u0089\22\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2\u008c\u008d"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\b\n\2\2\u0090\24\3\2\2\2\u0091\u0093\t\3\2\2\u0092\u0091\3\2\2"+
		"\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\26"+
		"\3\2\2\2\u0096\u0097\t\4\2\2\u0097\30\3\2\2\2\u0098\u0099\t\5\2\2\u0099"+
		"\32\3\2\2\2\u009a\u009b\t\6\2\2\u009b\u009d\t\7\2\2\u009c\u009e\t\b\2"+
		"\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\34\3\2\2"+
		"\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\t\t\2\2\u00a8\36\3\2\2\2\u00a9\u00aa"+
		"\t\n\2\2\u00aa \3\2\2\2\u00ab\u00ac\t\13\2\2\u00ac\"\3\2\2\2\u00ad\u00ae"+
		"\t\f\2\2\u00ae$\3\2\2\2\u00af\u00b0\t\r\2\2\u00b0&\3\2\2\2\u00b1\u00b2"+
		"\t\16\2\2\u00b2(\3\2\2\2\u00b3\u00b4\t\17\2\2\u00b4*\3\2\2\2\u00b5\u00b6"+
		"\t\20\2\2\u00b6,\3\2\2\2\u00b7\u00b8\t\21\2\2\u00b8.\3\2\2\2\u00b9\u00ba"+
		"\t\22\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\t\23\2\2\u00bc\62\3\2\2\2\u00bd"+
		"\u00be\t\24\2\2\u00be\64\3\2\2\2\u00bf\u00c0\t\25\2\2\u00c0\66\3\2\2\2"+
		"\u00c1\u00c2\t\26\2\2\u00c28\3\2\2\2\u00c3\u00c4\t\27\2\2\u00c4:\3\2\2"+
		"\2\u00c5\u00c6\t\30\2\2\u00c6<\3\2\2\2\u00c7\u00c8\t\31\2\2\u00c8>\3\2"+
		"\2\2\u00c9\u00ca\t\32\2\2\u00ca@\3\2\2\2\u00cb\u00cc\t\33\2\2\u00ccB\3"+
		"\2\2\2\u00cd\u00ce\t\34\2\2\u00ceD\3\2\2\2\u00cf\u00d0\t\35\2\2\u00d0"+
		"F\3\2\2\2\u00d1\u00d2\t\36\2\2\u00d2H\3\2\2\2\u00d3\u00d4\t\37\2\2\u00d4"+
		"J\3\2\2\2\u00d5\u00d6\t \2\2\u00d6L\3\2\2\2\u00d7\u00d8\t!\2\2\u00d8N"+
		"\3\2\2\2\u00d9\u00da\t\"\2\2\u00daP\3\2\2\2\u00db\u00dc\t#\2\2\u00dcR"+
		"\3\2\2\2\u00dd\u00de\t$\2\2\u00deT\3\2\2\2\u00df\u00e0\t%\2\2\u00e0V\3"+
		"\2\2\2\u00e1\u00e2\t&\2\2\u00e2X\3\2\2\2\u00e3\u00e4\t\t\2\2\u00e4Z\3"+
		"\2\2\2\u00e5\u00e6\t\'\2\2\u00e6\\\3\2\2\2\u00e7\u00e8\t(\2\2\u00e8^\3"+
		"\2\2\2\u00e9\u00ea\t)\2\2\u00ea`\3\2\2\2\u00eb\u00ec\t*\2\2\u00ecb\3\2"+
		"\2\2\u00ed\u00ee\t+\2\2\u00eed\3\2\2\2\u00ef\u00f0\t,\2\2\u00f0f\3\2\2"+
		"\2\u00f1\u00f2\t-\2\2\u00f2h\3\2\2\2\u00f3\u00f4\t\36\2\2\u00f4j\3\2\2"+
		"\2\u00f5\u00f6\t\37\2\2\u00f6l\3\2\2\2\u00f7\u00f8\t%\2\2\u00f8n\3\2\2"+
		"\2\u00f9\u00fa\t.\2\2\u00fap\3\2\2\2\u00fb\u00fc\t%\2\2\u00fcr\3\2\2\2"+
		"\u00fd\u00fe\t/\2\2\u00fet\3\2\2\2\u00ff\u0100\t\60\2\2\u0100v\3\2\2\2"+
		"\b\2\u0086\u008d\u0094\u009f\u00a4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}