lexer grammar HtmlJinjaLexer;

/*
 * General Comment -> HTML & JINJA
 */
HTML_COMMENT: '<!--' .*? '-->';
JINJA_COMMENT: '{#' .*? '#}';

/*
 * Script Let As {?php ?}
 */
SCRIPTLET: '<?' .*? '?>' | '<%' .*? '%>';

/*
 * White Space
 */
SEA_WS: (' ' | '\t' | '\r'? '\n')+;

/*
 * Mode -> Tag, Script, Style, (Jinja blocks and Jinja Expression) => JinjaEXPR
 */
TAG_OPEN: '<' -> pushMode(TAG);
SCRIPT_OPEN: '<script' .*? '>' -> pushMode(SCRIPT);
STYLE_OPEN: '<style' .*? '>' -> pushMode(STYLE);
JINJA_VAR_START   : '{{' -> pushMode(JINJA_BLOCK_EXPR);
JINJA_BLOCK_START : '{%' -> pushMode(JINJA_BLOCK_EXPR);

/*
 * HTML Text
 */
HTML_TEXT
    : ( ~[<{] | ('{' ~[#{%]) )+ ;

/*
 * Tag Mode
 */
mode TAG;
TAG_JINJA_VAR
    : '{{' .*? '}}' // -> for {{ }} in <tagName ...here...>
    ;
TAG_CLOSE: '>' -> popMode;
TAG_SLASH_CLOSE: '/>' -> popMode;
TAG_SLASH: '/';

TAG_EQUALS: '=' -> pushMode(ATTR_VALUE);
TAG_NAME: TAG_NameStartChar TAG_NameChar*;
TAG_WHITESPACE: [ \t\r\n] -> channel(HIDDEN);

fragment HEXDIGIT: [a-fA-F0-9];
fragment DIGIT: [0-9];
fragment TAG_NameChar:
    TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
;
fragment TAG_NameStartChar: [:a-zA-Z];

/*
 * Script Mode
 */
mode SCRIPT;
SCRIPT_BODY: .*? '</script>' -> popMode;

/*
 * Style Mode
 */
mode STYLE;
STYLE_BODY: .*? '</style>' -> popMode;

/*
 * ATTR_VALUE Mode
 */
mode ATTR_VALUE;
ATTVALUE_VALUE: ' '* ATTRIBUTE -> popMode;
ATTRIBUTE: DOUBLE_QUOTE_STRING | SINGLE_QUOTE_STRING | ATTCHARS | HEXCHARS | DECCHARS;

fragment ATTCHARS: ATTCHAR+ ' '?;
fragment ATTCHAR: '-' | '_' | '.' | '/' | '+' | ',' | '?' | '=' | ':' | ';' | '#' | [0-9a-zA-Z];
fragment HEXCHARS: '#' [0-9a-fA-F]+;
fragment DECCHARS: [0-9]+ '%'?;
fragment DOUBLE_QUOTE_STRING: '"' ~[<"]* '"';
fragment SINGLE_QUOTE_STRING: '\'' ~[<']* '\'';

/*
 * JINJA_BLOCK_EXPR Mode
 */
mode JINJA_BLOCK_EXPR;

JINJA_WS
    : [ \t\r\n]+ -> skip;

JINJA_BLOCK_END
    : '%}' -> popMode;

JINJA_VAR_END
    : '}}' -> popMode;

/*
 * Jinja Keywords
 */
JINJA_IF        : 'if';
JINJA_ELIF      : 'elif';
JINJA_ELSE      : 'else';
JINJA_ENDIF     : 'endif';
JINJA_FOR       : 'for';
JINJA_IN        : 'in';
JINJA_ENDFOR    : 'endfor';
JINJA_SET       : 'set';
JINJA_WHILE     : 'while';
JINJA_ENDWHILE  : 'endwhile';
JINJA_EXTENDS   : 'extends';

/*
 * Jinja Operators
 */
JINJA_ADD    : '+';
JINJA_SUB    : '-';
JINJA_MUL    : '*';
JINJA_DIV    : '/';
JINJA_SEQ    : '=';
JINJA_EQ     : '==';
JINJA_NEQ    : '!=';
JINJA_GT     : '>';
JINJA_LT     : '<';
JINJA_GTEQ   : '>=';
JINJA_LTEQ   : '<=';
JINJA_DQ     : '"';
JINJA_SQ     : '\'';

/*
 * Jinja Symbols
 */
JINJA_LP  : '(';
JINJA_RP  : ')';
JINJA_LSP  : '[';
JINJA_RSP  : ']';
JINJA_DOT : '.';
JINJA_PIP: '|';
JINJA_COMA: ',';

/*
 * Jinja Literals
 */
JINJA_ID     : [a-zA-Z_] [a-zA-Z0-9_]*;
JINJA_INT    : '-'? [0-9]+;
JINJA_DOUBLE : '-'? [0-9]+ '.' [0-9]+;
JINJA_STRING : '\'' (ESC | ~['\\])* '\'' | '"' (ESC | ~["\\])* '"';
JINJA_BOOL   : 'true' | 'false';

fragment ESC : '\\' [btnfr"'\\];
