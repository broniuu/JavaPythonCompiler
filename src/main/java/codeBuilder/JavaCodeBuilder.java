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
    public JavaCodeBuilder appendLine(JavaCodeBuilder codeBuilder, int tabsNumber) {
        return appendTabs(tabsNumber).append(codeBuilder).appendNewLine();
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
    public JavaCodeBuilder appendStartIf(String condition){
        stringBuilder.append("if (")
                .append(condition)
                .append(") {");
        return this;
    }
    public JavaCodeBuilder appendStartWhile(String condition){
        stringBuilder.append("while (")
                .append(condition)
                .append(") {");
        return this;
    }

    public JavaCodeBuilder appendThread(String condition, int threadNumber){
        stringBuilder.append("Thread thread_")
                .append(threadNumber)
                .append(" = new Thread(")
                .append(condition)
                .append(")");
        return this;
    }

    public JavaCodeBuilder appendStartThread(int threadNumber){
        stringBuilder.append("thread_")
                .append(threadNumber)
                .append(".start()");
        return this;
    }

    public JavaCodeBuilder appendClosedBracket(){
        stringBuilder.append("}");
        return this;
    }

    public JavaCodeBuilder appendIf(String condition, JavaCodeBuilder... lines){
        return this.append("if (")
                .append(condition)
                .append(") {\n")
                .appendCodeBlock(lines)
                .appendTabs().append("}");
    }

    public JavaCodeBuilder appendElse(JavaCodeBuilder... lines) {
        return this.append(" else {\n")
                .appendCodeBlock(lines)
                .appendTabs().append("}\n");
    }
    public JavaCodeBuilder appendStartElse() {
        stringBuilder.append("} else {\n");
        return this;
    }
    public JavaCodeBuilder appendDoWhile(String condition, JavaCodeBuilder... lines){
        return this.append("do {\n")
                .appendCodeBlock(lines)
                .appendTabs()
                .append("} while (")
                .append(condition)
                .append(");\n");
    }

    public JavaCodeBuilder appendCodeBlock(JavaCodeBuilder... lines){
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
