package proj.dfjm.javapythoncompiler.parser;

import proj.dfjm.javapythoncompiler.listeners.PythonGrammarListener;

public class PythonParser extends BaseParser {
    public PythonParser() {
        grammarListener = new PythonGrammarListener();
    }
}
