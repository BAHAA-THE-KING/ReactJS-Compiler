package js.statements.ReturnStatement;

import js.visitors.models.Expression;
import js.visitors.models.Statement;

import java.util.List;

public class ReturnStatement implements Statement {
    List<Expression> expr;

    public ReturnStatement(List<Expression> expr) {
        this.expr = expr;
    }

    @Override
    public String toString() {
        return "ReturnStatement{" + "expr=" + expr + '}';
    }
}
