package proj.dfjm.javapythoncompiler.util;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

public final class CommonUtilities {
    public static String createSourceCodeForArguments(List<String> arguments) {
        StringBuilder internalStringBuilder = new StringBuilder();

        internalStringBuilder.append('(');

        if (arguments.size() > 0) {
            int lastArgumentIndex = arguments.size() - 1;

            arguments.subList(0, lastArgumentIndex).forEach( x -> {
                internalStringBuilder.append(x).append(", ");
            });

            internalStringBuilder.append(arguments.get(lastArgumentIndex));
        }

        internalStringBuilder.append(')');

        return internalStringBuilder.toString();
    }

    public static String separateElementsWithWhitespaces(ParseTree context) {
        StringBuilder internalStringBuilder = new StringBuilder();
        int lastChildIndex = context.getChildCount() - 1;

        for (int i = 0; i < lastChildIndex; i++) {
            internalStringBuilder.append(context.getChild(i).getText()).append(" ");
        }
        internalStringBuilder.append(context.getChild(lastChildIndex).getText());

        return internalStringBuilder.toString();
    }
}
