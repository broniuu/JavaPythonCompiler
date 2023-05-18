package builder.workflowPatternBuilder;

import builder.codeBuilder.JavaCodeBuilder;
import tree.FunctionDeclaration;

import java.util.List;

public class JavaWorkflowPatternBuilder implements IWorkflowPatternBuilder {
    JavaCodeBuilder javaCodeBuilder = new JavaCodeBuilder();
    private static int threadNumber = 1;

    @Override
    public IWorkflowPatternBuilder setTabNumber(int tabNumber) {
        javaCodeBuilder.setCurrentTabsNumber(tabNumber);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder createNewInstance() {
        return new JavaWorkflowPatternBuilder();
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendLastLine(secondInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendBranchBranchRe(
            IWorkflowPatternBuilder condition,
            IWorkflowPatternBuilder branchFirstInstruction,
            IWorkflowPatternBuilder branchSecondInstruction,
            IWorkflowPatternBuilder branchReFirstInstruction,
            IWorkflowPatternBuilder branchReSecondInstruction,
            IWorkflowPatternBuilder branchReThirdInstruction) {
        javaCodeBuilder
                .appendIf(condition.getCode(), branchFirstInstruction.getCode(), branchReFirstInstruction.getCode())
                .appendElse(branchSecondInstruction.getCode(), branchReSecondInstruction.getCode())
                .appendLastLine(branchReThirdInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcur(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcurRe(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCond(
            IWorkflowPatternBuilder condition,
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction) {
        javaCodeBuilder.appendIf(condition.getCode(), firstInstruction.getCode())
                .appendElse(secondInstruction.getCode())
                .appendLastLine(thirdInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendPara(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction,
            IWorkflowPatternBuilder fourthInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendTabs().appendThread(threadNumber, secondInstruction.getCode()).appendNewLine()
                .appendStartThread(threadNumber++).appendNewLine()
                .appendTabs().appendThread(threadNumber, thirdInstruction.getCode()).appendNewLine()
                .appendStartThread(threadNumber++).appendNewLine()
                .append(fourthInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendLoop(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder condition,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendWhile(condition.getCode(), secondInstruction.getCode()).appendNewLine()
                .appendLastLine(thirdInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendChoice(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction,
            IWorkflowPatternBuilder fourthInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendTabs().appendIf("", secondInstruction.getCode())
                .appendElse(thirdInstruction.getCode())
                .appendLastLine(fourthInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeqSeq(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder thirdInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendLine(secondInstruction.getCode())
                .appendLastLine(thirdInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendRepeat(
            IWorkflowPatternBuilder firstInstruction,
            IWorkflowPatternBuilder secondInstruction,
            IWorkflowPatternBuilder condition,
            IWorkflowPatternBuilder thirdInstruction) {
        javaCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendTabs()
                .appendDoWhile(condition.getCode(), secondInstruction.getCode())
                .appendLastLine(thirdInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCode(String code) {
        javaCodeBuilder.append(code);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        javaCodeBuilder.append("\n\n")
                .append("// - - - - Deklaracje funkcji - - - - -")
                .append("\n\n")
                .appendFunctionDeclarations(functionDeclarations);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionCall(String functionName, List<String> arguments) {
        javaCodeBuilder.appendFunctionCall(functionName, arguments);
        return this;
    }

    @Override
    public String getCode() {
        return javaCodeBuilder.toString();
    }

    @Override
    public String toString() {
        return this.getCode();
    }
}
