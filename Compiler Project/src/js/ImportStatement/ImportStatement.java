package js.ImportStatement;

import js.Statement;

public abstract class ImportStatement implements Statement {
    String packageName;

    public ImportStatement(String packageName) {
        this.packageName = packageName;
    }
}
