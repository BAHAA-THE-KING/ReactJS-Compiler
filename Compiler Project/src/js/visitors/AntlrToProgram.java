package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.visitors.models.JsProgram;

public class AntlrToProgram extends JSParserBaseVisitor<JsProgram> {
    @Override
    public JsProgram visitProgram(JSParser.ProgramContext ctx) {
        JsProgram program = new JsProgram();
        AntlrToStatement statementVisitor = new AntlrToStatement();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            program.addStatement(statementVisitor.visit(ctx.getChild(i)));
        }
        return program;
    }
}
