package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ExpressionSequence;
import js.statements.Loops.*;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

public class AntlrToIterationStatement extends JSParserBaseVisitor<IterationStatement> {
    public String filePath;

    public AntlrToIterationStatement(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public IterationStatement visitDoWhileStatement(JSParser.DoWhileStatementContext ctx) {
        ExpressionSequence expressions = new ExpressionSequence(ctx.expressionSequence(), filePath);

        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        Statement statement = statementVisitor.visit(ctx.statement());

        return new DoWhileLoop(statement, expressions);
    }

    @Override
    public IterationStatement visitWhileStatement(JSParser.WhileStatementContext ctx) {
        ExpressionSequence expressions = new ExpressionSequence(ctx.expressionSequence(), filePath);

        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        Statement statement = statementVisitor.visit(ctx.statement());

        return new WhileLoop(statement, expressions);
    }

    @Override
    public IterationStatement visitForStatement(JSParser.ForStatementContext ctx) {
        AntlrToStatement visitor = new AntlrToStatement(filePath);
        int i = 2;
        Statement firstPart = null;
        if (!ctx.getChild(i++).getText().equals(";")) {
            firstPart = visitor.visit(ctx.getChild(i - 1));
        }
        Statement secondPart = null;
        if (!ctx.getChild(i++).getText().equals(";")) {
            secondPart = visitor.visit(ctx.getChild(i - 1));
        }
        Statement thirdPart = null;
        if (!ctx.getChild(i++).getText().equals(")")) {
            thirdPart = visitor.visit(ctx.getChild(i - 1));
        }
        Statement statement = visitor.visit(ctx.statement());

        return new ForLoop(firstPart, secondPart, thirdPart, statement);
    }

    @Override
    public IterationStatement visitForInStatement(JSParser.ForInStatementContext ctx) {
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        Statement firstPart = statementVisitor.visit(ctx.getChild(2));

        ExpressionSequence expressions = new ExpressionSequence(ctx.expressionSequence(), filePath);

        Statement statement = statementVisitor.visit(ctx.statement());

        return new ForInLoop(firstPart, expressions, statement);
    }

    @Override
    public IterationStatement visitForOfStatement(JSParser.ForOfStatementContext ctx) {
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        Statement firstPart = statementVisitor.visit(ctx.getChild(2));

        ExpressionSequence expressions = new ExpressionSequence(ctx.expressionSequence(), filePath);

        Statement statement = statementVisitor.visit(ctx.statement());

        return new ForOfLoop(firstPart, expressions, statement);
    }
}
