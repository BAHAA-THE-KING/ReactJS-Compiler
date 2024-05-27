package js.statements.ExportStatement;

public class ExportDefaultDeclaration extends ExportChunk {
    public String exportName;

    public ExportDefaultDeclaration(String exportName) {
        this.exportName = exportName;
    }

    @Override
    public String toString() {
        return "export default " + exportName;
    }
}
