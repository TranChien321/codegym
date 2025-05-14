package Lesson_5.student;

public class TestStudentClass {
    public static void main(String[] args) {
        Student studentClass1 = new Student();

        Student studentClass2 = new Student();
        studentClass2.setName("Hoang");
        studentClass2.setClasses("C002");

        System.out.println(studentClass2.studentDisplay());
        System.out.println(studentClass1.studentDisplay());
    }
}
