package js.expressions.ArrayLiteral;

import js.visitors.models.Expression;

public class ArrayElement {
    private final String className = this.getClass().getSimpleName();
    Expression element ;
    boolean withEllipsis = false;
    public ArrayElement(Expression element) {
        this.element = element;
    }
    public ArrayElement withEllipsis (boolean b){
        this.withEllipsis=b;
        return this;
    }

    @Override
    public String toString() {
        return "ArrayElement{" +
                "element=" + element +
                ", withEllipsis=" + withEllipsis +
                '}';
    }
}
