package js.Function;

import js.Expression;
import js.Statement;

import java.util.List;

public class FunctionDeclaration implements Statement, Expression {
    private String Identifier;

    private List<String> parameters;
    private FunctionBody body;

    public FunctionDeclaration(String identifier, List<String> parameters, FunctionBody body) {
        this.Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "Identifier='" + Identifier + '\'' + ", parameters=" + parameters + ", body=" + body + '}';
    }
}
