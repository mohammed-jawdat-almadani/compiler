lexer grammar jinjaLexer;

/*
 * Text
 */
TEXT
    : ~'{' + ;

/*
 * Comment
 */
COMMENT
    : '{#' .*? '#}' -> skip;

/*
 * White Space
 */
WS
    : [ \t\r\n]+ -> skip;

/*
 * Start Mode <EXPR_MODE>
 */
BLOCK_START
    : '{%' -> pushMode(EXPR_MODE);

VAR_START
    : '{{' -> pushMode(EXPR_MODE);

/*
 * EXPR_MODE
 */
mode EXPR_MODE;
WS_EXPR
    : [ \t\r\n]+ -> skip;

/*
 * End Mode <EXPR_MODE>
 */
BLOCK_END
    : '%}' -> popMode;

VAR_END
    : '}}' -> popMode;

/*
 * Keywords
 */
IF        : 'if';
ELIF      : 'elif';
ELSE      : 'else';
ENDIF     : 'endif';
FOR       : 'for';
IN        : 'in';
END_FOR    : 'endfor';
SET       : 'set';
WHILE     : 'while';
END_WHILE  : 'endwhile';

/*
 * Operators
 */
ADD    : '+';
SUB    : '-';
MUL    : '*';
DIV    : '/';
EQUALS : '=';
EQ     : '==';
NEQ    : '!=';
GT     : '>';
LT     : '<';
GTEQ   : '>=';
LTEQ   : '<=';

/*
 * Symbols
 */
LP  : '(';
RP  : ')';
DOT : '.';

/*
 * Literals
 */
ID     : [a-zA-Z_] [a-zA-Z0-9_]*;
INT    : '-'? [0-9]+ ([Ee] [+\-]? [0-9]+)?;
DOUBLE : '-'? [0-9]+ '.' [0-9]+ ([Ee] [+\-]? [0-9]+)?;
STRING : '\'' (ESC | ~['\\])* '\'' | '"' (ESC | ~["\\])* '"';
BOOL   : 'true' | 'false';

/*
 * helper
 */
fragment ESC : '\\' [btnfr"'\\];
