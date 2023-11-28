package js;

import js.ClassDeclaration.ClassDeclaration;
import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.Block.BlockModel;
import js.ExportStatement.ExportBlock;
import js.ExportStatement.ExportDeclaration;
import js.ExportStatement.ExportDefaultDeclaration;
import js.ImportStatement.FileImportBlock;

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
        return super.visitObjectImportBlock(ctx);
    }

    @Override
    public Statement visitBlockChunk(JSParser.BlockChunkContext ctx) {
        BlockModel blockModel = new BlockModel();
        for(int i = 0 ; i < ctx.block().statementList().getChildCount() ; i++){
            blockModel.addStatement(visit(ctx.block().statementList().getChild(i)));
        }
        return super.visitBlockChunk(ctx);
    }

    @Override
    public Statement visitClassDeclaration(JSParser.ClassDeclarationContext ctx) {
        String id = ctx.Identifier().getText();
        String parent ;
        if(ctx.classTail().Identifier().getText() != null) {
            parent=ctx.classTail().Identifier().getText();
        }else {
            parent= "null" ;
        }
        ClassDeclaration classDeclaration = new ClassDeclaration(id , parent);
        //TODO visit elements
        return classDeclaration;
    }
    @Override
    public Statement visitExportChunk(JSParser.ExportChunkContext ctx) {
        return visit(ctx.exportStatement());
    }

    @Override
    public Statement visitExportDefaultDeclaration(JSParser.ExportDefaultDeclarationContext ctx) {
        String exportName = ctx.singleExpression().getChild(0).getText();
        ExportDefaultDeclaration  e =new ExportDefaultDeclaration(exportName);
        System.out.println( e.toString());
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
        String className = ctx.declaration().getChild(0).getChild(1).getText();
        ExportDeclaration e = new ExportDeclaration(className);
        System.out.println( e.toString());
        return e;
    }
}
