package builder.codeBuilder.helper;

import java.util.List;

public class CodeBuilderHelper {
    public static String createArgsOrParamsCode(List<String> argsOrParams){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        if (argsOrParams.size() > 0){
            int lastIndexOfArguments = argsOrParams.size() - 1;
            String lastArgument = argsOrParams.get(lastIndexOfArguments);
            argsOrParams.subList(0, lastIndexOfArguments).forEach( x -> {
                stringBuilder.append(x).append(", ");
            });
            stringBuilder.append(lastArgument);
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
