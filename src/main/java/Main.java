import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.BailErrorStrategy;
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
                "seqSeq(`p = 234;`, `d = 344;`, `p < d;`)"
        );
        GrammarLexer lexer = new GrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        parser.setErrorHandler(new BailErrorStrategy());
        JavaGrammarListener javaGrammarListener = new JavaGrammarListener();
        PythonGrammarListener pythonGrammarListener = new PythonGrammarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        try {
            walker.walk(javaGrammarListener, tree);
            walker.walk(pythonGrammarListener, tree);
        } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
}
