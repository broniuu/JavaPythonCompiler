package proj.dfjm.javapythoncompiler.listeners;

import proj.dfjm.javapythoncompiler.antlr.GrammarBaseListener;
import proj.dfjm.javapythoncompiler.nodes.RootASTNode;

public abstract class GrammarCodeRetrievableListener extends GrammarBaseListener {
    protected final RootASTNode rootASTNode;

    public GrammarCodeRetrievableListener(RootASTNode rootASTNode) {
        this.rootASTNode = rootASTNode;
    }

    public String getGeneratedSourceCode() {
        return rootASTNode.getSourceCode();
    }
}
