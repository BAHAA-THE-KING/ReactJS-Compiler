package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.ImportStatement.DeafultAsImportBlock;
import js.ImportStatement.FileImportBlock;
import js.ImportStatement.ObjectImportBlock;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToStatement extends JSParserBaseVisitor<Statement> {
    @Override
    public Statement visitImportChunk(JSParser.ImportChunkContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public Statement visitFileImportBlock(JSParser.FileImportBlockContext ctx) {
        String fileName = ctx.StringLiteral().getText();
        return new FileImportBlock(fileName);
    }

    @Override
    public Statement visitObjectImportBlock(JSParser.ObjectImportBlockContext ctx) {
        String packageName = ctx.StringLiteral().getText();

        var importNamespace = ctx.importNamespace();
        String defaultImportName = null;
        String defaultImportValue = null;
        if (importNamespace != null) {
            defaultImportName = importNamespace.getChild(0).getText();
            defaultImportValue = importNamespace.getChildCount() == 3 ? importNamespace.getChild(2).getText() : defaultImportName;
        }
        Pair<String, String> defaultImport = new Pair<>(defaultImportName, defaultImportValue);

        var importModuleItems = ctx.importModuleItems();
        List<Pair<String, String>> items = new ArrayList<>();
        for (int i = 1; i < importModuleItems.getChildCount() - 1; i += 2) {
            var aliasName = importModuleItems.getChild(i);
            String itemName = aliasName.getChild(0).getText();
            String itemValue = aliasName.getChildCount() == 3 ? aliasName.getChild(2).getText() : itemName;
            items.add(new Pair<>(itemName, itemValue));
        }

        return new ObjectImportBlock(packageName, defaultImport, items);
    }

    @Override
    public Statement visitDeafultAsImportBlock(JSParser.DeafultAsImportBlockContext ctx) {
        String packageName = ctx.StringLiteral().getText();

        var importNamespace = ctx.importNamespace();
        String defaultImportName = importNamespace.getChild(0).getText();
        String defaultImportValue = importNamespace.getChildCount() == 3 ? importNamespace.getChild(2).getText() : defaultImportName;
        Pair<String, String> defaultImport = new Pair<>(defaultImportName, defaultImportValue);

        return new DeafultAsImportBlock(packageName, defaultImport);
    }
}
