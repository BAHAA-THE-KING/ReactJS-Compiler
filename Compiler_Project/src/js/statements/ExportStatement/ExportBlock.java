package js.statements.ExportStatement;

import js.visitors.models.Statement;

import java.util.List;

public class ExportBlock implements Statement {
    List<String> items;

    public ExportBlock(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "ExportBlock{" +
                "items=" + items +
                '}';
    }
}
