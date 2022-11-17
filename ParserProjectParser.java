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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, NUMBER=34, BOOL=35, INTEGER=36, FLOAT=37, WHITESPACE=38, 
		NAME=39, STRING=40, COMMENT=41;
	public static final int
		RULE_number = 0, RULE_operators = 1, RULE_assignments = 2, RULE_assignment = 3, 
		RULE_variable_assignment = 4, RULE_variable = 5, RULE_if_statement = 6, 
		RULE_elif_statement = 7, RULE_else_statement = 8, RULE_expression = 9, 
		RULE_condition = 10, RULE_condition_symbol = 11, RULE_operator_symbol = 12, 
		RULE_comparison = 13, RULE_block = 14, RULE_while_loop = 15, RULE_for_loop = 16, 
		RULE_function = 17, RULE_function_call = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"number", "operators", "assignments", "assignment", "variable_assignment", 
			"variable", "if_statement", "elif_statement", "else_statement", "expression", 
			"condition", "condition_symbol", "operator_symbol", "comparison", "block", 
			"while_loop", "for_loop", "function", "function_call"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'*'", "'/'", "'%'", "'+'", "'+='", "'-='", "'*='", "'/='", 
			"'='", "'if'", "':'", "'\n\t'", "'elif'", "'else'", "'<'", "'>'", "'>='", 
			"'<='", "'=='", "'!='", "'and'", "'or'", "'not'", "'\n'", "'\t'", "'while'", 
			"':\n\t'", "'for'", "'in'", "'('", "','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "NUMBER", 
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
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
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
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
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				number();
				setState(49);
				match(T__1);
				setState(50);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				variable();
				setState(53);
				match(T__1);
				setState(54);
				number();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				number();
				setState(57);
				match(T__2);
				setState(58);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				number();
				setState(61);
				match(T__3);
				setState(62);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				number();
				setState(65);
				match(T__4);
				setState(66);
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(68);
				match(STRING);
				setState(69);
				match(T__4);
				setState(70);
				match(STRING);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(71);
				number();
				setState(72);
				match(T__0);
				setState(73);
				number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(75);
				match(NAME);
				setState(76);
				operator_symbol();
				setState(77);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(NAME);
				setState(82);
				match(T__5);
				setState(83);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(NAME);
				setState(85);
				match(T__5);
				setState(86);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				match(NAME);
				setState(88);
				match(T__6);
				setState(89);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(NAME);
				setState(91);
				match(T__7);
				setState(92);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				match(NAME);
				setState(94);
				match(T__7);
				setState(95);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(NAME);
				setState(97);
				match(T__8);
				setState(98);
				number();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(NAME);
				setState(100);
				match(T__9);
				setState(101);
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
			setState(104);
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
			setState(106);
			match(NAME);
			setState(107);
			assignment();
			setState(108);
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
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(110);
					match(T__0);
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(116);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				match(BOOL);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
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
			setState(143);
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
				setState(123);
				match(T__10);
				setState(124);
				condition(0);
				setState(125);
				match(T__11);
				setState(126);
				match(T__12);
				setState(127);
				expression();
				setState(128);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__10);
				setState(131);
				condition(0);
				setState(132);
				match(T__11);
				setState(133);
				match(T__12);
				setState(134);
				expression();
				setState(135);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(137);
				match(T__10);
				setState(138);
				condition(0);
				setState(139);
				match(T__11);
				setState(140);
				match(T__12);
				setState(141);
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
			setState(166);
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
				setState(146);
				match(T__13);
				setState(147);
				condition(0);
				setState(148);
				match(T__11);
				setState(149);
				match(T__12);
				setState(150);
				expression();
				setState(151);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(153);
				match(T__13);
				setState(154);
				condition(0);
				setState(155);
				match(T__11);
				setState(156);
				match(T__12);
				setState(157);
				expression();
				setState(158);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				match(T__13);
				setState(161);
				condition(0);
				setState(162);
				match(T__11);
				setState(163);
				match(T__12);
				setState(164);
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
			setState(173);
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
				setState(169);
				match(T__14);
				setState(170);
				match(T__11);
				setState(171);
				match(T__12);
				setState(172);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
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
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				function_call();
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

	public static class ConditionContext extends ParserRuleContext {
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
			{
			setState(180);
			variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(182);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(183);
						condition_symbol();
						setState(184);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(186);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(187);
						operator_symbol();
						setState(188);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(194);
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
			setState(195);
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
			setState(197);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				number();
				setState(200);
				condition_symbol();
				setState(201);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(STRING);
				setState(204);
				match(T__19);
				setState(205);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				match(STRING);
				setState(207);
				match(T__20);
				setState(208);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(209);
				match(STRING);
				setState(210);
				match(T__21);
				setState(211);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				match(STRING);
				setState(213);
				match(T__22);
				setState(214);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(215);
				match(STRING);
				setState(216);
				match(T__23);
				setState(217);
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

	public static class BlockContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			int _alt;
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						match(T__24);
						setState(225);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__25) {
							{
							{
							setState(222);
							match(T__25);
							}
							}
							setState(227);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(228);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(233);
				while_loop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(234);
				for_loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class While_loopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitWhile_loop(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__26);
			setState(239);
			condition(0);
			setState(240);
			match(T__27);
			setState(241);
			block();
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

	public static class For_loopContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitFor_loop(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_loop);
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				match(T__28);
				setState(244);
				match(NAME);
				setState(245);
				match(T__29);
				setState(246);
				match(NAME);
				setState(247);
				match(T__27);
				setState(248);
				expression();
				setState(253);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(249);
						match(T__12);
						setState(250);
						expression();
						}
						} 
					}
					setState(255);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(T__28);
				setState(257);
				match(NAME);
				setState(258);
				match(T__29);
				setState(259);
				function_call();
				setState(260);
				match(T__27);
				setState(261);
				expression();
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(262);
						match(T__12);
						setState(263);
						expression();
						}
						} 
					}
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(ParserProjectParser.BOOL, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(BOOL);
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

	public static class Function_callContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserProjectListener ) ((ParserProjectListener)listener).exitFunction_call(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(NAME);
			setState(274);
			match(T__30);
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(275);
				match(NAME);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__31) {
					{
					{
					setState(276);
					match(T__31);
					setState(277);
					match(NAME);
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(285);
			match(T__32);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4i\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7r\n\7\f\7\16\7u\13\7\3"+
		"\7\3\7\3\7\3\7\5\7{\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0092\n\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00a9\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\5\13\u00b4\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c1\n\f\f\f\16\f\u00c4"+
		"\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00dd\n\17\3\20"+
		"\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13\20\3\20\6\20\u00e8\n\20"+
		"\r\20\16\20\u00e9\3\20\3\20\3\20\5\20\u00ef\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00fe\n\22\f\22\16\22"+
		"\u0101\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010b\n\22\f"+
		"\22\16\22\u010e\13\22\5\22\u0110\n\22\3\23\3\23\3\24\3\24\3\24\3\24\3"+
		"\24\7\24\u0119\n\24\f\24\16\24\u011c\13\24\5\24\u011e\n\24\3\24\3\24\3"+
		"\24\2\3\26\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\22\32"+
		"\3\2\3\7\2\u013b\2\60\3\2\2\2\4Q\3\2\2\2\6h\3\2\2\2\bj\3\2\2\2\nl\3\2"+
		"\2\2\fz\3\2\2\2\16\u0091\3\2\2\2\20\u00a8\3\2\2\2\22\u00af\3\2\2\2\24"+
		"\u00b3\3\2\2\2\26\u00b5\3\2\2\2\30\u00c5\3\2\2\2\32\u00c7\3\2\2\2\34\u00dc"+
		"\3\2\2\2\36\u00ee\3\2\2\2 \u00f0\3\2\2\2\"\u010f\3\2\2\2$\u0111\3\2\2"+
		"\2&\u0113\3\2\2\2(*\7\3\2\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,."+
		"\3\2\2\2-+\3\2\2\2.\61\7$\2\2/\61\7%\2\2\60+\3\2\2\2\60/\3\2\2\2\61\3"+
		"\3\2\2\2\62\63\5\2\2\2\63\64\7\4\2\2\64\65\5\f\7\2\65R\3\2\2\2\66\67\5"+
		"\f\7\2\678\7\4\2\289\5\2\2\29R\3\2\2\2:;\5\2\2\2;<\7\5\2\2<=\5\2\2\2="+
		"R\3\2\2\2>?\5\2\2\2?@\7\6\2\2@A\5\2\2\2AR\3\2\2\2BC\5\2\2\2CD\7\7\2\2"+
		"DE\5\2\2\2ER\3\2\2\2FG\7*\2\2GH\7\7\2\2HR\7*\2\2IJ\5\2\2\2JK\7\3\2\2K"+
		"L\5\2\2\2LR\3\2\2\2MN\7)\2\2NO\5\32\16\2OP\7)\2\2PR\3\2\2\2Q\62\3\2\2"+
		"\2Q\66\3\2\2\2Q:\3\2\2\2Q>\3\2\2\2QB\3\2\2\2QF\3\2\2\2QI\3\2\2\2QM\3\2"+
		"\2\2R\5\3\2\2\2ST\7)\2\2TU\7\b\2\2Ui\5\2\2\2VW\7)\2\2WX\7\b\2\2Xi\7*\2"+
		"\2YZ\7)\2\2Z[\7\t\2\2[i\5\2\2\2\\]\7)\2\2]^\7\n\2\2^i\5\2\2\2_`\7)\2\2"+
		"`a\7\n\2\2ai\5\f\7\2bc\7)\2\2cd\7\13\2\2di\5\2\2\2ef\7)\2\2fg\7\f\2\2"+
		"gi\5\f\7\2hS\3\2\2\2hV\3\2\2\2hY\3\2\2\2h\\\3\2\2\2h_\3\2\2\2hb\3\2\2"+
		"\2he\3\2\2\2i\7\3\2\2\2jk\7\f\2\2k\t\3\2\2\2lm\7)\2\2mn\5\b\5\2no\5\f"+
		"\7\2o\13\3\2\2\2pr\7\3\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3"+
		"\2\2\2us\3\2\2\2v{\7$\2\2w{\7*\2\2x{\7%\2\2y{\7)\2\2zs\3\2\2\2zw\3\2\2"+
		"\2zx\3\2\2\2zy\3\2\2\2{\r\3\2\2\2|\u0092\3\2\2\2}~\7\r\2\2~\177\5\26\f"+
		"\2\177\u0080\7\16\2\2\u0080\u0081\7\17\2\2\u0081\u0082\5\24\13\2\u0082"+
		"\u0083\5\20\t\2\u0083\u0092\3\2\2\2\u0084\u0085\7\r\2\2\u0085\u0086\5"+
		"\26\f\2\u0086\u0087\7\16\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5\24\13"+
		"\2\u0089\u008a\5\22\n\2\u008a\u0092\3\2\2\2\u008b\u008c\7\r\2\2\u008c"+
		"\u008d\5\26\f\2\u008d\u008e\7\16\2\2\u008e\u008f\7\17\2\2\u008f\u0090"+
		"\5\24\13\2\u0090\u0092\3\2\2\2\u0091|\3\2\2\2\u0091}\3\2\2\2\u0091\u0084"+
		"\3\2\2\2\u0091\u008b\3\2\2\2\u0092\17\3\2\2\2\u0093\u00a9\3\2\2\2\u0094"+
		"\u0095\7\20\2\2\u0095\u0096\5\26\f\2\u0096\u0097\7\16\2\2\u0097\u0098"+
		"\7\17\2\2\u0098\u0099\5\24\13\2\u0099\u009a\5\20\t\2\u009a\u00a9\3\2\2"+
		"\2\u009b\u009c\7\20\2\2\u009c\u009d\5\26\f\2\u009d\u009e\7\16\2\2\u009e"+
		"\u009f\7\17\2\2\u009f\u00a0\5\24\13\2\u00a0\u00a1\5\22\n\2\u00a1\u00a9"+
		"\3\2\2\2\u00a2\u00a3\7\20\2\2\u00a3\u00a4\5\26\f\2\u00a4\u00a5\7\16\2"+
		"\2\u00a5\u00a6\7\17\2\2\u00a6\u00a7\5\24\13\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u0093\3\2\2\2\u00a8\u0094\3\2\2\2\u00a8\u009b\3\2\2\2\u00a8\u00a2\3\2"+
		"\2\2\u00a9\21\3\2\2\2\u00aa\u00b0\3\2\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad"+
		"\7\16\2\2\u00ad\u00ae\7\17\2\2\u00ae\u00b0\5\24\13\2\u00af\u00aa\3\2\2"+
		"\2\u00af\u00ab\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b4\5\6\4\2\u00b2\u00b4"+
		"\5&\24\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\25\3\2\2\2\u00b5"+
		"\u00b6\b\f\1\2\u00b6\u00b7\5\f\7\2\u00b7\u00c2\3\2\2\2\u00b8\u00b9\f\5"+
		"\2\2\u00b9\u00ba\5\30\r\2\u00ba\u00bb\5\26\f\6\u00bb\u00c1\3\2\2\2\u00bc"+
		"\u00bd\f\4\2\2\u00bd\u00be\5\32\16\2\u00be\u00bf\5\26\f\5\u00bf\u00c1"+
		"\3\2\2\2\u00c0\u00b8\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\27\3\2\2\2\u00c4\u00c2\3\2\2"+
		"\2\u00c5\u00c6\t\2\2\2\u00c6\31\3\2\2\2\u00c7\u00c8\t\3\2\2\u00c8\33\3"+
		"\2\2\2\u00c9\u00ca\5\2\2\2\u00ca\u00cb\5\30\r\2\u00cb\u00cc\5\2\2\2\u00cc"+
		"\u00dd\3\2\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7\26\2\2\u00cf\u00dd\7*"+
		"\2\2\u00d0\u00d1\7*\2\2\u00d1\u00d2\7\27\2\2\u00d2\u00dd\7*\2\2\u00d3"+
		"\u00d4\7*\2\2\u00d4\u00d5\7\30\2\2\u00d5\u00dd\7*\2\2\u00d6\u00d7\7*\2"+
		"\2\u00d7\u00d8\7\31\2\2\u00d8\u00dd\7*\2\2\u00d9\u00da\7*\2\2\u00da\u00db"+
		"\7\32\2\2\u00db\u00dd\7*\2\2\u00dc\u00c9\3\2\2\2\u00dc\u00cd\3\2\2\2\u00dc"+
		"\u00d0\3\2\2\2\u00dc\u00d3\3\2\2\2\u00dc\u00d6\3\2\2\2\u00dc\u00d9\3\2"+
		"\2\2\u00dd\35\3\2\2\2\u00de\u00ef\5\24\13\2\u00df\u00e3\7\33\2\2\u00e0"+
		"\u00e2\7\34\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3"+
		"\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e8\5\24\13\2\u00e7\u00df\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ef\3\2\2\2\u00eb\u00ef\5 \21\2\u00ec"+
		"\u00ef\5\"\22\2\u00ed\u00ef\3\2\2\2\u00ee\u00de\3\2\2\2\u00ee\u00e7\3"+
		"\2\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\37\3\2\2\2\u00f0\u00f1\7\35\2\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3\7\36"+
		"\2\2\u00f3\u00f4\5\36\20\2\u00f4!\3\2\2\2\u00f5\u00f6\7\37\2\2\u00f6\u00f7"+
		"\7)\2\2\u00f7\u00f8\7 \2\2\u00f8\u00f9\7)\2\2\u00f9\u00fa\7\36\2\2\u00fa"+
		"\u00ff\5\24\13\2\u00fb\u00fc\7\17\2\2\u00fc\u00fe\5\24\13\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0110\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7\37\2\2\u0103\u0104\7"+
		")\2\2\u0104\u0105\7 \2\2\u0105\u0106\5&\24\2\u0106\u0107\7\36\2\2\u0107"+
		"\u010c\5\24\13\2\u0108\u0109\7\17\2\2\u0109\u010b\5\24\13\2\u010a\u0108"+
		"\3\2\2\2\u010b\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010f\u00f5\3\2\2\2\u010f\u0102\3\2"+
		"\2\2\u0110#\3\2\2\2\u0111\u0112\7%\2\2\u0112%\3\2\2\2\u0113\u0114\7)\2"+
		"\2\u0114\u011d\7!\2\2\u0115\u011a\7)\2\2\u0116\u0117\7\"\2\2\u0117\u0119"+
		"\7)\2\2\u0118\u0116\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011a"+
		"\u011b\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011d\u0115\3\2"+
		"\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7#\2\2\u0120"+
		"\'\3\2\2\2\27+\60Qhsz\u0091\u00a8\u00af\u00b3\u00c0\u00c2\u00dc\u00e3"+
		"\u00e9\u00ee\u00ff\u010c\u010f\u011a\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}