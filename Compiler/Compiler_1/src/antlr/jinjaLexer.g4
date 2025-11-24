lexer grammar jinjaLexer;

//TEXT: ~({%|{{|{)+ -> channel(HIDDEN);

/*
 * Keywords
 */
IF          : 'if';
ELIF        : 'elif';
ELSE        : 'else';
ENDIF       : 'endif';
WHILE       : 'while';
END_WHILE   : 'endwhile';
SET   : 'set';
TRUE        : 'True';
FALSE       : 'False';

/*
 * Operators
 */
// Arithmatic
EQUALS : '=';
ADD : '+';
SUB : '-';
MUL : '*';
DIV : '/';

// Logical
EQ  : '==';
NEQ : '!=';

// Comparsion
GT   : '>';
LT   : '<';
GTEQ : '>=';
LTEQ : '<=';

// Symbols
LP: '(';
RP: ')';
BLOCK_START: '{%';
BLOCK_END: '%}';
VAR_START: '{{';
VAR_END: '}}';

/*
 * Identifiers
 */
ID : [a-z][a-zA-Z0-9_]* ;

/*
 * Numbers
 */
DOUBLE: '-'? NUM '.' NUM EXP?;

INT: '-'? NUM EXP?;

fragment NUM: '0' | [1-9] DIGITS*;
fragment DIGITS: [0-9];
fragment EXP: [Ee] [+\-]? INT;
/*
 * String
 */
STRING : '\'' (ESC | .)*? '\'' ;
fragment ESC: '\\' [btnfr"'\\] | UNICODE;
fragment UNICODE: '\\u' HEX HEX HEX HEX;
fragment HEX: [0-9a-fA-F];

/*
 * Bool
 */
BOOL : TRUE | FALSE;

/*
 * White spaces
 */
WS : [ \n\r\t]+ -> skip;
NEWLINE : [\r\n]+;

/*
 * Comments
 */
COMMENT : '{#' .*? '#}' NEWLINE -> skip;

