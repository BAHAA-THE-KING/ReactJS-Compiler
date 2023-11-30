package js.Function;

import js.Statement;

import java.util.List;

public class FunctionBody implements ArrowFunctionBody {
    private List<Statement> statements;


    public void addStatement(Statement statement) {
        statements.add(statement);
    }

    @Override
    public String toString() {
        return "FunctionBody{" + "statements=" + statements + '}';
    }
}

