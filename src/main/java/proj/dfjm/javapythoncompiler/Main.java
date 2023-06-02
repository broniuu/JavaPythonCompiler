package proj.dfjm.javapythoncompiler;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import proj.dfjm.javapythoncompiler.antlr.GrammarLexer;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.listeners.JavaGrammarListener;
import proj.dfjm.javapythoncompiler.listeners.PythonGrammarListener;

import java.io.IOException;
import java.nio.file.InvalidPathException;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: javapythoncompiler.jar file...");
            return;
        }

        for (String arg : args) {
            try {
                CharStream charStream = CharStreams.fromFileName(arg);

                GrammarLexer grammarLexer = new GrammarLexer(charStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
                GrammarParser grammarParser = new GrammarParser(commonTokenStream);

                grammarParser.setErrorHandler(new BailErrorStrategy());

                ParseTree parseTreeRoot = grammarParser.prog();

                ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
                parseTreeWalker.walk(new JavaGrammarListener(), parseTreeRoot);
                parseTreeWalker.walk(new PythonGrammarListener(), parseTreeRoot);
            } catch (IOException | InvalidPathException e) {
                System.err.println("Unable to open file '" + arg + "'!");
            } catch (ParseCancellationException e) {
                System.err.println("Failed to parse file '" + arg + "'!");
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }
}
