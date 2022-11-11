grammar ParserProject;

// expressions
expr :   '(' expr ')'                         
     |   op=('+'|'-') expr                    
     |   left=expr op=('*'|'/'|'%') right=expr    
     |   left=expr op=('+'|'-') right=expr    
     |   func=NAME '(' expr ')'                 
     |   value=NUMBER                            
     ;

// Parser arithmetic operators 
multiply_operator  :  '*'  ;     
divide_operator  :  '/'  ;    
mod_operator  :  '%'  ;      
add_operator  :  '+'  ;
minus_operator  :  '-'  ;     

// Parser assignment operators 
assignment : '=' ;
add_assignment : NUMBER '+=' NUMBER; 
minus_assignment : NUMBER '-=' NUMBER; 
multiply_assignment : NUMBER '*=' NUMBER; 
divide_assignment : NUMBER '/=' NUMBER; 

// Parser variables
variable_assignment : NAME assignment variable;
variable : NUMBER | STRING | BOOL ; 

// Lexer types 
NUMBER : '-'?INTEGER | '-'?FLOAT ;   
BOOL : 'True' | 'False';  
INTEGER : '0' | [0-9]+ ;   
FLOAT :  INTEGER '.' [0-9]+ ; 
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines
NAME : [a-zA-Z|_][a-zA-Z0-9|_]* ; 
STRING : '"' ~('"')* '"' ;
COMMENT : '#' ~('\r' | '\n')* -> skip ;
