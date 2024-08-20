import program.ProgramJS;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException, IllegalAccessException {
        File root = new File(args[0]);
        if (!root.exists() || !root.isDirectory()) {
            System.err.println("Please Enter A Valid Project Root Folder.");
            return;
        }
        File indexJS = new File(root.getPath() + "\\index.js");
        File indexHTML = new File(root.getPath() + "\\index.html");
        if (!indexJS.exists()) {
            System.err.println("Missing Index.js");
            return;
        }
        if (!indexHTML.exists()) {
            System.err.println("Missing Index.html");
            return;
        }
        String[] s = {indexJS.getPath()};
        ProgramJS.main(s);
    }
}