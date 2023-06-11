package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.util.SourceCodeBuilderHelper;

import java.util.List;

public final class PythonSourceCodeBuilder extends SourceCodeBuilderBase {

    private final StringBuilder threadFunctionDeclarationsBuilder = new StringBuilder();
    public PythonSourceCodeBuilder setCurrentIndentationLevel(int indentationLevel) {
        currentIndentationLevel = indentationLevel;
        return this;
    }

    public PythonSourceCodeBuilder append(char character) {
        stringBuilder.append(character);
        return this;
    }

    public PythonSourceCodeBuilder append(String string) {
        stringBuilder.append(string);
        return this;
    }

    public PythonSourceCodeBuilder appendFirstLine(String sourceCode) {
        return append(sourceCode).appendNewlineCharacter();
    }

    public PythonSourceCodeBuilder appendLine(String sourceCode) {
        return appendIndentation().append(sourceCode).appendNewlineCharacter();
    }

    public PythonSourceCodeBuilder appendLastLine(String sourceCode) {
        return appendIndentation().append(sourceCode);
    }

    public PythonSourceCodeBuilder appendCodeBlockLines(String... lines) {
        currentIndentationLevel++;
        for (String line : lines) {
            appendLine(line);
        }
        currentIndentationLevel--;

        return this;
    }

    public PythonSourceCodeBuilder appendNewlineCharacter() {
        stringBuilder.append('\n');
        return this;
    }

    public PythonSourceCodeBuilder appendIndentation() {
        stringBuilder.append("\t".repeat(Math.max(0, currentIndentationLevel)));
        return this;
    }

    public PythonSourceCodeBuilder appendCustomFunctionDeclarations(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        final String EMPTY_FUNCTION_BODY_COMMENT = "\t// Enter your function code here\n";

        append("\n\n# - - - - - Function definitions - - - - -\n");

        for (CustomFunctionDeclaration customFunctionDeclaration : customFunctionDeclarations) {
            append("def ")
                .append(customFunctionDeclaration.getFunctionName())
                .appendFunctionArguments(customFunctionDeclaration.getArguments());

            String functionReturnType = customFunctionDeclaration.getReturnType();
            if (functionReturnType != null) {
                append(" -> ").append(functionReturnType);
            }

            append(":\n")
                .append(EMPTY_FUNCTION_BODY_COMMENT)
                .append('\n');
        }

        return this;
    }

    public PythonSourceCodeBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        return append(functionName).appendFunctionArguments(arguments);
    }

    private PythonSourceCodeBuilder appendFunctionArguments(List<String> arguments) {
        stringBuilder.append(SourceCodeBuilderHelper.createSourceCodeForArguments(arguments));
        return this;
    }

    public PythonSourceCodeBuilder appendIf(String condition, String... linesInside) {
        return append("if ")
                .append(condition != null ? condition : "/* implementation required */")
                .append(":\n")
                .appendCodeBlockLines(linesInside)
                .appendIndentation();
    }

    public PythonSourceCodeBuilder appendElse(String... linesInside) {
        return append("else:\n")
                .appendCodeBlockLines(linesInside)
                .appendIndentation()
                .append("\n");
    }

    public PythonSourceCodeBuilder appendWhile(String condition, String... linesInside) {
        return append("while ")
                .append(condition)
                .append(":\n")
                .appendCodeBlockLines(linesInside);
    }
    /*
    public PythonSourceCodeBuilder appendDoWhile(String condition, String... linesInside) {
        return append("do {\n")
                .appendCodeBlockLines(linesInside)
                .appendIndentation()
                .append("} while (")
                .append(condition)
                .append(");\n");
    }
    */
    public PythonSourceCodeBuilder appendThread(int threadNumber, String... linesInside) {
        String threadFunctionName = "thread_function" + threadNumber;
        String threadName = "thread" + threadNumber;
        return appendThreadFunctionDeclaration(threadFunctionName, linesInside)
                .append(threadName)
                .append(" = threading.Thread(target=")
                .append(threadFunctionName)
                .append(")");
    }

    private PythonSourceCodeBuilder appendThreadFunctionDeclaration(String threadFunctionName, String... linesInside) {
        threadFunctionDeclarationsBuilder.append("def ")
                .append(threadFunctionName)
                .append("():\n");
        for (String line: linesInside) {
          threadFunctionDeclarationsBuilder
                  .append("\t")
                  .append(line)
                  .append("\n");
        }
        threadFunctionDeclarationsBuilder.append("\n");
        return this;
    }
    public PythonSourceCodeBuilder appendThreadStart(int threadNumber) {
        return appendIndentation()
                .append("thread")
                .append(String.valueOf(threadNumber))
                .append(".start()");
    }

    @Override
    public String toString() {
        return threadFunctionDeclarationsBuilder.append(stringBuilder).toString();
    }
}
