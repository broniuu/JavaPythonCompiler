package codeBuilder;

import tree.java.JavaFunctionDeclaration;

import java.util.List;

public class JavaCodeBuilder {
    public StringBuilder stringBuilder = new StringBuilder();
    private int currentTabsNumber = 0;
    public JavaCodeBuilder setCurrentTabsNumber(int currentTabsNumber) {
        this.currentTabsNumber = currentTabsNumber;
        return this;
    }

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
    public JavaCodeBuilder appendLastLine(JavaCodeBuilder codeBuilder) {
        return appendTabs().append(codeBuilder);
    }
    public JavaCodeBuilder appendLine(JavaCodeBuilder code){
        return appendTabs().append(code).appendNewLine();
    }
    public JavaCodeBuilder appendTabs(int tabsNumber) {
        stringBuilder.append("\t".repeat(Math.max(0, tabsNumber)));
        return this;
    }

    public JavaCodeBuilder appendTabs() {
        stringBuilder.append("\t".repeat(Math.max(0, currentTabsNumber)));
        return this;
    }

    public JavaCodeBuilder appendNewLine(){
        stringBuilder.append("\n");
        return this;
    }

    public  JavaCodeBuilder appendWhile(String condition, JavaCodeBuilder... lines) {
        return this.append("while (")
                .append(condition)
                .append(") {\n")
                .appendCodeBlockLines(lines)
                .append("}");
    }
    public JavaCodeBuilder appendStartWhile(String condition){
        stringBuilder.append("while (")
                .append(condition)
                .append(") {");
        return this;
    }

    public JavaCodeBuilder appendThread(int threadNumber, JavaCodeBuilder... lines){
        return this.append("Thread thread_")
                .append(String.valueOf(threadNumber))
                .append(" = new Thread(() -> {\n")
                .appendCodeBlockLines(lines)
                .appendTabs().
                append("});");
    }

    public JavaCodeBuilder appendStartThread(int threadNumber){
        return this.appendTabs()
                .append("thread_")
                .append(String.valueOf(threadNumber))
                .append(".start();");
    }

    public JavaCodeBuilder appendClosedBracket(){
        stringBuilder.append("}");
        return this;
    }

    public JavaCodeBuilder appendIf(String condition, JavaCodeBuilder... lines){
        return this.append("if (")
                .append(condition)
                .append(") {\n")
                .appendCodeBlockLines(lines)
                .appendTabs().append("}");
    }

    public JavaCodeBuilder appendElse(JavaCodeBuilder... lines) {
        return this.append(" else {\n")
                .appendCodeBlockLines(lines)
                .appendTabs().append("}\n");
    }
    public JavaCodeBuilder appendDoWhile(String condition, JavaCodeBuilder... lines){
        return this.append("do {\n")
                .appendCodeBlockLines(lines)
                .appendTabs()
                .append("} while (")
                .append(condition)
                .append(");\n");
    }

    public JavaCodeBuilder appendCodeBlockLines(JavaCodeBuilder... lines){
        ++currentTabsNumber;
        for (JavaCodeBuilder instruction : lines) {
            this.appendLine(instruction);
        }
        --currentTabsNumber;
        return this;
    }
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
