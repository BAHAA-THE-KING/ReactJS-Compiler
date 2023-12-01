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
        FormalParameter formal = new FormalParameter();
        if (ctx != null) {
            for (int i = 0; i < ctx.getChildCount(); i += 2) {
                formal.addParameter(ctx.getChild(i).getChild(0).getText());
            }
            return formal;
        }
        return super.visitNormalParameters(ctx);
    }
}
