import sys
from antlr4 import *
from ParserProjectLexer import ParserProjectLexer
from ParserProjectListener import ParserProjectListener
from ParserProjectParser import ParserProjectParser


class ParserProjectPrintListener(ParserProjectListener):
		def enterHi(self, ctx):
			print("Hello: %s" %  ctx.ID)

def main():
	lexer = ParserProjectLexer(StdinStream())
	stream = CommonTokenStream(lexer)
	parser = ParserProjectParser(stream)
	tree = parser.hi()
	printer = ParserProjectListener()
	walker = ParseTreeWalker()
	walker.walk(printer, tree)
	
if __name__ == '__main__':
	main()
