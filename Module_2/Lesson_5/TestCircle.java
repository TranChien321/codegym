package Lesson_5;

public class TestCircle {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(10);

        System.out.println("Circle 1");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.getArea());

        System.out.println("Circle 2");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.getArea());
    }
}
