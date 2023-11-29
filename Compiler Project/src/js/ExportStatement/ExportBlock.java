package js.ExportStatement;

import java.util.List;

public class ExportBlock {
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
