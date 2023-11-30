package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.statements.ConditionalStatement.ConditionalStatement;
import js.statements.Loops.*;
import js.visitors.models.Expression;
import js.visitors.models.IterationStatement;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class AntlrToIterationStatement extends JSParserBaseVisitor<IterationStatement> {
    @Override
    public IterationStatement visitDoWhileStatement(JSParser.DoWhileStatementContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        for (var expression : ctx.expressionSequence().singleExpression()) {
            expressions.add(expressionVisitor.visit(expression));
        }

        AntlrToStatement statementVisitor = new AntlrToStatement();
        Statement statement = statementVisitor.visit(ctx.statement());

        return new DoWhileLoop(statement, expressions);
    }

    @Override
    public IterationStatement visitWhileStatement(JSParser.WhileStatementContext ctx) {
        List<Expression> expressions = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        for (var expression : ctx.expressionSequence().singleExpression()) {
            expressions.add(expressionVisitor.visit(expression));
        }

        AntlrToStatement statementVisitor = new AntlrToStatement();
        Statement statement = statementVisitor.visit(ctx.statement());

        return new WhileLoop(statement, expressions);
    }

    @Override
    public IterationStatement visitForStatement(JSParser.ForStatementContext ctx) {
        AntlrToStatement visitor = new AntlrToStatement();
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
        AntlrToStatement statementVisitor = new AntlrToStatement();
        Statement firstPart = statementVisitor.visit(ctx.getChild(2));

        List<Expression> expressions = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        for (var expression : ctx.expressionSequence().singleExpression()) {
            expressions.add(expressionVisitor.visit(expression));
        }

        Statement statement = statementVisitor.visit(ctx.statement());

        return new ForInLoop(firstPart, expressions, statement);
    }

    @Override
    public IterationStatement visitForOfStatement(JSParser.ForOfStatementContext ctx) {
        AntlrToStatement statementVisitor = new AntlrToStatement();
        Statement firstPart = statementVisitor.visit(ctx.getChild(2));

        List<Expression> expressions = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression();
        for (var expression : ctx.expressionSequence().singleExpression()) {
            expressions.add(expressionVisitor.visit(expression));
        }

        Statement statement = statementVisitor.visit(ctx.statement());

        return new ForOfLoop(firstPart, expressions, statement);
    }
}
