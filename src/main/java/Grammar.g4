grammar Grammar;
prog: (java| python) EOF;

java: (
          j_seqSeq
          | j_choice
          | j_repeat
          | j_loop
          | j_para
          | j_concur
          | j_concurRe
          | j_cond
          | j_seq
          ) j_function_declaration*;

python: (
            j_seqSeq
            | p_seqSeq
            | p_choice
            | p_repeat
            | p_loop
            | p_para
            | p_concur
            | p_concurRe
            | p_cond
            | p_seq
            );

p_line: p_function_call | p_assignment | p_forloop | p_if;

j_function_declaration: j_type ID (('(' j_params ')') | '()');

j_params: ( j_function_param ',')* j_function_param;

j_function_param: j_type ID;

j_line: ((j_declaration | j_array_declaration | j_initialization | j_function_call | j_loopFun | j_if) ';');

j_function_call: ID ('(' j_function_args ')' | '()');

j_function_args: ( j_function_arg ',')* j_function_arg;

j_function_arg
    : BOOL_JAVA
    | j_function_call
    | NUMBER
    | STRING
    | ID
    | CHAR
    ;

p_function_call: ID ('(' p_args ')' | '()');

p_args: ( p_arg ',')* p_arg;

p_arg
    : BOOL_PYTHON
    | p_string
    | NUMBER
    | p_function_call
    | ID
    ;

j_declaration
    : INT_TYPE ID
    | STRING_TYPE ID
    | BOOL_TYPE ID
    | FLOAT_TYPE ID
    | DOUBLE_TYPE ID
    | CHAR_TYPE ID
    ;

j_array_declaration
    : INT_TYPE '[]' ID
    | STRING_TYPE '[]' ID
    | BOOL_TYPE '[]' ID
    | FLOAT_TYPE '[]' ID
    | DOUBLE_TYPE '[]' ID
    | CHAR_TYPE '[]' ID
    ;

//initialization
j_initialization
    : j_int_initialization
    | j_float_initialization
    | j_double_initialization
    | j_bool_initialization
    | j_string_initialization
    | j_char_initialization
    | j_array_initialization
    ;

j_int_initialization:
    INT_TYPE ID '=' (ID | NUMBER);
j_string_initialization:
    STRING_TYPE ID '=' (ID | STRING);
j_bool_initialization:
    BOOL_TYPE ID '=' (ID | BOOL_JAVA);
j_float_initialization:
    FLOAT_TYPE ID '=' (ID | DOBULE);
j_double_initialization:
    DOUBLE_TYPE ID '=' (ID | DOBULE);
j_char_initialization:
    CHAR_TYPE ID '=' (ID | CHAR);
j_array_initialization
    : INT_TYPE '[]' ID '=' (ID
        | ('new' INT_TYPE '[' NUMBER ']' ('{' (NUMBER (',' NUMBER)*)? '}')?)
        | (('new' INT_TYPE '[]')? '{' (NUMBER (',' NUMBER)*)? '}')
    )
    | STRING_TYPE '[]' ID '=' (ID
        | ('new' STRING_TYPE '[' NUMBER ']' ('{' (STRING (',' STRING)*)? '}')?)
        | (('new' STRING_TYPE '[]')? '{' (STRING (',' STRING)*)? '}')
    )
    | BOOL_TYPE '[]' ID '=' (ID
        | ('new' BOOL_TYPE '[' NUMBER ']' ('{' (BOOL_JAVA (',' BOOL_JAVA)*)? '}')?)
        | (('new' BOOL_TYPE '[]')? '{' (BOOL_JAVA (',' BOOL_JAVA)*)? '}')
    )
    | FLOAT_TYPE '[]' ID '=' (ID
        | ('new' FLOAT_TYPE '[' NUMBER ']' ('{' (DOBULE (',' DOBULE)*)? '}')?)
        | (('new' FLOAT_TYPE '[]')? '{' (DOBULE (',' DOBULE)*)? '}')
    )
    | DOUBLE_TYPE '[]' ID '=' (ID
        | ('new' DOUBLE_TYPE '[' NUMBER ']' ('{' (DOBULE (',' DOBULE)*)? '}')?)
        | (('new' DOUBLE_TYPE '[]')? '{' (DOBULE (',' DOBULE)*)? '}')
    )
    | CHAR_TYPE '[]' ID '=' (ID
        | ('new' CHAR_TYPE '[' NUMBER ']' ('{' (CHAR (',' CHAR)*)? '}')?)
        | (('new' CHAR_TYPE '[]')? '{' (CHAR (',' CHAR)*)? '}')
    )
    ;

p_assignment: ID '=' p_rhs_value;

p_rhs_value: ID | NUMBER | BOOL_PYTHON | p_string | p_list;

p_string: STRING |  STRING_SMALL;

p_list: '[' (p_rhs_value (',' p_rhs_value)*)? ']';

j_type: INT_TYPE | CHAR_TYPE | STRING_TYPE | DOUBLE_TYPE | FLOAT_TYPE | BOOL_TYPE | ID;

//Values
NUMBER: '0' | '-'?[1-9][0-9]*;
CHAR: '\'' . '\'';
DOBULE: '-'?('0'|[1-9][0-9]*)('.'[0-9]+)?;
STRING: '"' .*? '"';
STRING_SMALL: ('\'' .*? '\'');
BOOL_JAVA: 'true' | 'false';
BOOL_PYTHON: 'True' | 'False';

//Types
INT_TYPE: 'int';
CHAR_TYPE: 'char';
STRING_TYPE: 'String';
DOUBLE_TYPE: 'double';
FLOAT_TYPE: 'float';
BOOL_TYPE: 'boolean';
ID: [a-zA-Z][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;

//For loop java
j_loopFun
    : statement
    ;

statement
	:	forStatement
	|   whileStatement
	;

whileStatement
    : 'while' '(' conditionStatement ')' stmt
    ;

conditionStatement
    : ID condition_greater_less NUMBER
    | BOOL_JAVA
    ;

forStatement
	:	basicForStatement
	;

basicForStatement
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' stmt
	;

stmt
    :   block
    |   j_line
    ;

block
    : '{' j_line* '}'
    ;

forInit
	:	localVariableDeclaration
	;

localVariableDeclaration
	:	j_int_initialization
	;

forUpdate
	:	incDecExpression
	;

expression
	:	ID condition_greater_less NUMBER
	;

condition_greater_less
    :   '>'
    |   '<'
    |   '>='
    |   '<='
    ;

condition_equal_unequal
    : '=='
    | '!='
    ;

incDecExpression
	:	'++' ID
	|	'--' ID
	|	ID '++'
	|	ID '--'
	;

// For loop python

p_forloop
    :   'for' ID 'in' p_exp ':' p_line*
    ;

p_exp
    :   p_string
    |   ID
    |   p_range
    |   p_list
    ;

p_range
    : 'range' '(' NUMBER ')'
    ;

// If java

j_if
    : 'if' '(' j_condition (('||' | '&&') j_condition)* ')' stmt;

j_condition
    : BOOL_JAVA | j_function_call
    | (BOOL_JAVA | ID) condition_equal_unequal (BOOL_JAVA | ID)
    | (STRING | ID) condition_equal_unequal (STRING | ID)
    | (ID | NUMBER | DOBULE | CHAR | incDecExpression | j_function_call) (condition_greater_less | condition_equal_unequal) (ID | NUMBER | DOBULE | CHAR | incDecExpression| j_function_call)
    ;

// If python

p_if
    : 'if ' p_condition (('or' | 'and') p_condition)* ':' p_line+;

p_condition
    : BOOL_PYTHON | p_function_call
    | (STRING_SMALL | STRING | ID) condition_equal_unequal (STRING_SMALL | STRING | ID)
    | (ID | NUMBER | DOBULE | p_function_call) (condition_greater_less | condition_equal_unequal) (ID | NUMBER | DOBULE | p_function_call)
    ;
//ANY: (~[;`][+-/])*;

J_ARG_CODE_BLOCK : ('`' (~[;`])*? ';' '`');
j_arg_condition: '``'j_condition'``';
j_arg_function: '~'j_function_call'~';
j_arg_special_function
    : j_seqSeq
    | j_choice
    | j_repeat
    | j_loop
    | j_para
    | j_concur
    | j_concurRe
    | j_cond
    | j_seq
    | j_branch
    | j_branchRe
    ;

j_arg_universal: J_ARG_CODE_BLOCK | j_arg_function | j_arg_special_function;

P_ARG_CODE_BLOCK : ('`' (~[;`])*? '`');
p_arg_condition: '``'p_condition'``';
p_arg_function: '~'p_function_call'~';
p_arg_special_function
    : p_seqSeq
    | p_choice
    | p_repeat
    | p_loop
    | p_para
    | p_concur
    | p_concurRe
    | p_cond
    | p_seq
    | j_branches
    | p_branches
    ;

p_arg_universal: P_ARG_CODE_BLOCK | p_arg_function | p_arg_special_function;

j_seqSeq : 'seqSeq('j_arg_universal ',' j_arg_universal ',' j_arg_universal')';
p_seqSeq : 'seqSeq('p_arg_universal ',' p_arg_universal ',' p_arg_universal')';
j_choice : 'choice('j_arg_universal ',' j_arg_universal ',' j_arg_universal',' j_arg_universal')';
p_choice : 'choice('p_arg_universal ',' p_arg_universal ',' p_arg_universal ',' p_arg_universal')';
p_repeat : 'repeat('p_arg_universal ',' p_arg_universal ',' p_arg_condition ',' p_arg_universal')';
j_repeat : 'repeat('j_arg_universal ',' j_arg_universal ',' j_arg_condition ',' j_arg_universal')';

j_loop : 'loop('j_arg_universal ','j_arg_condition','j_arg_universal','j_arg_universal')';
p_loop : 'loop('p_arg_universal ','p_arg_condition','p_arg_universal','p_arg_universal')';
j_para : 'para('j_arg_universal ','j_arg_universal','j_arg_universal','j_arg_universal ')';
p_para : 'para('p_arg_universal ','p_arg_universal','p_arg_universal','p_arg_universal ')';

j_cond: 'cond' '(' j_arg_condition ',' j_arg_universal ',' j_arg_universal ',' j_arg_universal ')';
p_cond: 'cond' '(' p_arg_condition ',' p_arg_universal ',' p_arg_universal ',' p_arg_universal ')';

j_concur: 'concur' '(' j_arg_universal ',' j_arg_universal ',' j_arg_universal ')';
p_concur: 'concur' '(' p_arg_universal ',' p_arg_universal ',' p_arg_universal ')';
j_concurRe: 'concurRe' '(' j_arg_universal ',' j_arg_universal ',' j_arg_universal ')';
p_concurRe: 'concurRe' '(' p_arg_universal ',' p_arg_universal ',' p_arg_universal ')';

j_seq : 'seq('(j_branches | j_seq_normal_args) ')';
p_seq : 'seq('(p_branches | p_seq_normal_args)')';
j_seq_normal_args: j_arg_universal ',' j_arg_universal;
p_seq_normal_args: p_arg_universal ',' p_arg_universal;
j_branches: j_branch ',' j_branchRe;
p_branches: p_branch ',' p_branchRe;
j_branch : 'branch('j_arg_condition ',' j_arg_universal ',' j_arg_universal')';
p_branch : 'branch('p_arg_condition ',' p_arg_universal ',' p_arg_universal')';
j_branchRe : 'branchRe('j_arg_universal ',' j_arg_universal ',' j_arg_universal')';
p_branchRe : 'branchRe('p_arg_universal ',' p_arg_universal ',' p_arg_universal')';
