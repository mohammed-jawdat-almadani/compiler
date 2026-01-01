parser grammar cssParser;

options {
    tokenVocab = cssLexer;
}

/* =================== Css Main Style Sheet =================== */ // Contains
stylesheet
    : declarationList | ws (charset ( COMMENT | SPACE | CDO | CDC)*)* (import_statement ( COMMENT | SPACE | CDO | CDC)*)* (
        namespace_statement ( COMMENT | SPACE | CDO | CDC)*
    )* (nestedStatement ( COMMENT | SPACE | CDO | CDC)*)* EOF
    ;

/* =================== Charset Def =================== */ // As ::@charset "test";
charset
    : CHARSET ws STRING ws SEMI? ws
    ;

/* =================== Import Def =================== */ // As ::@import "test" or url(test);
import_statement
    : IMPORT ws (STRING | url) ws mediaQueryList SEMI? ws
    ;

/* =================== Namespace Def =================== */ // As ::@namespace "test";
namespace_statement
    : NAMESPACE ws (namespacePrefix ws)? (STRING | url) ws SEMI? ws
    ;

namespacePrefix
    : ident
    ;

/* =================== Media Def =================== */ // As ::@media () {}
media
    : MEDIA ws mediaQueryList groupRuleBody ws
    ;

// As @media (), ()
mediaQueryList
    : (mediaQuery ( COMMA ws mediaQuery)*)? ws
    ;

// As this -> (only | not) screen and (max-width: 767px) - or this -> (max-width: 767px) and (min-width: 1200px)
mediaQuery
    : (MEDIA_ONLY | NOT)? ws mediaType ws (AND ws mediaExpression)*
    | mediaExpression ( AND ws mediaExpression)*
    ;

// As any thing and, or, to ...etc
mediaType
    : ident
    ;

// As (mediafeature: expr) Ex: (max-width: 767px)
mediaExpression
    : LPAREN ws mediaFeature (COLON ws expr)? RPAREN ws
    ;

mediaFeature
    : ident ws
    ;

// As @page:test {}
page
    : PAGE ws pseudoPage? LBRACE ws declaration? (SEMI ws declaration?)* RBRACE ws
    ;

// As :ident
pseudoPage
    : COLON ident ws
    ;

// As .name, .email {}
selectorGroup
    : selector (COMMA ws selector)*
    ;

// Sequence of selector (+ | > | ~ | ) Sequence of selector
selector
    : simpleSelectorSequence ws (combinator simpleSelectorSequence ws)*
    ;

// As (+ > ~) Ex: .name ~ p
combinator
    : PLUS ws
    | GREATER ws
    | TILDE ws
    | SPACE ws
    ;

// Types of selectors
simpleSelectorSequence
    : (typeSelector | universal) (HASH | className | attrib | pseudo | negation)*
    | ( HASH | className | attrib | pseudo | negation)+
    ;

// As div, h1, p, ...etc {}
typeSelector
    : typeNamespacePrefix? elementName
    ;

typeNamespacePrefix
    : (ident | MULTI)? PIPE
    ;

elementName
    : ident
    ;

// As * {}
universal
    : typeNamespacePrefix? MULTI
    ;

// As .className {}
className
    : DOT ident
    ;

// As selector[attr=value]
attrib
    : LSBRAC ws typeNamespacePrefix? ident ws (
        (PREFIX_MATCH | SUFFIX_MATCH | SUB_STR_MATCH | EQUAL | ICLUDES | DASH_MATCH) ws (
            ident
            | STRING
        ) ws
    )? RSBRAC
    ;

// As ::before, :focus, ...etc
pseudo
    : COLON COLON? (ident | functionalPseudo)
    ;

// As test(expr)
functionalPseudo
    : FUNCTION_IDENT ws expression RPAREN
    ;

expression
    : (( PLUS | MINUS | DIMENSION | UNKNOWN_DIME | NUMBER | STRING | ident) ws)+
    ;

negation
    : PSEUDO_NOT ws negationArg ws RSBRAC
    ;

negationArg
    : typeSelector
    | universal
    | HASH
    | className
    | attrib
    | pseudo
    ;

// Use between expr
operator_
    : DIVIDE ws   # goodOperator
    | COMMA ws    # goodOperator
    | SPACE ws    # goodOperator
    | EQUAL ws    # badOperator
    ;

property_
    : ident ws    # goodProperty
    | Variable ws # goodProperty
    | MULTI ident   # badProperty
    | UNDER_SCORE ident   # badProperty
    ;

ruleset
    : selectorGroup LBRACE ws declarationList? RBRACE ws # knownRuleset
    | any_* LBRACE ws declarationList? RBRACE ws         # unknownRuleset
    ;

declarationList
    : (SEMI ws)* declaration ws (SEMI ws declaration?)*
    ;

declaration
    : property_ COLON ws expr prio? # knownDeclaration
    | property_ COLON ws value      # unknownDeclaration
    ;

prio
    : IMPORTANT ws
    ;

value
    : (any_ | block | AT_KEYWORD ws)+
    ;

expr
    : term (operator_? term)*
    ;

term
    : number ws           # knownTerm
    | percentage ws       # knownTerm
    | dimension ws        # knownTerm
    | STRING ws          # knownTerm
    | UNICODE_RANGE ws     # knownTerm
    | ident ws            # knownTerm
    | var_                # knownTerm
    | url ws              # knownTerm
    | hexcolor            # knownTerm
    | calc                # knownTerm
    | function_           # knownTerm
    | unknownDimension ws # unknownTerm
    | dxImageTransform    # badTerm
    ;

function_
    : FUNCTION_IDENT ws expr RPAREN ws
    ;

dxImageTransform
    : DxImageTransform ws expr RPAREN ws
    ;

hexcolor
    : HASH ws
    ;

number
    : (PLUS | MINUS)? NUMBER
    ;

percentage
    : (PLUS | MINUS)? PERCENTAGE
    ;

dimension
    : (PLUS | MINUS)? DIMENSION
    ;

unknownDimension
    : (PLUS | MINUS)? UNKNOWN_DIME
    ;

// Error handling
any_
    : ident ws
    | number ws
    | percentage ws
    | dimension ws
    | unknownDimension ws
    | STRING ws
    | url ws
    | HASH ws
    | UNICODE_RANGE ws
    | ICLUDES ws
    | DASH_MATCH ws
    | COLON ws
    | FUNCTION_IDENT ws ( any_ | unused)* ')' ws
    | '(' ws ( any_ | unused)* ')' ws
    | '[' ws ( any_ | unused)* ']' ws
    ;

atRule
    : AT_KEYWORD ws any_* (block | SEMI ws) # unknownAtRule
    ;

unused
    : block
    | AT_KEYWORD ws
    | SEMI ws
    | CDO ws
    | CDC ws
    ;

block
    : LBRACE ws (declarationList | nestedStatement | any_ | block | AT_KEYWORD ws | SEMI ws)* RBRACE ws
    ;

nestedStatement
    : ruleset
    | media
    | page
    | fontFaceRule
    | keyframesRule
    | supportsRule
    | viewport
    | counterStyle
    | fontFeatureValuesRule
    | atRule
    ;

groupRuleBody
    : LBRACE ws nestedStatement* RBRACE ws
    ;

supportsRule
    : SUPPORTS ws supportsCondition ws groupRuleBody
    ;

supportsCondition
    : supportsNegation
    | supportsConjunction
    | supportsDisjunction
    | supportsConditionInParens
    ;

supportsConditionInParens
    : LPAREN ws supportsCondition ws RPAREN
    | supportsDeclarationCondition
    | generalEnclosed
    ;

supportsNegation
    : NOT ws SPACE ws supportsConditionInParens
    ;

supportsConjunction
    : supportsConditionInParens (ws SPACE ws AND ws SPACE ws supportsConditionInParens)+
    ;

supportsDisjunction
    : supportsConditionInParens (ws SPACE ws OR ws SPACE ws supportsConditionInParens)+
    ;

supportsDeclarationCondition
    : LPAREN ws declaration RPAREN
    ;

generalEnclosed
    : (FUNCTION_IDENT | LPAREN) (any_ | unused)* RPAREN
    ;

url
    : URL_ ws STRING ws RPAREN
    | URL
    ;

var_
    : Var ws Variable ws RPAREN ws
    ;

calc
    : Calc ws calcSum RPAREN ws
    ;

calcSum
    : calcProduct (SPACE ws ( PLUS | MINUS) ws SPACE ws calcProduct)*
    ;

calcProduct
    : calcValue (MULTI ws calcValue | DIVIDE ws number ws)*
    ;

calcValue
    : number ws
    | dimension ws
    | unknownDimension ws
    | percentage ws
    | LPAREN ws calcSum RPAREN ws
    ;

fontFaceRule
    : FONT_FACE ws LBRACE ws fontFaceDeclaration? (SEMI ws fontFaceDeclaration?)* RBRACE ws
    ;

fontFaceDeclaration
    : property_ COLON ws expr  # knownFontFaceDeclaration
    | property_ COLON ws value # unknownFontFaceDeclaration
    ;

keyframesRule
    : Keyframes ws SPACE ws ident ws LBRACE ws keyframeBlock* RBRACE ws
    ;

keyframeBlock
    : (keyframeSelector LBRACE ws declarationList? RBRACE ws)
    ;

keyframeSelector
    : (FROM | TO | PERCENTAGE) ws (COMMA ws ( FROM | TO | PERCENTAGE) ws)*
    ;

viewport
    : Viewport ws LBRACE ws declarationList? RBRACE ws
    ;

counterStyle
    : CounterStyle ws ident ws LBRACE ws declarationList? RBRACE ws
    ;

fontFeatureValuesRule
    : FontFeatureValues ws fontFamilyNameList ws LBRACE ws featureValueBlock* RBRACE ws
    ;

fontFamilyNameList
    : fontFamilyName (ws COMMA ws fontFamilyName)*
    ;

fontFamilyName
    : STRING
    | ident ( ws ident)*
    ;

featureValueBlock
    : featureType ws LBRACE ws featureValueDefinition? (ws SEMI ws featureValueDefinition?)* RBRACE ws
    ;

featureType
    : AT_KEYWORD
    ;

featureValueDefinition
    : ident ws COLON ws number (ws number)*
    ;

ident
    : IDENT
    | MEDIA_ONLY
    | NOT
    | AND
    | OR
    | FROM
    | TO
    ;

ws
    : (COMMENT | SPACE)*
    ;