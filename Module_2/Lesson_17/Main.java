package Lesson_17;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream on = null;
        try {
            is = new FileInputStream(source);
            on = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                on.write(buffer, 0, length);
            }
        } finally {
            is.close();
            on.close();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter source file: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Enter destination file: ");
        String destinationPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        try {
            copyFileUsingJava7Files(sourceFile, destinationFile);
            System.out.println("Copy completed");
        } catch (IOException ioe) {
            System.out.println("Can't copy that file");
            System.out.println(ioe.getMessage());
        }
    }
}
