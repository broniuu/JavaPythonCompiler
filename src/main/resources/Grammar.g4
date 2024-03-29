grammar Grammar;


prog: (javaSyntax | pythonSyntax) EOF;


javaSyntax: jSpecialFunctionCall jCustomFunctionDeclaration*;
pythonSyntax: pSpecialFunctionCall pCustomFunctionDeclaration*;


jSpecialFunctionCall
    : jSeq
    | jConcur
    | jConcurRe
    | jCond
    | jPara
    | jLoop
    | jChoice
    | jSeqSeq
    | jRepeat
    | jAlt
    ;

pSpecialFunctionCall
    : pSeq
    | pConcur
    | pConcurRe
    | pCond
    | pPara
    | pLoop
    | pChoice
    | pSeqSeq
    | pRepeat
    | pAlt
    ;


jCustomFunctionDeclaration: functionReturnDataType ID '(' jCustomFunctionDeclarationParams? ')';
pCustomFunctionDeclaration: 'def' ID '(' pCustomFunctionDeclarationParams? ')' pCustomFunctionDeclarationReturnType?;


jCustomFunctionDeclarationParams: jCustomFunctionDeclarationParam (',' jCustomFunctionDeclarationParam)*;
pCustomFunctionDeclarationParams: ID (',' ID)*;


jCustomFunctionDeclarationParam: variableDataType ID;


pCustomFunctionDeclarationReturnType: '->' ID;


jSeq: 'Seq' '(' (jSpecialFunctionParam ',' jSpecialFunctionParam | jBranch ',' jBranchRe) ')';
jBranch: 'Branch' '(' jSpecialFunctionCondParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jBranchRe: 'BranchRe' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jConcur: 'Concur' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jConcurRe: 'ConcurRe' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jCond: 'Cond' '(' jSpecialFunctionCondParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jPara: 'Para' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jLoop: 'Loop' '(' jSpecialFunctionParam ',' jSpecialFunctionCondParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jChoice: 'Choice' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jSeqSeq: 'SeqSeq' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';
jRepeat: 'Repeat' '(' jSpecialFunctionParam ',' jSpecialFunctionParam ',' jSpecialFunctionCondParam ',' jSpecialFunctionParam ')';
jAlt: 'Alt' '(' jSpecialFunctionCondParam ',' jSpecialFunctionParam ',' jSpecialFunctionParam ')';

pSeq: 'Seq' '(' (pSpecialFunctionParam ',' pSpecialFunctionParam | pBranch ',' pBranchRe) ')';
pBranch: 'Branch' '(' pSpecialFunctionCondParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pBranchRe: 'BranchRe' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pConcur: 'Concur' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pConcurRe: 'ConcurRe' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pCond: 'Cond' '(' pSpecialFunctionCondParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pPara: 'Para' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pLoop: 'Loop' '(' pSpecialFunctionParam ',' pSpecialFunctionCondParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pChoice: 'Choice' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pSeqSeq: 'SeqSeq' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';
pRepeat: 'Repeat' '(' pSpecialFunctionParam ',' pSpecialFunctionParam ',' pSpecialFunctionCondParam ',' pSpecialFunctionParam ')';
pAlt: 'Alt' '(' pSpecialFunctionCondParam ',' pSpecialFunctionParam ',' pSpecialFunctionParam ')';


jSpecialFunctionParam: jSpecialFunctionCall | jSpecialFunctionFuncParam | JAVA_CODE_SNIPPET;
pSpecialFunctionParam: pSpecialFunctionCall | pSpecialFunctionFuncParam | PYTHON_CODE_SNIPPET;


jSpecialFunctionCondParam: '``' jCondition '``';
pSpecialFunctionCondParam: '``' pCondition '``';


jSpecialFunctionFuncParam: '~' jCheckedCustomFunctionCall '~';
pSpecialFunctionFuncParam: '~' pCheckedCustomFunctionCall '~';


jCondition
    : (
        (JAVA_LOGICAL_VALUE | ID) equalUnequalOperator (JAVA_LOGICAL_VALUE | ID)
        | (TEXT_STRING_DOUBLE_QUOTES | ID) equalUnequalOperator (TEXT_STRING_DOUBLE_QUOTES | ID)
        | (
            (ID | INTEGER_NUMBER | FRACTIONAL_NUMBER | SINGLE_CHARACTER | jUncheckedCustomFunctionCall)
            (greaterLessOperator | equalUnequalOperator)
            (ID | INTEGER_NUMBER | FRACTIONAL_NUMBER | SINGLE_CHARACTER | jUncheckedCustomFunctionCall)
        )
    )
    | jIncrementDecrement (greaterLessOperator | equalUnequalOperator) jIncrementDecrement
    | JAVA_LOGICAL_VALUE | ID | jUncheckedCustomFunctionCall
    ;

pCondition
    : pComparison
    | PYTHON_LOGICAL_VALUE
    | ID
    | pUncheckedCustomFunctionCall
    ;


jCheckedCustomFunctionCall: ID '(' jCheckedCustomFunctionCallParams? ')';
pCheckedCustomFunctionCall: ID '(' pCheckedCustomFunctionCallParams? ')';


jUncheckedCustomFunctionCall: ID '(' jUncheckedCustomFunctionCallParams? ')';
pUncheckedCustomFunctionCall: ID '(' pUncheckedCustomFunctionCallParams? ')';


jCheckedCustomFunctionCallParams: jCheckedCustomFunctionCallParam (',' jCheckedCustomFunctionCallParam)*;
pCheckedCustomFunctionCallParams: pCheckedCustomFunctionCallParam (',' pCheckedCustomFunctionCallParam)*;


jUncheckedCustomFunctionCallParams: jUncheckedCustomFunctionCallParam (',' jUncheckedCustomFunctionCallParam)*;
pUncheckedCustomFunctionCallParams: pUncheckedCustomFunctionCallParam (',' pUncheckedCustomFunctionCallParam)*;


jCheckedCustomFunctionCallParam
    : jCheckedCustomFunctionCall
    | INTEGER_NUMBER | FRACTIONAL_NUMBER | SINGLE_CHARACTER | TEXT_STRING_DOUBLE_QUOTES | JAVA_LOGICAL_VALUE | ID
    ;

pCheckedCustomFunctionCallParam
    : pCheckedCustomFunctionCall
    | pComparison
    | pRvalue
    ;


jUncheckedCustomFunctionCallParam
    : jUncheckedCustomFunctionCall
    | INTEGER_NUMBER | FRACTIONAL_NUMBER | SINGLE_CHARACTER | TEXT_STRING_DOUBLE_QUOTES | JAVA_LOGICAL_VALUE | ID
    ;

pUncheckedCustomFunctionCallParam
    : pUncheckedCustomFunctionCall
    | pComparison
    | pRvalue
    ;


jIncrementDecrement
    : '++' ID
    | '--' ID
    | ID '++'
    | ID '--'
    ;


pComparison: pRvalue (greaterLessOperator | equalUnequalOperator) pRvalue;


pRvalue
    : ID
    | INTEGER_NUMBER
    | FRACTIONAL_NUMBER
    | TEXT_STRING_DOUBLE_QUOTES
    | TEXT_STRING_SINGLE_QUOTES
    | PYTHON_LOGICAL_VALUE
    | '[' (pRvalue (',' pRvalue)*)? ']'
    | pUncheckedCustomFunctionCall
    ;


equalUnequalOperator: '==' | '!=';
greaterLessOperator: '<' | '>' | '<=' | '>=';


variableDataType: INT_DATA_TYPE | DOUBLE_DATA_TYPE | CHAR_DATA_TYPE | STRING_DATA_TYPE | BOOLEAN_DATA_TYPE;
functionReturnDataType: variableDataType | VOID_DATA_TYPE;


INT_DATA_TYPE: 'int';
DOUBLE_DATA_TYPE: 'double';
CHAR_DATA_TYPE: 'char';
STRING_DATA_TYPE: 'String';
BOOLEAN_DATA_TYPE: 'boolean';
VOID_DATA_TYPE: 'void';


JAVA_CODE_SNIPPET: '`' (~[`;])* ';' '`';
PYTHON_CODE_SNIPPET: '`' (~[`;])* '`';


INTEGER_NUMBER: '0' | '-'?[1-9][0-9]*;
FRACTIONAL_NUMBER: '0.0' | '-'?('0' | [1-9][0-9]*)?'.'('0' | [0-9]*[1-9]);
SINGLE_CHARACTER: '\'' . '\'';
TEXT_STRING_DOUBLE_QUOTES: '"' .*? '"';
TEXT_STRING_SINGLE_QUOTES: '\'' .*? '\'';
JAVA_LOGICAL_VALUE: 'true' | 'false';
PYTHON_LOGICAL_VALUE: 'True' | 'False';


// This lexer rule must be kept almost at the bottom, as otherwise it may accidentally cannibalize other similar rules.
ID: [a-zA-Z_][a-zA-Z0-9_]*;


WS: [ \t\r\n]+ -> skip;
