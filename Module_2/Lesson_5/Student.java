package Lesson_5;

public class Student {
    private String name;
    private int rollno;
    private static String college = "BBDIT";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change(){
        college = "CODEGYM";
    }

    void display(){
        System.out.println("Name: " + name);
        System.out.println("Rollno: " + rollno);
        System.out.println("College: " + college);
    }
}
