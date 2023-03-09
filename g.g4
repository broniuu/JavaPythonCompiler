grammar g;
prog: (java | python) EOF;

java: p_line*;

python: j_line*;

p_line: p_function_call ;

j_line: j_function_call ';';

j_function_call: FUNCTION_NAME ('(' j_args ')' | '()');

j_args: ( j_arg ',')* j_arg;

j_arg: (TYPE ID) | j_function_call | NUM | STRING;

p_function_call: FUNCTION_NAME ('(' p_args ')' | '()');

p_args: ( p_arg ',')* p_arg;

p_arg: ID | P_STRING | NUM | p_function_call;

FUNCTION_NAME: 'Seq' | 'Cond' | 'BranchRe' | 'Branch' | 'ConcurRe' | 'Concur' | 'Para' | 'Loop';
TYPE : 'int' | 'char' | 'String' | 'double' | 'float' | 'bool';
ID : [a-zA-Z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
STRING: '"' .* '"';
P_STRING: ('\'' | '"') .* ( '\'' | '"' ) ;

WS: [ \t\n\r]+ ->skip;