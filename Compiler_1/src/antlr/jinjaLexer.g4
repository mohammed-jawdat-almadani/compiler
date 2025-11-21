lexer grammar jinjaLexer;

/*
 * Keywords
 */
FALSE: 'False';
NONE: 'None';
TRUE: 'True';

/*
 * Operators
 */
 // Arithmetic
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';

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

/*
 * Symbols
 */
VAR_START: '{{';
VAR_END: '}}';
BLOCK_START: '{%';
BLOCK_END: '%}';
COMMENT_START: '{#';
COMMENT_END: '#}';

/*
 * HTML / CSS text
 */
TEXT: ~[{]+ -> channel(HIDDEN);


/*
 * Literals & Identifiers
 */
ID: [a-zA-Z_][a-zA-Z0-9_]*;

FLOAT: '-'? NUM '.' NUM EXP?;
INT: '-'? NUM EXP?;
fragment NUM: '0' | [1-9] DIGITS*;
fragment DIGITS: [0-9];
fragment EXP: [Ee] [+\-]? INT;

STRING
    : '"' ( ~["\\\r\n] | '\\' . )* '"'
    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
    ;

/*
 * Whitespace
 */
WS: [ \t\r\n]+ -> skip ;