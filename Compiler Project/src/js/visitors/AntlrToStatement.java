package js.visitors;

import js.expressions.ExpressionSequence;
import js.statements.BreakStatement.Break;
import js.statements.ClassDeclaration.ClassDeclaration;
import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.statements.Block.BlockModel;
import js.statements.ConditionalStatement.ConditionalStatement;
import js.statements.ContinueStatement.Continue;
import js.statements.ExportStatement.ExportBlock;
import js.statements.ExportStatement.ExportDefaultDeclaration;
import js.statements.ExpressionChunk.ExpressionChunk;
import js.statements.Function.FunctionDeclaration;
import js.statements.ImportStatement.DeafultAsImportBlock;
import js.statements.ImportStatement.FileImportBlock;
import js.statements.ImportStatement.ObjectImportBlock;
import js.statements.ReturnStatement.ReturnStatement;
//import js.statements.SwitchStatement.CaseClause;
import js.statements.SwitchStatement.CaseClauses;
import js.statements.SwitchStatement.DefaultClause;
import js.statements.SwitchStatement.SwitchStatement;
import js.statements.ThrowStatement.Throw;
import js.statements.TryStatement.CatchProduction;
import js.statements.TryStatement.FinallyProduction;
import js.statements.TryStatement.TryStatement;
import js.statements.VariableDeclarationStatement.VariableDeclaration;
import js.statements.VariableDeclarationStatement.VariableDeclarationStatement;
import js.visitors.models.Assignable;
import js.visitors.models.ClassElement;
import js.visitors.models.Expression;
import js.visitors.models.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;
import java.util.List;

public class AntlrToStatement extends JSParserBaseVisitor<Statement> {
    public String filePath ;
    public AntlrToStatement(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Statement visitImportChunk(JSParser.ImportChunkContext ctx) {
        return visit(ctx.importStatement());
    }

    @Override
    public Statement visitExpressionChunk(JSParser.ExpressionChunkContext ctx) {
        ExpressionSequence exps = new ExpressionSequence(ctx.expressionStatement().expressionSequence(),filePath);
        ExpressionChunk chunk = new ExpressionChunk(exps);

        return chunk;
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
        return visit(ctx.block());
    }

    @Override
    public Statement visitBlock(JSParser.BlockContext ctx) {

        if (ctx.statementList() == null) return new BlockModel();
        BlockModel block = new BlockModel();
        for (int i = 0; i < ctx.statementList().getChildCount(); i++) {
            block.addStatement(visit(ctx.statementList().getChild(i)));
        }
        return block;
    }

    @Override
    public Statement visitClassDeclaration(JSParser.ClassDeclarationContext ctx) {
        String id = ctx.Identifier().getText();
        String parent;
        if (ctx.classTail().Identifier() != null) {
            parent = ctx.classTail().Identifier().getText();
        } else {
            parent = "null";
        }
        ClassDeclaration classDeclaration = new ClassDeclaration(id, parent);
        var classElements = ctx.classTail().classElements();
        AntlrToClassElement visitor = new AntlrToClassElement(filePath);
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
    public Statement visitFunctionDeclaration(JSParser.FunctionDeclarationContext ctx) {
        String functionName = ctx.Identifier().getText();

        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        AntlrToAssignable assignableVisitor = new AntlrToAssignable(filePath);
        var allParameters = ctx.formalParameterList();
        List<Pair<Assignable, Expression>> parameters = new ArrayList<>();
        for (int i = 0; i < allParameters.formalParameterArg().size(); i++) {
            Assignable name = assignableVisitor.visit(allParameters.formalParameterArg(i).assignable());
            Expression value = allParameters.formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(allParameters.formalParameterArg(i).singleExpression()) : null;
            parameters.add(new Pair<>(name, value));
        }

        Expression spreadParameter = allParameters.lastFormalParameterArg() != null ? expressionVisitor.visit(allParameters.lastFormalParameterArg()) : null;

        List<Statement> body = new ArrayList<>();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var functionBody = ctx.functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            body.add(statementVisitor.visit(functionBody.statement(i)));
        }
        return new FunctionDeclaration(functionName, parameters, spreadParameter, body);
    }

    @Override
    public Statement visitReturnChunk(JSParser.ReturnChunkContext ctx) {
        ExpressionSequence expressions = new ExpressionSequence(ctx.returnStatement().expressionSequence(),filePath);

        return new ReturnStatement(expressions);
    }

    @Override
    public Statement visitIfStatement(JSParser.IfStatementContext ctx) {
        ExpressionSequence expressions = new ExpressionSequence(ctx.expressionSequence(),filePath);

        Statement statement = visit(ctx.statement(0));

        Statement elseStatement = ctx.statement().size() == 2 ? visit(ctx.statement(1)) : null;

        return new ConditionalStatement(expressions, statement, elseStatement);
    }

    @Override
    public Statement visitLoopChunk(JSParser.LoopChunkContext ctx) {
        AntlrToIterationStatement visitor = new AntlrToIterationStatement(filePath);
        return visitor.visit(ctx.iterationStatement());
    }

    @Override
    public Statement visitContinueChunk(JSParser.ContinueChunkContext ctx) {
        return new Continue();
    }

    @Override
    public Statement visitBreakChunk(JSParser.BreakChunkContext ctx) {
        return new Break();
    }

    @Override
    public Statement visitVariableDeclerationChunk(JSParser.VariableDeclerationChunkContext ctx) {
        var variableDeclarationList = ctx.variableStatement().variableDeclarationList();
        String modifier = variableDeclarationList.varModifier().getText();

        List<VariableDeclaration> vars = new ArrayList<>();
        AntlrToAssignable assignableVisitor = new AntlrToAssignable(filePath);
        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        for (var decl : variableDeclarationList.variableDeclaration()) {
            Assignable name = assignableVisitor.visit(decl.assignable());
            Expression value = decl.singleExpression() != null ? expressionVisitor.visit(decl.singleExpression()) : null;
            vars.add(new VariableDeclaration(name, value));
        }
        return new VariableDeclarationStatement(modifier, vars);
    }

    @Override
    public Statement visitTryChunk(JSParser.TryChunkContext ctx) {
        return visitTryStatement(ctx.tryStatement());
    }

    @Override
    public Statement visitTryStatement(JSParser.TryStatementContext ctx) {

        BlockModel block = (BlockModel) visit(ctx.block());
        CatchProduction catchPro = ctx.catchProduction() != null ? (CatchProduction) visit(ctx.catchProduction()) : null;

        FinallyProduction finallyPro = ctx.finallyProduction() != null ? (FinallyProduction) visit(ctx.finallyProduction()) : null;

        TryStatement tryState = new TryStatement(block, catchPro, finallyPro);
        return tryState;
    }

    @Override
    public Statement visitCatchProduction(JSParser.CatchProductionContext ctx) {

        AntlrToAssignable visitor = new AntlrToAssignable(filePath);

        Assignable exception = visitor.visit(ctx.assignable());
        BlockModel block = (BlockModel) visit(ctx.block());

        CatchProduction catchPro = new CatchProduction(exception, block);
        return catchPro;
    }

    @Override
    public Statement visitFinallyProduction(JSParser.FinallyProductionContext ctx) {
        BlockModel block = (BlockModel) visit(ctx.block());

        FinallyProduction finallyPro = new FinallyProduction(block);

        return finallyPro;
    }


    @Override
    public Statement visitSwitchChunk(JSParser.SwitchChunkContext ctx) {
        AntlrToExpression vistor = new AntlrToExpression(filePath);
        ExpressionSequence expressionSequence = new ExpressionSequence(ctx.switchStatement().expressionSequence(),filePath);
        CaseClauses cases = new CaseClauses();
        AntlrToCaseClause vis = new AntlrToCaseClause(filePath);
        var caseClauses = ctx.switchStatement().caseBlock().caseClauses();
        for (int i = 0; i < ctx.getChild(0).getChild(4).getChild(1).getChildCount(); i++) {
            cases.addCase(vis.visit(ctx.getChild(0).getChild(4).getChild(1).getChild(i)));
        }
        DefaultClause defaultClause = new DefaultClause(new ArrayList<>());
        if (ctx.switchStatement().caseBlock().defaultClause() != null) {
            List<Statement> statements = new ArrayList<>();
            for (int i = 0; i < ctx.switchStatement().caseBlock().defaultClause().statementList().getChildCount(); i++) {
                statements.add(visit(ctx.switchStatement().caseBlock().defaultClause().statementList().getChild(i)));
            }
            defaultClause = new DefaultClause(statements);
        }
        SwitchStatement s = new SwitchStatement(expressionSequence, cases, defaultClause);
        System.out.println(s.toString());
        return s;
//        return new SwitchStatement(expressionSequence,cases,defaultClause);
    }

    @Override
    public Statement visitThrowChunk(JSParser.ThrowChunkContext ctx) {
        ExpressionSequence expressions = new ExpressionSequence(ctx.throwStatement().expressionSequence(),filePath);

        return new Throw(expressions);
    }
}