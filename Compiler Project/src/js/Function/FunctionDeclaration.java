package js.Function;

import js.Statement;

import java.util.List;

public class FunctionDeclaration implements Statement {
    private String Identifier;

    private List<String> parameters;
    private FunctionBody body;

    public FunctionDeclaration(String identifier, List<String> parameters, FunctionBody body) {
        Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "Identifier='" + Identifier + '\'' + ", parameters=" + parameters + ", body=" + body + '}';
    }
}
