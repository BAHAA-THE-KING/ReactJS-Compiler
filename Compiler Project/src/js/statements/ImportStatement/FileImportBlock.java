package js.statements.ImportStatement;

import program.ProgramJS;

public class FileImportBlock extends ImportStatement {
    public String packageName;

    public FileImportBlock(String packageName) {
        this.packageName = packageName;
    }

    @Override
    public String toString() {
        ProgramJS.InjectPaths.add(packageName);
        return "";
    }
}
