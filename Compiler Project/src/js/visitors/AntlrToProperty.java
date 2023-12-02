package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.expressions.Properties.ComputedProperty;
import js.expressions.Properties.EllipsisProperty;
import js.expressions.Properties.FunctionProperty;
import js.expressions.Properties.NormalProperty;
import js.statements.Function.FunctionDeclaration;
import js.visitors.models.*;
import org.antlr.v4.runtime.misc.Pair;
import program.Error;
import program.ProgramJS;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProperty extends JSParserBaseVisitor<Property> {
    public String filePath;

    public AntlrToProperty(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public Property visitPropertyExpressionAssignment(JSParser.PropertyExpressionAssignmentContext ctx) {
        AntlrToPropertyName nameVisitor = new AntlrToPropertyName(filePath);
        AntlrToExpression valueVisitor = new AntlrToExpression(filePath);
        PropertyName key =nameVisitor.visit(ctx.propertyName());
        Expression value=valueVisitor.visit(ctx.singleExpression());
        return new NormalProperty(key,value);
    }

    @Override
    public Property visitComputedPropertyExpressionAssignment(JSParser.ComputedPropertyExpressionAssignmentContext ctx) {
        AntlrToExpression visitor = new AntlrToExpression(filePath);
        Expression key = visitor.visit(ctx.singleExpression(0));
        Expression value = visitor.visit(ctx.singleExpression(1));
        return new ComputedProperty(key,value);
    }

    @Override
    public Property visitFunctionProperty(JSParser.FunctionPropertyContext ctx) {
        FunctionProperty property = new FunctionProperty();
        AntlrToExpression expressionVisitor = new AntlrToExpression(filePath);
        AntlrToAssignable assignableVisitor = new AntlrToAssignable(filePath);
        var allParameters = ctx.formalParameterList();
        for (int i = 0; i < allParameters.formalParameterArg().size(); i++) {
            Assignable name = assignableVisitor.visit(allParameters.formalParameterArg(i).assignable());
            Expression value = allParameters.formalParameterArg(i).singleExpression() != null ? expressionVisitor.visit(allParameters.formalParameterArg(i).singleExpression()) : null;
            boolean success=property.addParameter(name, value);

            if(!success){
                String msg = "Parameter %s is already defined.".formatted(name);
                Error.jsError(allParameters.formalParameterArg(i).assignable(),filePath,msg);
            }
        }
        Expression spreadParameter = allParameters.lastFormalParameterArg() != null ? expressionVisitor.visit(allParameters.lastFormalParameterArg()) : null;
        property.setSpreadParameter(spreadParameter);

        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        var functionBody = ctx.functionBody();
        for (int i = 0; i < functionBody.statement().size(); i++) {
            property.addStatement(statementVisitor.visit(functionBody.statement(i)));
        }
        return property;
    }

    @Override
    public Property visitPropertyShorthand(JSParser.PropertyShorthandContext ctx) {
        AntlrToExpression valueVisitor = new AntlrToExpression(filePath);
        Expression value = valueVisitor.visit(ctx.singleExpression());
        if(!(value instanceof ObjectLiteral)){
            Error.jsError(
                    ctx.singleExpression(),
                    filePath,
                    "You can only spread objects inside an object."
            );
            return null;
        }else{
            return new EllipsisProperty((ObjectLiteral) value);
        }
    }
}
