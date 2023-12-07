package js.statements.ImportStatement;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class ObjectImportBlock extends ImportStatement {
    Pair<String, String> defaultImport;
    List<Pair<String, String>> items;

    public ObjectImportBlock(String packageName, Pair<String, String> defaultImport, List<Pair<String, String>> items) {
        super(packageName);
        this.defaultImport = defaultImport;
        this.items = items;
    }

    @Override
    public String toString() {
        return "ObjectImportBlock{" + "defaultImport=" + defaultImport + ", items=" + items + ", packageName='" + packageName + '\'' + '}';
    }
}
