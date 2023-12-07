package js.expressions;

import js.visitors.models.Assignable;
import js.visitors.models.Expression;

import java.util.Objects;

public class IdentifierExpression implements Expression, Assignable  {

    public String name;

    public IdentifierExpression(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdentifierExpression that = (IdentifierExpression) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
