package builder.workflowPatternBuilder;

import builder.codeBuilder.JavaCodeBuilder;

public class JavaWorkflowPatternBuilder implements IWorkflowPatternBuilder {
    JavaCodeBuilder javaCodeBuilder = new JavaCodeBuilder();
    @Override
    public IWorkflowPatternBuilder setTabNumber(int tabNumber) {
        javaCodeBuilder.setCurrentTabsNumber(tabNumber);
        return this;
    }

    @Override
    public IWorkflowPatternBuilder appendSeq(IWorkflowPatternBuilder firstInstruction, IWorkflowPatternBuilder secondInstruction) {
        return null;
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
    public IWorkflowPatternBuilder appendFunctionDeclarations(String code) {
        javaCodeBuilder.append("\n\n")
                .append("// - - - - Deklaracje funkcji - - - - -")
                .append("\n\n")
                .appendFunctionDeclarations(functionDeclarations);
        return null;
    }

    @Override
    public String getCode() {
        return javaCodeBuilder.toString();
    }
}
