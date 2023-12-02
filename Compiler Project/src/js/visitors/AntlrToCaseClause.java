package js.visitors;


import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.ExpressionSequence;
import js.statements.SwitchStatement.CaseClause;
import js.statements.SwitchStatement.CaseClauses;
import js.visitors.models.Statement;

import java.util.ArrayList;
import java.util.List;

public class AntlrToCaseClause extends JSParserBaseVisitor<CaseClause> {
    public String filePath ;

    public AntlrToCaseClause(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public CaseClause visitCaseClause(JSParser.CaseClauseContext ctx) {
        AntlrToExpression vistor = new AntlrToExpression(filePath);
        List<Statement> statements = new ArrayList<>();
        AntlrToStatement visitStatement = new AntlrToStatement(filePath);
        ExpressionSequence expressionSequence = new ExpressionSequence(ctx.expressionSequence(),filePath);
        if (ctx.statementList()!=null) {
            for(int i=0; i< ctx.statementList().getChildCount();i++){
                statements.add(visitStatement.visit(ctx.statementList().getChild(i)));
            }
        }
        return new CaseClause(expressionSequence,statements);

    }

}
