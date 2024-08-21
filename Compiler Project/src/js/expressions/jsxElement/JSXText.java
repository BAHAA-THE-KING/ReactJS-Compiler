package js.expressions.jsxElement;

import js.visitors.models.JSXContent;

public class    JSXText implements JSXContent {
    public String value;

    public JSXText(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
