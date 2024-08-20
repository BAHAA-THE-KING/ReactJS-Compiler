package js.expressions;

import js.visitors.models.Expression;

public class SimpleExpression implements Expression {
    public String keyWord;

    public SimpleExpression This() {
        keyWord = "this";
        return this;
    }

    public SimpleExpression Super() {
        keyWord = "super";
        return this;
    }

    public SimpleExpression Undefined() {
        keyWord = "undefined";
        return this;
    }

    @Override
    public String toString() {
        return keyWord;
    }
}
