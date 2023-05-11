package builder.codeBuilder;

import tree.java.JavaFunctionDeclaration;

import java.util.List;

public class JavaCodeBuilder extends CodeBuilder{

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
    public JavaCodeBuilder appendFunctionCall(String functionName, List<String> arguments){
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
    public JavaCodeBuilder appendFirstLine(String codeBuilder) {
        return append(codeBuilder).appendNewLine();
    }
    public JavaCodeBuilder appendLastLine(String codeBuilder) {
        return appendTabs().append(codeBuilder);
    }
    public JavaCodeBuilder appendLine(String code){
        return appendTabs().append(code).appendNewLine();
    }
    public JavaCodeBuilder appendTabs() {
        stringBuilder.append("\t".repeat(Math.max(0, currentTabsNumber)));
        return this;
    }
    public JavaCodeBuilder appendNewLine(){
        stringBuilder.append("\n");
        return this;
    }
    public  JavaCodeBuilder appendWhile(String condition, String... lines) {
        return this.append("while (")
                .append(condition)
                .append(") {\n")
                .appendCodeBlockLines(lines)
                .append("}");
    }
    public JavaCodeBuilder appendThread(int threadNumber, String... lines){
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
    public JavaCodeBuilder appendIf(String condition, String... lines){
        return this.append("if (")
                .append(condition)
                .append(") {\n")
                .appendCodeBlockLines(lines)
                .appendTabs().append("}");
    }
    public JavaCodeBuilder appendElse(String... lines) {
        return this.append(" else {\n")
                .appendCodeBlockLines(lines)
                .appendTabs().append("}\n");
    }
    public JavaCodeBuilder appendDoWhile(String condition, String... lines){
        return this.append("do {\n")
                .appendCodeBlockLines(lines)
                .appendTabs()
                .append("} while (")
                .append(condition)
                .append(");\n");
    }
    public JavaCodeBuilder appendCodeBlockLines(String... lines){
        ++currentTabsNumber;
        for (String instruction : lines) {
            this.appendLine(instruction);
        }
        --currentTabsNumber;
        return this;
    }
}
