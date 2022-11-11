# Generated from ParserProject.g4 by ANTLR 4.9.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .ParserProjectParser import ParserProjectParser
else:
    from ParserProjectParser import ParserProjectParser

# This class defines a complete listener for a parse tree produced by ParserProjectParser.
class ParserProjectListener(ParseTreeListener):

    # Enter a parse tree produced by ParserProjectParser#add_operator.
    def enterAdd_operator(self, ctx:ParserProjectParser.Add_operatorContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#add_operator.
    def exitAdd_operator(self, ctx:ParserProjectParser.Add_operatorContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#minus_operator.
    def enterMinus_operator(self, ctx:ParserProjectParser.Minus_operatorContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#minus_operator.
    def exitMinus_operator(self, ctx:ParserProjectParser.Minus_operatorContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#multiply_operator.
    def enterMultiply_operator(self, ctx:ParserProjectParser.Multiply_operatorContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#multiply_operator.
    def exitMultiply_operator(self, ctx:ParserProjectParser.Multiply_operatorContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#divide_operator.
    def enterDivide_operator(self, ctx:ParserProjectParser.Divide_operatorContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#divide_operator.
    def exitDivide_operator(self, ctx:ParserProjectParser.Divide_operatorContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#mod_operator.
    def enterMod_operator(self, ctx:ParserProjectParser.Mod_operatorContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#mod_operator.
    def exitMod_operator(self, ctx:ParserProjectParser.Mod_operatorContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#assignment.
    def enterAssignment(self, ctx:ParserProjectParser.AssignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#assignment.
    def exitAssignment(self, ctx:ParserProjectParser.AssignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#add_assignment.
    def enterAdd_assignment(self, ctx:ParserProjectParser.Add_assignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#add_assignment.
    def exitAdd_assignment(self, ctx:ParserProjectParser.Add_assignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#minus_assignment.
    def enterMinus_assignment(self, ctx:ParserProjectParser.Minus_assignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#minus_assignment.
    def exitMinus_assignment(self, ctx:ParserProjectParser.Minus_assignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#multiply_assignment.
    def enterMultiply_assignment(self, ctx:ParserProjectParser.Multiply_assignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#multiply_assignment.
    def exitMultiply_assignment(self, ctx:ParserProjectParser.Multiply_assignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#divide_assignment.
    def enterDivide_assignment(self, ctx:ParserProjectParser.Divide_assignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#divide_assignment.
    def exitDivide_assignment(self, ctx:ParserProjectParser.Divide_assignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#variable_assignment.
    def enterVariable_assignment(self, ctx:ParserProjectParser.Variable_assignmentContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#variable_assignment.
    def exitVariable_assignment(self, ctx:ParserProjectParser.Variable_assignmentContext):
        pass


    # Enter a parse tree produced by ParserProjectParser#variable.
    def enterVariable(self, ctx:ParserProjectParser.VariableContext):
        pass

    # Exit a parse tree produced by ParserProjectParser#variable.
    def exitVariable(self, ctx:ParserProjectParser.VariableContext):
        pass



del ParserProjectParser