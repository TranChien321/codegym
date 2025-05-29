package Lesson_16.Copy_file_text;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReaderWriteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String sourceFile = scanner.nextLine();
        System.out.println("Nhập tên đích: ");
        String targetFile = scanner.nextLine();
        scanner.close();

        copyFile(sourceFile, targetFile);
    }

    public static void copyFile(String sourceFile, String targetFile) {
        File source = new File(sourceFile);
        File target = new File(targetFile);

        if (!source.exists()) {
            System.out.println("File source không tồn tại");
            return;
        }
        if (!target.exists()) {
            System.out.println("File target không tồn tại");
            return;
        }

        try (FileReader reader = new FileReader(source);
             FileWriter writer = new FileWriter(target)) {

            int ch;
            int charCount = 0;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
                charCount++;
            }
            System.out.println("Sao chép hoàn tất. Số ký tự trong tệp: " + charCount);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tệp: " + e.getMessage());
        }
    }
}