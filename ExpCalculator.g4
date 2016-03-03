// MidtermActivity Yo
grammar ExpCalculator;

//Parser

start
	: (statement)+;

statement
	: NL? expr;


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

NL         : '\r'? '\n';
WS  :   [ \t\n\r]+ -> skip ;
DIGIT: [0-9]+;