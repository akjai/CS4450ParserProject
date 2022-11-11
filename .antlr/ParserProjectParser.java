// Generated from /Users/ankitjain/CS4450ParserProject/ParserProject.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserProjectParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUMBER=11, WHITESPACE=12;
	public static final int
		RULE_add_operator = 0, RULE_minus_operator = 1, RULE_multiply_operator = 2, 
		RULE_divide_operator = 3, RULE_mod_operator = 4, RULE_assignment = 5, 
		RULE_add_assignment = 6, RULE_minus_assignment = 7, RULE_multiply_assignment = 8, 
		RULE_divide_assignment = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"add_operator", "minus_operator", "multiply_operator", "divide_operator", 
			"mod_operator", "assignment", "add_assignment", "minus_assignment", "multiply_assignment", 
			"divide_assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'+='", "'-='", "'*='", 
			"'/='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NUMBER", 
			"WHITESPACE"
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

	@Override
	public String getGrammarFileName() { return "ParserProject.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserProjectParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Add_operatorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public Add_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_operator; }
	}

	public final Add_operatorContext add_operator() throws RecognitionException {
		Add_operatorContext _localctx = new Add_operatorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_add_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(NUMBER);
			setState(21);
			match(T__0);
			setState(22);
			match(NUMBER);
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

	public static class Minus_operatorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public Minus_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_operator; }
	}

	public final Minus_operatorContext minus_operator() throws RecognitionException {
		Minus_operatorContext _localctx = new Minus_operatorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_minus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(NUMBER);
			setState(25);
			match(T__1);
			setState(26);
			match(NUMBER);
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

	public static class Multiply_operatorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public Multiply_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_operator; }
	}

	public final Multiply_operatorContext multiply_operator() throws RecognitionException {
		Multiply_operatorContext _localctx = new Multiply_operatorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(NUMBER);
			setState(29);
			match(T__2);
			setState(30);
			match(NUMBER);
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

	public static class Divide_operatorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public Divide_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_operator; }
	}

	public final Divide_operatorContext divide_operator() throws RecognitionException {
		Divide_operatorContext _localctx = new Divide_operatorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_divide_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NUMBER);
			setState(33);
			match(T__3);
			setState(34);
			match(NUMBER);
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

	public static class Mod_operatorContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public Mod_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod_operator; }
	}

	public final Mod_operatorContext mod_operator() throws RecognitionException {
		Mod_operatorContext _localctx = new Mod_operatorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mod_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NUMBER);
			setState(37);
			match(T__4);
			setState(38);
			match(NUMBER);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__5);
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

	public static class Add_assignmentContext extends ParserRuleContext {
		public Add_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_assignment; }
	}

	public final Add_assignmentContext add_assignment() throws RecognitionException {
		Add_assignmentContext _localctx = new Add_assignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_add_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(T__6);
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

	public static class Minus_assignmentContext extends ParserRuleContext {
		public Minus_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minus_assignment; }
	}

	public final Minus_assignmentContext minus_assignment() throws RecognitionException {
		Minus_assignmentContext _localctx = new Minus_assignmentContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_minus_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(T__7);
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

	public static class Multiply_assignmentContext extends ParserRuleContext {
		public Multiply_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_assignment; }
	}

	public final Multiply_assignmentContext multiply_assignment() throws RecognitionException {
		Multiply_assignmentContext _localctx = new Multiply_assignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_multiply_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(T__8);
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

	public static class Divide_assignmentContext extends ParserRuleContext {
		public Divide_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_assignment; }
	}

	public final Divide_assignmentContext divide_assignment() throws RecognitionException {
		Divide_assignmentContext _localctx = new Divide_assignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_divide_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__9);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\16\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6"+
		"\b\n\f\16\20\22\24\2\2\2*\2\26\3\2\2\2\4\32\3\2\2\2\6\36\3\2\2\2\b\"\3"+
		"\2\2\2\n&\3\2\2\2\f*\3\2\2\2\16,\3\2\2\2\20.\3\2\2\2\22\60\3\2\2\2\24"+
		"\62\3\2\2\2\26\27\7\r\2\2\27\30\7\3\2\2\30\31\7\r\2\2\31\3\3\2\2\2\32"+
		"\33\7\r\2\2\33\34\7\4\2\2\34\35\7\r\2\2\35\5\3\2\2\2\36\37\7\r\2\2\37"+
		" \7\5\2\2 !\7\r\2\2!\7\3\2\2\2\"#\7\r\2\2#$\7\6\2\2$%\7\r\2\2%\t\3\2\2"+
		"\2&\'\7\r\2\2\'(\7\7\2\2()\7\r\2\2)\13\3\2\2\2*+\7\b\2\2+\r\3\2\2\2,-"+
		"\7\t\2\2-\17\3\2\2\2./\7\n\2\2/\21\3\2\2\2\60\61\7\13\2\2\61\23\3\2\2"+
		"\2\62\63\7\f\2\2\63\25\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}