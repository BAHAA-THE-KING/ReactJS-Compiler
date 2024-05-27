package js.expressions.ArgumentsExpression;

import js.expressions.Function.AnonymousFunction;
import js.visitors.models.Expression;

public class UseEffectFunction implements Expression {
    public AnonymousFunction onRenderFunction;
    public Argument dependencies;

    public UseEffectFunction(AnonymousFunction onRenderFunction, Argument dependencies) {
        this.onRenderFunction = onRenderFunction;
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        if (dependencies == null) return "useEffect(\n" + onRenderFunction + "\n)";
        return "useEffect(\n" + onRenderFunction + ", " + dependencies + "\n)";
    }
}
