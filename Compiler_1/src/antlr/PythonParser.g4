parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

file_input: statements? EOF # File;

statements: statement+;

statement: compound_stmt | simple_stmts;

simple_stmts: simple_stmt (';' simple_stmt)* ';'? NEWLINE;

simple_stmt
    : assignment                # AssignStmt
    | expressions               # ExprStmt
    | return_stmt               # ReturnStmt
    | import_stmt               # ImportStmt
    | raise_stmt                # RaiseStmt
    | PASS                      # PassStmt
    | del_stmt                  # DelStmt
    | yield_stmt                # YieldStmt
    | assert_stmt               # AssertStmt
    | BREAK                   # BreakStmt
    | CONTINUE                # ContinueStmt
    | global_stmt               # GlobalStmt
    | nonlocal_stmt             # NonlocalStmt;

compound_stmt
    : decorators? function_def  # FuncDefStmt
    | decorators? class_def     # ClassDefStmt
    | if_stmt                   # IfStmt
    | with_stmt                 # WithStmt
    | for_stmt                  # ForStmt
    | try_stmt                  # TryStmt
    | while_stmt                # WhileStmt;

decorators: ('@' primary NEWLINE)+;

assignment
    : (targets '=')+ (yield_expr | expressions)
    | target augassign (yield_expr | expressions)
    | name ':' expression ('=' expressions)?;

augassign: '+=' | '-=' | '*=' | '/=' | '%=' | '&=' | '|=' | '^=' | '<<=' | '>>=' | '**=' | '//=';

if_stmt: 'if' expression ':' block elif_stmt* else_block?;
elif_stmt: 'elif' expression ':' block;
else_block: 'else' ':' block;

while_stmt: 'while' expression ':' block else_block?;
for_stmt: 'for' targets 'in' expressions ':' block else_block?;

with_stmt: 'with' with_item (',' with_item)* ':' block;
with_item: expression ('as' target)?;

try_stmt: 'try' ':' block (except_block+ else_block? finally_block? | finally_block);
except_block: 'except' (expression ('as' name)?)? ':' block;
finally_block: 'finally' ':' block;

class_def: 'class' name ('(' arguments? ')')? ':' block;
function_def: 'def' name '(' params? ')' ('->' expression)? ':' block;

block: NEWLINE INDENT statements DEDENT | simple_stmts;

params: param (',' param)*;
param: name (':' expression)? ('=' expression)?;

expressions: expression (',' expression)* ','?;

expression
    : disjunction ('if' disjunction 'else' expression)? # LogicalExpr
    | lambdef                                           # LambdaExpr;

lambdef: 'lambda' params? ':' expression;

disjunction: conjunction ('or' conjunction)*;
conjunction: inversion ('and' inversion)*;
inversion: 'not' inversion | comparison;

comparison: bitwise_or (compare_op bitwise_or)*;
compare_op: '==' | '!=' | '<=' | '<' | '>=' | '>' | 'in' | 'not' 'in' | 'is' | 'is' 'not';

bitwise_or: bitwise_xor ('|' bitwise_xor)*;
bitwise_xor: bitwise_and ('^' bitwise_and)*;
bitwise_and: shift_expr ('&' shift_expr)*;
shift_expr: sum (('<<' | '>>') sum)*;

sum
    : term (op=('+' | '-') term)* # AddSubExpr
    ;

term
    : factor (op=('*' | '/' | '//' | '%' | '@') factor)* # MulDivExpr
    ;

factor
    : op=('+' | '-' | '~') factor # UnaryExpr
    | power                       # FactorPower
    ;

power
    : primary ('**' factor)? # PowerExpr
    ;

primary
    : primary '.' name              # AttributeExpr
    | primary '(' (arguments | genexp)? ')' # CallExpr
    | primary '[' slices ']'        # SubscriptExpr
    | atom                          # AtomExpr;

genexp: expression for_if_clause;
for_if_clause: 'for' targets 'in' disjunction ('if' disjunction)*;

slices: slice (',' slice)* ','?;
slice: expression? ':' expression? (':' expression?)? | expression;

atom
    : name                          # NameAtom
    | 'True'                        # TrueAtom
    | 'False'                       # FalseAtom
    | 'None'                        # NoneAtom
    | strings                       # StringAtom
    | NUMBER                        # NumberAtom
    | '(' (yield_expr | expressions)? ')' # GroupAtom
    | '[' (expressions | genexp)? ']' # ListAtom
    | LBRACE dict_set? RBRACE       # DictSetAtom
    | '...'                         # EllipsisAtom;

strings: STRING+;
dict_set
    : (NEWLINE* expression ':' expression (',' NEWLINE* expression ':' expression)* ','? NEWLINE*)
    | (NEWLINE* expression (',' NEWLINE* expression)* ','? NEWLINE*)
    ;

import_stmt: 'import' dotted_as_names | 'from' ('.' | '...')? dotted_name 'import' ('*' | import_from_targets);
import_from_targets: '(' import_from_as_names ')' | import_from_as_names;
import_from_as_names: name ('as' name)? (',' name ('as' name)?)*;
dotted_as_names: dotted_name ('as' name)? (',' dotted_name ('as' name)?)*;
dotted_name: name ('.' name)*;

targets: target (',' target)* ','?;
target: name | '(' target ')' | '[' targets? ']' | primary '.' name | primary '[' slices ']';

return_stmt: 'return' expressions?;
raise_stmt: 'raise' (expression ('from' expression)?)?;
global_stmt: 'global' name (',' name)*;
nonlocal_stmt: 'nonlocal' name (',' name)*;
del_stmt: 'del' target (',' target)*;
yield_stmt: yield_expr;
yield_expr: 'yield' ('from' expression | expressions?);
assert_stmt: 'assert' expression (',' expression)?;
arguments: (expression | name '=' expression) (',' (expression | name '=' expression))*;

name: NAME | NAME_OR_TYPE | NAME_OR_MATCH | NAME_OR_CASE | NAME_OR_WILDCARD;