package js.statements.Function;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class FunctionDeclaration implements Statement, Expression {
    public String Identifier;
    public List<Pair<Assignable, Expression>> parameters;
    public Expression spreadParameter;
    public List<Statement> body;

    public FunctionDeclaration(String identifier, List<Pair<Assignable, Expression>> parameters, Expression spreadParameter, List<Statement> body) {
        this.Identifier = identifier;
        this.parameters = parameters;
        this.spreadParameter = spreadParameter;
        this.body = body;
    }

    @Override
    public String toString() {
        return "FunctionDeclaration{" + "Identifier='" + Identifier + '\'' + ", parameters=" + parameters + ", spreadParameter=" + spreadParameter + ", body=" + body + '}';
    }
}
