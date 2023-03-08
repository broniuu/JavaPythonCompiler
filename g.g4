grammar g;
prog: function | EOF;

function: FUNCTION_NAME '(' j_params ')';

j_params: ( j_param',')* j_param;

j_param: (TYPE ID) | function | NUM | STRING;

FUNCTION_NAME: 'Seq' | 'Cond';
TYPE : 'int' | 'char' | 'String' | 'double' | 'float' | 'bool';
ID : [a-zA-Z][a-zA-Z0-9_]*;
NUM : '0' | '-'?[1-9][0-9]*;
STRING: '"' .* '"';

WS: [ \t\n\r]+ ->skip;