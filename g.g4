grammar g;
prog: (java | python) EOF;

java: j_line*;

python: p_line*;

p_line: p_function_call | p_declaration ;

j_line: j_function_call | j_initialization ';';

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
    | P_STRING
    | NUMBER
    | p_function_call
    | ID
    ;

//initialization
j_initialization
    : j_int_initialization
    | j_float_initialization
    | j_double_initialization
    | j_bool_initialization
    | j_string_initialization
    | j_char_initialization
    ;



j_int_initialization:
    INT_TYPE ID '=' (NUMBER | ID);
j_string_initialization:
    STRING_TYPE ID '=' (STRING | ID);
j_bool_initialization:
    BOOL_TYPE ID '=' (BOOL | ID);
j_float_initialization:
    FLOAT_TYPE ID '=' (DOBULE | ID);
j_double_initialization:
    DOUBLE_TYPE ID '=' (DOBULE | ID);
j_char_initialization:
    CHAR_TYPE ID '=' (CHAR | ID);

p_declaration: ID '=' (ID | NUMBER | STRING | BOOL);

j_type : INT_TYPE | CHAR_TYPE  | STRING_TYPE | DOUBLE_TYPE | FLOAT_TYPE | BOOL_TYPE;

FUNCTION_NAME: 'Seq' | 'Cond' | 'BranchRe' | 'Branch' | 'ConcurRe' | 'Concur' | 'Para' | 'Loop';

//Types

INT_TYPE : 'int';
CHAR_TYPE : 'char';
STRING_TYPE : 'String';
DOUBLE_TYPE : 'double';
FLOAT_TYPE : 'float';
BOOL_TYPE : 'boolean';
ID : [a-zA-Z][a-zA-Z0-9_]*;

//Values
NUMBER : '0' | '-'?[1-9][0-9]*;
CHAR: '\'' . '\'';
DOBULE: '-'?('0'|[1-9][0-9]*)('.'[0-9]+)?;
STRING: '"' .* '"';
P_STRING: ('\'' | '"') .* ( '\'' | '"' ) ;
BOOL: 'true' | 'false';

WS: [ \t\n\r]+ ->skip;


//For loop
statement
	:	forStatement
	;

forStatement
	:	basicForStatement
	;

basicForStatement
	:	'for' '(' forInit? ';' expression? ';' forUpdate? ')' statement
	;

forInit
	:	statementExpressionList
	|	localVariableDeclaration
	;

localVariableDeclaration
	:	j_initialization
	;

forUpdate
	:	statementExpressionList
	;

statementExpressionList
	:	statementExpression (',' statementExpression)*
	;
expression
	:	assignmentExpression
	;
assignmentExpression
	:	conditionalExpression
	|	assignment
	;

assignment
	:	leftHandSide assignmentOperator expression
	;

leftHandSide
	:	expressionName
	;

assignmentOperator
	:	'='
	|	'*='
	|	'/='
	|	'%='
	|	'+='
	|	'-='
	|	'<<='
	|	'>>='
	|	'>>>='
	|	'&='
	|	'^='
	|	'|='
	;

conditionalExpression
	:	conditionalOrExpression
	|	conditionalOrExpression '?' expression ':' conditionalExpression
	;

conditionalOrExpression
	:	conditionalAndExpression
	|	conditionalOrExpression '||' conditionalAndExpression
	;

conditionalAndExpression
	:	inclusiveOrExpression
	|	conditionalAndExpression '&&' inclusiveOrExpression
	;

inclusiveOrExpression
	:	exclusiveOrExpression
	|	inclusiveOrExpression '|' exclusiveOrExpression
	;

exclusiveOrExpression
	:	andExpression
	|	exclusiveOrExpression '^' andExpression
	;

andExpression
	:	equalityExpression
	|	andExpression '&' equalityExpression
	;

equalityExpression
	:	relationalExpression
	|	equalityExpression '==' relationalExpression
	|	equalityExpression '!=' relationalExpression
	;

relationalExpression
	:	shiftExpression
	|	relationalExpression '<' shiftExpression
	|	relationalExpression '>' shiftExpression
	|	relationalExpression '<=' shiftExpression
	|	relationalExpression '>=' shiftExpression
	;

shiftExpression
	:	additiveExpression
	|	shiftExpression '<' '<' additiveExpression
	|	shiftExpression '>' '>' additiveExpression
	|	shiftExpression '>' '>' '>' additiveExpression
	;

additiveExpression
	:	multiplicativeExpression
	|	additiveExpression '+' multiplicativeExpression
	|	additiveExpression '-' multiplicativeExpression
	;

multiplicativeExpression
	:	unaryExpression
	|	multiplicativeExpression '*' unaryExpression
	|	multiplicativeExpression '/' unaryExpression
	|	multiplicativeExpression '%' unaryExpression
	;

unaryExpression
	:	preIncrementExpression
	|	preDecrementExpression
	|	'+' unaryExpression
	|	'-' unaryExpression
	;

preIncrementExpression
	:	'++' unaryExpression
	;

preDecrementExpression
	:	'--' unaryExpression
	;

expressionName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

ambiguousName
	:	Identifier
	|	ambiguousName '.' Identifier
	;

statementExpression
	:	assignment
	|	preIncrementExpression
	|	preDecrementExpression
	;