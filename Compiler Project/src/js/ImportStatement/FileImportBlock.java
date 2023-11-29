package js.ImportStatement;

public class FileImportBlock extends ImportStatement {
    public FileImportBlock(String packageName) {
        super(packageName);
    }

    @Override
    public String toString() {
        return "FileImportBlock{" + "packageName='" + packageName + '\'' + '}';
    }
}
