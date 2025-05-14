package Lesson_5.student;

public class Student {
    private String name = "Jone";
    private String classes = "C001";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String studentDisplay() {
        return "Student Name: " + name + ", Class: " + classes;
    }
}
