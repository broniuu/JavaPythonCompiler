package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.util.SourceCodeBuilderHelper;

import java.util.List;

public final class JavaSourceCodeBuilder extends SourceCodeBuilderBase {
    public JavaSourceCodeBuilder setCurrentIndentationLevel(int indentationLevel) {
        currentIndentationLevel = indentationLevel;
        return this;
    }

    public JavaSourceCodeBuilder append(char character) {
        stringBuilder.append(character);
        return this;
    }

    public JavaSourceCodeBuilder append(String string) {
        stringBuilder.append(string);
        return this;
    }

    public JavaSourceCodeBuilder appendFirstLine(String sourceCode) {
        return append(sourceCode).appendNewlineCharacter();
    }

    public JavaSourceCodeBuilder appendLine(String sourceCode) {
        return appendIndentation().append(sourceCode).appendNewlineCharacter();
    }

    public JavaSourceCodeBuilder appendLastLine(String sourceCode) {
        return appendIndentation().append(sourceCode);
    }

    public JavaSourceCodeBuilder appendCodeBlockLines(String... lines) {
        currentIndentationLevel++;
        for (String line : lines) {
            appendLine(line);
        }
        currentIndentationLevel--;

        return this;
    }

    public JavaSourceCodeBuilder appendNewlineCharacter() {
        stringBuilder.append('\n');
        return this;
    }

    public JavaSourceCodeBuilder appendIndentation() {
        stringBuilder.append("\t".repeat(Math.max(0, currentIndentationLevel)));
        return this;
    }

    public JavaSourceCodeBuilder appendCustomFunctionDeclarations(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        final String EMPTY_FUNCTION_BODY_COMMENT = "\t// Enter your function code here\n";

        append("\n\n// - - - - - Function definitions - - - - -\n");

        for (CustomFunctionDeclaration customFunctionDeclaration : customFunctionDeclarations) {
            append(customFunctionDeclaration.getReturnType())
                .append(' ')
                .append(customFunctionDeclaration.getFunctionName())
                .appendFunctionArguments(customFunctionDeclaration.getArguments())
                .append(" {\n")
                .append(EMPTY_FUNCTION_BODY_COMMENT)
                .append("}\n");
        }

        return this;
    }

    public JavaSourceCodeBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        return append(functionName)
            .appendFunctionArguments(arguments)
            .append(';');
    }

    public JavaSourceCodeBuilder appendIf(String condition, String... linesInside) {
        return append("if (")
            .append(condition != null ? condition : "/* implementation required */")
            .append(") {\n")
            .appendCodeBlockLines(linesInside)
            .appendIndentation()
            .append('}');
    }

    public JavaSourceCodeBuilder appendElse(String... linesInside) {
        return append(" else {\n")
            .appendCodeBlockLines(linesInside)
            .appendIndentation()
            .append("}\n");
    }

    public JavaSourceCodeBuilder appendWhile(String condition, String... linesInside) {
        return append("while (")
            .append(condition)
            .append(") {\n")
            .appendCodeBlockLines(linesInside)
            .append('}');
    }

    public JavaSourceCodeBuilder appendDoWhile(String condition, String... linesInside) {
        return append("do {\n")
            .appendCodeBlockLines(linesInside)
            .appendIndentation()
            .append("} while (")
            .append(condition)
            .append(");\n");
    }

    public JavaSourceCodeBuilder appendThread(int threadNumber, String... linesInside) {
        return append("Thread thread")
            .append(String.valueOf(threadNumber))
            .append(" = new Thread(() -> {\n")
            .appendCodeBlockLines(linesInside)
            .appendIndentation().
            append("});");
    }

    public JavaSourceCodeBuilder appendThreadStart(int threadNumber) {
        return appendIndentation()
            .append("thread")
            .append(String.valueOf(threadNumber))
            .append(".start();");
    }

    private JavaSourceCodeBuilder appendFunctionArguments(List<String> arguments) {
        stringBuilder.append(SourceCodeBuilderHelper.createSourceCodeForArguments(arguments));
        return this;
    }
}
