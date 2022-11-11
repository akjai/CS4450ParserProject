// Generated from ParserProject.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserProjectLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, BOOL=12, INTEGER=13, FLOAT=14, WHITESPACE=15, NAME=16, 
		STRING=17, COMMENT=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NUMBER", "BOOL", "INTEGER", "FLOAT", "WHITESPACE", "NAME", "STRING", 
			"COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'*'", "'/'", "'%'", "'+'", "'+='", "'-='", "'*='", "'/='", 
			"'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"BOOL", "INTEGER", "FLOAT", "WHITESPACE", "NAME", "STRING", "COMMENT"
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


	public ParserProjectLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ParserProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24}\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\5\fB\n\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\5\rM\n\r\3\16\3\16\6\16Q\n\16\r\16\16\16R\5\16"+
		"U\n\16\3\17\3\17\3\17\6\17Z\n\17\r\17\16\17[\3\20\6\20_\n\20\r\20\16\20"+
		"`\3\20\3\20\3\21\3\21\7\21g\n\21\f\21\16\21j\13\21\3\22\3\22\7\22n\n\22"+
		"\f\22\16\22q\13\22\3\22\3\22\3\23\3\23\7\23w\n\23\f\23\16\23z\13\23\3"+
		"\23\3\23\2\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\3\2\b\3\2\62;\5\2\13\f\17\17\"\"\6\2"+
		"C\\aac|~~\7\2\62;C\\aac|~~\3\2$$\4\2\f\f\17\17\2\u0085\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3"+
		"\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13/\3\2\2\2\r\61\3\2\2\2\17"+
		"\64\3\2\2\2\21\67\3\2\2\2\23:\3\2\2\2\25=\3\2\2\2\27A\3\2\2\2\31L\3\2"+
		"\2\2\33T\3\2\2\2\35V\3\2\2\2\37^\3\2\2\2!d\3\2\2\2#k\3\2\2\2%t\3\2\2\2"+
		"\'(\7/\2\2(\4\3\2\2\2)*\7,\2\2*\6\3\2\2\2+,\7\61\2\2,\b\3\2\2\2-.\7\'"+
		"\2\2.\n\3\2\2\2/\60\7-\2\2\60\f\3\2\2\2\61\62\7-\2\2\62\63\7?\2\2\63\16"+
		"\3\2\2\2\64\65\7/\2\2\65\66\7?\2\2\66\20\3\2\2\2\678\7,\2\289\7?\2\29"+
		"\22\3\2\2\2:;\7\61\2\2;<\7?\2\2<\24\3\2\2\2=>\7?\2\2>\26\3\2\2\2?B\5\33"+
		"\16\2@B\5\35\17\2A?\3\2\2\2A@\3\2\2\2B\30\3\2\2\2CD\7V\2\2DE\7t\2\2EF"+
		"\7w\2\2FM\7g\2\2GH\7H\2\2HI\7c\2\2IJ\7n\2\2JK\7u\2\2KM\7g\2\2LC\3\2\2"+
		"\2LG\3\2\2\2M\32\3\2\2\2NU\7\62\2\2OQ\t\2\2\2PO\3\2\2\2QR\3\2\2\2RP\3"+
		"\2\2\2RS\3\2\2\2SU\3\2\2\2TN\3\2\2\2TP\3\2\2\2U\34\3\2\2\2VW\5\33\16\2"+
		"WY\7\60\2\2XZ\t\2\2\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\36\3"+
		"\2\2\2]_\t\3\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b"+
		"\20\2\2c \3\2\2\2dh\t\4\2\2eg\t\5\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi"+
		"\3\2\2\2i\"\3\2\2\2jh\3\2\2\2ko\7$\2\2ln\n\6\2\2ml\3\2\2\2nq\3\2\2\2o"+
		"m\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7$\2\2s$\3\2\2\2tx\7%\2\2uw"+
		"\n\7\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zx\3\2\2\2{"+
		"|\b\23\2\2|&\3\2\2\2\f\2ALRT[`hox\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}