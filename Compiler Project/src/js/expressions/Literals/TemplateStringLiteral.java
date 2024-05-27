package js.expressions.Literals;

import js.visitors.models.Expression;
import js.visitors.models.Literal;

import java.util.List;

public class TemplateStringLiteral implements Literal {
    public List content;
    public Expression placeholder;

    public TemplateStringLiteral(List content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder cnt = new StringBuilder();
        content.forEach(e -> {
            if (e instanceof String) {
                cnt.append(e);
            } else if (e instanceof Expression) {
                cnt.append(e);
            } else {
                throw new RuntimeException("There Is Thing Other Than String And Expression In The Template String Literal");
            }
        });
        return "`" + cnt + "`";
    }
}
