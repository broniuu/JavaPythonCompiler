package proj.dfjm.javapythoncompiler.parser;

import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import proj.dfjm.javapythoncompiler.antlr.GrammarBaseListener;
import proj.dfjm.javapythoncompiler.antlr.GrammarLexer;
import proj.dfjm.javapythoncompiler.antlr.GrammarParser;
import proj.dfjm.javapythoncompiler.listeners.GrammarCodeRetrievableListener;
import proj.dfjm.javapythoncompiler.listeners.JavaGrammarListener;
import proj.dfjm.javapythoncompiler.listeners.PythonGrammarListener;

import java.io.IOException;
import java.nio.file.InvalidPathException;

public abstract class BaseParser {
    protected ParseTree parseTreeRoot;
    protected ParseTreeWalker parseTreeWalker;
    protected GrammarCodeRetrievableListener grammarListener;
    protected void initializeParseTree(String sourceCode) {
        CharStream charStream = CharStreams.fromString(sourceCode);
        GrammarLexer grammarLexer = new GrammarLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(grammarLexer);
        GrammarParser grammarParser = new GrammarParser(commonTokenStream);
        grammarParser.setErrorHandler(new BailErrorStrategy());
        parseTreeRoot = grammarParser.prog();
        parseTreeWalker = new ParseTreeWalker();
    }
    public String parse(String sourceCode) {
        initializeParseTree(sourceCode);
        parseTreeWalker.walk(grammarListener, parseTreeRoot);
        return grammarListener.getGeneratedCode();
    }
}
