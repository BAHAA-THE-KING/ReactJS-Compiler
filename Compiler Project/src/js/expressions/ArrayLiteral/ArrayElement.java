package js.expressions.ArrayLiteral;

import js.visitors.models.Expression;

public class ArrayElement {
    public Expression element ;
    public boolean withEllipsis = false;
    public ArrayElement(Expression element) {
        this.element = element;
    }
    public ArrayElement withEllipsis (boolean b){
        this.withEllipsis=b;
        return this;
    }
}
