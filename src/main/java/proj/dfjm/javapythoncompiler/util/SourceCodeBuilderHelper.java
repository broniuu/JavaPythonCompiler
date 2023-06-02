package proj.dfjm.javapythoncompiler.util;

import java.util.List;

public final class SourceCodeBuilderHelper {
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
}
