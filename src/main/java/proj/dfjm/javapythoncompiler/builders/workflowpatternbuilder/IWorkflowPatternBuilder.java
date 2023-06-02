package builder.workflowPatternBuilder;

import tree.FunctionDeclaration;

import java.util.List;

public interface IWorkflowPatternBuilder {
    IWorkflowPatternBuilder setTabNumber(int tabNumber);
    IWorkflowPatternBuilder createNewInstance();
    IWorkflowPatternBuilder appendSeq(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction
    );

    IWorkflowPatternBuilder appendBranchBranchRe(
            IWorkflowPatternBuilder condition,
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction,
            IWorkflowPatternBuilder fourthInstruction,
            IWorkflowPatternBuilder fifthInstruction
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

    IWorkflowPatternBuilder appendCode(String code);

    IWorkflowPatternBuilder appendFunctionDeclarations(List<FunctionDeclaration> functionDeclarations);

    IWorkflowPatternBuilder appendFunctionCall(String functionName, List<String> arguments);

    String getCode();
}
