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

// Parser arithmetic operators 
operators:
    variable '*' variable | 
    variable '/' variable | 
    variable '*' '-'*NUMBER | 
    variable '%' '-'*NUMBER  |   
    '-'*NUMBER '%' '-'*NUMBER  |    
    variable '+' variable  |
    '-'*NUMBER '-' '-'*NUMBER ;

assignments:
    variable '+=' '-'*NUMBER |
    variable '-=' '-'*NUMBER |
    variable '*=' '-'*NUMBER |
    variable '/=' '-'*NUMBER ;

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
    |assignments;

condition:
    variable |
    variable condition_symbol variable;
    

condition_symbol:
    '<'|'>' | '>=' | '<=' | '==' | '!=' | 'and' | 'or' | 'not';

