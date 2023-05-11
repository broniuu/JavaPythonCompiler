package builder.codeBuilder;

public abstract class CodeBuilder {
    protected StringBuilder stringBuilder = new StringBuilder();
    protected int currentTabsNumber = 0;
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
