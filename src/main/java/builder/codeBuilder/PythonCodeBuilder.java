package builder.codeBuilder;

import builder.codeBuilder.helper.CodeBuilderHelper;
import tree.FunctionDeclaration;

import java.util.List;
import java.util.Objects;

public class PythonCodeBuilder extends CodeBuilderBase {

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

    public PythonCodeBuilder appendFunctionDeclarations(List<FunctionDeclaration> functionDeclarations) {
        this.append("\n\n")
                .append("// - - - - Deklaracje funkcji - - - - -")
                .append("\n\n");
        String emptyFunctionComment = "\t// Umieść tutaj swój kod\n";
        functionDeclarations.forEach(x -> {
            this.append("def ")
                    .append(x.getName())
                    .appendArgsOrParams(x.getParameters());
            if(x.getType() != null && !Objects.equals(x.getType(), "")) {
                this.append(" -> ").append(x.getType());
            }
            this.append(":\n")
                    .append(emptyFunctionComment)
                    .append("\n");
        });
        return this;
    }
    private PythonCodeBuilder appendArgsOrParams(List<String> argsOrParams) {
        stringBuilder.append(CodeBuilderHelper.createArgsOrParamsCode(argsOrParams));
        return this;
    }
}
