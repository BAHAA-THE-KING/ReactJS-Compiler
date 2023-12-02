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

    @Override
    public CaseClause visitCaseClause(JSParser.CaseClauseContext ctx) {
        AntlrToExpression vistor = new AntlrToExpression();
        List<Statement> statements = new ArrayList<>();
        ExpressionSequence expressionSequence = new ExpressionSequence(ctx.expressionSequence());
        if (ctx.statementList()!=null) {
            for(int i=0; i< ctx.statementList().getChildCount();i++){
                statements.add(visit(ctx.statementList().getChild(i)));
            }
        }
        return new CaseClause(expressionSequence,statements);

    }

}
