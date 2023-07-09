package proj.dfjm.javapythoncompiler.builders.sourcecodebuilder;

abstract class SourceCodeBuilderBase {
    protected static final String SINGLE_INDENTATION_REPRESENTATION = "\t";

    protected final StringBuilder stringBuilder = new StringBuilder();
    protected int indentationLevel = 0;

    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
