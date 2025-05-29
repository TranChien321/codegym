package Lesson_16.Read_File_Csv;

import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static void readFile(String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException("Tệp không tồn tại.");
            }

            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (FileNotFoundException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        ReadFile.readFile(path);
    }
}
