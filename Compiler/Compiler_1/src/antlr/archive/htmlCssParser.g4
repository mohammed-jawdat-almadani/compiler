parser grammar htmlCssParser;

options {
    tokenVocab = htmlCssLexer;
}

/*
 * Entry Point
 */
document
    : (element | HTML_COMMENT | TEXT)* EOF
    ;

/*
 * HTML Elements
 */
element
    : openTag content closeTag
    | selfCloseTag
    ;

openTag
    : TAG_OPEN (WS attribute)* TAG_END
    ;

closeTag
    : TAG_CLOSE
    ;

selfCloseTag
    : SELF_CLOSE_TAG
    ;

attribute
    : ATTR_NAME ( '=' ATTR_VALUE )?
    ;

/*
 * Content inside HTML tags
 */
content
    : (element | TEXT | HTML_COMMENT | cssBlock)*
    ;

/*
 * CSS Sections
 */
cssBlock
    : CSS_SELECTOR cssBody
    ;

cssBody
    : CSS_LKB cssProperty* CSS_RKB
    ;

cssProperty
    : ATTR_NAME CSS_COL CSS_VALUE CSS_SCOL
    ;

/*
 * Comments
 */
cssComment
    : CSS_COMMENT
    ;
