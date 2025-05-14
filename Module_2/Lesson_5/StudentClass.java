package Lesson_5;

public class StudentClass {
    private String name = "Jone";
    private String classes = "C001";

    public StudentClass(){}

    public void setName(String name){
        this.name = name;
    }

    public void setClasses(String classes){
        this.classes = classes;
    }

    public String StudentDisplay(){
        return "Student Name: " + name + ", Class: " + classes;
    }
}
