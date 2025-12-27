lexer grammar pythonLexer;

/*
 * Keywords
 */
FALSE: 'False';
NONE: 'None';
TRUE: 'True';
AS: 'as';
ASSERT: 'assert';
ASYNC: 'async';
AWAIT: 'await';
BREAK: 'break';
CLASS: 'class';
CONTINUE: 'continue';
DEF: 'def';
DEL: 'del';
ELIF: 'elif';
ELSE: 'else';
EXCEPT: 'except';
FINALLY: 'finally';
FOR: 'for';
FROM: 'from';
GLOBAL: 'global';
IF: 'if';
IMPORT: 'import';
IN: 'in';
IS: 'is';
LAMBDA: 'lambda';
NONLOCAL: 'nonlocal';
PASS: 'pass';
RAISE: 'raise';
RETURN: 'return';
TRY: 'try';
WHILE: 'while';
WITH: 'with';
YIELD: 'yield';

/*
 * Operators & Symbols
 */
// Arithmetic
PLUS: '+';
MINUS: '-';
MULTIPLICATION: '*';
DIVISION: '/';
FLOORDIV: '//';
MOD: '%';
POW: '**';

// Comparison
EQ: '==';
NEQ: '!=';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';

// Logical
AND: 'and';
OR: 'or';
NOT: 'not';

// Assignment
ASSIGN: '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
FLOOR_ASSIGN: '//=';
MOD_ASSIGN: '%=';
POW_ASSIGN: '**=';

// Symbols
LKB: '{';
RKB: '}';
LSB: '[';
RSB: ']';
LRB: '(';
RRB: ')';
COL: ':';
CM: ',';
DOT: '.';
SCOL: ';';
WALRUS: ':=';
TANN: '->';
DECORATOR: '@';

/*
 * Literals & Identifiers
 */
// Numbers
FLOAT: '-'? NUM '.' NUM EXP?;

INT: '-'? NUM EXP?;

fragment NUM: '0' | [1-9] DIGITS*;
fragment DIGITS: [0-9];
fragment EXP: [Ee] [+\-]? INT;

// Strings
SQ: '\'';
DQ: '"';
TSQ: '\'\'\'';
TDQ: '"""';

STRING
    : TDQ .*? TDQ
    | TSQ .*? TSQ
    | SQ ( ~['\\\r\n] | ESC )* SQ
    | DQ ( ~["\\\r\n] | ESC )* DQ
    ;

fragment ESC: '\\' [btnfr"'\\] | UNICODE;
fragment UNICODE: '\\u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

// Identifiers
ID: [a-zA-Z_][a-zA-Z0-9_]*;

/*
 * Whitespace & Comments
 */
WS: [ \t\r\n]+ -> skip ;
COMMENT: '#' ~[\r\n]* -> skip ;
