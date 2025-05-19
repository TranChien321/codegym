package Lesson_6.Point_MoveablePoint;

public class Demo {
    public static void main(String[] args) {
        Point point = new Point(1.0f, 2.0f);
        System.out.println(point);

        MoveablePoint mp = new MoveablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("Before move: " + mp);
        mp.move();
        System.out.println("After move: " + mp);
    }
}
