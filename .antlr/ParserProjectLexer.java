// Generated from /Users/jamestipton/Documents/GitHub/Propl/CS4450ParserProject/ParserProject.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, NUMBER=13, BOOL=14, INTEGER=15, FLOAT=16, 
		WHITESPACE=17, NAME=18, STRING=19, COMMENT=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "NUMBER", "BOOL", "INTEGER", "FLOAT", "WHITESPACE", 
			"NAME", "STRING", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", 
			"'-='", "'*='", "'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "NUMBER", "BOOL", "INTEGER", "FLOAT", "WHITESPACE", "NAME", "STRING", 
			"COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u008b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\16\5\16I\n\16\3\16\3\16\5\16M\n\16\3\16\5\16P\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17[\n\17\3\20\3\20\6\20_\n"+
		"\20\r\20\16\20`\5\20c\n\20\3\21\3\21\3\21\6\21h\n\21\r\21\16\21i\3\22"+
		"\6\22m\n\22\r\22\16\22n\3\22\3\22\3\23\3\23\7\23u\n\23\f\23\16\23x\13"+
		"\23\3\24\3\24\7\24|\n\24\f\24\16\24\177\13\24\3\24\3\24\3\25\3\25\7\25"+
		"\u0085\n\25\f\25\16\25\u0088\13\25\3\25\3\25\2\2\26\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26\3\2\b\3\2\62;\5\2\13\f\17\17\"\"\6\2C\\aac|~~\7\2\62;C\\aac|~"+
		"~\3\2$$\4\2\f\f\17\17\2\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3"+
		"+\3\2\2\2\5-\3\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2"+
		"\2\17\67\3\2\2\2\219\3\2\2\2\23;\3\2\2\2\25>\3\2\2\2\27A\3\2\2\2\31D\3"+
		"\2\2\2\33O\3\2\2\2\35Z\3\2\2\2\37b\3\2\2\2!d\3\2\2\2#l\3\2\2\2%r\3\2\2"+
		"\2\'y\3\2\2\2)\u0082\3\2\2\2+,\7*\2\2,\4\3\2\2\2-.\7+\2\2.\6\3\2\2\2/"+
		"\60\7-\2\2\60\b\3\2\2\2\61\62\7/\2\2\62\n\3\2\2\2\63\64\7,\2\2\64\f\3"+
		"\2\2\2\65\66\7\61\2\2\66\16\3\2\2\2\678\7\'\2\28\20\3\2\2\29:\7?\2\2:"+
		"\22\3\2\2\2;<\7-\2\2<=\7?\2\2=\24\3\2\2\2>?\7/\2\2?@\7?\2\2@\26\3\2\2"+
		"\2AB\7,\2\2BC\7?\2\2C\30\3\2\2\2DE\7\61\2\2EF\7?\2\2F\32\3\2\2\2GI\7/"+
		"\2\2HG\3\2\2\2HI\3\2\2\2IJ\3\2\2\2JP\5\37\20\2KM\7/\2\2LK\3\2\2\2LM\3"+
		"\2\2\2MN\3\2\2\2NP\5!\21\2OH\3\2\2\2OL\3\2\2\2P\34\3\2\2\2QR\7V\2\2RS"+
		"\7t\2\2ST\7w\2\2T[\7g\2\2UV\7H\2\2VW\7c\2\2WX\7n\2\2XY\7u\2\2Y[\7g\2\2"+
		"ZQ\3\2\2\2ZU\3\2\2\2[\36\3\2\2\2\\c\7\62\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2"+
		"\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b\\\3\2\2\2b^\3\2\2\2c \3\2\2\2de\5"+
		"\37\20\2eg\7\60\2\2fh\t\2\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2\2"+
		"j\"\3\2\2\2km\t\3\2\2lk\3\2\2\2mn\3\2\2\2nl\3\2\2\2no\3\2\2\2op\3\2\2"+
		"\2pq\b\22\2\2q$\3\2\2\2rv\t\4\2\2su\t\5\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2w&\3\2\2\2xv\3\2\2\2y}\7$\2\2z|\n\6\2\2{z\3\2\2\2|\177\3"+
		"\2\2\2}{\3\2\2\2}~\3\2\2\2~\u0080\3\2\2\2\177}\3\2\2\2\u0080\u0081\7$"+
		"\2\2\u0081(\3\2\2\2\u0082\u0086\7%\2\2\u0083\u0085\n\7\2\2\u0084\u0083"+
		"\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\b\25\2\2\u008a*\3\2\2\2"+
		"\16\2HLOZ`binv}\u0086\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}