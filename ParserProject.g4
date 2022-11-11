grammar ParserProject;

// Parser arithmetic operators 
add_operator  : NUMBER '+' NUMBER ;
minus_operator  : NUMBER '-' NUMBER ;     
multiply_operator  : NUMBER '*' NUMBER ;     
divide_operator  : NUMBER '/' NUMBER ;    
mod_operator  : NUMBER '%' NUMBER ;      

// Parser assignment operators 
assignment : '=' ;
add_assignment : NUMBER '+=' NUMBER; 
minus_assignment : NUMBER '-=' NUMBER; 
multiply_assignment : NUMBER '*=' NUMBER; 
divide_assignment : NUMBER '/=' NUMBER; 

// Parser variables
variable_assignment : NAME assignment variable;
variable : NUMBER | STRING | BOOL; 

// Lexer types 
NUMBER : INTEGER | FLOAT ;   
BOOL : 'true' | 'false';  
INTEGER : '0' | '-'?[0-9]+ ;   
FLOAT :  INTEGER '.' [0-9]+ ; 
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NAME : [a-zA-Z][a-zA-Z0-9]* ; 
STRING : '"' ~('"')* '"' ;