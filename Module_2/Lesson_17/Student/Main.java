package Lesson_17.Student;

import java.util.ArrayList;
import java.util.List;

import static Lesson_17.Student.Student.writeDataToFile;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Nguyễn Văn A", "Hải Dương"));
        students.add(new Student(2, "Nguyễn Văn B", "Long An"));
        students.add(new Student(3, "Nguyễn Văn C", "Hà Nội"));
        students.add(new Student(4, "Nguyễn Văn D", "Huế"));
        students.add(new Student(5, "Nguyễn Văn E", "Đà Nẵng"));

        writeDataToFile("student.txt", students);
        List<Student> students1 = Student.readDataFromFile("student.txt");
        for (Student student : students1) {
            System.out.println(student);
        }
    }
}
