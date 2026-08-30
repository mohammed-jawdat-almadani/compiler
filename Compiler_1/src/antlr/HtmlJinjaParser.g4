parser grammar HtmlJinjaParser;

options {
    tokenVocab = HtmlJinjaLexer;
}

@parser::members {
    private boolean isVoidElement(String tagName) {
        String t = tagName.toLowerCase();
        return t.equals("area") || t.equals("base") || t.equals("br") || t.equals("col") ||
               t.equals("embed") || t.equals("hr") || t.equals("img") || t.equals("input") ||
               t.equals("link") || t.equals("meta") || t.equals("param") || t.equals("source") ||
               t.equals("track") || t.equals("wbr");
    }
}

block_statement
    : block_open templateContent* block_close
    ;

block_open
    : JINJA_BLOCK_START JINJA_BLOCK JINJA_ID? JINJA_BLOCK_END
    ;

block_close
    : JINJA_BLOCK_START JINJA_ENDBLOCK JINJA_ID? JINJA_BLOCK_END
    ;

/* =================== Main Html Document =================== */ // This is the empty document
htmlDocument
    : (scriptletOrSeaWs | DTD)*
      (extends_statement | jinja_statement | jinjaComment | htmlMisc | htmlElement)*
    ;

/* =================== Extends Statement =================== */ // As {% extends "test.html" %}
extends_statement
    : JINJA_BLOCK_START JINJA_EXTENDS JINJA_STRING JINJA_BLOCK_END
    ;

/* =================== Spaces Or ScriptLet =================== */ // As {?php ?} or Space
scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

/* =================== Html Element =================== */ // As {{ ... }} {% ... %} <tag></tag> {?php ?} <script></script> <style></style>
htmlElement
    : jinjaExpression
    | jinja_statement
    | TAG_OPEN startName=TAG_NAME htmlTagContent* (
        TAG_CLOSE (
            { !isVoidElement($startName.text) }? htmlContent TAG_OPEN TAG_SLASH endName=TAG_NAME TAG_CLOSE 
            { $startName.text.equalsIgnoreCase($endName.text) }?
        )?
        | TAG_SLASH_CLOSE
    )
    | SCRIPTLET
    | script
    | style
    ;

/* =================== Html Element Content =================== */ // Any Element
htmlContent
    : templateContent*
    ;

/* =================== Html Element Attribute =================== */ // As class = "test"
htmlAttribute
    : TAG_NAME (TAG_EQUALS ATTVALUE_VALUE)?  // <-- يمكن أن يكون ATTVALUE_VALUE يحتوي {{ expression }}
    ;

/* =================== Html Text or Space =================== */ // Any thing can be content
htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

/* =================== Html and Jinja Comments or Spaces =================== */ // <!----> {# ... #} Or Space
htmlMisc
    : htmlComment
    | jinjaComment
    | SEA_WS
    ;

/* =================== Html Comment =================== */ // <!---->
htmlComment
    : HTML_COMMENT
    ;

/* =================== Jinja Comment =================== */ // {# ... #}
jinjaComment
    : JINJA_COMMENT
    ;

/* =================== Jinja Expression =================== */ // {{ ... }}
jinjaExpression
    : JINJA_VAR_START expression JINJA_VAR_END ;

/* =================== Jinja Definition Expression =================== */ // Type of expression
expression
    : JINJA_LP expression JINJA_RP                                          #eqPar
    | expression JINJA_DOT JINJA_ID                                         #eqAttr
    | expression JINJA_LSP expression JINJA_RSP                            #eqIndex
    | expression JINJA_LP arguments? JINJA_RP                               #eqCall
    | expression JINJA_PIP JINJA_ID (JINJA_LP arguments? JINJA_RP)?         #eqFilter
    | JINJA_NOT expression                                                  #eqNot
    | JINJA_SUB expression                                                  #eqNeg
    | left=expression operator=(JINJA_MUL|JINJA_DIV) right=expression       #eqMul
    | left=expression operator=(JINJA_ADD|JINJA_SUB) right=expression       #eqAdd
    | left=expression JINJA_TILDE right=expression                          #eqConcat
    | left=expression operator=(JINJA_EQ|JINJA_NEQ|JINJA_GT|JINJA_LT|JINJA_GTEQ|JINJA_LTEQ) right=expression  #eqCompare
    | left=expression JINJA_IN right=expression                             #eqIn
    | left=expression JINJA_IS JINJA_NOT? JINJA_ID                          #eqIs
    | left=expression JINJA_AND right=expression                            #eqAnd
    | left=expression JINJA_OR right=expression                             #eqOr
    | expression JINJA_IF expression (JINJA_ELSE expression)?                #eqTernary
    | JINJA_DOUBLE                                                    #eqDouble
    | JINJA_INT                                                       #eqInt
    | JINJA_STRING                                                    #eqString
    | JINJA_BOOL                                                      #eqBool
    | JINJA_NONE                                                      #eqNone
    | JINJA_ID                                                        #eqId
    ;

/* =================== Call / filter arguments =================== */ // f(a, b, key=value)
arguments
    : argument (JINJA_COMA argument)*
    ;

argument
    : JINJA_ID JINJA_SEQ expression   #kwArgument
    | expression                      #posArgument
    ;

/* =================== Jinja Statement =================== */ // set, if, while and for {% ... %}
jinja_statement
    : assignment_statement
    | if_statement
    | while_statement
    | for_statement
    | block_statement
    ;

/* =================== Jinja Assignment Statement =================== */ // {% set id = expression %}
assignment_statement
    : JINJA_BLOCK_START JINJA_SET JINJA_ID JINJA_SEQ expression JINJA_BLOCK_END
    ;

/* =================== Jinja If Statement =================== */ // {% if %} Any Element {% elif %} {% else %} {% endif %}
if_statement
    : if_fragment templateContent*
      (elif_statement | else_statement)?
      endif_fragment
    ;

/* =================== Jinja If Definition =================== */ // {% if expression %}
if_fragment
    : JINJA_BLOCK_START JINJA_IF expression JINJA_BLOCK_END
    ;

/* =================== Jinja Elif Statement =================== */ // {% elif %} Any Element {% elif %} {% else %}
elif_statement
    : elif_fragment templateContent* (elif_statement | else_statement)?
    ;

/* =================== Jinja Elif Definition =================== */ // {% elif expression %}
elif_fragment
    : JINJA_BLOCK_START JINJA_ELIF expression JINJA_BLOCK_END
    ;

/* =================== Jinja Else Statement =================== */ // {% else %} Any Element
else_statement
    : else_fragment templateContent*
    ;

/* =================== Jinja Else Definition =================== */ // {% else expression %}
else_fragment
    : JINJA_BLOCK_START JINJA_ELSE JINJA_BLOCK_END
    ;

/* =================== Jinja Endif Definition =================== */ // {% endif %}
endif_fragment
    : JINJA_BLOCK_START JINJA_ENDIF JINJA_BLOCK_END
    ;

/* =================== Jinja While Statement =================== */ // {% while %} Any Element {% endwhile %}
while_statement
    : while_fragment templateContent* endwhile_fragment
    ;

/* =================== Jinja While Definition =================== */ // {% while expression %}
while_fragment
    : JINJA_BLOCK_START JINJA_WHILE expression JINJA_BLOCK_END
    ;

/* =================== Jinja Endwhile Definition =================== */ // {% endwhile %}
endwhile_fragment
    : JINJA_BLOCK_START JINJA_ENDWHILE JINJA_BLOCK_END
    ;

/* =================== Jinja For Statement =================== */ // {% for %} Any Element {% endfor %}
for_statement
    : for_fragment templateContent* endfor_fragment
    ;

/* =================== Jinja For Definition =================== */ // {% For (id | id,id) in expression %}
for_fragment
    : JINJA_BLOCK_START JINJA_FOR for_target JINJA_IN expression JINJA_BLOCK_END
    ;

/* =================== Jinja For target =================== */ // Helper to use with for fragment
for_target
    : JINJA_ID
    | JINJA_ID JINJA_COMA JINJA_ID
    ;

/* =================== Jinja Endfor Definition =================== */ // {% endfor %}
endfor_fragment
    : JINJA_BLOCK_START JINJA_ENDFOR JINJA_BLOCK_END
    ;

/* =================== html Script Definition =================== */ // <script></script>
script
    : SCRIPT_OPEN SCRIPT_BODY
    ;

/* =================== html Style Definition =================== */ // <style></style>
style
    : STYLE_OPEN STYLE_BODY
    ;

/* =================== Helper Rules =================== */ // It is mean any element both Html & Jinja
templateContent
    : htmlChardata
    | htmlElement
    | jinjaExpression
    | jinja_statement
    | htmlComment
    | jinjaComment
    ;

/* =================== Helper Rules =================== */ // <tag ...useHere...> ... </tag> as class="{{ varName }}"
htmlTagContent
    : htmlAttribute
    | TAG_JINJA_VAR
    ;
