// Generated from ParserProject.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProjectParser}.
 */
public interface ParserProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(ParserProjectParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(ParserProjectParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#operators}.
	 * @param ctx the parse tree
	 */
	void enterOperators(ParserProjectParser.OperatorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#operators}.
	 * @param ctx the parse tree
	 */
	void exitOperators(ParserProjectParser.OperatorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#assignments}.
	 * @param ctx the parse tree
	 */
	void enterAssignments(ParserProjectParser.AssignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#assignments}.
	 * @param ctx the parse tree
	 */
	void exitAssignments(ParserProjectParser.AssignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ParserProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ParserProjectParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(ParserProjectParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(ParserProjectParser.Variable_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(ParserProjectParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(ParserProjectParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(ParserProjectParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(ParserProjectParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(ParserProjectParser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(ParserProjectParser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(ParserProjectParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(ParserProjectParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ParserProjectParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ParserProjectParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ParserProjectParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ParserProjectParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#condition_symbol}.
	 * @param ctx the parse tree
	 */
	void enterCondition_symbol(ParserProjectParser.Condition_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#condition_symbol}.
	 * @param ctx the parse tree
	 */
	void exitCondition_symbol(ParserProjectParser.Condition_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void enterOperator_symbol(ParserProjectParser.Operator_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#operator_symbol}.
	 * @param ctx the parse tree
	 */
	void exitOperator_symbol(ParserProjectParser.Operator_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ParserProjectParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ParserProjectParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(ParserProjectParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(ParserProjectParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(ParserProjectParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(ParserProjectParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ParserProjectParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ParserProjectParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(ParserProjectParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(ParserProjectParser.Function_callContext ctx);
}