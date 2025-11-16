lexer grammar htmlCssLexer;

/*
 * HTML Tags
 */
TAG_OPEN: '<' [a-zA-Z][a-zA-Z0-9]*;
TAG_CLOSE: '</' [a-zA-Z][a-zA-Z0-9]* '>';
SELF_CLOSE_TAG: '<' [a-zA-Z][a-zA-Z0-9]* (WS? ATTR_PAIR)* WS? '/>';
TAG_END: '>';

/*
 * HTML Attributes
 */
ATTR_NAME: [a-zA-Z_:][a-zA-Z0-9_:.-]*;
ATTR_VALUE: '"' .*? '"' | '\'' .*? '\'';

// Attribute pair: name=optional value
fragment ATTR_PAIR: ATTR_NAME (WS? '=' WS? ATTR_VALUE)?;

/*
 * CSS
 */
CSS_SELECTOR: [.#]?[a-zA-Z_][a-zA-Z0-9_-]*;
CSS_LKB: '{';
CSS_RKB: '}';
CSS_COL: ':';
CSS_SCOL: ';';
CSS_VALUE: ~[{};]+;

/*
 * Comments
 */
// HTML comments
HTML_COMMENT: '<!--' .*? '-->';
// CSS comments
CSS_COMMENT: '/*' .*? '*/';

/*
 * Text and whitespace
 */
TEXT: ~[<{]+;
WS: [ \t\r\n]+ -> skip ;
