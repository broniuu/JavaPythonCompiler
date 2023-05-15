package builder.workflowPatternBuilder;

import tree.FunctionDeclaration;

import java.util.List;

public class PythonWorkflowPatternBuilder implements IWorkflowPatternBuilder{
    @Override
    public IWorkflowPatternBuilder setTabNumber(int tabNumber) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder createNewInstance() {
        return new PythonWorkflowPatternBuilder();
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendBranchBranchRe(IWorkflowPatternBuilder condition, IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction, IWorkflowPatternBuilder fifthInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendConcur(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendConcurRe(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendCond(IWorkflowPatternBuilder condition, IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendPara(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendLoop(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder condition, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendChoice(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction, IWorkflowPatternBuilder fourthInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendSeqSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendRepeat(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction, IWorkflowPatternBuilder condition, IWorkflowPatternBuilder thirdInstruction) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendCode(String code) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        return null;
    }

    @Override
    public IWorkflowPatternBuilder appendFunctionCall(String functionName, List<String> arguments) {
        return null;
    }

    @Override
    public String getCode() {
        return null;
    }
}
