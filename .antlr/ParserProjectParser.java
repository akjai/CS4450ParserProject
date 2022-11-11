// Generated from /Users/jamestipton/Documents/GitHub/CS4450ParserProject/ParserProject.g4 by ANTLR 4.9.2
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
		RULE_operators = 0, RULE_assignment = 1, RULE_variable_assignment = 2, 
		RULE_variable = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"operators", "assignment", "variable_assignment", "variable"
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

	public static class OperatorsContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(ParserProjectParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ParserProjectParser.NUMBER, i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operators);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(8);
					match(T__0);
					}
					}
					setState(13);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(14);
				match(NUMBER);
				setState(15);
				match(T__1);
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(16);
					match(T__0);
					}
					}
					setState(21);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(22);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(23);
					match(T__0);
					}
					}
					setState(28);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(29);
				match(NUMBER);
				setState(30);
				match(T__2);
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(31);
					match(T__0);
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(37);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(38);
					match(T__0);
					}
					}
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(44);
				match(NUMBER);
				setState(45);
				match(T__3);
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(46);
					match(T__0);
					}
					}
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(52);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(53);
					match(T__0);
					}
					}
					setState(58);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(59);
				match(NUMBER);
				setState(60);
				match(T__4);
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(61);
					match(T__0);
					}
					}
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(67);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(68);
					match(T__0);
					}
					}
					setState(73);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(74);
				match(NUMBER);
				setState(75);
				match(T__0);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(76);
					match(T__0);
					}
					}
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(82);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				variable();
				setState(84);
				match(T__5);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(85);
					match(T__0);
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				variable();
				setState(94);
				match(T__6);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(95);
					match(T__0);
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(NUMBER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				variable();
				setState(104);
				match(T__7);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(105);
					match(T__0);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(NUMBER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(113);
				variable();
				setState(114);
				match(T__8);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(115);
					match(T__0);
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(121);
				match(NUMBER);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
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
		enterRule(_localctx, 4, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(NAME);
			setState(128);
			assignment();
			setState(129);
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
		public TerminalNode NAME() { return getToken(ParserProjectParser.NAME, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMBER) | (1L << BOOL) | (1L << NAME) | (1L << STRING))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\3\2\7\2\f\n\2\f\2\16\2\17\13\2\3\2\3\2\3\2\7"+
		"\2\24\n\2\f\2\16\2\27\13\2\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2"+
		"\3\2\7\2#\n\2\f\2\16\2&\13\2\3\2\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\3"+
		"\2\7\2\62\n\2\f\2\16\2\65\13\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\3\2"+
		"\3\2\7\2A\n\2\f\2\16\2D\13\2\3\2\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3"+
		"\2\7\2P\n\2\f\2\16\2S\13\2\3\2\3\2\3\2\3\2\7\2Y\n\2\f\2\16\2\\\13\2\3"+
		"\2\3\2\3\2\3\2\3\2\7\2c\n\2\f\2\16\2f\13\2\3\2\3\2\3\2\3\2\3\2\7\2m\n"+
		"\2\f\2\16\2p\13\2\3\2\3\2\3\2\3\2\3\2\7\2w\n\2\f\2\16\2z\13\2\3\2\3\2"+
		"\5\2~\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3\4\2\r"+
		"\16\22\23\2\u0099\2}\3\2\2\2\4\177\3\2\2\2\6\u0081\3\2\2\2\b\u0085\3\2"+
		"\2\2\n\f\7\3\2\2\13\n\3\2\2\2\f\17\3\2\2\2\r\13\3\2\2\2\r\16\3\2\2\2\16"+
		"\20\3\2\2\2\17\r\3\2\2\2\20\21\7\r\2\2\21\25\7\4\2\2\22\24\7\3\2\2\23"+
		"\22\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27"+
		"\25\3\2\2\2\30~\7\r\2\2\31\33\7\3\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32"+
		"\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\r\2\2 $\7\5\2"+
		"\2!#\7\3\2\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\'\3\2\2\2&$\3"+
		"\2\2\2\'~\7\r\2\2(*\7\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,."+
		"\3\2\2\2-+\3\2\2\2./\7\r\2\2/\63\7\6\2\2\60\62\7\3\2\2\61\60\3\2\2\2\62"+
		"\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\66\3\2\2\2\65\63\3\2\2\2\66"+
		"~\7\r\2\2\679\7\3\2\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2"+
		"\2\2<:\3\2\2\2=>\7\r\2\2>B\7\7\2\2?A\7\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2"+
		"\2\2BC\3\2\2\2CE\3\2\2\2DB\3\2\2\2E~\7\r\2\2FH\7\3\2\2GF\3\2\2\2HK\3\2"+
		"\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\r\2\2MQ\7\3\2\2NP\7\3"+
		"\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2T~\7\r"+
		"\2\2UV\5\b\5\2VZ\7\b\2\2WY\7\3\2\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3"+
		"\2\2\2[]\3\2\2\2\\Z\3\2\2\2]^\7\r\2\2^~\3\2\2\2_`\5\b\5\2`d\7\t\2\2ac"+
		"\7\3\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2g"+
		"h\7\r\2\2h~\3\2\2\2ij\5\b\5\2jn\7\n\2\2km\7\3\2\2lk\3\2\2\2mp\3\2\2\2"+
		"nl\3\2\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\r\2\2r~\3\2\2\2st\5\b\5\2"+
		"tx\7\13\2\2uw\7\3\2\2vu\3\2\2\2wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2"+
		"\2zx\3\2\2\2{|\7\r\2\2|~\3\2\2\2}\r\3\2\2\2}\34\3\2\2\2}+\3\2\2\2}:\3"+
		"\2\2\2}I\3\2\2\2}U\3\2\2\2}_\3\2\2\2}i\3\2\2\2}s\3\2\2\2~\3\3\2\2\2\177"+
		"\u0080\7\f\2\2\u0080\5\3\2\2\2\u0081\u0082\7\22\2\2\u0082\u0083\5\4\3"+
		"\2\u0083\u0084\5\b\5\2\u0084\7\3\2\2\2\u0085\u0086\t\2\2\2\u0086\t\3\2"+
		"\2\2\21\r\25\34$+\63:BIQZdnx}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}