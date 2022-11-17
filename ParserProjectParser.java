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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUMBER=25, BOOL=26, INTEGER=27, FLOAT=28, WHITESPACE=29, NAME=30, STRING=31, 
		COMMENT=32;
	public static final int
		RULE_number = 0, RULE_operators = 1, RULE_assignments = 2, RULE_assignment = 3, 
		RULE_variable_assignment = 4, RULE_variable = 5, RULE_if_statement = 6, 
		RULE_elif_statement = 7, RULE_else_statement = 8, RULE_expression = 9, 
		RULE_condition = 10, RULE_condition_symbol = 11, RULE_operator_symbol = 12, 
		RULE_comparison = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "operators", "assignments", "assignment", "variable_assignment", 
			"variable", "if_statement", "elif_statement", "else_statement", "expression", 
			"condition", "condition_symbol", "operator_symbol", "comparison"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_number);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(28);
					match(T__0);
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				match(NUMBER);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
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
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
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
		enterRule(_localctx, 2, RULE_operators);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				number();
				setState(39);
				match(T__1);
				setState(40);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				variable();
				setState(43);
				match(T__1);
				setState(44);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				number();
				setState(47);
				match(T__2);
				setState(48);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				number();
				setState(51);
				match(T__3);
				setState(52);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				number();
				setState(55);
				match(T__4);
				setState(56);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
				match(STRING);
				setState(59);
				match(T__4);
				setState(60);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				number();
				setState(62);
				match(T__0);
				setState(63);
				number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(65);
				match(NAME);
				setState(66);
				operator_symbol();
				setState(67);
				match(NAME);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterAssignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitAssignments(this);
		}
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignments);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(NAME);
				setState(72);
				match(T__5);
				setState(73);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(NAME);
				setState(75);
				match(T__5);
				setState(76);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(NAME);
				setState(78);
				match(T__6);
				setState(79);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				match(NAME);
				setState(81);
				match(T__7);
				setState(82);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(NAME);
				setState(84);
				match(T__7);
				setState(85);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				match(NAME);
				setState(87);
				match(T__8);
				setState(88);
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
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 8, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(NAME);
			setState(94);
			assignment();
			setState(95);
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
		enterRule(_localctx, 10, RULE_variable);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(97);
					match(T__0);
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				match(BOOL);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitIf_statement(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		try {
			setState(130);
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
				setState(110);
				match(T__10);
				setState(111);
				condition(0);
				setState(112);
				match(T__11);
				setState(113);
				match(T__12);
				setState(114);
				expression();
				setState(115);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(T__10);
				setState(118);
				condition(0);
				setState(119);
				match(T__11);
				setState(120);
				match(T__12);
				setState(121);
				expression();
				setState(122);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(124);
				match(T__10);
				setState(125);
				condition(0);
				setState(126);
				match(T__11);
				setState(127);
				match(T__12);
				setState(128);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterElif_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitElif_statement(this);
		}
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elif_statement);
		try {
			setState(153);
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
				setState(133);
				match(T__13);
				setState(134);
				condition(0);
				setState(135);
				match(T__11);
				setState(136);
				match(T__12);
				setState(137);
				expression();
				setState(138);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(140);
				match(T__13);
				setState(141);
				condition(0);
				setState(142);
				match(T__11);
				setState(143);
				match(T__12);
				setState(144);
				expression();
				setState(145);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(147);
				match(T__13);
				setState(148);
				condition(0);
				setState(149);
				match(T__11);
				setState(150);
				match(T__12);
				setState(151);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterElse_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitElse_statement(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_else_statement);
		try {
			setState(160);
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
				setState(156);
				match(T__14);
				setState(157);
				match(T__11);
				setState(158);
				match(T__12);
				setState(159);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
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
		public OperatorsContext operators() {
			return getRuleContext(OperatorsContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public Condition_symbolContext condition_symbol() {
			return getRuleContext(Condition_symbolContext.class,0);
		}
		public Operator_symbolContext operator_symbol() {
			return getRuleContext(Operator_symbolContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitCondition(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(165);
				operators();
				}
				break;
			case 2:
				{
				setState(166);
				variable();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(177);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(169);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(170);
						condition_symbol();
						setState(171);
						condition(5);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(173);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(174);
						operator_symbol();
						setState(175);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Condition_symbolContext extends ParserRuleContext {
		public Condition_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterCondition_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitCondition_symbol(this);
		}
	}

	public final Condition_symbolContext condition_symbol() throws RecognitionException {
		Condition_symbolContext _localctx = new Condition_symbolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
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

	public static class Operator_symbolContext extends ParserRuleContext {
		public Operator_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterOperator_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitOperator_symbol(this);
		}
	}

	public final Operator_symbolContext operator_symbol() throws RecognitionException {
		Operator_symbolContext _localctx = new Operator_symbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitComparison(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison);
		try {
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				number();
				setState(187);
				condition_symbol();
				setState(188);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(STRING);
				setState(191);
				match(T__19);
				setState(192);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(STRING);
				setState(194);
				match(T__20);
				setState(195);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(STRING);
				setState(197);
				match(T__21);
				setState(198);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(199);
				match(STRING);
				setState(200);
				match(T__22);
				setState(201);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(STRING);
				setState(203);
				match(T__23);
				setState(204);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\"\u00d2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3H\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\5\4\\\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7e\n\7\f\7\16\7h"+
		"\13\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085\n\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u009c\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a3\n\n\3\13\3\13\3\f\3\f\3"+
		"\f\5\f\u00aa\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00b4\n\f\f\f\16"+
		"\f\u00b7\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d0\n\17"+
		"\3\17\2\3\26\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\3\2\22\32\3\2"+
		"\3\7\2\u00e4\2&\3\2\2\2\4G\3\2\2\2\6[\3\2\2\2\b]\3\2\2\2\n_\3\2\2\2\f"+
		"m\3\2\2\2\16\u0084\3\2\2\2\20\u009b\3\2\2\2\22\u00a2\3\2\2\2\24\u00a4"+
		"\3\2\2\2\26\u00a9\3\2\2\2\30\u00b8\3\2\2\2\32\u00ba\3\2\2\2\34\u00cf\3"+
		"\2\2\2\36 \7\3\2\2\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3"+
		"\2\2\2#!\3\2\2\2$\'\7\33\2\2%\'\7\34\2\2&!\3\2\2\2&%\3\2\2\2\'\3\3\2\2"+
		"\2()\5\2\2\2)*\7\4\2\2*+\5\f\7\2+H\3\2\2\2,-\5\f\7\2-.\7\4\2\2./\5\2\2"+
		"\2/H\3\2\2\2\60\61\5\2\2\2\61\62\7\5\2\2\62\63\5\2\2\2\63H\3\2\2\2\64"+
		"\65\5\2\2\2\65\66\7\6\2\2\66\67\5\2\2\2\67H\3\2\2\289\5\2\2\29:\7\7\2"+
		"\2:;\5\2\2\2;H\3\2\2\2<=\7!\2\2=>\7\7\2\2>H\7!\2\2?@\5\2\2\2@A\7\3\2\2"+
		"AB\5\2\2\2BH\3\2\2\2CD\7 \2\2DE\5\32\16\2EF\7 \2\2FH\3\2\2\2G(\3\2\2\2"+
		"G,\3\2\2\2G\60\3\2\2\2G\64\3\2\2\2G8\3\2\2\2G<\3\2\2\2G?\3\2\2\2GC\3\2"+
		"\2\2H\5\3\2\2\2IJ\7 \2\2JK\7\b\2\2K\\\5\2\2\2LM\7 \2\2MN\7\b\2\2N\\\7"+
		"!\2\2OP\7 \2\2PQ\7\t\2\2Q\\\5\2\2\2RS\7 \2\2ST\7\n\2\2T\\\5\2\2\2UV\7"+
		" \2\2VW\7\n\2\2W\\\5\f\7\2XY\7 \2\2YZ\7\13\2\2Z\\\5\2\2\2[I\3\2\2\2[L"+
		"\3\2\2\2[O\3\2\2\2[R\3\2\2\2[U\3\2\2\2[X\3\2\2\2\\\7\3\2\2\2]^\7\f\2\2"+
		"^\t\3\2\2\2_`\7 \2\2`a\5\b\5\2ab\5\f\7\2b\13\3\2\2\2ce\7\3\2\2dc\3\2\2"+
		"\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hf\3\2\2\2in\7\33\2\2jn\7!\2"+
		"\2kn\7\34\2\2ln\7 \2\2mf\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2\2n\r\3\2"+
		"\2\2o\u0085\3\2\2\2pq\7\r\2\2qr\5\26\f\2rs\7\16\2\2st\7\17\2\2tu\5\24"+
		"\13\2uv\5\20\t\2v\u0085\3\2\2\2wx\7\r\2\2xy\5\26\f\2yz\7\16\2\2z{\7\17"+
		"\2\2{|\5\24\13\2|}\5\22\n\2}\u0085\3\2\2\2~\177\7\r\2\2\177\u0080\5\26"+
		"\f\2\u0080\u0081\7\16\2\2\u0081\u0082\7\17\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0085\3\2\2\2\u0084o\3\2\2\2\u0084p\3\2\2\2\u0084w\3\2\2\2\u0084~\3\2"+
		"\2\2\u0085\17\3\2\2\2\u0086\u009c\3\2\2\2\u0087\u0088\7\20\2\2\u0088\u0089"+
		"\5\26\f\2\u0089\u008a\7\16\2\2\u008a\u008b\7\17\2\2\u008b\u008c\5\24\13"+
		"\2\u008c\u008d\5\20\t\2\u008d\u009c\3\2\2\2\u008e\u008f\7\20\2\2\u008f"+
		"\u0090\5\26\f\2\u0090\u0091\7\16\2\2\u0091\u0092\7\17\2\2\u0092\u0093"+
		"\5\24\13\2\u0093\u0094\5\22\n\2\u0094\u009c\3\2\2\2\u0095\u0096\7\20\2"+
		"\2\u0096\u0097\5\26\f\2\u0097\u0098\7\16\2\2\u0098\u0099\7\17\2\2\u0099"+
		"\u009a\5\24\13\2\u009a\u009c\3\2\2\2\u009b\u0086\3\2\2\2\u009b\u0087\3"+
		"\2\2\2\u009b\u008e\3\2\2\2\u009b\u0095\3\2\2\2\u009c\21\3\2\2\2\u009d"+
		"\u00a3\3\2\2\2\u009e\u009f\7\21\2\2\u009f\u00a0\7\16\2\2\u00a0\u00a1\7"+
		"\17\2\2\u00a1\u00a3\5\24\13\2\u00a2\u009d\3\2\2\2\u00a2\u009e\3\2\2\2"+
		"\u00a3\23\3\2\2\2\u00a4\u00a5\5\6\4\2\u00a5\25\3\2\2\2\u00a6\u00a7\b\f"+
		"\1\2\u00a7\u00aa\5\4\3\2\u00a8\u00aa\5\f\7\2\u00a9\u00a6\3\2\2\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00b5\3\2\2\2\u00ab\u00ac\f\6\2\2\u00ac\u00ad\5\30"+
		"\r\2\u00ad\u00ae\5\26\f\7\u00ae\u00b4\3\2\2\2\u00af\u00b0\f\4\2\2\u00b0"+
		"\u00b1\5\32\16\2\u00b1\u00b2\5\26\f\5\u00b2\u00b4\3\2\2\2\u00b3\u00ab"+
		"\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00b9\t\2\2"+
		"\2\u00b9\31\3\2\2\2\u00ba\u00bb\t\3\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\5"+
		"\2\2\2\u00bd\u00be\5\30\r\2\u00be\u00bf\5\2\2\2\u00bf\u00d0\3\2\2\2\u00c0"+
		"\u00c1\7!\2\2\u00c1\u00c2\7\26\2\2\u00c2\u00d0\7!\2\2\u00c3\u00c4\7!\2"+
		"\2\u00c4\u00c5\7\27\2\2\u00c5\u00d0\7!\2\2\u00c6\u00c7\7!\2\2\u00c7\u00c8"+
		"\7\30\2\2\u00c8\u00d0\7!\2\2\u00c9\u00ca\7!\2\2\u00ca\u00cb\7\31\2\2\u00cb"+
		"\u00d0\7!\2\2\u00cc\u00cd\7!\2\2\u00cd\u00ce\7\32\2\2\u00ce\u00d0\7!\2"+
		"\2\u00cf\u00bc\3\2\2\2\u00cf\u00c0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf\u00c6"+
		"\3\2\2\2\u00cf\u00c9\3\2\2\2\u00cf\u00cc\3\2\2\2\u00d0\35\3\2\2\2\17!"+
		"&G[fm\u0084\u009b\u00a2\u00a9\u00b3\u00b5\u00cf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}