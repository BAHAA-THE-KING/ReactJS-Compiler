package program;

import antlrHTML.HTMLLexer;
import antlrHTML.HTMLParser;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import html.AntlrToHtmlDocument;
import html.HtmlDocument;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProgramHTML {
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("Please Choose An HTML File.");
        } else if (args.length == 1) {
            HTMLParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.htmlDocument();
            AntlrToHtmlDocument docVisitor = new AntlrToHtmlDocument(args[0]);
            HtmlDocument doc = docVisitor.visit(antlrAST);
            if (errors.isEmpty()) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
                String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(doc);
                System.out.println(result);
            } else {
                for (String err : errors) {
                    System.err.println(err);
                }
            }
        } else if (args.length == 2) {
            HTMLParser parser = getParser(args[0]);
            String outputDir = args[1];
            ParseTree antlrAST = parser.htmlDocument();
            AntlrToHtmlDocument docVisitor = new AntlrToHtmlDocument(args[0]);
            HtmlDocument doc = docVisitor.visit(antlrAST);
            if (errors.isEmpty()) {
                ObjectMapper mapper = new ObjectMapper();
                mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
                String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(doc);
                saveCodeInFile(doc.toString(), outputDir);
            } else {
                for (String err : errors) {
                    System.err.println(err);
                }
            }

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

    private static void saveCodeInFile(String code, String outputDir) throws IOException {
        FileWriter fileWriter = new FileWriter(outputDir + "\\index.html");
        fileWriter.write(code);
        fileWriter.close();
    }

}
