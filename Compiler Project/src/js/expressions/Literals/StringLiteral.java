package js.expressions.Literals;

import js.visitors.models.Literal;

public class StringLiteral implements Literal {
    public String value;

    public StringLiteral(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
//        String temp = value;
//        if (temp.length() > 2) temp = temp.substring(1, temp.length() - 1);
//        else temp = "";
//        return "`" + temp + "`";
    }
}
