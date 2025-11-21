parser grammar htmlParser;

options {
    tokenVocab = htmlLexer;
}

htmlDocument
    : scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    ;

script
    : SCRIPT_OPEN SCRIPT_BODY
    ;

style
    : STYLE_OPEN STYLE_BODY
    ;



