package Lesson_6.ThucHanh.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
