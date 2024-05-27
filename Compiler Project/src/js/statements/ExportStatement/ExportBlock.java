package js.statements.ExportStatement;

import js.visitors.models.Statement;

import java.util.List;
import java.util.StringJoiner;

public class ExportBlock implements Statement {
    public List<String> items;

    public ExportBlock(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        StringJoiner itemsJoiner = new StringJoiner(", ");
        items.forEach(item -> itemsJoiner.add(item));
        return "export {\n" + itemsJoiner + "\n}";
    }
}
