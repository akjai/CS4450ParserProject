// Generated from ParserProject.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProjectParser}.
 */
public interface ParserProjectListener extends ParseTreeListener {
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
}