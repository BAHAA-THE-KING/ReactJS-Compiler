package js.Function;

import js.Statement;

import java.util.List;

public class FunctionDeclaration extends Function {
    private String Identifier;

    private List<String> parameters;
    private List<Statement> body;

    public FunctionDeclaration(String identifier, List<String> parameters, List<Statement> body) {
        Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "Identifier='" + Identifier + '\'' + ", parameters=" + parameters + ", body=" + body + '}';
    }
}
