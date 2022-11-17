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
    number '-' number |
    NAME operator_symbol NAME;

assignments:
    NAME '+=' number |
    NAME '+=' NAME |
    NAME '-=' number |
    NAME '-=' NAME |
    NAME '*=' number |
    NAME '*=' variable |
    NAME '/=' number |
    NAME '=' variable;

// Parser variables
assignment : '=' ;
variable_assignment : NAME assignment variable;
variable : '-'*NUMBER | STRING | BOOL | NAME; 

// conditionals
if_statement:
    | 'if ' condition ':' '\n\t' expression elif_statement 
    | 'if ' condition ':' '\n\t' expression else_statement
    | 'if ' condition ':' '\n\t' expression;
elif_statement:
    | 'elif ' condition ':' '\n\t' expression elif_statement 
    | 'elif ' condition ':' '\n\t' expression else_statement
    | 'elif ' condition ':' '\n\t' expression;
else_statement:
    | 'else ' ':' '\n\t' expression;

expression: 
    assignments |
    function_call 
    ;
    
condition:
    condition condition_symbol condition |
    condition operator_symbol condition |
    variable ;
    
condition_symbol:
    '<' | '>' | '>=' | '<=' | '==' | '!=' | ' and ' | ' or ' | ' not ';

operator_symbol: '*' | '/' | '+' | '-' | '%';

comparison:
    number condition_symbol number |
    STRING '==' STRING |
    STRING '!=' STRING |
    STRING ' and ' STRING |
    STRING ' or ' STRING |
    STRING ' not ' STRING;

block:
    expression |
    ('\n'('\t')*expression)+ |
    while_loop |
    for_loop |
    'return ' variable
    ;

while_loop:
    'while ' condition ':\n\t' (('\n\t')*block)* ;

for_loop:
    'for ' NAME ' in ' NAME ':\n\t' (('\n\t')*block)* |
    'for ' NAME ' in ' function_call ':\n\t' (('\n\t')*block)* ;

function:
    'def ' function_call ':\n\t' (('\n\t')*block)* '\n' ;

function_call: 
    NAME '(' (variable(','variable)*)? ')' |            // zero or infinite variables
    NAME '(' (function_call(','variable)*)? ')' |       // zero or one function calls, then zero or infinite variables
    NAME '(' (variable(','function_call)*)? ')' |       // zero or one variables, then zero or infinite function calls
    NAME '(' (function_call(','function_call)*)? ')'    // zero or infinite function calls
    ;