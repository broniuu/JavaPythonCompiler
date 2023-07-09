package proj.dfjm.javapythoncompiler.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import proj.dfjm.javapythoncompiler.antlr.GrammarLexer;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.exceptions.CodeParsingException;
import proj.dfjm.javapythoncompiler.listeners.GrammarCodeRetrievableListener;
import proj.dfjm.javapythoncompiler.listeners.ParsingErrorListener;

abstract class CodeParserBase {
    protected static String parseCode(
        GrammarCodeRetrievableListener grammarCodeRetrievableListener,
        String input
    ) throws CodeParsingException {
        CharStream charStream = CharStreams.fromString(input);

        GrammarLexer grammarLexer = new GrammarLexer(charStream);
        grammarLexer.removeErrorListeners();
        grammarLexer.addErrorListener(new ParsingErrorListener());

        GrammarParser grammarParser = new GrammarParser(new CommonTokenStream(grammarLexer));
        grammarParser.removeErrorListeners();
        grammarParser.addErrorListener(new ParsingErrorListener());

        try {
            new ParseTreeWalker().walk(grammarCodeRetrievableListener, grammarParser.prog());
        } catch (ParseCancellationException ignored) {
            // Silently ignore the ParseCancellationException that might be thrown in this
            // 'try' block, as that exception wouldn't be very informative anyway. Instead,
            // our own exception will be thrown (see ParsingErrorListener class), which in
            // turn will provide more useful information on what went wrong during parsing.
        }

        return grammarCodeRetrievableListener.getGeneratedSourceCode();
    }
}
