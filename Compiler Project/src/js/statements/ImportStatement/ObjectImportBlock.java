package js.statements.ImportStatement;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class ObjectImportBlock extends ImportStatement {
    public String packageName;

    public Pair<String, String> defaultImport;
    public List<Pair<String, String>> items;

    public ObjectImportBlock(String packageName, Pair<String, String> defaultImport, List<Pair<String, String>> items) {
        this.packageName = packageName;
        this.defaultImport = defaultImport;
        this.items = items;
    }
}
