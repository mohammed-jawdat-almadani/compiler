lexer grammar PythonLexer;

options { superClass=PythonLexerBase; }

tokens {
    ENCODING
  , INDENT, DEDENT
  , TYPE_COMMENT
}

LPAR             : '(';
LSQB             : '[';
LBRACE           : '{';
RPAR             : ')';
RSQB             : ']';
RBRACE           : '}';
DOT              : '.';
COLON            : ':';
COMMA            : ',';
SEMI             : ';';
PLUS             : '+';
MINUS            : '-';
STAR             : '*';
SLASH            : '/';
VBAR             : '|';
AMPER            : '&';
LESS             : '<';
GREATER          : '>';
EQUAL            : '=';
PERCENT          : '%';
EQEQUAL          : '==';
NOTEQUAL         : '!=';
LESSEQUAL        : '<=';
GREATEREQUAL     : '>=';
TILDE            : '~';
CIRCUMFLEX       : '^';
LEFTSHIFT        : '<<';
RIGHTSHIFT       : '>>';
DOUBLESTAR       : '**';
PLUSEQUAL        : '+=';
MINEQUAL         : '-=';
STAREQUAL        : '*=';
SLASHEQUAL       : '/=';
PERCENTEQUAL     : '%=';
AMPEREQUAL       : '&=';
VBAREQUAL        : '|=';
CIRCUMFLEXEQUAL  : '^=';
LEFTSHIFTEQUAL   : '<<=';
RIGHTSHIFTEQUAL  : '>>=';
DOUBLESTAREQUAL  : '**=';
DOUBLESLASH      : '//';
DOUBLESLASHEQUAL : '//=';
AT               : '@';
ATEQUAL          : '@=';
RARROW           : '->';
ELLIPSIS         : '...';
COLONEQUAL       : ':=';
EXCLAMATION      : '!';

FALSE    : 'False';
AWAIT    : 'await';
ELSE     : 'else';
IMPORT   : 'import';
PASS     : 'pass';
NONE     : 'None';
BREAK    : 'break';
EXCEPT   : 'except';
IN       : 'in';
RAISE    : 'raise';
TRUE     : 'True';
CLASS    : 'class';
FINALLY  : 'finally';
IS       : 'is';
RETURN   : 'return';
AND      : 'and';
CONTINUE : 'continue';
FOR      : 'for';
LAMBDA   : 'lambda';
TRY      : 'try';
AS       : 'as';
DEF      : 'def';
FROM     : 'from';
NONLOCAL : 'nonlocal';
WHILE    : 'while';
ASSERT   : 'assert';
DEL      : 'del';
GLOBAL   : 'global';
NOT      : 'not';
WITH     : 'with';
ASYNC    : 'async';
ELIF     : 'elif';
IF       : 'if';
OR       : 'or';
YIELD    : 'yield';

NAME_OR_TYPE     : 'type';
NAME_OR_MATCH    : 'match';
NAME_OR_CASE     : 'case';
NAME_OR_WILDCARD : '_';

NAME : ID_START ID_CONTINUE*;

NUMBER : INTEGER | FLOAT_NUMBER | IMAG_NUMBER;

STRING : STRING_LITERAL;

NEWLINE : '\r'? '\n';
COMMENT : '#' ~[\r\n]* -> channel(HIDDEN);
WS : [ \t\f]+                             -> channel(HIDDEN);
EXPLICIT_LINE_JOINING : BACKSLASH_NEWLINE -> channel(HIDDEN);

ERRORTOKEN : . ;

fragment STRING_LITERAL : STRING_PREFIX? (SHORT_STRING | LONG_STRING);
fragment STRING_PREFIX options { caseInsensitive=true; }  : 'r' | 'u';

fragment SHORT_STRING
    : ['] (~[\\\r\n'] | STRING_ESCAPE_SEQ)* [']
    | ["] (~[\\\r\n"] | STRING_ESCAPE_SEQ)* ["]
    ;

fragment LONG_STRING
    : ['][']['] ( ~[\\] | STRING_ESCAPE_SEQ)*? [']['][']
    | ["]["]["] ( ~[\\] | STRING_ESCAPE_SEQ)*? ["]["]["]
    ;

fragment STRING_ESCAPE_SEQ : '\\' . | '\\' NEWLINE;
fragment BACKSLASH_NEWLINE : '\\' NEWLINE;

fragment INTEGER        : DEC_INTEGER;
fragment DEC_INTEGER    : [1-9] ('_'? [0-9])* | '0'+ ('_'? '0')*;

fragment FLOAT_NUMBER   : POINT_FLOAT | EXPONENT_FLOAT;
fragment POINT_FLOAT    : [0-9]+? '.' [0-9]+ | [0-9]+ '.';
fragment EXPONENT_FLOAT : ([0-9]+ | POINT_FLOAT) [eE] [+-]? [0-9]+;
fragment IMAG_NUMBER    : ([0-9]+ | FLOAT_NUMBER) [jJ];

fragment ID_START
    : [a-zA-Z_]
    ;

fragment ID_CONTINUE
    : ID_START
    | [0-9]
    ;