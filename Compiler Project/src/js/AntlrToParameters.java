package js;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.Function.FormalParameter;

import java.util.ArrayList;
import java.util.List;

public class AntlrToParameters extends JSParserBaseVisitor<FormalParameter> {
    //TODO
    @Override
    public FormalParameter visitNormalParameters(JSParser.NormalParametersContext ctx) {
        List<String> parameters = new ArrayList<>();
        if (ctx != null) {
            for (int i = 0; i < ctx.getChildCount(); i += 2) {
                parameters.add(ctx.getChild(i).getChild(0).getText());
            }
            return new FormalParameter(parameters);
        }
        return super.visitNormalParameters(ctx);
    }
}
