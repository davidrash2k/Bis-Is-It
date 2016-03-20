// MidtermActivity Yo
grammar ExpCalculator;

//Parser

// Production Rule
start
	: func_define main_func EOF;
	
func_define
	: (func)*;

// Main Function
main_func
	: MAIN_FUNC PARAMS_KEYWORD params FUNC_DEFINITION OPEN_BRE codeblock OPEN_BRE ;

// Defining a Function
func 
	: func_data_type FUNC_IDENTIFIER PARAMS_KEYWORD params FUNC_DEFINITION OPEN_BRE codeblock return_state? CLOSE_BRE;
	
params
	: data_type VAR_IDENTIFIER (COMMA params)*;

return_state
	: RETURN val TERMINATOR;
	
// Function Call
func_call_state 
	: func_call TERMINATOR;
	 
func_call
	: FUNC_CALL FUNC_IDENTIFIER OPEN_PAR call_params? CLOSE_PAR;

call_params
	: val (COMMA call_params)*;
	 	
// Code Block
codeblock 
	: (statement)*;

statement
	: ass_state 
	| vardec_state 
	| cond_state 
	| while_state 
	| do_while_state 
	| for_state 
	| func_call_state;
	
// Variable Declaration
vardec_state
	: data_type arr? var TERMINATOR;

consvardec_state
	: CONSTANT arr? VAR_IDENTIFIER assignment TERMINATOR;

var
	: var COMMA var 
	| VAR_IDENTIFIER assignment?;

func_data_type
	: data_type
	| VOID_TYPE;
	
data_type
	: INT_TYPE 
	| FLOAT_TYPE
	| STRING_TYPE
	| CHAR_TYPE 
	| BOOLEAN_TYPE;

arr
	: ARRAY_DELIM DIGIT ARRAY_DELIM ;
	
// Assignment Statement
ass_state
	: VAR_IDENTIFIER arr? assignment TERMINATOR
	| ass_state_operator TERMINATOR;

assignment
	: ASS_OPERATOR val;

val
	: cond_val 
	| condition;
	
ass_state_operator
	: VAR_IDENTIFIER arr? ass_operator;
	
ass_operator
	: INCREMENT_OPERATOR 
	| DECREMENT_OPERATOR ;

// Math Expressions 

unary_op
	: '+'
	| '-';
	
num_val
	: unary_op? DIGIT EXPONENT?
	| unary_op? FLOAT EXPONENT?
	| CHAR
	| func_call 
	| VAR_IDENTIFIER ;

expr                            
    : OPEN_PAR expr CLOSE_PAR              # parenExpr
    | expr (MULTIPLY_OPERATOR|DIVIDE_OPERATOR|MODULO_OPERATOR) expr   # multOrDiv
    | expr (ADD_OPERATOR|SUBTRACT_OPERATOR) expr       # addOrSubtract
    | num_val                   # intLiteral;

// Conditional Statement
cond_state
	: IF_CONDITIONAL OPEN_PAR condition CLOSE_PAR THEN_CONDITIONAL OPEN_BRE codeblock CLOSE_BRE  else_block?;

else_block
	: ELSE_IF_CONDITIONAL OPEN_PAR condition CLOSE_PAR THEN_CONDITIONAL OPEN_BRE codeblock CLOSE_BRE else_block?
	| ELSE_CONDITIONAL OPEN_BRE codeblock CLOSE_BRE ;

cond_val
	: expr 
	| STRING
	| BOOLEAN;

condition
	: NOT_OPERATOR? OPEN_PAR condition CLOSE_PAR
	| condition logical_operator condition 
	| cond_val cond_operator cond_val;
	
cond_operator
	: LESS_THAN_OPERATOR
	| GREATER_THAN_OPERATOR 
	| LESS_THAN_EQUAL_TO_OPERATOR
	| GREATER_THAN_EQUAL_TO_OPERATOR 
	| EQUAL_TO_OPERATOR 
	| NOT_EQUAL_TO_OPERATOR;
	
logical_operator
	: AND_OPERATOR 
	| OR_OPERATOR;

// Loop Statements
while_state
	: WHILE_LOOP OPEN_PAR condition CLOSE_PAR OPEN_BRE codeblock CLOSE_BRE;

do_while_state
	: DO_WHILE_LOOP OPEN_BRE codeblock CLOSE_BRE WHILE_LOOP OPEN_PAR condition CLOSE_PAR;

for_state
	: FOR_LOOP OPEN_PAR ass_state condition TERMINATOR ass_state_operator CLOSE_PAR OPEN_BRE codeblock CLOSE_BRE ;

//Lexer

//List of Tokens

NL : '\r'? '\n';
WS :  [ \t\n\r]+ -> skip ;
EXPONENT : '^'('0'..'9')+;
DIGIT : ('0'..'9')+;
FLOAT : DIGIT ('.'DIGIT)? | ('.'DIGIT);
STRING: '"' (' '..'~')* '"';
CHAR:  '\'' . '\'';
BOOLEAN: 'tinood' | 'ditinood';
VAR_IDENTIFIER:  '_'[a-z][A-za-z]+DIGIT*;
ASS_OPERATOR: '=';
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
EQUAL_TO_OPERATOR: '=';
NOT_EQUAL_TO_OPERATOR: '<>';
AND_OPERATOR: 'ug';
OR_OPERATOR: 'o';
NOT_OPERATOR: 'dili';
ARRAY_DELIM: '$';
CONSTANT: 'hantodhantod';
FUNC_IDENTIFIER: 'func.'[a-z][A-za-z]+DIGIT*;
COMMA: ',';
INCREMENT_OPERATOR: '++';
DECREMENT_OPERATOR: '--';
FUNC_DEFINITION: '>>>';
FUNC_CALL: 'tawaga';
PARAMS_KEYWORD: '>>';
MAIN_FUNC: 'sugod_diri';
RETURN: 'ibalik';