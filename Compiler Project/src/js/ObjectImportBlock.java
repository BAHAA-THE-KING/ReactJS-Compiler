package js;

import java.util.List;

public class ObjectImportBlock extends ImportChunk {
    String packageName;
    String defaultImport;
    List<String> items;

    public ObjectImportBlock(String packageName, String defaultImport, List<String> items) {
        this.packageName = packageName;
        this.defaultImport = defaultImport;
        this.items = items;
    }

    @Override
    public String toString() {
        return "ObjectImportBlock{" + "packageName='" + packageName + '\'' + ", defaultImport='" + defaultImport + '\'' + ", items=" + items + '}';
    }
}
