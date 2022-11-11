// Generated from ParserProject.g4 by ANTLR 4.9.2
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterOperators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitOperators(this);
		}
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_operators);
		int _la;
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(8);
					match(T__0);
					}
				}

				setState(11);
				match(NUMBER);
				setState(12);
				match(T__1);
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(13);
					match(T__0);
					}
				}

				setState(16);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(18);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(17);
					match(T__0);
					}
				}

				setState(20);
				match(NUMBER);
				setState(21);
				match(T__2);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(22);
					match(T__0);
					}
				}

				setState(25);
				match(NUMBER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(26);
					match(T__0);
					}
				}

				setState(29);
				match(NUMBER);
				setState(30);
				match(T__3);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(31);
					match(T__0);
					}
				}

				setState(34);
				match(NUMBER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(35);
					match(T__0);
					}
				}

				setState(38);
				match(NUMBER);
				setState(39);
				match(T__4);
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(40);
					match(T__0);
					}
				}

				setState(43);
				match(NUMBER);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(44);
					match(T__0);
					}
				}

				setState(47);
				match(NUMBER);
				setState(48);
				match(T__0);
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(49);
					match(T__0);
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(55);
				match(NUMBER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				variable();
				setState(57);
				match(T__5);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(58);
					match(T__0);
					}
				}

				setState(61);
				match(NUMBER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(63);
				variable();
				setState(64);
				match(T__6);
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(65);
					match(T__0);
					}
				}

				setState(68);
				match(NUMBER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				variable();
				setState(71);
				match(T__7);
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(72);
					match(T__0);
					}
				}

				setState(75);
				match(NUMBER);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(77);
				variable();
				setState(78);
				match(T__8);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(79);
					match(T__0);
					}
				}

				setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitVariable_assignment(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NAME);
			setState(89);
			assignment();
			setState(90);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24a\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\5\2\f\n\2\3\2\3\2\3\2\5\2\21\n\2\3\2\3\2\5\2\25"+
		"\n\2\3\2\3\2\3\2\5\2\32\n\2\3\2\3\2\5\2\36\n\2\3\2\3\2\3\2\5\2#\n\2\3"+
		"\2\3\2\5\2\'\n\2\3\2\3\2\3\2\5\2,\n\2\3\2\3\2\5\2\60\n\2\3\2\3\2\3\2\7"+
		"\2\65\n\2\f\2\16\28\13\2\3\2\3\2\3\2\3\2\5\2>\n\2\3\2\3\2\3\2\3\2\3\2"+
		"\5\2E\n\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\2\3\2\3\2\3\2\3\2\5\2S\n\2\3"+
		"\2\3\2\5\2W\n\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\2\2\6\2\4\6\b\2\3"+
		"\4\2\r\16\22\23\2r\2V\3\2\2\2\4X\3\2\2\2\6Z\3\2\2\2\b^\3\2\2\2\n\f\7\3"+
		"\2\2\13\n\3\2\2\2\13\f\3\2\2\2\f\r\3\2\2\2\r\16\7\r\2\2\16\20\7\4\2\2"+
		"\17\21\7\3\2\2\20\17\3\2\2\2\20\21\3\2\2\2\21\22\3\2\2\2\22W\7\r\2\2\23"+
		"\25\7\3\2\2\24\23\3\2\2\2\24\25\3\2\2\2\25\26\3\2\2\2\26\27\7\r\2\2\27"+
		"\31\7\5\2\2\30\32\7\3\2\2\31\30\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33"+
		"W\7\r\2\2\34\36\7\3\2\2\35\34\3\2\2\2\35\36\3\2\2\2\36\37\3\2\2\2\37 "+
		"\7\r\2\2 \"\7\6\2\2!#\7\3\2\2\"!\3\2\2\2\"#\3\2\2\2#$\3\2\2\2$W\7\r\2"+
		"\2%\'\7\3\2\2&%\3\2\2\2&\'\3\2\2\2\'(\3\2\2\2()\7\r\2\2)+\7\7\2\2*,\7"+
		"\3\2\2+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-W\7\r\2\2.\60\7\3\2\2/.\3\2\2\2/"+
		"\60\3\2\2\2\60\61\3\2\2\2\61\62\7\r\2\2\62\66\7\3\2\2\63\65\7\3\2\2\64"+
		"\63\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3"+
		"\2\2\29W\7\r\2\2:;\5\b\5\2;=\7\b\2\2<>\7\3\2\2=<\3\2\2\2=>\3\2\2\2>?\3"+
		"\2\2\2?@\7\r\2\2@W\3\2\2\2AB\5\b\5\2BD\7\t\2\2CE\7\3\2\2DC\3\2\2\2DE\3"+
		"\2\2\2EF\3\2\2\2FG\7\r\2\2GW\3\2\2\2HI\5\b\5\2IK\7\n\2\2JL\7\3\2\2KJ\3"+
		"\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\r\2\2NW\3\2\2\2OP\5\b\5\2PR\7\13\2\2QS"+
		"\7\3\2\2RQ\3\2\2\2RS\3\2\2\2ST\3\2\2\2TU\7\r\2\2UW\3\2\2\2V\13\3\2\2\2"+
		"V\24\3\2\2\2V\35\3\2\2\2V&\3\2\2\2V/\3\2\2\2V:\3\2\2\2VA\3\2\2\2VH\3\2"+
		"\2\2VO\3\2\2\2W\3\3\2\2\2XY\7\f\2\2Y\5\3\2\2\2Z[\7\22\2\2[\\\5\4\3\2\\"+
		"]\5\b\5\2]\7\3\2\2\2^_\t\2\2\2_\t\3\2\2\2\21\13\20\24\31\35\"&+/\66=D"+
		"KRV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}