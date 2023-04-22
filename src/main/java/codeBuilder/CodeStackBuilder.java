package codeBuilder;

import java.util.ArrayDeque;

public class CodeStackBuilder implements ICodeStackBuilder {
    private final ArrayDeque<StringBuilder> codeStack = new ArrayDeque<StringBuilder>();
    private StringBuilder codeAboveStack;
    public CodeStackBuilder(){
        codeAboveStack = new StringBuilder();
    }
    @Override
    public ICodeStackBuilder appendCode(String code) {
        codeAboveStack.append(code);
        return this;
    }

    @Override
    public String getText() {
        return codeAboveStack.toString();
    }

    @Override
    public String popCodeAboveStack() {
        String codeAboveStackText = codeAboveStack.toString();
        codeAboveStack = codeStack.pop();
        return codeAboveStackText;
    }

    @Override
    public void pushNewEmptyCode() {
        codeStack.push(codeAboveStack);
        codeAboveStack = new StringBuilder();
    }

    @Override
    public boolean codeAboveStackIsNull() {
        return codeAboveStack == null;
    }

    @Override
    public ICodeStackBuilder appendCodeAboveStack() {
        String codeAboveStackText = codeAboveStack.toString();
        StringBuilder codeFromTheTopOfStack = codeStack.pop();
        codeAboveStack = codeFromTheTopOfStack.append(codeAboveStackText);
        return this;
    }

    @Override
    public String toString() {
        return this.getText();
    }
}
