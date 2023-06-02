package proj.dfjm.javapythoncompiler.datasets;

import java.util.ArrayList;
import java.util.List;

public final class CustomFunctionDeclaration {
    private String returnType;
    private String functionName;
    private final List<String> arguments = new ArrayList<>();

    public String getReturnType() {
        return returnType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getArguments() {
        return arguments;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void addArgument(String argument) {
        arguments.add(argument);
    }
}
