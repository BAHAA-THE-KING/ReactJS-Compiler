package js.statements.ImportStatement;

import js.visitors.models.Statement;

public abstract class ImportStatement implements Statement {
    String packageName;

    public ImportStatement(String packageName) {
        this.packageName = packageName;
    }
}
