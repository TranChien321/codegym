package Lesson_19.ValidateNameClass;

public class ClassNameTest {
    public static void main(String[] args) {
        ClassName className = new ClassName("C0220G1");
        System.out.println(className.validate(className.getClassName()));
        className = new ClassName("C0220G");
        System.out.println(className.validate(className.getClassName()));
        className = new ClassName("C0220G1A");
        System.out.println(className.validate(className.getClassName()));
        className = new ClassName("C0220G1_");
        System.out.println(className.validate(className.getClassName()));

    }
}
