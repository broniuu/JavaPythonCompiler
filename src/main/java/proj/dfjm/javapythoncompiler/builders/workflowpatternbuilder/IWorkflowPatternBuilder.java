package proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder;

import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;

import java.util.List;

public interface IWorkflowPatternBuilder {
    IWorkflowPatternBuilder createNewInstance();

    String getSourceCode();

    IWorkflowPatternBuilder setIndentationLevel(int indentationLevel);

    IWorkflowPatternBuilder appendSourceCode(String sourceCode);

    IWorkflowPatternBuilder appendCustomFunctionDeclarations(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    );

    IWorkflowPatternBuilder appendThreadFunctionDefinitions(
        List<ThreadFunctionDefinition> threadFunctionDefinitions
    );

    IWorkflowPatternBuilder appendCustomFunctionCall(String functionName, List<String> arguments);

    IWorkflowPatternBuilder appendSeq(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction
    );

    IWorkflowPatternBuilder appendBranchBranchRe(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder branchFirstInstruction,
        IWorkflowPatternBuilder branchSecondInstruction,
        IWorkflowPatternBuilder branchReFirstInstruction,
        IWorkflowPatternBuilder branchReSecondInstruction,
        IWorkflowPatternBuilder branchReThirdInstruction
    );

    IWorkflowPatternBuilder appendConcur(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendConcurRe(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendCond(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendPara(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction,
        IWorkflowPatternBuilder fourthInstruction
    );

    IWorkflowPatternBuilder appendLoop(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendChoice(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction,
        IWorkflowPatternBuilder fourthInstruction
    );

    IWorkflowPatternBuilder appendSeqSeq(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendRepeat(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder thirdInstruction
    );

    IWorkflowPatternBuilder appendAlt(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction
    );
}
