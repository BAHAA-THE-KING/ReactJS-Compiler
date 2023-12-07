package js.statements.ImportStatement;

import org.antlr.v4.runtime.misc.Pair;

public class DeafultAsImportBlock extends ImportStatement {
    Pair<String, String> defaultImport;

    public DeafultAsImportBlock(String packageName, Pair<String, String> defaultImport) {
        super(packageName);
        this.defaultImport = defaultImport;
    }

    @Override
    public String toString() {
        return "DeafultAsImportBlock{" + "defaultImport=" + defaultImport + ", packageName='" + packageName + '\'' + '}';
    }
}
