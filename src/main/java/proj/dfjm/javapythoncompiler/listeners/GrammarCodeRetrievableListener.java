package proj.dfjm.javapythoncompiler.listeners;

import org.antlr.v4.runtime.tree.ErrorNode;
import proj.dfjm.javapythoncompiler.antlr.GrammarBaseListener;
import proj.dfjm.javapythoncompiler.builders.workflowpatternbuilder.JavaWorkflowPatternBuilder;
import proj.dfjm.javapythoncompiler.nodes.RootASTNode;

public abstract class GrammarCodeRetrievableListener extends GrammarBaseListener {
    protected RootASTNode rootASTNode;
    public String getGeneratedCode() {
        return rootASTNode.getSourceCode();
    }
}
