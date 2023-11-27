package js.ImportStatement;

import js.Statement;

public abstract class ImportStatement extends Statement {
    String packageName;

    public ImportStatement(String packageName) {
        this.packageName = packageName;
    }
}
