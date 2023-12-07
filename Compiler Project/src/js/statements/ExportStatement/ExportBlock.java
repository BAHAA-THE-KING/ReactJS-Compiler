package js.statements.ExportStatement;

import js.visitors.models.Statement;

import java.util.List;

public class ExportBlock implements Statement {
    public List<String> items;

    public ExportBlock(List<String> items) {
        this.items = items;
    }
}
