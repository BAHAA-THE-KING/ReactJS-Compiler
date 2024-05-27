package js.statements.ImportStatement;

public class FileImportBlock extends ImportStatement {
    public String packageName;

    public FileImportBlock(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        return "import " + packageName;
    }
}
