package proj.dfjm.javapythoncompiler.datasets;

public final class ThreadFunctionDefinition {
    private final String functionBody;
    private final int functionNumber;

    public ThreadFunctionDefinition(String functionBody, int functionNumber) {
        this.functionBody = functionBody;
        this.functionNumber = functionNumber;
    }

    public String getFunctionBody() {
        return functionBody;
    }

    public int getFunctionNumber() {
        return functionNumber;
    }
}
