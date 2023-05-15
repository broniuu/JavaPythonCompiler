package builder.codeBuilder;

public class PythonCodeBuilder extends CodeBuilder {

    public PythonCodeBuilder setCurrentTabsNumber(int currentTabsNumber) {
        this.currentTabsNumber = currentTabsNumber;
        return this;
    }
    public PythonCodeBuilder append(String string){
        this.stringBuilder.append(string);
        return this;
    }
    public PythonCodeBuilder append(PythonCodeBuilder codeBuilder){
        this.stringBuilder.append(codeBuilder.stringBuilder);
        return this;
    }
    public PythonCodeBuilder appendNewLine(){
        stringBuilder.append("\n");
        return this;
    }
    public PythonCodeBuilder appendFirstLine(String codeBuilder) {
        return append(codeBuilder).appendNewLine();
    }
    public PythonCodeBuilder appendLastLine(String codeBuilder) {
        return appendTabs().append(codeBuilder);
    }
    public PythonCodeBuilder appendLine(String code){
        return appendTabs().append(code).appendNewLine();
    }
    public PythonCodeBuilder appendTabs() {
        stringBuilder.append("\t".repeat(Math.max(0, currentTabsNumber)));
        return this;
    }
    public PythonCodeBuilder appendCodeBlockLines(String... lines){
        ++currentTabsNumber;
        for (String instruction : lines) {
            this.appendLine(instruction);
        }
        --currentTabsNumber;
        return this;
    }
}
