package js.visitors.models;

import java.util.ArrayList;
import java.util.List;

public class JsProgram {
    public List<Statement> statements;

    public JsProgram() {
        this.statements = new ArrayList<>();
    }

    public void addStatement(Statement statement) {
        this.statements.add(statement);
    }
}
