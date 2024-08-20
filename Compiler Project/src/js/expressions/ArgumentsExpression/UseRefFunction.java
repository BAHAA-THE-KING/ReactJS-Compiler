package js.expressions.ArgumentsExpression;

import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

public class UseRefFunction implements Expression {
    public Argument initialValue;
    public ParserRuleContext context;

    public UseRefFunction(Argument initialValue, ParserRuleContext context) {
        this.initialValue = initialValue;
        this.context = context;
    }

    @Override
    public String toString() {
        return "useRef(" + initialValue + ")";
    }
}
