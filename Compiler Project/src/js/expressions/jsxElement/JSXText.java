package js.expressions.jsxElement;

import js.visitors.models.JSXContent;

public class JSXText implements JSXContent {
    String value;

    public JSXText(String value) {
        this.value = value;
    }
}
