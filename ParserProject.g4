grammar ParserProject;

NUMBER : '-'?INTEGER | '-'?FLOAT ;   
BOOL : 'True' | 'False';  
INTEGER : '0' | [0-9]+ ;   
FLOAT :  INTEGER '.' [0-9]+ ; 
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NAME : [a-zA-Z|_][a-zA-Z0-9|_]* ; 
STRING : '"' ~('"')* '"' ;
COMMENT : '#' ~('\r' | '\n')* -> skip ;

// Parser arithmetic operators 
multiply_operator  : NUMBER '*' NUMBER ;     
divide_operator  : NUMBER '/' NUMBER ;    
mod_operator  : NUMBER '%' NUMBER ;      
add_operator  : NUMBER '+' NUMBER ;
minus_operator  : NUMBER '-' NUMBER ;     

// Parser assignment operators 
add_assignment : NUMBER '+=' NUMBER; 
minus_assignment : NUMBER '-=' NUMBER; 
multiply_assignment : NUMBER '*=' NUMBER; 
divide_assignment : NUMBER '/=' NUMBER; 

// Parser variables
assignment : '=' ;
variable_assignment : NAME assignment variable;
variable : NUMBER | STRING | BOOL ; 

// Lexer types 

