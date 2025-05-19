package Lesson_6.Point2D_Point3D;

public class Demo {
    public static void main(String[] args) {

        Point2D p2d = new Point2D(1, 2);
        System.out.println(p2d);
        p2d.move(3, 4);
        System.out.println("Sau khi di chuyển " + p2d);

        Point3D p3d = new Point3D(1, 2, 3);
        System.out.println(p3d);
        p3d.move(3, 4, 5);
        System.out.println("Sau khi di chuyển " + p3d);
    }
}
