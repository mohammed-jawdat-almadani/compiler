parser grammar jinjaParser;

options { tokenVocab=jinjaLexer; }

program
    : statement* EOF
    ;

statement
    : evaluation_statement
    | if_statement
    | assignment_statement
    | while_statement
    | comment
    ;

assignment_statement
    : BLOCK_START SET ID EQUALS expression BLOCK_END
    ;

expression
    : LP expression RP                                #eqPar
    | left=expression operator=(MUL|DIV) right=expression   #eqMul
    | left=expression operator=(ADD|SUB) right=expression   #eqAdd
    | DOUBLE                                            #eqDouble
    | INT                                               #eqInt
    | STRING                                            #eqString
    | ID                                                #eqVar
    ;

boolean_expression
    : LP boolean_expression RP                                #eqBoolPar
    | left=expression operator=(GT|GTEQ|LT|LTEQ) right=expression  #relationExpr
    | left=expression operator=(EQ|NEQ) right=expression           #boolEq
    | BOOL                                                        #eqBool
    ;

evaluation_statement
    : VAR_START expression VAR_END
    | VAR_START boolean_expression VAR_END
    ;

if_statement
    : if_fragment statement (elif_statement | else_statement)? endif_fragment
    ;

if_fragment
    : BLOCK_START IF LP boolean_expression RP BLOCK_END NEWLINE?
    ;

elif_statement
    : elif_fragment statement (elif_statement | else_statement)?
    ;

else_statement
    : else_fragment statement
    ;

elif_fragment
    : BLOCK_START ELIF LP boolean_expression RP BLOCK_END NEWLINE?
    ;

else_fragment
    : BLOCK_START ELSE BLOCK_END NEWLINE?
    ;

endif_fragment
    : BLOCK_START ENDIF BLOCK_END NEWLINE?
    ;

while_statement
    : while_fragment statement* endwhile_fragment
    ;

while_fragment
    : BLOCK_START WHILE LP boolean_expression RP BLOCK_END NEWLINE?
    ;

endwhile_fragment
    : BLOCK_START END_WHILE BLOCK_END NEWLINE?
    ;

comment
    : COMMENT
    ;