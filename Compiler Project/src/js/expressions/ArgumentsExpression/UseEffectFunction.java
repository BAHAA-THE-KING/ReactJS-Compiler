package js.expressions.ArgumentsExpression;

import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.visitors.models.Expression;
import org.antlr.v4.runtime.ParserRuleContext;

import java.lang.reflect.Array;

public class UseEffectFunction implements Expression {
    public AnonymousFunction onRenderFunction;
    public ArrayLiteral dependencies;
    public ParserRuleContext context;

    public UseEffectFunction(AnonymousFunction onRenderFunction, ArrayLiteral dependencies, ParserRuleContext context) {
        this.onRenderFunction = onRenderFunction;
        this.dependencies = dependencies;
        this.context = context;
    }

    @Override
    public String toString() {
        if (dependencies == null) return "useEffect(\n" + onRenderFunction + "\n)";
        return "useEffect(\n" + onRenderFunction + ", " + dependencies + "\n)";
    }
}
