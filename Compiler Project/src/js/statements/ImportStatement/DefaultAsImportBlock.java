package js.statements.ImportStatement;

import org.antlr.v4.runtime.misc.Pair;

public class DefaultAsImportBlock extends ImportStatement {
    public String packageName;
    public Pair<String, String> defaultImport;

    public DefaultAsImportBlock(String packageName, Pair<String, String> defaultImport) {
        this.packageName = packageName;
        this.defaultImport = defaultImport;
    }

    @Override
    public String toString() {
        return "import " + defaultImport.a + (defaultImport.b != null ? " as " + defaultImport.b : "") + " from " + packageName + "";
    }
}
