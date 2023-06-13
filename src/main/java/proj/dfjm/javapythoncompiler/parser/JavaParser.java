package proj.dfjm.javapythoncompiler.parser;

import proj.dfjm.javapythoncompiler.listeners.JavaGrammarListener;

public class JavaParser extends BaseParser {
    public JavaParser() {
        grammarListener = new JavaGrammarListener();
    }
}
