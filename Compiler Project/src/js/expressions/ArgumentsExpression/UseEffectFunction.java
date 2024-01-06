package js.expressions.ArgumentsExpression;

import js.expressions.Function.AnonymousFunction;
import js.visitors.models.Expression;
import js.visitors.models.Function;

public class UseEffectFunction implements Expression {
    public AnonymousFunction onRenderFunction;
    public Argument dependencies;

    public UseEffectFunction(AnonymousFunction onRenderFunction, Argument dependencies) {
        this.onRenderFunction = onRenderFunction;
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        return "useEffect("+onRenderFunction+", "+dependencies+")";
    }
}
