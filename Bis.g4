// MidtermActivity Yo
grammar Bis;

//Parser

/* Type checking */




/* Production Rule */
start
	: func_define main_func  EOF;
	
func_define
	: (func)*;

/* Main Function */
main_func
	: MAIN_FUNC FUNC_DEFINITION OPEN_BRE codeblock CLOSE_BRE #mainFunc ;

/*Scanf */
scan
	: INPUT OPEN_PAR data_type VAR_IDENTIFIER CLOSE_PAR TERMINATOR;

/*Printf */
print
	: OUTPUT OPEN_PAR stringParty CLOSE_PAR TERMINATOR;

printnl
	: OUTPUTNL OPEN_PAR stringParty CLOSE_PAR TERMINATOR;

/* Defining a Function */
func 
	: VOID_TYPE FUNC_IDENTIFIER PARAMS_KEYWORD (params (COMMA params)*)? FUNC_DEFINITION OPEN_BRE codeblock CLOSE_BRE
	| data_type FUNC_IDENTIFIER PARAMS_KEYWORD (params (COMMA params)*)? FUNC_DEFINITION OPEN_BRE codeblock return_state CLOSE_BRE;
	
params
	: data_type VAR_IDENTIFIER;

return_state
	: RETURN val TERMINATOR;
	
/* Function Call */
func_call_state 
	: func_call TERMINATOR;
	 
func_call
	: FUNC_CALL FUNC_IDENTIFIER OPEN_PAR (val (COMMA val)*)? CLOSE_PAR;
	 	
/* Code Block */
codeblock 
	: (statement)*;

statement
	: ass_state 
	| vardec_state 
	| consvardec_state
	| cond_state 
	| while_state 
	| do_while_state 
	| for_state 
	| func_call_state
	| scan
	| print
	| return_state
	| printnl;
	
/* Variable Declaration */
vardec_state
	: vardec TERMINATOR;

consvardec_state
	: CONSTANT data_type VAR_IDENTIFIER assignment TERMINATOR;

vardec
	: vardec COMMA vardec #multipleVar
	| data_type VAR_IDENTIFIER assignment? #singleVar
	| data_type arr VAR_IDENTIFIER #arrayVar;

data_type
	: INT_TYPE 
	| FLOAT_TYPE
	| STRING_TYPE
	| CHAR_TYPE 
	| BOOLEAN_TYPE;

arr
	: ARRAY_DELIM DIGIT ARRAY_DELIM ;
	
/* Assignment Statement */
ass_state
	: VAR_IDENTIFIER arr? assignment TERMINATOR #normalAssign
	| ass_state_operator TERMINATOR #operatorAssign;

assignment
	: ASS_OPERATOR val;

//Value which can be assigned to a variable/passed to function
val
	: expr
	| STRING 
	| STRING ADD_OPERATOR STRING 
	| STRING ADD_OPERATOR expr 
	| BOOLEAN 
	| condition;
/////
	
ass_state_operator
	: VAR_IDENTIFIER arr? ass_operator;
	
ass_operator
	: INCREMENT_OPERATOR 
	| DECREMENT_OPERATOR ;

/* Math Expressions */

unary_op
	: '+'
	| '-';

//Value which can be evaluated in an expression
num_val
	: unary_op? DIGIT #integerLiteral
	| unary_op? FLOAT EXPONENT? #floatLiteral
	| CHAR #charLiteral
	| func_call #functionCall
	| VAR_IDENTIFIER arr #arrayIdentifier
	| VAR_IDENTIFIER #varIdentifier;
////////

expr                            
    : OPEN_PAR expr CLOSE_PAR              # parenExpr
    | expr (MULTIPLY_OPERATOR|DIVIDE_OPERATOR|MODULO_OPERATOR) expr   # multOrDiv
    | expr (ADD_OPERATOR|SUBTRACT_OPERATOR) expr       # addOrSubtract
    | num_val                   # numberValue;

/*String concat Functions */
stringParty
	: STRING #soloerString
	| stringParty ADD_OPERATOR stringParty #stringConcatString
	| stringParty ADD_OPERATOR expr #stringConcatExpr
	| stringParty ADD_OPERATOR func_call #stringConcatFuncCall;

/* Conditional Statement */
cond_state
	: IF_CONDITIONAL cond_block (ELSE_IF_CONDITIONAL cond_block)* (ELSE_CONDITIONAL OPEN_BRE codeblock CLOSE_BRE)?;

cond_block
	: OPEN_PAR condition CLOSE_PAR THEN_CONDITIONAL OPEN_BRE codeblock CLOSE_BRE;
 
//Value which can be compared
cond_val
	: expr #expression
	| STRING #stringLiteral
	| BOOLEAN #booleanLiteral ;
////

condition
	: NOT_OPERATOR? OPEN_PAR condition CLOSE_PAR #parenCondition
	| condition AND_OPERATOR condition #andCondition
	| condition OR_OPERATOR condition #orCondition
	| cond_val (LESS_THAN_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_EQUAL_TO_OPERATOR | GREATER_THAN_EQUAL_TO_OPERATOR | NOT_EQUAL_TO_OPERATOR | EQUAL_TO_OPERATOR) cond_val #conditionOperator
	| stringParty (LESS_THAN_OPERATOR | GREATER_THAN_OPERATOR | LESS_THAN_EQUAL_TO_OPERATOR | GREATER_THAN_EQUAL_TO_OPERATOR | NOT_EQUAL_TO_OPERATOR | EQUAL_TO_OPERATOR) stringParty #stringVsString;
	
	
/* Loop Statements */
while_state
	: WHILE_LOOP OPEN_PAR condition CLOSE_PAR OPEN_BRE codeblock CLOSE_BRE;

do_while_state
	: DO_WHILE_LOOP OPEN_BRE codeblock CLOSE_BRE WHILE_LOOP OPEN_PAR condition CLOSE_PAR;

for_state
	: FOR_LOOP OPEN_PAR ass_state condition TERMINATOR ass_state_operator CLOSE_PAR OPEN_BRE codeblock CLOSE_BRE ;

//Lexer

//List of Tokens

NL : '\r'? '\n' -> skip;
WS :  [ \t]+ -> skip ;
EXPONENT : '^'('0'..'9')+;
DIGIT : ('0'..'9')+;
FLOAT : DIGIT ('.'DIGIT)? | ('.'DIGIT);
STRING: '"' (' '..'~')* '"';
CHAR:  '\'' . '\'';
BOOLEAN: 'tinood' | 'ditinood';
FUNC_CALL: 'tawaga';
VAR_IDENTIFIER:  '_'[a-z][A-za-z]*DIGIT*;
ASS_OPERATOR: '=';
INPUT: 'basaha';
OUTPUT: 'suwata';
OUTPUTNL: 'suwataBL';
INT_TYPE: 'numero';
FLOAT_TYPE: 'lutaw';
STRING_TYPE:'pisi';
CHAR_TYPE: 'letra';
BOOLEAN_TYPE: 'tinoodba';
VOID_TYPE: 'wala';
TERMINATOR: ';';
IF_CONDITIONAL: 'kung';
ELSE_IF_CONDITIONAL: 'kungdili';
ELSE_CONDITIONAL: 'kungwalagyud';
THEN_CONDITIONAL: 'di';
FOR_LOOP: 'para';
WHILE_LOOP: 'habang';
DO_WHILE_LOOP: 'buhata';
OPEN_PAR: '(';
CLOSE_PAR: ')';
OPEN_BRE: '{';
CLOSE_BRE: '}';
OPEN_BRT: '[';
CLOSE_BRT: ']';
COMMENT_BLOCK: '/*' .*? '*/' -> skip;
ADD_OPERATOR: '+';
SUBTRACT_OPERATOR: '-';
MULTIPLY_OPERATOR: '*';
DIVIDE_OPERATOR: '/';
MODULO_OPERATOR: '%';
LESS_THAN_OPERATOR: '<';
LESS_THAN_EQUAL_TO_OPERATOR: '<=';
GREATER_THAN_OPERATOR: '>';
GREATER_THAN_EQUAL_TO_OPERATOR: '>=';
EQUAL_TO_OPERATOR: '==';
NOT_EQUAL_TO_OPERATOR: '<>';
AND_OPERATOR: 'ug';
OR_OPERATOR: 'o';
NOT_OPERATOR: 'dili';
ARRAY_DELIM: '$';
CONSTANT: 'hantodhantod';
FUNC_IDENTIFIER: 'func.'[a-z][A-za-z]*DIGIT*;
COMMA: ',';
INCREMENT_OPERATOR: '++';
DECREMENT_OPERATOR: '--';
FUNC_DEFINITION: '>>>';
PARAMS_KEYWORD: '>>';
MAIN_FUNC: 'sugod_diri';
RETURN: 'ibalik';