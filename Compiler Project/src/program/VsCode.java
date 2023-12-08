package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class VsCode {
    public static String OS="win";

    private static void openFile(boolean ast){
        String root = Paths.get(System.getProperty("user.dir")).toString();
        String command = "cd %s & code --new-window -r  %s".formatted(root,ast?ProgramJS.AST_FILE_NAME:ProgramJS.SYMB_FILE_NAME);
        System.out.printf("Opening %s in VsCode...%n",ast?"AST Tree":"Symbol Table");
        try {
            executeCommand(command);
            System.out.println("Success!");
        } catch (Exception e) {
            System.err.println("Fail! Want to know the reason?(Default:yes)");
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine().trim();
            boolean wantToKnow = !userInput.isEmpty() && Boolean.parseBoolean(userInput);
            if(wantToKnow)e.printStackTrace();
            System.out.printf("Results were put in %s\\%s .%n", root,ast?ProgramJS.AST_FILE_NAME:ProgramJS.SYMB_FILE_NAME);
        }
    }
    public static void openAstTree(){
        openFile(true);
    }
    public static void openSymbolTree(){
        openFile(false);
    }

    public static void executeCommand(String customCommand) throws Exception {
        // Create a ProcessBuilder with the specified custom command
        ProcessBuilder processBuilder = new ProcessBuilder(OS.equals("win")?"cmd":"bash", "/c", customCommand);
        // Redirect error stream to output stream
        processBuilder.redirectErrorStream(true);

        // Start the process
        Process process = processBuilder.start();

        // Read the output of the command
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
//            System.out.println(line);
        }
        // Wait for the process to complete
        int exitCode = process.waitFor();
//        System.out.println("Command exited with code " + exitCode);
    }
}
