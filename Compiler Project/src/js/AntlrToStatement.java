package js;

import js.ClassDeclaration.ClassDeclaration;
import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.Block.BlockModel;
import js.ImportStatement.FileImportBlock;

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

}
