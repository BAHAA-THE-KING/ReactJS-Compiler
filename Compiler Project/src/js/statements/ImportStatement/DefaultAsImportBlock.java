package js.statements.ImportStatement;

import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import org.antlr.v4.runtime.misc.Pair;
import program.CodeGeneration;

public class DefaultAsImportBlock extends ImportStatement {
    public String packageName;
    public Pair<String, String> defaultImport;

    public DefaultAsImportBlock(String packageName, Pair<String, String> defaultImport) {
        this.packageName = packageName;
        this.defaultImport = defaultImport;
    }

    @Override
    public String toString() {
        VariableDeclarationStatement declaration = CodeGeneration.ImportToDecl(this);
        if (declaration != null) {
            return declaration.toString();
        }
        return "import " + defaultImport.a + (defaultImport.b != null ? " as " + defaultImport.b : "") + " from " + packageName + "";
    }
}
