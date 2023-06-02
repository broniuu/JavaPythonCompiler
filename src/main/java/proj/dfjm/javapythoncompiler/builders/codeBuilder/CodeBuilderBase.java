package builder.codeBuilder;

import java.util.List;

public abstract class CodeBuilderBase {
    protected StringBuilder stringBuilder = new StringBuilder();
    protected int currentTabsNumber = 0;
    @Override
    public String toString() {
        return stringBuilder.toString();
    }
}
