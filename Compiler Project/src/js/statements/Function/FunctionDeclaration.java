package js.statements.Function;
import js.visitors.models.Expression;
import js.visitors.models.Parameters;
import js.visitors.models.Statement;

import java.util.List;

public class FunctionDeclaration implements Statement, Expression {
    public String Identifier;
    public Parameters parameters;
    public List<Statement> body;

    public FunctionDeclaration(String identifier, Parameters parameters, List<Statement> body) {
        this.Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
    }
}
