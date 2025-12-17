parser grammar HtmlJinjaParser;

options {
    tokenVocab = HtmlJinjaLexer;
}

/* =================== Main Html Document =================== */ // This is the empty document
htmlDocument
    : scriptletOrSeaWs* (htmlMisc | htmlElement)*
    ;

/* =================== Spaces Or ScriptLet =================== */ // As {?pho ?} or Space
scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

/* =================== Html Element =================== */ // As {{ ... }} {% ... %} <tag></tag> {?php ?} <script></script> <style></style>
htmlElement
    : jinjaExpression
    | jinja_statement
    | TAG_OPEN TAG_NAME htmlTagContent* (
        TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)?
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
    | left=expression operator=(JINJA_MUL|JINJA_DIV) right=expression       #eqMul
    | left=expression operator=(JINJA_ADD|JINJA_SUB) right=expression       #eqAdd
    | left=expression operator=(JINJA_EQ|JINJA_NEQ|JINJA_GT|JINJA_LT|JINJA_GTEQ|JINJA_LTEQ) right=expression  #eqCompare
    | expression JINJA_DOT JINJA_ID                                         #eqAttr
    | expression JINJA_LSP expression JINJA_RSP                            #eqIndex
    | expression JINJA_PIP JINJA_ID ('(' expression* ')')?                 #eqFilter
    | JINJA_DOUBLE                                                    #eqDouble
    | JINJA_INT                                                       #eqInt
    | JINJA_STRING                                                    #eqString
    | JINJA_ID                                                        #eqId
    ;

/* =================== Jinja Statement =================== */ // set, if, while and for {% ... %}
jinja_statement
    : assignment_statement
    | if_statement
    | while_statement
    | for_statement
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

/* =================== Helper Rules =================== */ // <tag ...useHere...> ... </tag>
htmlTagContent
    : htmlAttribute
    | jinjaExpression
    | tagJinjaBlock
    | TAG_JINJA_VAR
    ;

tagJinjaBlock
    : tagIfBlock
    | tagForBlock
    | tagWhileBlock
    ;

tagIfBlock
    : TAG_JINJA_BLOCK htmlAttribute* tagElifBlock* tagElseBlock? TAG_JINJA_BLOCK
    ;

tagElifBlock
    : TAG_JINJA_BLOCK htmlAttribute*
    ;

tagElseBlock
    : TAG_JINJA_BLOCK htmlAttribute*
    ;

tagForBlock
    : TAG_JINJA_BLOCK htmlAttribute* TAG_JINJA_BLOCK
    ;

tagWhileBlock
    : TAG_JINJA_BLOCK htmlAttribute* TAG_JINJA_BLOCK
    ;

