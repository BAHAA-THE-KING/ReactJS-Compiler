package js.expressions.ArgumentsExpression;

import js.expressions.ArrayLiteral.ArrayLiteral;
import js.expressions.Function.AnonymousFunction;
import js.visitors.models.Expression;

import java.lang.reflect.Array;

public class UseEffectFunction implements Expression {
    public AnonymousFunction onRenderFunction;
    public ArrayLiteral dependencies;

    public UseEffectFunction(AnonymousFunction onRenderFunction, ArrayLiteral dependencies) {
        this.onRenderFunction = onRenderFunction;
        this.dependencies = dependencies;
    }

    @Override
    public String toString() {
        if (dependencies == null) return "useEffect(\n" + onRenderFunction + "\n)";
        return "useEffect(\n" + onRenderFunction + ", " + dependencies + "\n)";
    }
}
