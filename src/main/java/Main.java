import gen.GrammarLexer;
import gen.GrammarParser;
import listener.JavaGrammarListener;
import listener.PythonGrammarListener;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream("input.txt");
        assert inputStream != null;
        CharStream codePointCharStream = CharStreams.fromStream(inputStream);
        GrammarLexer lexer = new GrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        parser.setErrorHandler(new BailErrorStrategy());
        JavaGrammarListener javaGrammarListener = new JavaGrammarListener();
        PythonGrammarListener pythonGrammarListener = new PythonGrammarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        try {
//            walker.walk(javaGrammarListener, tree);
            walker.walk(pythonGrammarListener, tree);
        } catch (RuntimeException ex){;
            ex.printStackTrace();
        }
    }
}
