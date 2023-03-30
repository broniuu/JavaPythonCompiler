import gen.GrammarBaseListener;
import gen.GrammarParser;

public class GrammarScriptListener extends GrammarBaseListener{
    @Override
    public void enterProg(GrammarParser.ProgContext ctx) {
        System.out.println("Hello world!");
    }
}
