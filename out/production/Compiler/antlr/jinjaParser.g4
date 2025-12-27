parser grammar jinjaParser;

options { tokenVocab=jinjaLexer; }

program
    : statement* EOF
    ;

/*
 * Normal text or Var {{ ... }}
 */
text_or_eval
    : (TEXT | evaluation_statement)+
    ;

/*
 * Main Stmt
 */
statement
    : assignment_statement
    | if_statement
    | while_statement
    | for_statement
    | text_or_eval
    ;

/*
 * As {% set x = 1 %}
 */
assignment_statement
    : BLOCK_START SET ID EQUALS expression BLOCK_END
    ;

/*
 * Arithmatic Exp
 */
expression
    : LP expression RP                                #eqPar
    | left=expression operator=(MUL|DIV) right=expression   #eqMul
    | left=expression operator=(ADD|SUB) right=expression   #eqAdd
    | DOUBLE                                            #eqDouble
    | INT                                               #eqInt
    | STRING                                            #eqString
    | ID                                                #eqVar
    ;

/*
 * Boolean Exp
 */
boolean_expression
    : LP boolean_expression RP                                #eqBoolPar
    | left=expression operator=(GT|GTEQ|LT|LTEQ) right=expression  #relationExpr
    | left=expression operator=(EQ|NEQ) right=expression           #boolEq
    | BOOL                                                        #eqBool
    ;

/*
 * {{ x }}, {{ x + 1 }}, {{ true }} or {{ 1 == 1 }}
 */
evaluation_statement
    : VAR_START expression VAR_END
    | VAR_START boolean_expression VAR_END
    ;

/*
 * If
 */
if_statement
    : if_fragment statement* (elif_statement | else_statement)? endif_fragment
    ;

/*
 * As {% if x > 2 %}
 */
if_fragment
    : BLOCK_START IF boolean_expression BLOCK_END
    ;


elif_statement
    : elif_fragment statement* (elif_statement | else_statement)?
    ;

else_statement
    : else_fragment statement*
    ;

/*
 * As {% elif x > 2 %}
 */
elif_fragment
    : BLOCK_START ELIF boolean_expression BLOCK_END
    ;

/*
 * As {% else %}
 */
else_fragment
    : BLOCK_START ELSE BLOCK_END
    ;

/*
 * As {% endif %}
 */
endif_fragment
    : BLOCK_START ENDIF BLOCK_END
    ;

/*
 * While
 */
while_statement
    : while_fragment statement* endwhile_fragment
    ;

/*
 * As {% while x > 2 %} {% endwhile %}
 */
while_fragment
    : BLOCK_START WHILE boolean_expression BLOCK_END
    ;

endwhile_fragment
    : BLOCK_START END_WHILE BLOCK_END
    ;

/*
 * For
 */
for_statement
    : for_fragment statement* endfor_fragment
    ;

/*
 * As {% for i in is %}
 */
for_fragment
    : BLOCK_START FOR ID IN ID BLOCK_END
    ;

/*
 * As {% endfor %}
 */
endfor_fragment
    : BLOCK_START END_FOR BLOCK_END
    ;
