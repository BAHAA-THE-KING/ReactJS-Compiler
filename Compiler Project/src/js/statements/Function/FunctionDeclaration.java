package js.statements.Function;

import js.visitors.models.Expression;
import js.visitors.models.Function;
import js.visitors.models.Parameters;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.ParserRuleContext;
import program.CodeGeneration;

import java.util.List;
import java.util.StringJoiner;

public class FunctionDeclaration implements Function {
    public String Identifier;
    public Parameters parameters;
    public List<Statement> body;
    public ParserRuleContext context;

    public FunctionDeclaration(String identifier, Parameters parameters, List<Statement> body, ParserRuleContext context) {
        this.Identifier = identifier;
        this.parameters = parameters;
        this.body = body;
        this.context = context;
    }

    @Override
    public String toString() {
        if (this.Identifier.toUpperCase().charAt(0) == this.Identifier.charAt(0)) {
            return CodeGeneration.FunctionToClass(this).toString();
        }
        StringJoiner bodyJoiner = new StringJoiner(";\n");
        body.forEach(stmt -> bodyJoiner.add(stmt.toString()));
        return "function " + Identifier + "(" + parameters + "){\n" + bodyJoiner + "\n}";
    }
}
