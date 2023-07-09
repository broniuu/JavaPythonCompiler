package proj.dfjm.javapythoncompiler.listeners;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import proj.dfjm.javapythoncompiler.exceptions.CodeParsingException;

public final class ParsingErrorListener extends BaseErrorListener {
    @Override
    public void syntaxError(
        Recognizer<?, ?> recognizer, Object offendingSymbol,
        int line, int charPositionInLine,
        String msg, RecognitionException e
    ) {
        StringBuilder errorMessageStringBuilder = new StringBuilder();
        errorMessageStringBuilder
            .append("The code provided as input cannot be parsed! Problem detected at line ")
            .append(line).append(", column ").append(charPositionInLine).append('.');

        // The offendingSymbol may be null when this error listener is called by a GrammarLexer instance (as opposed to
        // a GrammarParser instance), in which case tokenization has not yet occurred, so the symbols are not defined.
        if (offendingSymbol != null) {
            errorMessageStringBuilder
                .append(" The troublesome token: '")
                .append(((Token) offendingSymbol).getText())
                .append("'.");
        }

        throw new CodeParsingException(errorMessageStringBuilder.toString());
    }
}
