# Generated from ParserProject.g4 by ANTLR 4.9.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing import TextIO


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("I\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2\3\2")
        buf.write("\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3")
        buf.write("\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t")
        buf.write("\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3")
        buf.write("\r\3\r\3\r\5\rG\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24")
        buf.write("\26\30\2\2\2>\2\32\3\2\2\2\4\36\3\2\2\2\6\"\3\2\2\2\b")
        buf.write("&\3\2\2\2\n*\3\2\2\2\f.\3\2\2\2\16\60\3\2\2\2\20\64\3")
        buf.write("\2\2\2\228\3\2\2\2\24<\3\2\2\2\26@\3\2\2\2\30F\3\2\2\2")
        buf.write("\32\33\7\16\2\2\33\34\7\3\2\2\34\35\7\16\2\2\35\3\3\2")
        buf.write("\2\2\36\37\7\16\2\2\37 \7\4\2\2 !\7\16\2\2!\5\3\2\2\2")
        buf.write("\"#\7\16\2\2#$\7\5\2\2$%\7\16\2\2%\7\3\2\2\2&\'\7\16\2")
        buf.write("\2\'(\7\6\2\2()\7\16\2\2)\t\3\2\2\2*+\7\16\2\2+,\7\7\2")
        buf.write("\2,-\7\16\2\2-\13\3\2\2\2./\7\b\2\2/\r\3\2\2\2\60\61\7")
        buf.write("\16\2\2\61\62\7\t\2\2\62\63\7\16\2\2\63\17\3\2\2\2\64")
        buf.write("\65\7\16\2\2\65\66\7\n\2\2\66\67\7\16\2\2\67\21\3\2\2")
        buf.write("\289\7\16\2\29:\7\13\2\2:;\7\16\2\2;\23\3\2\2\2<=\7\16")
        buf.write("\2\2=>\7\f\2\2>?\7\16\2\2?\25\3\2\2\2@A\7\r\2\2AB\5\f")
        buf.write("\7\2B\27\3\2\2\2CG\7\16\2\2DG\7\r\2\2EG\3\2\2\2FC\3\2")
        buf.write("\2\2FD\3\2\2\2FE\3\2\2\2G\31\3\2\2\2\3F")
        return buf.getvalue()


class ParserProjectParser ( Parser ):

    grammarFileName = "ParserProject.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'+'", "'-'", "'*'", "'/'", "'%'", "'='", 
                     "'+='", "'-='", "'*='", "'/='" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "STRING", "NUMBER", 
                      "WHITESPACE" ]

    RULE_add_operator = 0
    RULE_minus_operator = 1
    RULE_multiply_operator = 2
    RULE_divide_operator = 3
    RULE_mod_operator = 4
    RULE_assignment = 5
    RULE_add_assignment = 6
    RULE_minus_assignment = 7
    RULE_multiply_assignment = 8
    RULE_divide_assignment = 9
    RULE_variable_assignment = 10
    RULE_variable = 11

    ruleNames =  [ "add_operator", "minus_operator", "multiply_operator", 
                   "divide_operator", "mod_operator", "assignment", "add_assignment", 
                   "minus_assignment", "multiply_assignment", "divide_assignment", 
                   "variable_assignment", "variable" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    STRING=11
    NUMBER=12
    WHITESPACE=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.9.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class Add_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_add_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd_operator" ):
                listener.enterAdd_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd_operator" ):
                listener.exitAdd_operator(self)




    def add_operator(self):

        localctx = ParserProjectParser.Add_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_add_operator)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 24
            self.match(ParserProjectParser.NUMBER)
            self.state = 25
            self.match(ParserProjectParser.T__0)
            self.state = 26
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Minus_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_minus_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMinus_operator" ):
                listener.enterMinus_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMinus_operator" ):
                listener.exitMinus_operator(self)




    def minus_operator(self):

        localctx = ParserProjectParser.Minus_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_minus_operator)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 28
            self.match(ParserProjectParser.NUMBER)
            self.state = 29
            self.match(ParserProjectParser.T__1)
            self.state = 30
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Multiply_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_multiply_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiply_operator" ):
                listener.enterMultiply_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiply_operator" ):
                listener.exitMultiply_operator(self)




    def multiply_operator(self):

        localctx = ParserProjectParser.Multiply_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_multiply_operator)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32
            self.match(ParserProjectParser.NUMBER)
            self.state = 33
            self.match(ParserProjectParser.T__2)
            self.state = 34
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Divide_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_divide_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDivide_operator" ):
                listener.enterDivide_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDivide_operator" ):
                listener.exitDivide_operator(self)




    def divide_operator(self):

        localctx = ParserProjectParser.Divide_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_divide_operator)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 36
            self.match(ParserProjectParser.NUMBER)
            self.state = 37
            self.match(ParserProjectParser.T__3)
            self.state = 38
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Mod_operatorContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_mod_operator

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMod_operator" ):
                listener.enterMod_operator(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMod_operator" ):
                listener.exitMod_operator(self)




    def mod_operator(self):

        localctx = ParserProjectParser.Mod_operatorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_mod_operator)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            self.match(ParserProjectParser.NUMBER)
            self.state = 41
            self.match(ParserProjectParser.T__4)
            self.state = 42
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ParserProjectParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = ParserProjectParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 44
            self.match(ParserProjectParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Add_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_add_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAdd_assignment" ):
                listener.enterAdd_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAdd_assignment" ):
                listener.exitAdd_assignment(self)




    def add_assignment(self):

        localctx = ParserProjectParser.Add_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_add_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46
            self.match(ParserProjectParser.NUMBER)
            self.state = 47
            self.match(ParserProjectParser.T__6)
            self.state = 48
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Minus_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_minus_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMinus_assignment" ):
                listener.enterMinus_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMinus_assignment" ):
                listener.exitMinus_assignment(self)




    def minus_assignment(self):

        localctx = ParserProjectParser.Minus_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_minus_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 50
            self.match(ParserProjectParser.NUMBER)
            self.state = 51
            self.match(ParserProjectParser.T__7)
            self.state = 52
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Multiply_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_multiply_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMultiply_assignment" ):
                listener.enterMultiply_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMultiply_assignment" ):
                listener.exitMultiply_assignment(self)




    def multiply_assignment(self):

        localctx = ParserProjectParser.Multiply_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_multiply_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 54
            self.match(ParserProjectParser.NUMBER)
            self.state = 55
            self.match(ParserProjectParser.T__8)
            self.state = 56
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Divide_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self, i:int=None):
            if i is None:
                return self.getTokens(ParserProjectParser.NUMBER)
            else:
                return self.getToken(ParserProjectParser.NUMBER, i)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_divide_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDivide_assignment" ):
                listener.enterDivide_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDivide_assignment" ):
                listener.exitDivide_assignment(self)




    def divide_assignment(self):

        localctx = ParserProjectParser.Divide_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_divide_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 58
            self.match(ParserProjectParser.NUMBER)
            self.state = 59
            self.match(ParserProjectParser.T__9)
            self.state = 60
            self.match(ParserProjectParser.NUMBER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Variable_assignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def STRING(self):
            return self.getToken(ParserProjectParser.STRING, 0)

        def assignment(self):
            return self.getTypedRuleContext(ParserProjectParser.AssignmentContext,0)


        def getRuleIndex(self):
            return ParserProjectParser.RULE_variable_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable_assignment" ):
                listener.enterVariable_assignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable_assignment" ):
                listener.exitVariable_assignment(self)




    def variable_assignment(self):

        localctx = ParserProjectParser.Variable_assignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_variable_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self.match(ParserProjectParser.STRING)
            self.state = 63
            self.assignment()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class VariableContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NUMBER(self):
            return self.getToken(ParserProjectParser.NUMBER, 0)

        def STRING(self):
            return self.getToken(ParserProjectParser.STRING, 0)

        def getRuleIndex(self):
            return ParserProjectParser.RULE_variable

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVariable" ):
                listener.enterVariable(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVariable" ):
                listener.exitVariable(self)




    def variable(self):

        localctx = ParserProjectParser.VariableContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_variable)
        try:
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [ParserProjectParser.NUMBER]:
                self.enterOuterAlt(localctx, 1)
                self.state = 65
                self.match(ParserProjectParser.NUMBER)
                pass
            elif token in [ParserProjectParser.STRING]:
                self.enterOuterAlt(localctx, 2)
                self.state = 66
                self.match(ParserProjectParser.STRING)
                pass
            elif token in [ParserProjectParser.EOF]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





