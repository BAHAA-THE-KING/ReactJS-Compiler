package js.Function;

import java.util.List;

public class FunctionDeclaration extends JSExpression {
    private String Identifier;

    private List<String> parameters;
    private JSExpression body;

    public FunctionDeclaration(String identifier, List<String> parameters, JSExpression body) {
        Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "Identifier='" + Identifier + '\'' + ", parameters=" + parameters + ", body=" + body + '}';
    }
}
