package Lesson_5;

public class TestStudentClass {
    public static void main(String[] args) {
        StudentClass studentClass1 = new StudentClass();

        StudentClass studentClass2 = new StudentClass();
        studentClass2.setName("Hoang");
        studentClass2.setClasses("C002");

        System.out.println(studentClass2.StudentDisplay());
        System.out.println(studentClass1.StudentDisplay());
    }
}
