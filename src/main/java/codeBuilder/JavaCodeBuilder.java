package codeBuilder;

import tree.java.JavaFunctionDeclaration;

import java.util.List;

public class JavaCodeBuilder {
    public StringBuilder stringBuilder = new StringBuilder();

    public JavaCodeBuilder append(String string){
        this.stringBuilder.append(string);
        return this;
    }

    public JavaCodeBuilder append(JavaCodeBuilder codeBuilder){
        this.stringBuilder.append(codeBuilder.stringBuilder);
        return this;
    }

    public JavaCodeBuilder appendFunctionCall(String functionName, List<JavaCodeBuilder> arguments){
        return this.append(functionName)
                .appendArgsOrParams(arguments)
                .append(";");
    }

    private <T> JavaCodeBuilder appendArgsOrParams(List<T> argsOrParams) {
        stringBuilder.append("(");
        if (argsOrParams.size() > 0){
            int lastIndexOfArguments = argsOrParams.size() - 1;
            T lastArgument = argsOrParams.get(lastIndexOfArguments);
            argsOrParams.subList(0, lastIndexOfArguments).forEach( x -> {
                stringBuilder.append(x).append(", ");
            });
            stringBuilder.append(lastArgument);
        }
        stringBuilder.append(")");
        return this;
    }

    public JavaCodeBuilder appendFunctionDeclarations(List<JavaFunctionDeclaration> functionDeclaration)
    {
        functionDeclaration.forEach(this::appendFunctionDeclaration);
        return this;
    }
    public JavaCodeBuilder appendFunctionDeclaration(JavaFunctionDeclaration functionDeclaration){
        String functionName = functionDeclaration.getName();
        String functionType = functionDeclaration.getType();
        List<String> functionArguments = functionDeclaration.getParameters();
        String emptyFunctionComment = "\t// Umieść tutaj swój kod\n";
        return this.append(functionType)
                .append(" ")
                .append(functionName)
                .appendArgsOrParams(functionArguments)
                .append(" {\n")
                .append(emptyFunctionComment)
                .append("}\n");
    }

    public JavaCodeBuilder appendFirstLine(JavaCodeBuilder codeBuilder) {
        return append(codeBuilder).appendNewLine();
    }

    public JavaCodeBuilder appendLine(JavaCodeBuilder codeBuilder, int tabsNumber) {
        return appendTabs(tabsNumber).append(codeBuilder).appendNewLine();
    }
    public JavaCodeBuilder appendTabs(int tabsNumber) {
        stringBuilder.append("\t".repeat(Math.max(0, tabsNumber)));
        return this;
    }

    public JavaCodeBuilder appendNewLine(){
        stringBuilder.append("\n");
        return this;
    }
    public JavaCodeBuilder appendStartIf(String condition){
        stringBuilder.append("if (")
                .append(condition)
                .append(") {");
        return this;
    }
    public JavaCodeBuilder appendClosedBracket(){
        stringBuilder.append("}");
        return this;
    }
    public JavaCodeBuilder appendStartElse() {
        stringBuilder.append("} else {");
        return this;
    }

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
