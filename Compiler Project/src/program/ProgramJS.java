package program;

import antlrJS.JSLexer;
import antlrJS.JSParser;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import js.SymbolTable.Symbolable;
import js.visitors.AntlrToProgram;
import js.visitors.models.JsProgram;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;


public class ProgramJS {
    public static List<String> errors = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("fuck you");
        } else {
            JSParser parser = getParser(args[0]);
            ParseTree antlrAST = parser.program();
            AntlrToProgram progVisitor = new AntlrToProgram(args[0]);
            JsProgram doc = progVisitor.visit(antlrAST);
            Symbolable s = SymbolTableVisitor.visit(doc);
            ObjectMapper mapper = new ObjectMapper();
            mapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
            for (String err : errors) {
                System.err.println(err);
            }
            String result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
            System.out.println(result);
            new visualizeJSON(result);
            File file = new File("ast.json");
            FileWriter fw = new FileWriter(file);
            fw.write(result);
            fw.close();
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


class visualizeJSON extends JFrame {

    public visualizeJSON(String jsonString) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            JsonNode jsonNode = mapper.readTree(jsonString);
            DefaultMutableTreeNode rootNode = createTreeNode("JSON", jsonNode);
            JTree jsonTree = new JTree();
            jsonTree.setModel(new DefaultTreeModel(rootNode));

            JFrame treeFrame = new JFrame("JSON Tree");
            treeFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            treeFrame.setSize(400, 300);
            treeFrame.setLocationRelativeTo(null);
            treeFrame.add(new JScrollPane(jsonTree));
            treeFrame.setVisible(true);
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Invalid JSON format", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private DefaultMutableTreeNode createTreeNode(String nodeName, JsonNode node) {
        DefaultMutableTreeNode treeNode = new DefaultMutableTreeNode(nodeName + ": " + node.toString());

        if (node.isObject()) {
            node.fields().forEachRemaining(entry -> treeNode.add(createTreeNode(entry.getKey(), entry.getValue())));
        } else if (node.isArray()) {
            int i = 0;
            for (JsonNode element : node) {
                treeNode.add(createTreeNode("[" + i + "]", element));
                i++;
            }
        }

        return treeNode;
    }
}