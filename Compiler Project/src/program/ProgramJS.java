package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import js.AntlrToProgram;
import js.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramJS {
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("fuck you");
        } else {
            JSParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram();
            JsProgram doc = progVisitor.visit(antlrAST);
            System.out.println(doc);
        }

    }

    private static JSParser getParser(String filename) {
        JSParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            JSLexer lexer = new JSLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new JSParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parser;
    }

}
