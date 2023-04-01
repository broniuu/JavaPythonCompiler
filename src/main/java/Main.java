import gen.GrammarLexer;
import gen.GrammarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class Main {
    public static void main(String[] args) {
        CharStream codePointCharStream = CharStreams
                .fromString("");
        GrammarLexer lexer = new GrammarLexer(codePointCharStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        GrammarParser parser = new GrammarParser(tokens);
        ParseTree tree = parser.prog();
        JavaGrammarListener scriptListener = new JavaGrammarListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(scriptListener, tree);
    }
}
