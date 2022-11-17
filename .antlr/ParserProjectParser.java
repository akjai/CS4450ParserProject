// Generated from /Users/thad/Desktop/CS4450ParserProject/ParserProject.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUMBER=25, BOOL=26, INTEGER=27, FLOAT=28, WHITESPACE=29, NAME=30, STRING=31, 
		COMMENT=32;
	public static final int
		RULE_number = 0, RULE_operators = 1, RULE_assignments = 2, RULE_assignment = 3, 
		RULE_variable_assignment = 4, RULE_variable = 5, RULE_if_statement = 6, 
		RULE_elif_statement = 7, RULE_else_statement = 8, RULE_expression = 9, 
		RULE_condition = 10, RULE_condition_symbol = 11, RULE_comparison = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "operators", "assignments", "assignment", "variable_assignment", 
			"variable", "if_statement", "elif_statement", "else_statement", "expression", 
			"condition", "condition_symbol", "comparison"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'*'", "'/'", "'%'", "'+'", "'+='", "'-='", "'*='", "'/='", 
			"'='", "'if'", "':'", "'\n\t'", "'elif'", "'else'", "'<'", "'>'", "'>='", 
			"'<='", "'=='", "'!='", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ParserProjectParser.NUMBER, 0); }
		public TerminalNode BOOL() { return getToken(ParserProjectParser.BOOL, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		int _la;
		try {
			setState(34);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(26);
					match(T__0);
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				match(NUMBER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
				match(BOOL);
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

	public static class OperatorsContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(ParserProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ParserProjectParser.STRING, i);
		}
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operators);
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				number();
				setState(37);
				match(T__1);
				setState(38);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				variable();
				setState(41);
				match(T__1);
				setState(42);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(44);
				number();
				setState(45);
				match(T__2);
				setState(46);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				number();
				setState(49);
				match(T__3);
				setState(50);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				number();
				setState(53);
				match(T__4);
				setState(54);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(56);
				match(STRING);
				setState(57);
				match(T__4);
				setState(58);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(59);
				number();
				setState(60);
				match(T__0);
				setState(61);
				number();
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

	public static class AssignmentsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserProjectParser.NAME, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode STRING() { return getToken(ParserProjectParser.STRING, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AssignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignments; }
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignments);
		try {
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(NAME);
				setState(66);
				match(T__5);
				setState(67);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(NAME);
				setState(69);
				match(T__5);
				setState(70);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(NAME);
				setState(72);
				match(T__6);
				setState(73);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(74);
				match(NAME);
				setState(75);
				match(T__7);
				setState(76);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(77);
				match(NAME);
				setState(78);
				match(T__7);
				setState(79);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(80);
				match(NAME);
				setState(81);
				match(T__8);
				setState(82);
				number();
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
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
		enterRule(_localctx, 8, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(NAME);
			setState(88);
			assignment();
			setState(89);
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
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(91);
					match(T__0);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(97);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				match(BOOL);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(100);
				match(NAME);
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

	public static class If_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__10);
				setState(105);
				condition();
				setState(106);
				match(T__11);
				setState(107);
				match(T__12);
				setState(108);
				expression();
				setState(109);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__10);
				setState(112);
				condition();
				setState(113);
				match(T__11);
				setState(114);
				match(T__12);
				setState(115);
				expression();
				setState(116);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(T__10);
				setState(119);
				condition();
				setState(120);
				match(T__11);
				setState(121);
				match(T__12);
				setState(122);
				expression();
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

	public static class Elif_statementContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__13);
				setState(128);
				condition();
				setState(129);
				match(T__11);
				setState(130);
				match(T__12);
				setState(131);
				expression();
				setState(132);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(134);
				match(T__13);
				setState(135);
				condition();
				setState(136);
				match(T__11);
				setState(137);
				match(T__12);
				setState(138);
				expression();
				setState(139);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(T__13);
				setState(142);
				condition();
				setState(143);
				match(T__11);
				setState(144);
				match(T__12);
				setState(145);
				expression();
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

	public static class Else_statementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statement);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(T__14);
				setState(151);
				match(T__11);
				setState(152);
				match(T__12);
				setState(153);
				expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentsContext assignments() {
			return getRuleContext(AssignmentsContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			assignments();
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public Condition_symbolContext condition_symbol() {
			return getRuleContext(Condition_symbolContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				variable();
				setState(160);
				condition_symbol();
				setState(161);
				variable();
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

	public static class Condition_symbolContext extends ParserRuleContext {
		public Condition_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_symbol; }
	}

	public final Condition_symbolContext condition_symbol() throws RecognitionException {
		Condition_symbolContext _localctx = new Condition_symbolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
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

	public static class ComparisonContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Condition_symbolContext condition_symbol() {
			return getRuleContext(Condition_symbolContext.class,0);
		}
		public List<TerminalNode> STRING() { return getTokens(ParserProjectParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(ParserProjectParser.STRING, i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				number();
				setState(168);
				condition_symbol();
				setState(169);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(STRING);
				setState(172);
				match(T__19);
				setState(173);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				match(STRING);
				setState(175);
				match(T__20);
				setState(176);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(177);
				match(STRING);
				setState(178);
				match(T__21);
				setState(179);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(180);
				match(STRING);
				setState(181);
				match(T__22);
				setState(182);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				match(STRING);
				setState(184);
				match(T__23);
				setState(185);
				match(STRING);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\5"+
		"\2%\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4V\n\4\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7\3\7\3\7\3\7\5\7"+
		"h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u009d\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5\f\u00a6\n\f\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bd\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\3\3\2\22\32\2\u00cf\2$\3\2\2\2\4A\3\2\2\2\6U\3"+
		"\2\2\2\bW\3\2\2\2\nY\3\2\2\2\fg\3\2\2\2\16~\3\2\2\2\20\u0095\3\2\2\2\22"+
		"\u009c\3\2\2\2\24\u009e\3\2\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00bc"+
		"\3\2\2\2\34\36\7\3\2\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2"+
		"\2\2 \"\3\2\2\2!\37\3\2\2\2\"%\7\33\2\2#%\7\34\2\2$\37\3\2\2\2$#\3\2\2"+
		"\2%\3\3\2\2\2&\'\5\2\2\2\'(\7\4\2\2()\5\f\7\2)B\3\2\2\2*+\5\f\7\2+,\7"+
		"\4\2\2,-\5\2\2\2-B\3\2\2\2./\5\2\2\2/\60\7\5\2\2\60\61\5\2\2\2\61B\3\2"+
		"\2\2\62\63\5\2\2\2\63\64\7\6\2\2\64\65\5\2\2\2\65B\3\2\2\2\66\67\5\2\2"+
		"\2\678\7\7\2\289\5\2\2\29B\3\2\2\2:;\7!\2\2;<\7\7\2\2<B\7!\2\2=>\5\2\2"+
		"\2>?\7\3\2\2?@\5\2\2\2@B\3\2\2\2A&\3\2\2\2A*\3\2\2\2A.\3\2\2\2A\62\3\2"+
		"\2\2A\66\3\2\2\2A:\3\2\2\2A=\3\2\2\2B\5\3\2\2\2CD\7 \2\2DE\7\b\2\2EV\5"+
		"\2\2\2FG\7 \2\2GH\7\b\2\2HV\7!\2\2IJ\7 \2\2JK\7\t\2\2KV\5\2\2\2LM\7 \2"+
		"\2MN\7\n\2\2NV\5\2\2\2OP\7 \2\2PQ\7\n\2\2QV\5\f\7\2RS\7 \2\2ST\7\13\2"+
		"\2TV\5\2\2\2UC\3\2\2\2UF\3\2\2\2UI\3\2\2\2UL\3\2\2\2UO\3\2\2\2UR\3\2\2"+
		"\2V\7\3\2\2\2WX\7\f\2\2X\t\3\2\2\2YZ\7 \2\2Z[\5\b\5\2[\\\5\f\7\2\\\13"+
		"\3\2\2\2]_\7\3\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b"+
		"`\3\2\2\2ch\7\33\2\2dh\7!\2\2eh\7\34\2\2fh\7 \2\2g`\3\2\2\2gd\3\2\2\2"+
		"ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2i\177\3\2\2\2jk\7\r\2\2kl\5\26\f\2lm\7"+
		"\16\2\2mn\7\17\2\2no\5\24\13\2op\5\20\t\2p\177\3\2\2\2qr\7\r\2\2rs\5\26"+
		"\f\2st\7\16\2\2tu\7\17\2\2uv\5\24\13\2vw\5\22\n\2w\177\3\2\2\2xy\7\r\2"+
		"\2yz\5\26\f\2z{\7\16\2\2{|\7\17\2\2|}\5\24\13\2}\177\3\2\2\2~i\3\2\2\2"+
		"~j\3\2\2\2~q\3\2\2\2~x\3\2\2\2\177\17\3\2\2\2\u0080\u0096\3\2\2\2\u0081"+
		"\u0082\7\20\2\2\u0082\u0083\5\26\f\2\u0083\u0084\7\16\2\2\u0084\u0085"+
		"\7\17\2\2\u0085\u0086\5\24\13\2\u0086\u0087\5\20\t\2\u0087\u0096\3\2\2"+
		"\2\u0088\u0089\7\20\2\2\u0089\u008a\5\26\f\2\u008a\u008b\7\16\2\2\u008b"+
		"\u008c\7\17\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\22\n\2\u008e\u0096"+
		"\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0091\5\26\f\2\u0091\u0092\7\16\2"+
		"\2\u0092\u0093\7\17\2\2\u0093\u0094\5\24\13\2\u0094\u0096\3\2\2\2\u0095"+
		"\u0080\3\2\2\2\u0095\u0081\3\2\2\2\u0095\u0088\3\2\2\2\u0095\u008f\3\2"+
		"\2\2\u0096\21\3\2\2\2\u0097\u009d\3\2\2\2\u0098\u0099\7\21\2\2\u0099\u009a"+
		"\7\16\2\2\u009a\u009b\7\17\2\2\u009b\u009d\5\24\13\2\u009c\u0097\3\2\2"+
		"\2\u009c\u0098\3\2\2\2\u009d\23\3\2\2\2\u009e\u009f\5\6\4\2\u009f\25\3"+
		"\2\2\2\u00a0\u00a6\5\f\7\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\5\30\r\2\u00a3"+
		"\u00a4\5\f\7\2\u00a4\u00a6\3\2\2\2\u00a5\u00a0\3\2\2\2\u00a5\u00a1\3\2"+
		"\2\2\u00a6\27\3\2\2\2\u00a7\u00a8\t\2\2\2\u00a8\31\3\2\2\2\u00a9\u00aa"+
		"\5\2\2\2\u00aa\u00ab\5\30\r\2\u00ab\u00ac\5\2\2\2\u00ac\u00bd\3\2\2\2"+
		"\u00ad\u00ae\7!\2\2\u00ae\u00af\7\26\2\2\u00af\u00bd\7!\2\2\u00b0\u00b1"+
		"\7!\2\2\u00b1\u00b2\7\27\2\2\u00b2\u00bd\7!\2\2\u00b3\u00b4\7!\2\2\u00b4"+
		"\u00b5\7\30\2\2\u00b5\u00bd\7!\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\7\31"+
		"\2\2\u00b8\u00bd\7!\2\2\u00b9\u00ba\7!\2\2\u00ba\u00bb\7\32\2\2\u00bb"+
		"\u00bd\7!\2\2\u00bc\u00a9\3\2\2\2\u00bc\u00ad\3\2\2\2\u00bc\u00b0\3\2"+
		"\2\2\u00bc\u00b3\3\2\2\2\u00bc\u00b6\3\2\2\2\u00bc\u00b9\3\2\2\2\u00bd"+
		"\33\3\2\2\2\r\37$AU`g~\u0095\u009c\u00a5\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}