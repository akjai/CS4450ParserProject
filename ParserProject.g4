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
    number '-' number;

assignments:
    number '+=' number |
    STRING '+=' STRING |
    number '-=' number |
    variable '*=' number |
    number '*=' variable |
    number '/=' number ;

// Parser variables
assignment : '=' ;
variable_assignment : NAME assignment variable;
variable : '-'*NUMBER | STRING | BOOL | NAME; 

expression: 
    assignments |
    variable_assignment;

condition_symbol:
    '>' | '>=' | '<=' | '==' | '!=' | 'and' | 'or' | 'not';

condition:
    variable |
    comparison;

comparison:
    number condition_symbol number |
    STRING '==' STRING |
    STRING '!=' STRING |
    STRING 'and' STRING |
    STRING 'or' STRING |
    STRING 'not' STRING;

// conditionals
if_statement:
    'if' condition ':\n\t' expression'\n'* |
    'if' condition ':\n\t' expression'\n'* 'else:\n\t' expression;



