// Generated from /Users/ankitjain/CS4450Project/CS4450ParserProject/ParserProject.g4 by ANTLR 4.9.2
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
		COMMENT=32, OPERATOR_SYMBOL=33;
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
			"COMMENT", "OPERATOR_SYMBOL"
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
		public List<TerminalNode> NAME() { return getTokens(ParserProjectParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(ParserProjectParser.NAME, i);
		}
		public TerminalNode OPERATOR_SYMBOL() { return getToken(ParserProjectParser.OPERATOR_SYMBOL, 0); }
		public OperatorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operators; }
	}

	public final OperatorsContext operators() throws RecognitionException {
		OperatorsContext _localctx = new OperatorsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_operators);
		try {
			setState(66);
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
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				match(NAME);
				setState(64);
				match(OPERATOR_SYMBOL);
				setState(65);
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
	}

	public final AssignmentsContext assignments() throws RecognitionException {
		AssignmentsContext _localctx = new AssignmentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignments);
		try {
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(NAME);
				setState(69);
				match(T__5);
				setState(70);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(NAME);
				setState(72);
				match(T__5);
				setState(73);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(NAME);
				setState(75);
				match(T__6);
				setState(76);
				number();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(NAME);
				setState(78);
				match(T__7);
				setState(79);
				number();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				match(NAME);
				setState(81);
				match(T__7);
				setState(82);
				variable();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				match(NAME);
				setState(84);
				match(T__8);
				setState(85);
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
			setState(88);
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
			setState(90);
			match(NAME);
			setState(91);
			assignment();
			setState(92);
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
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(94);
					match(T__0);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(100);
				match(NUMBER);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				match(STRING);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(BOOL);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
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
			setState(127);
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
				setState(107);
				match(T__10);
				setState(108);
				condition();
				setState(109);
				match(T__11);
				setState(110);
				match(T__12);
				setState(111);
				expression();
				setState(112);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				match(T__10);
				setState(115);
				condition();
				setState(116);
				match(T__11);
				setState(117);
				match(T__12);
				setState(118);
				expression();
				setState(119);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(121);
				match(T__10);
				setState(122);
				condition();
				setState(123);
				match(T__11);
				setState(124);
				match(T__12);
				setState(125);
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
			setState(150);
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
				setState(130);
				match(T__13);
				setState(131);
				condition();
				setState(132);
				match(T__11);
				setState(133);
				match(T__12);
				setState(134);
				expression();
				setState(135);
				elif_statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(T__13);
				setState(138);
				condition();
				setState(139);
				match(T__11);
				setState(140);
				match(T__12);
				setState(141);
				expression();
				setState(142);
				else_statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				match(T__13);
				setState(145);
				condition();
				setState(146);
				match(T__11);
				setState(147);
				match(T__12);
				setState(148);
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
			setState(157);
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
				setState(153);
				match(T__14);
				setState(154);
				match(T__11);
				setState(155);
				match(T__12);
				setState(156);
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
			setState(159);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				variable();
				setState(163);
				condition_symbol();
				setState(164);
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
			setState(168);
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				number();
				setState(171);
				condition_symbol();
				setState(172);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(STRING);
				setState(175);
				match(T__19);
				setState(176);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				match(STRING);
				setState(178);
				match(T__20);
				setState(179);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(STRING);
				setState(181);
				match(T__21);
				setState(182);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(183);
				match(STRING);
				setState(184);
				match(T__22);
				setState(185);
				match(STRING);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(186);
				match(STRING);
				setState(187);
				match(T__23);
				setState(188);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\5"+
		"\2%\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3E\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4Y\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\7\7b\n\7\f\7\16\7e\13\7\3\7\3\7"+
		"\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0099"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u00a0\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00a9\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00c0\n\16\3\16\2\2"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\3\3\2\22\32\2\u00d3\2$\3\2\2\2"+
		"\4D\3\2\2\2\6X\3\2\2\2\bZ\3\2\2\2\n\\\3\2\2\2\fj\3\2\2\2\16\u0081\3\2"+
		"\2\2\20\u0098\3\2\2\2\22\u009f\3\2\2\2\24\u00a1\3\2\2\2\26\u00a8\3\2\2"+
		"\2\30\u00aa\3\2\2\2\32\u00bf\3\2\2\2\34\36\7\3\2\2\35\34\3\2\2\2\36!\3"+
		"\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"%\7\33\2\2#%"+
		"\7\34\2\2$\37\3\2\2\2$#\3\2\2\2%\3\3\2\2\2&\'\5\2\2\2\'(\7\4\2\2()\5\f"+
		"\7\2)E\3\2\2\2*+\5\f\7\2+,\7\4\2\2,-\5\2\2\2-E\3\2\2\2./\5\2\2\2/\60\7"+
		"\5\2\2\60\61\5\2\2\2\61E\3\2\2\2\62\63\5\2\2\2\63\64\7\6\2\2\64\65\5\2"+
		"\2\2\65E\3\2\2\2\66\67\5\2\2\2\678\7\7\2\289\5\2\2\29E\3\2\2\2:;\7!\2"+
		"\2;<\7\7\2\2<E\7!\2\2=>\5\2\2\2>?\7\3\2\2?@\5\2\2\2@E\3\2\2\2AB\7 \2\2"+
		"BC\7#\2\2CE\7 \2\2D&\3\2\2\2D*\3\2\2\2D.\3\2\2\2D\62\3\2\2\2D\66\3\2\2"+
		"\2D:\3\2\2\2D=\3\2\2\2DA\3\2\2\2E\5\3\2\2\2FG\7 \2\2GH\7\b\2\2HY\5\2\2"+
		"\2IJ\7 \2\2JK\7\b\2\2KY\7!\2\2LM\7 \2\2MN\7\t\2\2NY\5\2\2\2OP\7 \2\2P"+
		"Q\7\n\2\2QY\5\2\2\2RS\7 \2\2ST\7\n\2\2TY\5\f\7\2UV\7 \2\2VW\7\13\2\2W"+
		"Y\5\2\2\2XF\3\2\2\2XI\3\2\2\2XL\3\2\2\2XO\3\2\2\2XR\3\2\2\2XU\3\2\2\2"+
		"Y\7\3\2\2\2Z[\7\f\2\2[\t\3\2\2\2\\]\7 \2\2]^\5\b\5\2^_\5\f\7\2_\13\3\2"+
		"\2\2`b\7\3\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2"+
		"\2\2fk\7\33\2\2gk\7!\2\2hk\7\34\2\2ik\7 \2\2jc\3\2\2\2jg\3\2\2\2jh\3\2"+
		"\2\2ji\3\2\2\2k\r\3\2\2\2l\u0082\3\2\2\2mn\7\r\2\2no\5\26\f\2op\7\16\2"+
		"\2pq\7\17\2\2qr\5\24\13\2rs\5\20\t\2s\u0082\3\2\2\2tu\7\r\2\2uv\5\26\f"+
		"\2vw\7\16\2\2wx\7\17\2\2xy\5\24\13\2yz\5\22\n\2z\u0082\3\2\2\2{|\7\r\2"+
		"\2|}\5\26\f\2}~\7\16\2\2~\177\7\17\2\2\177\u0080\5\24\13\2\u0080\u0082"+
		"\3\2\2\2\u0081l\3\2\2\2\u0081m\3\2\2\2\u0081t\3\2\2\2\u0081{\3\2\2\2\u0082"+
		"\17\3\2\2\2\u0083\u0099\3\2\2\2\u0084\u0085\7\20\2\2\u0085\u0086\5\26"+
		"\f\2\u0086\u0087\7\16\2\2\u0087\u0088\7\17\2\2\u0088\u0089\5\24\13\2\u0089"+
		"\u008a\5\20\t\2\u008a\u0099\3\2\2\2\u008b\u008c\7\20\2\2\u008c\u008d\5"+
		"\26\f\2\u008d\u008e\7\16\2\2\u008e\u008f\7\17\2\2\u008f\u0090\5\24\13"+
		"\2\u0090\u0091\5\22\n\2\u0091\u0099\3\2\2\2\u0092\u0093\7\20\2\2\u0093"+
		"\u0094\5\26\f\2\u0094\u0095\7\16\2\2\u0095\u0096\7\17\2\2\u0096\u0097"+
		"\5\24\13\2\u0097\u0099\3\2\2\2\u0098\u0083\3\2\2\2\u0098\u0084\3\2\2\2"+
		"\u0098\u008b\3\2\2\2\u0098\u0092\3\2\2\2\u0099\21\3\2\2\2\u009a\u00a0"+
		"\3\2\2\2\u009b\u009c\7\21\2\2\u009c\u009d\7\16\2\2\u009d\u009e\7\17\2"+
		"\2\u009e\u00a0\5\24\13\2\u009f\u009a\3\2\2\2\u009f\u009b\3\2\2\2\u00a0"+
		"\23\3\2\2\2\u00a1\u00a2\5\6\4\2\u00a2\25\3\2\2\2\u00a3\u00a9\5\f\7\2\u00a4"+
		"\u00a5\5\f\7\2\u00a5\u00a6\5\30\r\2\u00a6\u00a7\5\f\7\2\u00a7\u00a9\3"+
		"\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\27\3\2\2\2\u00aa"+
		"\u00ab\t\2\2\2\u00ab\31\3\2\2\2\u00ac\u00ad\5\2\2\2\u00ad\u00ae\5\30\r"+
		"\2\u00ae\u00af\5\2\2\2\u00af\u00c0\3\2\2\2\u00b0\u00b1\7!\2\2\u00b1\u00b2"+
		"\7\26\2\2\u00b2\u00c0\7!\2\2\u00b3\u00b4\7!\2\2\u00b4\u00b5\7\27\2\2\u00b5"+
		"\u00c0\7!\2\2\u00b6\u00b7\7!\2\2\u00b7\u00b8\7\30\2\2\u00b8\u00c0\7!\2"+
		"\2\u00b9\u00ba\7!\2\2\u00ba\u00bb\7\31\2\2\u00bb\u00c0\7!\2\2\u00bc\u00bd"+
		"\7!\2\2\u00bd\u00be\7\32\2\2\u00be\u00c0\7!\2\2\u00bf\u00ac\3\2\2\2\u00bf"+
		"\u00b0\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b9\3\2"+
		"\2\2\u00bf\u00bc\3\2\2\2\u00c0\33\3\2\2\2\r\37$DXcj\u0081\u0098\u009f"+
		"\u00a8\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}