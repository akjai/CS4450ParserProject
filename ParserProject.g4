grammar ParserProject;

// Lexer types 
NUMBER : INTEGER | FLOAT ;
BOOL : 'True' | 'False';  
INTEGER : '0' | [0-9]+ ;   
FLOAT :  INTEGER '.' [0-9]+ ; 
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NAME : [a-zA-Z|_][a-zA-Z0-9|_]* ; 
STRING : '"' ~('"')* '"' ;
COMMENT : '#' ~('\r' | '\n')* -> skip ;
OPERATOR_SYMBOL: '*' | '/' | '+' | '-' | '%';

// BOOL value treated as 1 or 0 by compiler
number:
'-'*NUMBER | BOOL;

// Parser arithmetic operators 
operators:
    number '*' variable | 
    variable '*' number |
    number '/' number | 
    number '%' number  |     
    number '+' number  |
    STRING '+' STRING |
    number '-' number |
    NAME OPERATOR_SYMBOL NAME ;


assignments:
    NAME '+=' number |
    NAME '+=' STRING |
    NAME '-=' number |
    NAME '*=' number |
    NAME '*=' variable |
    NAME '/=' number ;

// Parser variables
assignment : '=' ;
variable_assignment : NAME assignment variable;
variable : '-'*NUMBER | STRING | BOOL | NAME; 

// conditionals
if_statement:
    | 'if' condition ':' '\n\t' expression elif_statement 
    | 'if' condition ':' '\n\t' expression else_statement
    | 'if' condition ':' '\n\t' expression;
elif_statement:
    | 'elif' condition ':' '\n\t' expression elif_statement 
    | 'elif' condition ':' '\n\t' expression else_statement
    | 'elif' condition ':' '\n\t' expression;
else_statement:
    | 'else' ':' '\n\t' expression;

expression: 
    assignments ;

condition:
    variable |
    variable condition_symbol variable;
    

condition_symbol:
    '<'|'>' | '>=' | '<=' | '==' | '!=' | 'and' | 'or' | 'not';

comparison:
    number condition_symbol number |
    STRING '==' STRING |
    STRING '!=' STRING |
    STRING 'and' STRING |
    STRING 'or' STRING |
    STRING 'not' STRING;





