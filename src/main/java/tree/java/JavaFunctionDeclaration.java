package tree.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaFunctionDeclaration {
    private String type;
    private String name;
    private List<String> parameters = new ArrayList<>();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public void addParameter(String parameter) {
        this.parameters.add(parameter);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
