grammar g;
prog: (java | python) EOF;

java: j_line*;

python: p_line*;

p_line: p_function_call | p_assignment | p_forloop;

j_line: ((j_declaration | j_array_declaration | j_initialization | j_function_call) ';') | j_loop;

j_function_call: FUNCTION_NAME ('(' j_args ')' | '()');

j_args: ( j_arg ',')* j_arg;

j_arg
    : BOOL
    | j_function_call
    | NUMBER
    | STRING
    | (j_type ID)
    ;

p_function_call: FUNCTION_NAME ('(' p_args ')' | '()');

p_args: ( p_arg ',')* p_arg;

p_arg
    : BOOL
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
    BOOL_TYPE ID '=' (ID | BOOL);
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
        | ('new' BOOL_TYPE '[' NUMBER ']' ('{' (BOOL (',' BOOL)*)? '}')?)
        | (('new' BOOL_TYPE '[]')? '{' (BOOL (',' BOOL)*)? '}')
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

p_rhs_value: ID | NUMBER | BOOL | p_string | p_list;

p_string: STRING |  STRING_SMALL;

p_list: '[' (p_rhs_value (',' p_rhs_value)*)? ']';

j_type: INT_TYPE | CHAR_TYPE | STRING_TYPE | DOUBLE_TYPE | FLOAT_TYPE | BOOL_TYPE;

FUNCTION_NAME: 'Seq' | 'Cond' | 'BranchRe' | 'Branch' | 'ConcurRe' | 'Concur' | 'Para' | 'Loop';

//Values
NUMBER: '0' | '-'?[1-9][0-9]*;
CHAR: '\'' . '\'';
DOBULE: '-'?('0'|[1-9][0-9]*)('.'[0-9]+)?;
STRING: '"' .*? '"';
STRING_SMALL: ('\'' .*? '\'');
BOOL: 'true' | 'false';

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
j_loop
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
    : ID condition NUMBER
    | BOOL
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
	:	ID condition NUMBER
	;

condition
    :   '>'
    |   '<'
    |   '>='
    |   '<='
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
