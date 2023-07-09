package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

import proj.dfjm.javapythoncompiler.datasets.CustomFunctionDeclaration;
import proj.dfjm.javapythoncompiler.datasets.ThreadFunctionDefinition;
import proj.dfjm.javapythoncompiler.util.CommonUtilities;

import java.util.List;

public final class PythonSourceCodeBuilder extends SourceCodeBuilderBase {
    public PythonSourceCodeBuilder setIndentationLevel(int indentationLevel) throws IllegalArgumentException {
        if (indentationLevel < 0) {
            throw new IllegalArgumentException("Indentation level cannot be negative!");
        }

        this.indentationLevel = indentationLevel;
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

    public PythonSourceCodeBuilder appendLine(String content) {
        return appendIndentation().append(content).appendNewlineCharacter();
    }

    public PythonSourceCodeBuilder appendFirstLine(String content) {
        return append(content).appendNewlineCharacter();
    }

    public PythonSourceCodeBuilder appendLastLine(String content) {
        return appendIndentation().append(content);
    }

    public PythonSourceCodeBuilder appendIndentation() {
        stringBuilder.append(SINGLE_INDENTATION_REPRESENTATION.repeat(indentationLevel));
        return this;
    }

    public PythonSourceCodeBuilder appendNewlineCharacter() {
        stringBuilder.append('\n');
        return this;
    }

    public PythonSourceCodeBuilder appendCustomFunctionDefinitions(
        List<CustomFunctionDeclaration> customFunctionDeclarations
    ) {
        final String EMPTY_FUNCTION_BODY_COMMENT = "\t// Enter your function code here\n";

        append("\n\n# Function definitions:\n");

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

    public PythonSourceCodeBuilder appendThreadFunctionDefinitions(
        List<ThreadFunctionDefinition> threadFunctionDefinitions
    ) {
        append("\n\n# Thread function definitions:\n");

        for (ThreadFunctionDefinition threadFunctionDefinition : threadFunctionDefinitions) {
            append("def thread_function")
                .append(String.valueOf(threadFunctionDefinition.getFunctionNumber()))
                .append("():\n");

            indentationLevel++;
            appendIndentation().append(threadFunctionDefinition.getFunctionBody()).appendNewlineCharacter();
            indentationLevel--;
        }

        return this;
    }

    public PythonSourceCodeBuilder appendCustomFunctionCall(String functionName, List<String> arguments) {
        return append(functionName).appendFunctionArguments(arguments);
    }

    public PythonSourceCodeBuilder appendIf(String condition, String... instructionsInside) {
        return append("if ")
            .append(condition != null ? condition : "False")
            .append(condition != null ? ":\n" : ": #<- Implementation required\n")
            .appendCodeBlockInstructions(instructionsInside);
    }

    public PythonSourceCodeBuilder appendElse(String... instructionsInside) {
        return appendIndentation()
            .append("else:\n")
            .appendCodeBlockInstructions(instructionsInside);
    }

    public PythonSourceCodeBuilder appendWhile(String condition, String... instructionsInside) {
        return append("while ")
            .append(condition)
            .append(":\n")
            .appendCodeBlockInstructions(instructionsInside);
    }

    public PythonSourceCodeBuilder appendDoWhile(String condition, String... instructionsInside) {
        append("while True:\n")
            .appendCodeBlockInstructions(instructionsInside);

        indentationLevel++;
        appendIndentation()
            .append("if not ")
            .append(condition)
            .append(":\n");

        indentationLevel++;
        appendIndentation().append("break\n");

        indentationLevel -= 2;

        return this;
    }

    public PythonSourceCodeBuilder appendThreadCreation(int threadNumber) {
        return append("thread")
            .append(String.valueOf(threadNumber))
            .append(" = threading.Thread(target=")
            .append("thread_function")
            .append(String.valueOf(threadNumber))
            .append(")\n");
    }

    public PythonSourceCodeBuilder appendThreadStart(int threadNumber) {
        return appendIndentation()
            .append("thread")
            .append(String.valueOf(threadNumber))
            .append(".start()");
    }

    public PythonSourceCodeBuilder appendThreadsJoin(int firstThreadNumber, int secondThreadNumber) {
        return appendIndentation()
            .append("thread")
            .append(String.valueOf(firstThreadNumber))
            .append(".join()\n")
            .appendIndentation()
            .append("thread")
            .append(String.valueOf(secondThreadNumber))
            .append(".join()\n");
    }

    private PythonSourceCodeBuilder appendCodeBlockInstructions(String... instructions) {
        indentationLevel++;
        for (String instruction : instructions) {
            appendLine(instruction);
        }
        indentationLevel--;

        return this;
    }

    private PythonSourceCodeBuilder appendFunctionArguments(List<String> arguments) {
        stringBuilder.append(CommonUtilities.createSourceCodeForArguments(arguments));
        return this;
    }
}
