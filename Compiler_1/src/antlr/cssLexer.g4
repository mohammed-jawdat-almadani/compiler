lexer grammar cssLexer;

channels {
    ERROR
}
/*
 *  Css Comment
 */
COMMENT: '/*' ~'*'* '*'+ ( ~[/*] ~'*'* '*'+)* '/';

/*
 *  Keywords
 */
CHARSET: AT C H A R S E T; // -> As @charset
IMPORT: AT I M P O R T; // -> As @import
PAGE: AT P A G E; // -> As @page
MEDIA: AT M E D I A; // -> As @media
NAMESPACE: AT N A M E S P A C E; // -> As @namespace
FONT_FACE: AT F O N T DashChar F A C E; // -> As @font-face
SUPPORTS: AT S U P P O R T S; // -> As @support
IMPORTANT: '!' ( SPACE | COMMENT)* I M P O R T A N T; // As !important
MEDIA_ONLY: O N L Y; // -> As only
NOT: N O T; // -> As not
AND: A N D; // -> As and
OR: O R;
AT_KEYWORD: AT IDENT;
Keyframes: AT VendorPrefix? K E Y F R A M E S;
FROM: F R O M;
TO: T O;
Viewport: AT V I E W P O R T;
CounterStyle: AT C O U N T E R DashChar S T Y L E;
FontFeatureValues: AT F O N T DashChar F E A T U R E DashChar V A L U E S;

/*
 * Pesudo or Functions
 */
PSEUDO_NOT: ':' N O T '(';
URL_: 'url(';
Var: 'var(';
FUNCTION_IDENT: IDENT '(';
Calc: 'calc(';

/*
 *  Operators
 */
EQUAL        : '=';
MULTI        : '*';
DIVIDE       : '/';
PLUS         : '+';
MINUS        : '-';

/*
 * Symbols
 */
LSBRAC       : '[';
RSBRAC       : ']';
LPAREN       : '(';
RPAREN       : ')';
LBRACE       : '{';
RBRACE       : '}';
SEMI         : ';';
COLON        : ':';
DOT          : '.';
PIPE         : '|';
UNDER_SCORE  : '_';
GREATER      : '>';
COMMA        : ',';
TILDE        : '~';
PREFIX_MATCH : '^=';
SUFFIX_MATCH : '$=';
SUB_STR_MATCH: '*=';
ICLUDES      : '~=';
DASH_MATCH   : '|=';
HASH         : '#' Name;

fragment AT: '@';
fragment Hex: [0-9a-fA-F];
fragment NewlineOrSpace: '\r\n' | [ \t\r\n\f] |;
fragment Unicode: '\\' Hex Hex? Hex? Hex? Hex? Hex? NewlineOrSpace;
fragment Escape: Unicode | '\\' ~[\r\n\f0-9a-fA-F];
fragment Nmstart: [_a-zA-Z] | Nonascii | Escape;
fragment Nmchar: [_a-zA-Z0-9\-] | Nonascii | Escape;
fragment Name: Nmchar+;
URL: U R L '(' Whitespace ( [!#$%&*-~] | Nonascii | Escape)* Whitespace ')';
SPACE: [ \t\r\n\f]+;
fragment Whitespace: SPACE |;
fragment Newline: '\n' | '\r\n' | '\r' | '\f';
fragment ZeroToFourZeros: '0'? '0'? '0'? '0'?;

fragment DashChar: '-' | '\\' ZeroToFourZeros '2d' NewlineOrSpace;

CDO: '<!--';
CDC: '-->';

/*
 * Units
 */
fragment FontRelative: NUMBER E M | NUMBER E X | NUMBER C H | NUMBER R E M;
fragment ViewportRelative: NUMBER V W | NUMBER V H | NUMBER V M I N | NUMBER V M A X;
fragment AbsLength:
    NUMBER P X
    | NUMBER C M
    | NUMBER M M
    | NUMBER I N
    | NUMBER P T
    | NUMBER P C
    | NUMBER Q
;
fragment Angle: NUMBER D E G | NUMBER R A D | NUMBER G R A D | NUMBER T U R N;
fragment Time: NUMBER M S | NUMBER S;
fragment Freq: NUMBER H Z | NUMBER K H Z;

PERCENTAGE: NUMBER '%';
UNICODE_RANGE:
    [u|U] '+?' '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex '?'? '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex '?'? '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex '?'? '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex '?'? '?'?
    | [u|U] '+' Hex Hex Hex Hex Hex '?'?
;

/*
 * Dimension
 */
DIMENSION: Length | Time | Freq | Resolution | Angle;
UNKNOWN_DIME: NUMBER IDENT;
fragment Resolution: NUMBER D P I | NUMBER D P C M | NUMBER D P P X;
fragment Length: AbsLength | FontRelative | ViewportRelative;
fragment Nonascii: ~[\u0000-\u007f];


fragment VendorPrefix: '-' M O Z '-' | '-' W E B K I T '-' | '-' O '-';

DxImageTransform: 'progid:DXImageTransform.Microsoft.' FUNCTION_IDENT;
/*
 * Literals
 */
NUMBER: [0-9]+ | [0-9]* '.' [0-9]+;
STRING:
    '"' (~[\n\r\f\\"] | '\\' Newline | Nonascii | Escape)* '"'
    | '\'' ( ~[\n\r\f\\'] | '\\' Newline | Nonascii | Escape)* '\''
;
Variable: '--' Nmstart Nmchar*;
IDENT: '-'? Nmstart Nmchar*;

/*
 * Error
 */
UnexpectedCharacter: . -> channel(ERROR);

/*
 * Helpers
 */
fragment A: 'a' | 'A' | '\\' ZeroToFourZeros ('41' | '61') NewlineOrSpace;
fragment B: 'b' | 'B' | '\\' ZeroToFourZeros ('42' | '62') NewlineOrSpace;
fragment C: 'c' | 'C' | '\\' ZeroToFourZeros ('43' | '63') NewlineOrSpace;
fragment D: 'd' | 'D' | '\\' ZeroToFourZeros ('44' | '64') NewlineOrSpace;
fragment E: 'e' | 'E' | '\\' ZeroToFourZeros ('45' | '65') NewlineOrSpace;
fragment F: 'f' | 'F' | '\\' ZeroToFourZeros ('46' | '66') NewlineOrSpace;
fragment G: 'g' | 'G' | '\\' ZeroToFourZeros ('47' | '67') NewlineOrSpace | '\\g' | '\\G';
fragment H: 'h' | 'H' | '\\' ZeroToFourZeros ('48' | '68') NewlineOrSpace | '\\h' | '\\H';
fragment I: 'i' | 'I' | '\\' ZeroToFourZeros ('49' | '69') NewlineOrSpace | '\\i' | '\\I';
fragment K: 'k' | 'K' | '\\' ZeroToFourZeros ('4b' | '6b') NewlineOrSpace | '\\k' | '\\K';
fragment L: 'l' | 'L' | '\\' ZeroToFourZeros ('4c' | '6c') NewlineOrSpace | '\\l' | '\\L';
fragment M: 'm' | 'M' | '\\' ZeroToFourZeros ('4d' | '6d') NewlineOrSpace | '\\m' | '\\M';
fragment N: 'n' | 'N' | '\\' ZeroToFourZeros ('4e' | '6e') NewlineOrSpace | '\\n' | '\\N';
fragment O: 'o' | 'O' | '\\' ZeroToFourZeros ('4f' | '6f') NewlineOrSpace | '\\o' | '\\O';
fragment P: 'p' | 'P' | '\\' ZeroToFourZeros ('50' | '70') NewlineOrSpace | '\\p' | '\\P';
fragment Q: 'q' | 'Q' | '\\' ZeroToFourZeros ('51' | '71') NewlineOrSpace | '\\q' | '\\Q';
fragment R: 'r' | 'R' | '\\' ZeroToFourZeros ('52' | '72') NewlineOrSpace | '\\r' | '\\R';
fragment S: 's' | 'S' | '\\' ZeroToFourZeros ('53' | '73') NewlineOrSpace | '\\s' | '\\S';
fragment T: 't' | 'T' | '\\' ZeroToFourZeros ('54' | '74') NewlineOrSpace | '\\t' | '\\T';
fragment U: 'u' | 'U' | '\\' ZeroToFourZeros ('55' | '75') NewlineOrSpace | '\\u' | '\\U';
fragment V: 'v' | 'V' | '\\' ZeroToFourZeros ('56' | '76') NewlineOrSpace | '\\v' | '\\V';
fragment W: 'w' | 'W' | '\\' ZeroToFourZeros ('57' | '77') NewlineOrSpace | '\\w' | '\\W';
fragment X: 'x' | 'X' | '\\' ZeroToFourZeros ('58' | '78') NewlineOrSpace | '\\x' | '\\X';
fragment Y: 'y' | 'Y' | '\\' ZeroToFourZeros ('59' | '79') NewlineOrSpace | '\\y' | '\\Y';
fragment Z: 'z' | 'Z' | '\\' ZeroToFourZeros ('5a' | '7a') NewlineOrSpace | '\\z' | '\\Z';