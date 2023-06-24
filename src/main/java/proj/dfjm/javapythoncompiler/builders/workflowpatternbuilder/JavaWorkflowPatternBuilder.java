package proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder;

import proj.dfjm.javapythoncompiler.builders.sourcecodebuilder.JavaSourceCodeBuilder;
import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;

import java.util.List;

public final class JavaWorkflowPatternBuilder implements IWorkflowPatternBuilder {
    private static int currentThreadNumber = 1;
    private final JavaSourceCodeBuilder javaSourceCodeBuilder = new JavaSourceCodeBuilder();

    @Override
    public IWorkflowPatternBuilder createNewInstance() {
        return new JavaWorkflowPatternBuilder();
    }

    @Override
    public String getSourceCode() {
        return javaSourceCodeBuilder.toString();
    }

    @Override
    public IWorkflowPatternBuilder setIndentationLevel(int indentationLevel) {
        javaSourceCodeBuilder.setCurrentIndentationLevel(indentationLevel);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSourceCode(String sourceCode) {
        javaSourceCodeBuilder.append(sourceCode);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCustomFunctionDeclarations(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        javaSourceCodeBuilder.appendCustomFunctionDeclarations(customFunctionDeclarations);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        javaSourceCodeBuilder.appendCustomFunctionCall(functionName, arguments);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction
    ) {
        javaSourceCodeBuilder
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
        javaSourceCodeBuilder
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
        int firstThreadNumber = currentThreadNumber++;
        int secondThreadNumber = currentThreadNumber++;

        javaSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendThread(firstThreadNumber, secondInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThread(secondThreadNumber, thirdInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadStart(firstThreadNumber)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadStart(secondThreadNumber);

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

        javaSourceCodeBuilder
            .appendThread(firstThreadNumber, secondInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThread(secondThreadNumber, thirdInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadStart(firstThreadNumber)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThreadStart(secondThreadNumber)
            .appendNewlineCharacter()
            .appendLastLine(firstInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCond(
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        javaSourceCodeBuilder
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
        javaSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendIndentation()
            .appendThread(currentThreadNumber, secondInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendThreadStart(currentThreadNumber++)
            .appendNewlineCharacter()
            .appendIndentation()
            .appendThread(currentThreadNumber, thirdInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendThreadStart(currentThreadNumber++)
            .appendNewlineCharacter()
            .append(fourthInstruction.getSourceCode());

        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendLoop(
        IWorkflowPatternBuilder firstInstruction,
        IWorkflowPatternBuilder condition,
        IWorkflowPatternBuilder secondInstruction,
        IWorkflowPatternBuilder thirdInstruction
    ) {
        javaSourceCodeBuilder
            .appendFirstLine(firstInstruction.getSourceCode())
            .appendWhile(condition.getSourceCode(), secondInstruction.getSourceCode())
            .appendNewlineCharacter()
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
        javaSourceCodeBuilder
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
        javaSourceCodeBuilder
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
        javaSourceCodeBuilder
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
        javaSourceCodeBuilder
            .appendIf(condition.getSourceCode(), firstInstruction.getSourceCode())
            .appendNewlineCharacter()
            .appendLastLine(secondInstruction.getSourceCode());

        return this;
    }
}
