package tree;

public class FunctionCallToCheck {
    private final String name;
    private final int numberOfArguments;

    public FunctionCallToCheck(String name, int numberOfArguments) {
        this.name = name;
        this.numberOfArguments = numberOfArguments;
    }

    public String getName() {
        return name;
    }
    public int getNumberOfArguments() {
        return numberOfArguments;
    }

}
