grammar ParserProject;

// arithmetic operators 
add_operator  : NUMBER '+' NUMBER ;
minus_operator  : NUMBER '-' NUMBER ;     
multiply_operator  : NUMBER '*' NUMBER ;     
divide_operator  : NUMBER '/' NUMBER ;    
mod_operator  : NUMBER '%' NUMBER ;      
NUMBER : [0-9]+ ;         
WHITESPACE : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

// assignment operators 
assignment : '=' ;
add_assignment : '+=' ; 
minus_assignment : '-=' ; 
multiply_assignment : '*=' ; 
divide_assignment : '/=' ; 

