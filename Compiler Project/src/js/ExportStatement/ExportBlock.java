package js.ExportStatement;

import js.Statement;

import java.util.List;

public class ExportBlock extends Statement {
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
