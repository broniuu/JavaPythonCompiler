package proj.dfjm.javapythoncompiler.datasets;

public final class CustomFunctionCallToCheck {
    private final String functionName;
    private final int argumentNumber;

    public CustomFunctionCallToCheck(String functionName, int argumentNumber) {
        this.functionName = functionName;
        this.argumentNumber = argumentNumber;
    }

    public String getFunctionName() {
        return functionName;
    }

    public int getArgumentNumber() {
        return argumentNumber;
    }
}
