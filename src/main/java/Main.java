import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        CharStream codePointCharStream = CharStreams.fromString(
                "repeat(`int a = 1;`, choice(`char cd = 'a';`, `char cda = 'b';`, `char cd = 'a';`, `char aa = 'b';`), ``ab < 2``, `int i = 5;`)"
        );
        GrammarLexer lexer = new GrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        JavaGrammarListener javaGrammarListener = new JavaGrammarListener();
        PythonGrammarListener pythonGrammarListener = new PythonGrammarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(javaGrammarListener, tree);
        walker.walk(pythonGrammarListener, tree);
    }
}
