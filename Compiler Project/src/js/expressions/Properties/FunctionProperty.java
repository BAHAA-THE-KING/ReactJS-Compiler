package js.expressions.Properties;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;
import js.visitors.models.Property;
import js.visitors.models.Statement;

import java.util.*;

public class FunctionProperty implements Property {
    public String name;
    public Map<Assignable, Expression> parameters = new HashMap<>();
    public Expression spreadParameter;
    public List<Statement> bodyStatements = new ArrayList<>();

    public FunctionProperty(String name) {
        this.name = name;
    }

    public boolean addParameter(Assignable key, Expression value) {
        if (parameters.containsKey(key)) return false;
        parameters.put(key, value);
        return true;
    }

    public void setSpreadParameter(Expression spreadParameter) {
        this.spreadParameter = spreadParameter;
    }

    public void addStatement(Statement statement) {
        bodyStatements.add(statement);
    }

    @Override
    public String toString() {
        StringJoiner parametersJoiner = new StringJoiner(", ");
        parameters.forEach((key, value) -> {
            if (value == null) parametersJoiner.add(key.toString());
            else parametersJoiner.add(key + "=" + value);
        });
        if (spreadParameter != null) parametersJoiner.add("..." + spreadParameter);

        StringJoiner bodyJoiner = new StringJoiner("\n");
        bodyStatements.forEach(statement -> {
            bodyJoiner.add(statement.toString());
        });

        return name + "(" + parametersJoiner + "){\n" + bodyJoiner + "\n}";
    }
}
