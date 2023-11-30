package js.ExpressionChunk;

import js.Expression;
import js.Statement;

import java.util.ArrayList;
import java.util.List;

public class ExpressionChunk implements Statement {

    List<Expression> expressions;

    public ExpressionChunk() {
        expressions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        expressions.add(e);
    }
    @Override
    public String toString() {
        return "ExpressionChunk{" +
                "expressions=" + expressions +
                '}';
    }
}
