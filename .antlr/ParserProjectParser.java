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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, NUMBER=36, BOOL=37, INTEGER=38, 
		FLOAT=39, WHITESPACE=40, NAME=41, STRING=42, COMMENT=43;
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
			"'='", "'if '", "':'", "'\n\t'", "'elif '", "'else '", "'<'", "'>'", 
			"'>='", "'<='", "'=='", "'!='", "'and'", "'or'", "'not'", "'\n'", "'\t'", 
			"'\nreturn '", "'while'", "':\n\t'", "'for'", "'in'", "'def '", "'('", 
			"','", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUMBER", "BOOL", "INTEGER", "FLOAT", "WHITESPACE", "NAME", "STRING", 
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
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
			setState(105);
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
				match(NAME);
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
				match(T__6);
				setState(92);
				match(NAME);
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
				number();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				match(NAME);
				setState(97);
				match(T__7);
				setState(98);
				variable();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(NAME);
				setState(100);
				match(T__8);
				setState(101);
				number();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				match(NAME);
				setState(103);
				match(T__9);
				setState(104);
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
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
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
			setState(109);
			match(NAME);
			setState(110);
			assignment();
			setState(111);
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
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(113);
					match(T__0);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(BOOL);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(122);
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
			setState(146);
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
				setState(126);
				match(T__10);
				setState(127);
				condition(0);
				setState(128);
				match(T__11);
				setState(129);
				match(T__12);
				setState(130);
				expression();
				setState(131);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__10);
				setState(134);
				condition(0);
				setState(135);
				match(T__11);
				setState(136);
				match(T__12);
				setState(137);
				expression();
				setState(138);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(T__10);
				setState(141);
				condition(0);
				setState(142);
				match(T__11);
				setState(143);
				match(T__12);
				setState(144);
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
			setState(169);
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
				setState(149);
				match(T__13);
				setState(150);
				condition(0);
				setState(151);
				match(T__11);
				setState(152);
				match(T__12);
				setState(153);
				expression();
				setState(154);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__13);
				setState(157);
				condition(0);
				setState(158);
				match(T__11);
				setState(159);
				match(T__12);
				setState(160);
				expression();
				setState(161);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(T__13);
				setState(164);
				condition(0);
				setState(165);
				match(T__11);
				setState(166);
				match(T__12);
				setState(167);
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
			setState(176);
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
				setState(172);
				match(T__14);
				setState(173);
				match(T__11);
				setState(174);
				match(T__12);
				setState(175);
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
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_expression);
		try {
			setState(180);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				assignments();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
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
			setState(183);
			variable();
			}
			_ctx.stop = _input.LT(-1);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(193);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(185);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(186);
						condition_symbol();
						setState(187);
						condition(4);
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(189);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(190);
						operator_symbol();
						setState(191);
						condition(3);
						}
						break;
					}
					} 
				}
				setState(197);
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
	}

	public final Condition_symbolContext condition_symbol() throws RecognitionException {
		Condition_symbolContext _localctx = new Condition_symbolContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_condition_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
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
	}

	public final Operator_symbolContext operator_symbol() throws RecognitionException {
		Operator_symbolContext _localctx = new Operator_symbolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operator_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
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
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comparison);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				number();
				setState(203);
				condition_symbol();
				setState(204);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(STRING);
				setState(207);
				match(T__19);
				setState(208);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				match(STRING);
				setState(210);
				match(T__20);
				setState(211);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(212);
				match(STRING);
				setState(213);
				match(T__21);
				setState(214);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(STRING);
				setState(216);
				match(T__22);
				setState(217);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(218);
				match(STRING);
				setState(219);
				match(T__23);
				setState(220);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_block);
		int _la;
		try {
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				expression();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(232); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(224);
						match(T__24);
						setState(228);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__25) {
							{
							{
							setState(225);
							match(T__25);
							}
							}
							setState(230);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(231);
						expression();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(234); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				while_loop();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				for_loop();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(T__26);
				setState(239);
				variable();
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

	public static class While_loopContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_while_loop);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__27);
			setState(243);
			condition(0);
			setState(244);
			match(T__28);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__12) {
						{
						{
						setState(245);
						match(T__12);
						}
						}
						setState(250);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(251);
					block();
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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

	public static class For_loopContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_for_loop);
		int _la;
		try {
			int _alt;
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				match(T__29);
				setState(258);
				match(NAME);
				setState(259);
				match(T__30);
				setState(260);
				match(NAME);
				setState(261);
				match(T__28);
				setState(271);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(265);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(262);
							match(T__12);
							}
							}
							setState(267);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(268);
						block();
						}
						} 
					}
					setState(273);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				match(T__29);
				setState(275);
				match(NAME);
				setState(276);
				match(T__30);
				setState(277);
				function_call();
				setState(278);
				match(T__28);
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(282);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==T__12) {
							{
							{
							setState(279);
							match(T__12);
							}
							}
							setState(284);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(285);
						block();
						}
						} 
					}
					setState(290);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(T__31);
			setState(294);
			function_call();
			setState(295);
			match(T__28);
			setState(305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__24) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << NAME))) != 0)) {
				{
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__12) {
					{
					{
					setState(296);
					match(T__12);
					}
					}
					setState(301);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(302);
				block();
				}
				}
				setState(307);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ParserProjectParser.NAME, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<Function_callContext> function_call() {
			return getRuleContexts(Function_callContext.class);
		}
		public Function_callContext function_call(int i) {
			return getRuleContext(Function_callContext.class,i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_function_call);
		int _la;
		try {
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(308);
				match(NAME);
				setState(309);
				match(T__32);
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << BOOL) | (1L << NAME) | (1L << STRING))) != 0)) {
					{
					setState(310);
					variable();
					setState(315);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__33) {
						{
						{
						setState(311);
						match(T__33);
						setState(312);
						variable();
						}
						}
						setState(317);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(320);
				match(T__34);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				match(NAME);
				setState(322);
				match(T__32);
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(323);
					function_call();
					setState(328);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__33) {
						{
						{
						setState(324);
						match(T__33);
						setState(325);
						variable();
						}
						}
						setState(330);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(333);
				match(T__34);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(NAME);
				setState(335);
				match(T__32);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << NUMBER) | (1L << BOOL) | (1L << NAME) | (1L << STRING))) != 0)) {
					{
					setState(336);
					variable();
					setState(341);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__33) {
						{
						{
						setState(337);
						match(T__33);
						setState(338);
						function_call();
						}
						}
						setState(343);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(346);
				match(T__34);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(347);
				match(NAME);
				setState(348);
				match(T__32);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NAME) {
					{
					setState(349);
					function_call();
					setState(354);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__33) {
						{
						{
						setState(350);
						match(T__33);
						setState(351);
						function_call();
						}
						}
						setState(356);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(359);
				match(T__34);
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
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u016d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3\2\3\2\5\2\61\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3R\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4l\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7u\n\7\f\7\16"+
		"\7x\13\7\3\7\3\7\3\7\3\7\5\7~\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0095\n\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u00ac\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00b3\n\n\3\13\3\13\5\13"+
		"\u00b7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00c4\n\f"+
		"\f\f\16\f\u00c7\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00e0"+
		"\n\17\3\20\3\20\3\20\7\20\u00e5\n\20\f\20\16\20\u00e8\13\20\3\20\6\20"+
		"\u00eb\n\20\r\20\16\20\u00ec\3\20\3\20\3\20\3\20\5\20\u00f3\n\20\3\21"+
		"\3\21\3\21\3\21\7\21\u00f9\n\21\f\21\16\21\u00fc\13\21\3\21\7\21\u00ff"+
		"\n\21\f\21\16\21\u0102\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u010a"+
		"\n\22\f\22\16\22\u010d\13\22\3\22\7\22\u0110\n\22\f\22\16\22\u0113\13"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u011b\n\22\f\22\16\22\u011e\13"+
		"\22\3\22\7\22\u0121\n\22\f\22\16\22\u0124\13\22\5\22\u0126\n\22\3\23\3"+
		"\23\3\23\3\23\7\23\u012c\n\23\f\23\16\23\u012f\13\23\3\23\7\23\u0132\n"+
		"\23\f\23\16\23\u0135\13\23\3\24\3\24\3\24\3\24\3\24\7\24\u013c\n\24\f"+
		"\24\16\24\u013f\13\24\5\24\u0141\n\24\3\24\3\24\3\24\3\24\3\24\3\24\7"+
		"\24\u0149\n\24\f\24\16\24\u014c\13\24\5\24\u014e\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\7\24\u0156\n\24\f\24\16\24\u0159\13\24\5\24\u015b\n\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\7\24\u0163\n\24\f\24\16\24\u0166\13\24\5"+
		"\24\u0168\n\24\3\24\5\24\u016b\n\24\3\24\2\3\26\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\4\3\2\22\32\3\2\3\7\2\u0196\2\60\3\2\2\2\4Q"+
		"\3\2\2\2\6k\3\2\2\2\bm\3\2\2\2\no\3\2\2\2\f}\3\2\2\2\16\u0094\3\2\2\2"+
		"\20\u00ab\3\2\2\2\22\u00b2\3\2\2\2\24\u00b6\3\2\2\2\26\u00b8\3\2\2\2\30"+
		"\u00c8\3\2\2\2\32\u00ca\3\2\2\2\34\u00df\3\2\2\2\36\u00f2\3\2\2\2 \u00f4"+
		"\3\2\2\2\"\u0125\3\2\2\2$\u0127\3\2\2\2&\u016a\3\2\2\2(*\7\3\2\2)(\3\2"+
		"\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2.\61\7&\2\2/\61"+
		"\7\'\2\2\60+\3\2\2\2\60/\3\2\2\2\61\3\3\2\2\2\62\63\5\2\2\2\63\64\7\4"+
		"\2\2\64\65\5\f\7\2\65R\3\2\2\2\66\67\5\f\7\2\678\7\4\2\289\5\2\2\29R\3"+
		"\2\2\2:;\5\2\2\2;<\7\5\2\2<=\5\2\2\2=R\3\2\2\2>?\5\2\2\2?@\7\6\2\2@A\5"+
		"\2\2\2AR\3\2\2\2BC\5\2\2\2CD\7\7\2\2DE\5\2\2\2ER\3\2\2\2FG\7,\2\2GH\7"+
		"\7\2\2HR\7,\2\2IJ\5\2\2\2JK\7\3\2\2KL\5\2\2\2LR\3\2\2\2MN\7+\2\2NO\5\32"+
		"\16\2OP\7+\2\2PR\3\2\2\2Q\62\3\2\2\2Q\66\3\2\2\2Q:\3\2\2\2Q>\3\2\2\2Q"+
		"B\3\2\2\2QF\3\2\2\2QI\3\2\2\2QM\3\2\2\2R\5\3\2\2\2ST\7+\2\2TU\7\b\2\2"+
		"Ul\5\2\2\2VW\7+\2\2WX\7\b\2\2Xl\7+\2\2YZ\7+\2\2Z[\7\t\2\2[l\5\2\2\2\\"+
		"]\7+\2\2]^\7\t\2\2^l\7+\2\2_`\7+\2\2`a\7\n\2\2al\5\2\2\2bc\7+\2\2cd\7"+
		"\n\2\2dl\5\f\7\2ef\7+\2\2fg\7\13\2\2gl\5\2\2\2hi\7+\2\2ij\7\f\2\2jl\5"+
		"\f\7\2kS\3\2\2\2kV\3\2\2\2kY\3\2\2\2k\\\3\2\2\2k_\3\2\2\2kb\3\2\2\2ke"+
		"\3\2\2\2kh\3\2\2\2l\7\3\2\2\2mn\7\f\2\2n\t\3\2\2\2op\7+\2\2pq\5\b\5\2"+
		"qr\5\f\7\2r\13\3\2\2\2su\7\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2"+
		"\2wy\3\2\2\2xv\3\2\2\2y~\7&\2\2z~\7,\2\2{~\7\'\2\2|~\7+\2\2}v\3\2\2\2"+
		"}z\3\2\2\2}{\3\2\2\2}|\3\2\2\2~\r\3\2\2\2\177\u0095\3\2\2\2\u0080\u0081"+
		"\7\r\2\2\u0081\u0082\5\26\f\2\u0082\u0083\7\16\2\2\u0083\u0084\7\17\2"+
		"\2\u0084\u0085\5\24\13\2\u0085\u0086\5\20\t\2\u0086\u0095\3\2\2\2\u0087"+
		"\u0088\7\r\2\2\u0088\u0089\5\26\f\2\u0089\u008a\7\16\2\2\u008a\u008b\7"+
		"\17\2\2\u008b\u008c\5\24\13\2\u008c\u008d\5\22\n\2\u008d\u0095\3\2\2\2"+
		"\u008e\u008f\7\r\2\2\u008f\u0090\5\26\f\2\u0090\u0091\7\16\2\2\u0091\u0092"+
		"\7\17\2\2\u0092\u0093\5\24\13\2\u0093\u0095\3\2\2\2\u0094\177\3\2\2\2"+
		"\u0094\u0080\3\2\2\2\u0094\u0087\3\2\2\2\u0094\u008e\3\2\2\2\u0095\17"+
		"\3\2\2\2\u0096\u00ac\3\2\2\2\u0097\u0098\7\20\2\2\u0098\u0099\5\26\f\2"+
		"\u0099\u009a\7\16\2\2\u009a\u009b\7\17\2\2\u009b\u009c\5\24\13\2\u009c"+
		"\u009d\5\20\t\2\u009d\u00ac\3\2\2\2\u009e\u009f\7\20\2\2\u009f\u00a0\5"+
		"\26\f\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\7\17\2\2\u00a2\u00a3\5\24\13"+
		"\2\u00a3\u00a4\5\22\n\2\u00a4\u00ac\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6"+
		"\u00a7\5\26\f\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7\17\2\2\u00a9\u00aa"+
		"\5\24\13\2\u00aa\u00ac\3\2\2\2\u00ab\u0096\3\2\2\2\u00ab\u0097\3\2\2\2"+
		"\u00ab\u009e\3\2\2\2\u00ab\u00a5\3\2\2\2\u00ac\21\3\2\2\2\u00ad\u00b3"+
		"\3\2\2\2\u00ae\u00af\7\21\2\2\u00af\u00b0\7\16\2\2\u00b0\u00b1\7\17\2"+
		"\2\u00b1\u00b3\5\24\13\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3"+
		"\23\3\2\2\2\u00b4\u00b7\5\6\4\2\u00b5\u00b7\5&\24\2\u00b6\u00b4\3\2\2"+
		"\2\u00b6\u00b5\3\2\2\2\u00b7\25\3\2\2\2\u00b8\u00b9\b\f\1\2\u00b9\u00ba"+
		"\5\f\7\2\u00ba\u00c5\3\2\2\2\u00bb\u00bc\f\5\2\2\u00bc\u00bd\5\30\r\2"+
		"\u00bd\u00be\5\26\f\6\u00be\u00c4\3\2\2\2\u00bf\u00c0\f\4\2\2\u00c0\u00c1"+
		"\5\32\16\2\u00c1\u00c2\5\26\f\5\u00c2\u00c4\3\2\2\2\u00c3\u00bb\3\2\2"+
		"\2\u00c3\u00bf\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6"+
		"\3\2\2\2\u00c6\27\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\t\2\2\2\u00c9"+
		"\31\3\2\2\2\u00ca\u00cb\t\3\2\2\u00cb\33\3\2\2\2\u00cc\u00cd\5\2\2\2\u00cd"+
		"\u00ce\5\30\r\2\u00ce\u00cf\5\2\2\2\u00cf\u00e0\3\2\2\2\u00d0\u00d1\7"+
		",\2\2\u00d1\u00d2\7\26\2\2\u00d2\u00e0\7,\2\2\u00d3\u00d4\7,\2\2\u00d4"+
		"\u00d5\7\27\2\2\u00d5\u00e0\7,\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8\7\30"+
		"\2\2\u00d8\u00e0\7,\2\2\u00d9\u00da\7,\2\2\u00da\u00db\7\31\2\2\u00db"+
		"\u00e0\7,\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7\32\2\2\u00de\u00e0\7,\2"+
		"\2\u00df\u00cc\3\2\2\2\u00df\u00d0\3\2\2\2\u00df\u00d3\3\2\2\2\u00df\u00d6"+
		"\3\2\2\2\u00df\u00d9\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\35\3\2\2\2\u00e1"+
		"\u00f3\5\24\13\2\u00e2\u00e6\7\33\2\2\u00e3\u00e5\7\34\2\2\u00e4\u00e3"+
		"\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\5\24\13\2\u00ea\u00e2\3"+
		"\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"\u00f3\3\2\2\2\u00ee\u00f3\5 \21\2\u00ef\u00f3\5\"\22\2\u00f0\u00f1\7"+
		"\35\2\2\u00f1\u00f3\5\f\7\2\u00f2\u00e1\3\2\2\2\u00f2\u00ea\3\2\2\2\u00f2"+
		"\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\37\3\2\2"+
		"\2\u00f4\u00f5\7\36\2\2\u00f5\u00f6\5\26\f\2\u00f6\u0100\7\37\2\2\u00f7"+
		"\u00f9\7\17\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3"+
		"\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00ff\5\36\20\2\u00fe\u00fa\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3"+
		"\2\2\2\u0100\u0101\3\2\2\2\u0101!\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104"+
		"\7 \2\2\u0104\u0105\7+\2\2\u0105\u0106\7!\2\2\u0106\u0107\7+\2\2\u0107"+
		"\u0111\7\37\2\2\u0108\u010a\7\17\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0110\5\36\20\2\u010f\u010b\3\2\2\2\u0110\u0113\3"+
		"\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0126\3\2\2\2\u0113"+
		"\u0111\3\2\2\2\u0114\u0115\7 \2\2\u0115\u0116\7+\2\2\u0116\u0117\7!\2"+
		"\2\u0117\u0118\5&\24\2\u0118\u0122\7\37\2\2\u0119\u011b\7\17\2\2\u011a"+
		"\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2"+
		"\2\2\u011d\u011f\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0121\5\36\20\2\u0120"+
		"\u011c\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2"+
		"\2\2\u0123\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0103\3\2\2\2\u0125"+
		"\u0114\3\2\2\2\u0126#\3\2\2\2\u0127\u0128\7\"\2\2\u0128\u0129\5&\24\2"+
		"\u0129\u0133\7\37\2\2\u012a\u012c\7\17\2\2\u012b\u012a\3\2\2\2\u012c\u012f"+
		"\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u0130\u0132\5\36\20\2\u0131\u012d\3\2\2\2\u0132\u0135\3"+
		"\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2\2\2\u0134%\3\2\2\2\u0135\u0133"+
		"\3\2\2\2\u0136\u0137\7+\2\2\u0137\u0140\7#\2\2\u0138\u013d\5\f\7\2\u0139"+
		"\u013a\7$\2\2\u013a\u013c\5\f\7\2\u013b\u0139\3\2\2\2\u013c\u013f\3\2"+
		"\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0138\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\u016b\7%\2\2\u0143\u0144\7+\2\2\u0144\u014d\7#\2\2\u0145\u014a"+
		"\5&\24\2\u0146\u0147\7$\2\2\u0147\u0149\5\f\7\2\u0148\u0146\3\2\2\2\u0149"+
		"\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014e\3\2"+
		"\2\2\u014c\u014a\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u014e\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u016b\7%\2\2\u0150\u0151\7+\2\2\u0151\u015a\7#\2"+
		"\2\u0152\u0157\5\f\7\2\u0153\u0154\7$\2\2\u0154\u0156\5&\24\2\u0155\u0153"+
		"\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u016b\7%\2\2\u015d\u015e\7+\2\2\u015e\u0167"+
		"\7#\2\2\u015f\u0164\5&\24\2\u0160\u0161\7$\2\2\u0161\u0163\5&\24\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0166\3\2\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2"+
		"\2\2\u0165\u0168\3\2\2\2\u0166\u0164\3\2\2\2\u0167\u015f\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016b\7%\2\2\u016a\u0136\3\2"+
		"\2\2\u016a\u0143\3\2\2\2\u016a\u0150\3\2\2\2\u016a\u015d\3\2\2\2\u016b"+
		"\'\3\2\2\2$+\60Qkv}\u0094\u00ab\u00b2\u00b6\u00c3\u00c5\u00df\u00e6\u00ec"+
		"\u00f2\u00fa\u0100\u010b\u0111\u011c\u0122\u0125\u012d\u0133\u013d\u0140"+
		"\u014a\u014d\u0157\u015a\u0164\u0167\u016a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}