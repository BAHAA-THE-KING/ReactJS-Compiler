package js.statements.ImportStatement;

import org.antlr.v4.runtime.misc.Pair;

import java.util.List;
import java.util.StringJoiner;

public class ObjectImportBlock extends ImportStatement {
    public String packageName;

    public Pair<String, String> defaultImport;
    public List<Pair<String, String>> items;

    public ObjectImportBlock(String packageName, Pair<String, String> defaultImport, List<Pair<String, String>> items) {
        this.packageName = packageName;
        this.defaultImport = defaultImport;
        this.items = items;
    }

    @Override
    public String toString() {
        StringJoiner itemJoiner = new StringJoiner(", ");
        items.forEach(item -> itemJoiner.add(item.a + (item.b != null ? " as " + item.b : "")));
        return "import " + (defaultImport.a != null ? defaultImport.a + (defaultImport.b != null ? " as " + defaultImport.b : "") : "") + "{\n" + itemJoiner + "\n} from " + packageName;
    }
}
