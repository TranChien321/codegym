package Lesson_3;

import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] Students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a student name: ");
        String name = scanner.nextLine();

        boolean isExist = false;
        for (int i = 0; i < Students.length; i++) {
            if (Students[i].equals(name)) {
                System.out.println("Student " + name + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println("Student " + name + " is not exist!");
    }
}
