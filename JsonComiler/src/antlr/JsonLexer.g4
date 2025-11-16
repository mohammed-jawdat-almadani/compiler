lexer grammar JsonLexer;

// Keywords
TRUE: 'true';
FALSE: 'false';
NULL: 'null';

// Operators & Symbols
RKB: '}';
LKB: '{';
RSB: ']';
LSB: '[';
CM: ',';
COL: ':';

// Literal & Identifiers
STRING: '"' (~["\\] | ESC)* '"';

fragment ESC : '\\' [bfnrt"] ;
fragment UNICODE : 'u' HEX HEX HEX HEX;
fragment HEX : [0-9a-fA-F];

DOUBLE: '-'? NUM '.' NUM EXP?;

INT: '-'? NUM EXP?;

fragment NUM: '0' | [1-9] DIGITS*;
fragment DIGITS: [0-9];
fragment EXP: [Ee] [+\-]? INT;

// WS
WS: [ \t\n\r] -> skip;
// Comments
MULTILINECOMMENT: '/*' .*? '*/' -> skip;
SINGLELINECOMMENT: '//' ~('\r' | '\n') -> skip;