
//lexer grammar cssLexer;
//
//channels { ERROR }
//
///*
// * Keywords / At-Rules
// */
//CHARSET: '@charset';
//IMPORT: '@import';
//MEDIA: '@media';
//NAMESPACE: '@namespace';
//PAGE: '@page';
//FONT_FACE: '@font-face';
//SUPPORTS: '@supports';
//KEYFRAMES: '@keyframes';
//VIEWPORT: '@viewport';
//COUNTER_STYLE: '@counter-style';
//FONT_FEATURE_VALUES: '@font-feature-values';
//
///*
// * CSS Functions
// */
//URL: 'url(';
//VAR: 'var(';
//CALC: 'calc(';
//FUNCTION: IDENT '(';
//DX_IMAGE: 'progid:DXImageTransform.Microsoft.' FUNCTION;
//
///*
// * Logical Keywords
// */
//ONLY: 'only';
//NOT: 'not';
//AND: 'and';
//OR: 'or';
//FROM: 'from';
//TO: 'to';
//IMPORTANT: '!important';
//
///*
// * Operators & Symbols
// */
//PLUS: '+';
//MINUS: '-';
//MULTIPLY: '*';
//DIVIDE: '/';
//UNDER: '_';
//
//EQUAL: '=';
//GREATER: '>';
//TILDE: '~';
//
//COMMA: ',';
//COLON: ':';
//SEMI: ';';
//DOT: '.';
//PIPE: '|';
//
//LPAREN: '(';
//RPAREN: ')';
//LBRACE: '{';
//RBRACE: '}';
//LBRACK: '[';
//RBRACK: ']';
//
//AT: '@';
//PREFIX_MATCH: '^=';
//SUFFIX_MATCH: '$=';
//SUBSTRING_MATCH: '*=';
//INCLUDES: '~=';
//DASH_MATCH: '|=';
//
///*
// * Literals
// */
//// Numbers
//NUMBER: [+-]? ([0-9]+ | [0-9]* '.' [0-9]+);
//
//// Percentage
//PERCENTAGE: NUMBER '%';
//
//// Dimensions (px, em, rem, vh, vw, s, ms, deg...)
//DIMENSION: NUMBER IDENT;
//
//// Strings
//STRING
//    : '"' ( ~["\\\r\n] | '\\' . )* '"'
//    | '\'' ( ~['\\\r\n] | '\\' . )* '\''
//    ;
//
///*
// * Identifiers
// */
//IDENT: '-'? [a-zA-Z_] [a-zA-Z0-9_-]*;
//
//// CSS Variables (--main-color)
//VARIABLE: '--' [a-zA-Z_] [a-zA-Z0-9_-]*;
//
///*
// * Colors
// */
//HASH: '#' [0-9a-fA-F]+;
//
///*
// * Comments & Whitespace
// */
//COMMENT: '/*' .*? '*/' -> skip;
//WS: [ \t\r\n\f]+ -> skip;
//SPACE: [ \t\r\n\f]+;
//
///*
// * Error Handling
// */
//ERROR_CHAR: . -> channel(ERROR);
