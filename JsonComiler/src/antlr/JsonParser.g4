parser grammar JsonParser;

// Import lexer file
options {tokenVocab=JsonLexer;}

// Start Node
json
    : object
    | array
    ;

object
    : LKB (keyValue (CM keyValue)*)? RKB
    ;

array
    : LSB (value (CM value)*)? RSB
    ;

keyValue
    : STRING COL value
    ;

value
    : TRUE                          #Bool
    | FALSE                         #Bool
    | NULL                          #Null
    | object                        #ObjectValue
    | array                         #ArrayValue
    | INT                           #Integer
    | DOUBLE                        #Double
    | STRING                        #String
    ;