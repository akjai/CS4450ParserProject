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
		T__9=10, NUMBER=11, BOOL=12, INTEGER=13, FLOAT=14, WHITESPACE=15, NAME=16, 
		STRING=17, COMMENT=18;
	public static final int
		RULE_multiply_operator = 0, RULE_divide_operator = 1, RULE_mod_operator = 2, 
		RULE_add_operator = 3, RULE_minus_operator = 4, RULE_assignment = 5, RULE_add_assignment = 6, 
		RULE_minus_assignment = 7, RULE_multiply_assignment = 8, RULE_divide_assignment = 9, 
		RULE_variable_assignment = 10, RULE_variable = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiply_operator", "divide_operator", "mod_operator", "add_operator", 
			"minus_operator", "assignment", "add_assignment", "minus_assignment", 
			"multiply_assignment", "divide_assignment", "variable_assignment", "variable"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "'+='", "'-='", "'*='", 
			"'/='"
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
		enterRule(_localctx, 0, RULE_multiply_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			match(NUMBER);
			setState(25);
			match(T__0);
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
		enterRule(_localctx, 2, RULE_divide_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(NUMBER);
			setState(29);
			match(T__1);
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
		enterRule(_localctx, 4, RULE_mod_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(NUMBER);
			setState(33);
			match(T__2);
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
		enterRule(_localctx, 6, RULE_add_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(NUMBER);
			setState(37);
			match(T__3);
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
		enterRule(_localctx, 8, RULE_minus_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(NUMBER);
			setState(41);
			match(T__4);
			setState(42);
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
			setState(44);
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
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
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
			setState(46);
			match(NUMBER);
			setState(47);
			match(T__6);
			setState(48);
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

	public static class Minus_assignmentContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
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
			setState(50);
			match(NUMBER);
			setState(51);
			match(T__7);
			setState(52);
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

	public static class Multiply_assignmentContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
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
			setState(54);
			match(NUMBER);
			setState(55);
			match(T__8);
			setState(56);
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

	public static class Divide_assignmentContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
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
			setState(58);
			match(NUMBER);
			setState(59);
			match(T__9);
			setState(60);
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

	public static class Variable_assignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserProjectParser.NAME, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(NAME);
			setState(63);
			assignment();
			setState(64);
			variable();
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ParserProjectParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ParserProjectParser.STRING, 0); }
		public TerminalNode BOOL() { return getToken(ParserProjectParser.BOOL, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24G\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\2\2\16\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\2\3\4\2\r\16\23\23\2:\2\32\3\2\2\2\4\36\3\2"+
		"\2\2\6\"\3\2\2\2\b&\3\2\2\2\n*\3\2\2\2\f.\3\2\2\2\16\60\3\2\2\2\20\64"+
		"\3\2\2\2\228\3\2\2\2\24<\3\2\2\2\26@\3\2\2\2\30D\3\2\2\2\32\33\7\r\2\2"+
		"\33\34\7\3\2\2\34\35\7\r\2\2\35\3\3\2\2\2\36\37\7\r\2\2\37 \7\4\2\2 !"+
		"\7\r\2\2!\5\3\2\2\2\"#\7\r\2\2#$\7\5\2\2$%\7\r\2\2%\7\3\2\2\2&\'\7\r\2"+
		"\2\'(\7\6\2\2()\7\r\2\2)\t\3\2\2\2*+\7\r\2\2+,\7\7\2\2,-\7\r\2\2-\13\3"+
		"\2\2\2./\7\b\2\2/\r\3\2\2\2\60\61\7\r\2\2\61\62\7\t\2\2\62\63\7\r\2\2"+
		"\63\17\3\2\2\2\64\65\7\r\2\2\65\66\7\n\2\2\66\67\7\r\2\2\67\21\3\2\2\2"+
		"89\7\r\2\29:\7\13\2\2:;\7\r\2\2;\23\3\2\2\2<=\7\r\2\2=>\7\f\2\2>?\7\r"+
		"\2\2?\25\3\2\2\2@A\7\22\2\2AB\5\f\7\2BC\5\30\r\2C\27\3\2\2\2DE\t\2\2\2"+
		"E\31\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}