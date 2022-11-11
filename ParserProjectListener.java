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
}