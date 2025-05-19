package Lesson_6.Circle_Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5,"red");

        System.out.println(circle1);
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder();
        Cylinder cylinder2 = new Cylinder(3.5, 3.8, "red");
        System.out.println(cylinder1);
        System.out.println(cylinder2);

        System.out.println("Thể tích = " + cylinder2.getVolume());
    }
}
