package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;
import proj.dfjm.javapythoncompiler.util.CommonUtilities;

import java.util.List;

public final class JavaSourceCodeBuilder extends SourceCodeBuilderBase {
    public JavaSourceCodeBuilder setIndentationLevel(int indentationLevel) throws IllegalArgumentException {
        if (indentationLevel < 0) {
            throw new IllegalArgumentException("Indentation level cannot be negative!");
        }

        this.indentationLevel = indentationLevel;
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

    public JavaSourceCodeBuilder appendLine(String content) {
        return appendIndentation().append(content).appendNewlineCharacter();
    }

    public JavaSourceCodeBuilder appendFirstLine(String content) {
        return append(content).appendNewlineCharacter();
    }

    public JavaSourceCodeBuilder appendLastLine(String content) {
        return appendIndentation().append(content);
    }

    public JavaSourceCodeBuilder appendIndentation() {
        stringBuilder.append(SINGLE_INDENTATION_REPRESENTATION.repeat(indentationLevel));
        return this;
    }

    public JavaSourceCodeBuilder appendNewlineCharacter() {
        stringBuilder.append('\n');
        return this;
    }

    public JavaSourceCodeBuilder appendCustomFunctionDefinitions(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        final String EMPTY_FUNCTION_BODY_COMMENT = "\t// Enter your function code here\n";

        append("\n\n// Function definitions:\n");

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

    public JavaSourceCodeBuilder appendThreadFunctionDefinitions(
        List<ThreadFunctionDefinition> threadFunctionDefinitions
    ) {
        append("\n\n// Thread function definitions:\n");

        for (ThreadFunctionDefinition threadFunctionDefinition : threadFunctionDefinitions) {
            append("void threadFunction")
                .append(String.valueOf(threadFunctionDefinition.getFunctionNumber()))
                .append("() {\n");

            indentationLevel++;
            appendIndentation().append(threadFunctionDefinition.getFunctionBody()).appendNewlineCharacter();
            indentationLevel--;

            append("}\n");
        }

        return this;
    }

    public JavaSourceCodeBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        return append(functionName)
            .appendFunctionArguments(arguments)
            .append(';');
    }

    public JavaSourceCodeBuilder appendIf(String condition, String... instructionsInside) {
        return append("if (")
            .append(condition != null ? condition : "/* implementation required */")
            .append(") {\n")
            .appendCodeBlockInstructions(instructionsInside)
            .appendIndentation()
            .append('}');
    }

    public JavaSourceCodeBuilder appendElse(String... instructionsInside) {
        return append(" else {\n")
            .appendCodeBlockInstructions(instructionsInside)
            .appendIndentation()
            .append("}\n");
    }

    public JavaSourceCodeBuilder appendWhile(String condition, String... instructionsInside) {
        return append("while (")
            .append(condition)
            .append(") {\n")
            .appendCodeBlockInstructions(instructionsInside)
            .appendIndentation()
            .append("}\n");
    }

    public JavaSourceCodeBuilder appendDoWhile(String condition, String... instructionsInside) {
        return append("do {\n")
            .appendCodeBlockInstructions(instructionsInside)
            .appendIndentation()
            .append("} while (")
            .append(condition)
            .append(");\n");
    }

    public JavaSourceCodeBuilder appendThreadCreation(int threadNumber) {
        return append("Thread thread")
            .append(String.valueOf(threadNumber))
            .append(" = new Thread(() -> { ")
            .append("threadFunction")
            .append(String.valueOf(threadNumber))
            .append("(); });\n");
    }

    public JavaSourceCodeBuilder appendThreadStart(int threadNumber) {
        return appendIndentation()
            .append("thread")
            .append(String.valueOf(threadNumber))
            .append(".start();");
    }

    public JavaSourceCodeBuilder appendThreadsJoin(int firstThreadNumber, int secondThreadNumber) {
        appendIndentation().append("try {\n");

        indentationLevel++;
        appendIndentation()
            .append("thread")
            .append(String.valueOf(firstThreadNumber))
            .append(".join();\n");

        appendIndentation()
            .append("thread")
            .append(String.valueOf(secondThreadNumber))
            .append(".join();\n");
        indentationLevel--;

        appendIndentation().append("} catch (InterruptedException e) {\n");
        indentationLevel++;
        appendIndentation().append("e.printStackTrace();\n");
        indentationLevel--;

        appendIndentation().append("}\n");

        return this;
    }

    private JavaSourceCodeBuilder appendCodeBlockInstructions(String... instructions) {
        indentationLevel++;
        for (String instruction : instructions) {
            appendLine(instruction);
        }
        indentationLevel--;

        return this;
    }

    private JavaSourceCodeBuilder appendFunctionArguments(List<String> arguments) {
        stringBuilder.append(CommonUtilities.createSourceCodeForArguments(arguments));
        return this;
    }
}
