package grammarNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GrammarNode {
    protected int maxNodesNumber = 0;
    protected List<GrammarNode> grammarNodes = new ArrayList<>();
    public boolean addGrammarNode(GrammarNode grammarNode){
        if (grammarNodes.size() >= maxNodesNumber) {
            return false; // cannot add more children
        }
        grammarNodes.add(grammarNode);
        return true;
    }
    public boolean allNodesSet;

    public StringBuilder getCode() {
        return new StringBuilder();
    }

    public boolean addGrammarNodeToTree(GrammarNode node) {
        Queue<GrammarNode> queue = new LinkedList<>();
        queue.add(this); // rozpoczynamy od korzenia

        while (!queue.isEmpty()) {
            GrammarNode current = queue.poll();
            if (current.addGrammarNode(node)) {
                return true; // udało się dodać węzeł
            }
            queue.addAll(current.getGrammarNodes());
        }
        return false; // nie udało się dodać węzła (brak miejsca w drzewie)
    }

    public List<GrammarNode> getGrammarNodes() {
        return grammarNodes;
    }
}

