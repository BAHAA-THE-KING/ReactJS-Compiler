package program;

import antlrHTML.HTMLLexer;
import antlrHTML.HTMLParser;
import html.AntlrToHtmlDocument;
import html.HtmlDocument;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramHTML {
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("fuck you");
        } else {
            HTMLParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.htmlDocument();
            AntlrToHtmlDocument docVisitor = new AntlrToHtmlDocument();
            HtmlDocument doc = docVisitor.visit(antlrAST);
        }

    }

    private static HTMLParser getParser(String filename) {
        HTMLParser parser = null;
        try {
            CharStream input = CharStreams.fromFileName(filename);
            HTMLLexer lexer = new HTMLLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser = new HTMLParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return parser;
    }

}
