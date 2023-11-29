package js;

import js.ClassDeclaration.ClassDeclaration;
import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.Block.BlockModel;
import js.ExportStatement.ExportBlock;
import js.ExportStatement.ExportDefaultDeclaration;
import js.Function.FormalParameter;
import js.Function.FunctionDeclaration;
import js.ImportStatement.FileImportBlock;
import org.antlr.v4.runtime.tree.ParseTree;

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
        System.out.println(classDeclaration.toString());
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


        return  visit(ctx.declaration().getChild(0));
    }

    @Override
    public Statement visitNormalParameters(JSParser.NormalParametersContext ctx) {
        List<String> parameters=new ArrayList<>();
        if (ctx != null) {
            for (int i=0; i<ctx.getChildCount(); i+=2) {
                parameters.add(ctx.getChild(i).getChild(0).getText());
            }
            return new FormalParameter(parameters);
        }
        return super.visitNormalParameters(ctx);
    }



    @Override
    public Statement visitFunctionDeclaration(JSParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.Identifier().getText();
       // FormalParameter p = new FormalParameter(parameters);


        List<String> parameters = new ArrayList<>();

        if (ctx.formalParameterList() != null) {

          for (int i = 0; i < ctx.formalParameterList().getChildCount(); i+=2) {

                parameters.add(ctx.formalParameterList().getChild(i).getText());

            }

        }
        // TODO add function Body
        FunctionDeclaration functionDeclaration = new FunctionDeclaration(functionName, parameters,null);

        System.out.println(functionDeclaration.toString());

        return functionDeclaration;
    }



    @Override
    public Statement visitArrowFunction(JSParser.ArrowFunctionContext ctx) {
        return super.visitArrowFunction(ctx);
    }
}
