import gen.GrammarLexer;
import gen.GrammarParser;
import grammarNode.StartNode;
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
//        CharStream codePointCharStream = CharStreams.fromString(
//                "seq( branch( ``i < 2``, seq(branch(``j < 2``, `int f = 2;`,`int g = 2;`), branchRe(`int h = 2;`,`int h1 = 2;`,`int h2 = 2;`)), `int b = 2;`), branchRe( `int c = 2;`, `int d = 2;`, `int e = 2;` ) )"
//        );
//        GrammarLexer lexer = new GrammarLexer(codePointCharStream);
//        CommonTokenStream tokens = new CommonTokenStream(lexer);
//        GrammarParser parser = new GrammarParser(tokens);
//        ParseTree tree = parser.prog();
//        parser.setErrorHandler(new BailErrorStrategy());
//        JavaGrammarListener javaGrammarListener = new JavaGrammarListener();
//        PythonGrammarListener pythonGrammarListener = new PythonGrammarListener();
//        ParseTreeWalker walker = new ParseTreeWalker();
//        try {
//            walker.walk(javaGrammarListener, tree);
//            walker.walk(pythonGrammarListener, tree);
//        } catch (RuntimeException ex){
//            System.out.println(ex.getMessage());
//        }
        StartNode startNode = new StartNode();
        startNode.addBranchBranchReNodeToTree();
        startNode.addCodeBlockNodeToTree("``i < 2``");
        // zagnieżdenie
        startNode.addBranchBranchReNodeToTree();
        startNode.addCodeBlockNodeToTree("``j < 2``");
        startNode.addCodeBlockNodeToTree("`int f = 2;`");
        startNode.addCodeBlockNodeToTree("`int g = 2;`");
        startNode.addCodeBlockNodeToTree("`int h = 2;`");
        startNode.addCodeBlockNodeToTree("`int h1 = 2;`");
        startNode.addCodeBlockNodeToTree("`int h2 = 2;`");
        // koniec zagnieżdżenia
        startNode.addCodeBlockNodeToTree("`int b = 2;`");
        startNode.addCodeBlockNodeToTree("`int c = 2;`");
        startNode.addCodeBlockNodeToTree(" `int d = 2;`");
        startNode.addCodeBlockNodeToTree(" `int e = 2;`");
        System.out.println(startNode.getCode());
    }
}
