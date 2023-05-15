package builder.workflowPatternBuilder;

import builder.codeBuilder.PythonCodeBuilder;
import tree.FunctionDeclaration;

import java.util.List;

public class PythonWorkflowPatternBuilder implements IWorkflowPatternBuilder{
    PythonCodeBuilder pythonCodeBuilder = new PythonCodeBuilder();

    @Override
    public IWorkflowPatternBuilder setTabNumber(int tabNumber) {
        pythonCodeBuilder.setCurrentTabsNumber(tabNumber);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder createNewInstance() {
        return new PythonWorkflowPatternBuilder();
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction) {
        pythonCodeBuilder.appendFirstLine(firstInstruction.getCode())
                .appendLastLine(secondInstruction.getCode());
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendBranchBranchRe(IWorkflowPatternBuilder condition, IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction, IWorkflowPatternBuilder fifthInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcur(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendConcurRe(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCond(IWorkflowPatternBuilder condition, IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendPara(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendLoop(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder condition, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendChoice(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeqSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendRepeat(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder condition, IWorkflowPatternBuilder thirdInstruction) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendCode(String code) {
        pythonCodeBuilder.append(code);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionCall(String functionName, List<String> arguments) {
        return this;
    }

    @Override
    public String getCode() {
        return pythonCodeBuilder.toString();
    }

    @Override
    public String toString() {
        return this.getCode();
    }
}
