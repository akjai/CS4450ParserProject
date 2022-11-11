// Generated from ParserProject.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProjectParser}.
 */
public interface ParserProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_operator(ParserProjectParser.Multiply_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#multiply_operator}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_operator(ParserProjectParser.Multiply_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#divide_operator}.
	 * @param ctx the parse tree
	 */
	void enterDivide_operator(ParserProjectParser.Divide_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#divide_operator}.
	 * @param ctx the parse tree
	 */
	void exitDivide_operator(ParserProjectParser.Divide_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#mod_operator}.
	 * @param ctx the parse tree
	 */
	void enterMod_operator(ParserProjectParser.Mod_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#mod_operator}.
	 * @param ctx the parse tree
	 */
	void exitMod_operator(ParserProjectParser.Mod_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator(ParserProjectParser.Add_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#add_operator}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator(ParserProjectParser.Add_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#minus_operator}.
	 * @param ctx the parse tree
	 */
	void enterMinus_operator(ParserProjectParser.Minus_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#minus_operator}.
	 * @param ctx the parse tree
	 */
	void exitMinus_operator(ParserProjectParser.Minus_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#add_assignment}.
	 * @param ctx the parse tree
	 */
	void enterAdd_assignment(ParserProjectParser.Add_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#add_assignment}.
	 * @param ctx the parse tree
	 */
	void exitAdd_assignment(ParserProjectParser.Add_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#minus_assignment}.
	 * @param ctx the parse tree
	 */
	void enterMinus_assignment(ParserProjectParser.Minus_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#minus_assignment}.
	 * @param ctx the parse tree
	 */
	void exitMinus_assignment(ParserProjectParser.Minus_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#multiply_assignment}.
	 * @param ctx the parse tree
	 */
	void enterMultiply_assignment(ParserProjectParser.Multiply_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#multiply_assignment}.
	 * @param ctx the parse tree
	 */
	void exitMultiply_assignment(ParserProjectParser.Multiply_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#divide_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDivide_assignment(ParserProjectParser.Divide_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#divide_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDivide_assignment(ParserProjectParser.Divide_assignmentContext ctx);
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