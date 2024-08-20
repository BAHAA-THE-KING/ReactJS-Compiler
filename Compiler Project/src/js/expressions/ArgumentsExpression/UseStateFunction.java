package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

public class UseStateFunction implements Expression {
    public Argument initialState;
    public ParserRuleContext context;

    public UseStateFunction(Argument initialState , ParserRuleContext context) {
        this.initialState = initialState;
        this.context = context;
    }

    @Override
    public String toString() {
        return "useState(" + initialState + ')';
    }
}
