// MidtermActivity Yo
grammar ExpCalculator;

//Parser

/*
start
	: (statement)+;
*/

start
	: func main_func;

func: data_type FUNC_IDENTIFIER PARAMETER_ENUMERATION params FUNC_DEFINITION OPEN_PAR CLOSE_PAR;

main_func
	: MAIN_FUNC PARAM_ENUMERATION params;
	
	
params
	: data_type VAR_IDENTIFIER params2
	| EOF;

params2
	: COMMA data_type VAR_IDENTIFIER params2
	| EOF;
	
data_type
	: INT_TYPE
	| STRING_TYPE
	| FLOAT_TYPE
	| CHAR_TYPE
	| BOOLEAN_TYPE
	| VOID_TYPE;
	

statement
	: expr NL
	| expr EOF;

integer
	: unary_op? DIGIT;

unary_op
	: '+'
	| '-';

expr                            
    : '(' expr ')'              # parenExpr
    | expr ('*'|'/'|'%') expr   # multOrDiv
    | expr ('+'|'-') expr       # addOrSubtract
    | integer                   # intLiteral;

//Lexer

NL : '\r'? '\n';
WS : [ \t]+ -> skip ;
DIGIT : [0-9]+;
//FLOAT : [0-9]+(\.[0-9]+)?|(.[0-9]+); //not done
STIRNG: [".+"];
//CHAR: '[A-Za-z0-9[ ]]';
BOOLEAN: [tinood|ditinood];
VAR_IDENTIFIER:  [_][a-z][A-za-z]+[0-9]*;
ASS_OPERATOR: [=];
INT_TYPE: [numero];
FLOAT_TYPE: [lutaw];
STRING_TYPE:[pisi];
CHAR_TYPE: [letra];
BOOLEAN_TYPE: [tinoodba];
VOID_TYPE: [wala];
TERMINATOR: [;];
IF_CONDITIONAL: [kung];
ELSE_IF_CONDITIONAL: [kungdili];
ELSE_CONDITIONAL: [kungwalagyud];
THEN_CONDITIONAL: [di];
FOR_LOOP: [para];
WHILE_LOOP: [habang];
DO_WHILE_LOOP: [buhata];
OPEN_PAR: [(];
CLOSE_PAR: [)];
OPEN_BRE: [{];
CLOSE_BRE: [}];
OPEN_BRT: [[];
//CLOSE_BRT: []];
COMMENT_BLOCK: [/*.**/];
ADD_OPERATOR: [+];
SUBTRACT_OPERATOR: [-];
MULTIPLY_OPERATOR: [*];
DIVIDE_OPERATOR: [/];
MODULO_OPERATOR: [%];
LESS_THAN_OPERATOR: [<];
LESS_THAN_EQUAL_TO_OPERATOR: [<=];
GREATER_THAN_OPERATOR: [>];
GREATER_THAN_EQAUL_TO_OPERATOR: [>=];
EQUAL_TO_OPERATOR: [=];
NOT_EQUAL_TO_OPERATOR: [<>];
AND_OPERATOR: [ug];
OR_OPERATOR: [o];
NOT_OPERATOR: [dili];
ARRAY_SIZE_DELIMITER: [$];
CONSTANT: [hantodhantod];
//FUNC_IDENTIFIER: [func.][a-z][A-za-z]+[0-9]*; period must be escaped
COMMA: [,];
INCREMENT_OPERATOR: [++];
DECREMENT_OPERATOR: [--];
FUNC_DEFINITION: [>>>];
FUNC_CALL: [tawaga];
PARAMETER_ENUMERATION: [>>];
MAIN_FUNC: [sugod_diri];
RETURN: [ibalik];





