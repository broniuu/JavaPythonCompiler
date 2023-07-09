package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

abstract class SourceCodeBuilderBase {
    protected final StringBuilder stringBuilder = new StringBuilder();
    protected int currentIndentationLevel = 0;

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
