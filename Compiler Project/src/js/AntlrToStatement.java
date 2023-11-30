package js;

import js.ClassDeclaration.ClassDeclaration;
import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.Block.BlockModel;
import js.ClassDeclaration.ClassElement;
import js.ExportStatement.ExportBlock;
import js.ExportStatement.ExportDefaultDeclaration;
import js.Function.AnonymousFunctionDecl;
import js.ImportStatement.DeafultAsImportBlock;
import js.Function.FormalParameter;
import js.Function.FunctionDeclaration;
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

    @Override
    public Statement visitBlockChunk(JSParser.BlockChunkContext ctx) {
        BlockModel blockModel = new BlockModel();
        for (int i = 0; i < ctx.block().statementList().getChildCount(); i++) {
            blockModel.addStatement(visit(ctx.block().statementList().getChild(i)));
        }
        return super.visitBlockChunk(ctx);
    }

    @Override
    public Statement visitClassDeclaration(JSParser.ClassDeclarationContext ctx) {
        String id = ctx.Identifier().getText();
        String parent;
        if (ctx.classTail().Identifier().getText() != null) {
            parent = ctx.classTail().Identifier().getText();
        } else {
            parent = "null";
        }
        ClassDeclaration classDeclaration = new ClassDeclaration(id, parent);
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement();
        for (int i = 0; i < classElements.getChildCount(); i++) {
            ClassElement classElement = visitor.visit(classElements.getChild(i));
            classDeclaration.addElement(classElement);
        }
        return classDeclaration;
    }

    @Override
    public Statement visitExportChunk(JSParser.ExportChunkContext ctx) {
        return visit(ctx.exportStatement());
    }

    @Override
    public Statement visitExportDefaultDeclaration(JSParser.ExportDefaultDeclarationContext ctx) {
        String exportName = ctx.singleExpression().getChild(0).getText();
        ExportDefaultDeclaration e = new ExportDefaultDeclaration(exportName);
        System.out.println(e.toString());
        return e;
    }

    @Override
    public Statement visitExportBlock(JSParser.ExportBlockContext ctx) {
        List<String> items = new ArrayList<>();

        for (int i = 1; i < ctx.exportFromBlock().exportModuleItems().getChildCount(); i += 2) {
            items.add(ctx.exportFromBlock().exportModuleItems().getChild(i).getText());
        }
        ExportBlock e = new ExportBlock(items);
        System.out.println(e.toString());
        return e;
    }


    @Override
    public Statement visitExportDeclaration(JSParser.ExportDeclarationContext ctx) {
        return visit(ctx.declaration().getChild(0));
    }

    @Override
    public Statement visitNormalParameters(JSParser.NormalParametersContext ctx) {
        FormalParameter fp = new FormalParameter();

        if (ctx != null) {
            for (int i = 0; i < ctx.getChildCount(); i += 2) {
                fp.addParameter(ctx.getChild(i).getChild(0).getText());
            }
            return fp;
        }
        return super.visitNormalParameters(ctx);
    }

    @Override
    public Statement visitAnonymousFunctionDecl(JSParser.AnonymousFunctionDeclContext ctx) {
        FormalParameter fp = (FormalParameter) visit(ctx.formalParameterList());

        AnonymousFunctionDecl a =  new AnonymousFunctionDecl(fp.getParameters(),null);
        System.out.println(a.toString());
        return a;
    }


    @Override
    public Statement visitFunctionDeclaration(JSParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.Identifier().getText();
        FormalParameter fp = (FormalParameter) visit(ctx.formalParameterList());


//        List<String> parameters = new ArrayList<>();

//        if (ctx.formalParameterList() != null) {
//
//            for (int i = 0; i < ctx.formalParameterList().getChildCount(); i += 2) {
//
//                parameters.add(ctx.formalParameterList().getChild(i).getText());
//
//            }
//
//        }
        // TODO add function Body
        FunctionDeclaration functionDeclaration = new FunctionDeclaration(functionName, fp.getParameters(), null);

        System.out.println(functionDeclaration.toString());

        return functionDeclaration;
    }

    @Override
    public Statement visitFunctionBody(JSParser.FunctionBodyContext ctx) {

        return super.visitFunctionBody(ctx);
    }

    @Override
    public Statement visitArrowFunction(JSParser.ArrowFunctionContext ctx) {
        FormalParameter fp = (FormalParameter) visit(ctx.arrowFunctionParameters().getChild(1));
        AnonymousFunctionDecl af = new AnonymousFunctionDecl(fp.getParameters(),null);
        System.out.println(af.toString());
        return af;

    }

    @Override
    public Statement visitManyParameters(JSParser.ManyParametersContext ctx) {
        return visit(ctx.formalParameterList());
    }

    @Override
    public Statement visitIdentifierExpression(JSParser.IdentifierExpressionContext ctx) {
        return super.visitIdentifierExpression(ctx);
    }
}