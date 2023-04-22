package codeBuilder;

public interface ICodeStackBuilder {
    ICodeStackBuilder appendCode(String code);
    String getText();
    String popCodeAboveStack();
    void pushNewEmptyCode();
    boolean codeAboveStackIsNull();
    ICodeStackBuilder appendCodeAboveStack();
}
