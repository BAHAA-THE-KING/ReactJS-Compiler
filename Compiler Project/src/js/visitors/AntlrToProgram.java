package js.visitors;

import antlrJS.JSParser;
import antlrJS.JSParserBaseVisitor;
import js.visitors.models.JsProgram;
import js.visitors.models.Statement;

public class AntlrToProgram extends JSParserBaseVisitor<JsProgram> {
    public String filePath ;

    public AntlrToProgram(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public JsProgram visitProgram(JSParser.ProgramContext ctx) {
        JsProgram program = new JsProgram();
        AntlrToStatement statementVisitor = new AntlrToStatement(filePath);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            Statement s = statementVisitor.visit(ctx.getChild(i));
            program.addStatement(s);
        }
        return program;
    }
}
