package proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder;

import proj.dfjm.javapythoncompiler.builders.sourcecodebuilder.PythonSourceCodeBuilder;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;

import java.util.List;

public final class PythonWorkflowPatternBuilder implements IWorkflowPatternBuilder {
    private static int currentThreadNumber = 1;
    private final PythonSourceCodeBuilder pythonSourceCodeBuilder = new PythonSourceCodeBuilder();

    @Override
    public IWorkflowPatternBuilder createNewInstance() {
        return new PythonWorkflowPatternBuilder();
    }

    @Override
    public String getSourceCode() {
        return pythonSourceCodeBuilder.toString();
    }

    @Override
    public IWorkflowPatternBuilder setIndentationLevel(int indentationLevel) {
        pythonSourceCodeBuilder.setIndentationLevel(indentationLevel);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSourceCode(String sourceCode) {
        pythonSourceCodeBuilder.append(sourceCode);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCustomFunctionDeclarations(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        pythonSourceCodeBuilder.appendCustomFunctionDefinitions(customFunctionDeclarations);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendThreadFunctionDefinitions(
        List<ThreadFunctionDefinition> threadFunctionDefinitions
    ) {
        pythonSourceCodeBuilder.appendThreadFunctionDefinitions(threadFunctionDefinitions);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        pythonSourceCodeBuilder.appendCustomFunctionCall(functionName, arguments);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendLastLine(secondInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendBranchBranchRe(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder branchFirstInstruction,
        IWorkflowPatternBuilder branchSecondInstruction,
        IWorkflowPatternBuilder branchReFirstInstruction,
        IWorkflowPatternBuilder branchReSecondInstruction,
        IWorkflowPatternBuilder branchReThirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendIf(
                condition.getSourceCode(),
                branchFirstInstruction.getSourceCode(),
                branchReFirstInstruction.getSourceCode()
            )
            .appendElse(branchSecondInstruction.getSourceCode(), branchReSecondInstruction.getSourceCode())
            .appendLastLine(branchReThirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcur(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendThreadCreation(currentThreadNumber)
            .appendThreadStart(currentThreadNumber++)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadCreation(currentThreadNumber)
            .appendThreadStart(currentThreadNumber++);

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcurRe(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        int firstThreadNumber = currentThreadNumber++;
        int secondThreadNumber = currentThreadNumber++;

        pythonSourceCodeBuilder
            .appendThreadCreation(firstThreadNumber)
            .appendThreadStart(firstThreadNumber)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadCreation(secondThreadNumber)
            .appendThreadStart(secondThreadNumber)
            .appendNewlineCharacter()
            .appendThreadsJoin(firstThreadNumber, secondThreadNumber)
            .appendLastLine(thirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCond(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendIf(condition.getSourceCode(), firstInstruction.getSourceCode())
            .appendElse(secondInstruction.getSourceCode())
            .appendLastLine(thirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendPara(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction,
        IWorkflowPatternBuilder fourthInstruction
    ) {
        int firstThreadNumber = currentThreadNumber++;
        int secondThreadNumber = currentThreadNumber++;

        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendThreadCreation(firstThreadNumber)
            .appendThreadStart(firstThreadNumber)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadCreation(secondThreadNumber)
            .appendThreadStart(secondThreadNumber)
            .appendNewlineCharacter()
            .appendThreadsJoin(firstThreadNumber, secondThreadNumber)
            .appendLastLine(fourthInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendLoop(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendWhile(condition.getSourceCode(), secondInstruction.getSourceCode())
            .appendLastLine(thirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendChoice(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction,
        IWorkflowPatternBuilder fourthInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendIf(null, secondInstruction.getSourceCode())
            .appendElse(thirdInstruction.getSourceCode())
            .appendLastLine(fourthInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeqSeq(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendLine(secondInstruction.getSourceCode())
            .appendLastLine(thirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendRepeat(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        pythonSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendDoWhile(condition.getSourceCode(), secondInstruction.getSourceCode())
            .appendLastLine(thirdInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendAlt(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction
    ) {
        pythonSourceCodeBuilder
            .appendIf(condition.getSourceCode(), firstInstruction.getSourceCode())
            .appendLastLine(secondInstruction.getSourceCode());

        return this;
    }
}
