import program.ProgramHTML;
import program.ProgramJS;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) throws IOException, IllegalAccessException {
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
        File output = new File(root.getPath() + "\\result");
        if (output.exists()) {

            Files.walkFileTree(output.toPath(), new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    // Delete each file
                    Files.delete(file);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
                    // Delete the directory after its contents have been deleted
                    Files.delete(dir);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                    // If file visit fails, throw the exception to stop the process
                    throw exc;
                }
            });

        }
        Files.createDirectory(output.toPath());
        String[] jsPaths = {indexJS.getPath(), output.getPath()};
        ProgramJS.main(jsPaths);
        String[] htmlPaths = {indexHTML.getPath(), output.getPath()};
        ProgramHTML.main(htmlPaths);
        Desktop desktop = Desktop.getDesktop();
        File entryPoint = new File(output.getPath() + "\\index.html");
        desktop.browse(entryPoint.toURI());
        File file = new File(output + "\\images");
        Files.createDirectory(file.toPath());

        for (String filePath : ProgramJS.InjectPaths) {
            filePath = filePath.substring(1, filePath.length() - 1);
            Path sourcePath = Paths.get(root.getPath(), filePath);
            System.out.println(sourcePath);
            Path destinationPath = Paths.get(output.getPath(), filePath);
            Files.copy(sourcePath, destinationPath);
        }
    }
}