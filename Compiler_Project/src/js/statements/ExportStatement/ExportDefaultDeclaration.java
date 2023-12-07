package js.statements.ExportStatement;

public class ExportDefaultDeclaration extends ExportChunk {
    String exportName;

    public ExportDefaultDeclaration(String exportName) {
        this.exportName = exportName;
    }

    @Override
    public String toString() {
        return "ExportDefaultDeclaration{" +
                "exportName='" + exportName + '\'' +
                '}';
    }
}
