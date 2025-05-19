package Lesson_7.Resizeable;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[]{
                new Circle(6),
                new Rectangle(9, 15),
                new Square(3)
        };

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double percent = rand.nextInt(100) + 1;

            double areaBefore = 0;
            double areaAfter = 0;

            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                areaBefore = Math.PI * Math.pow(c.getRadius(), 2);
                c.resize(percent);
                areaAfter = Math.PI * Math.pow(c.getRadius(), 2);
            } else if (shape instanceof Square) {
                Square s = (Square) shape;
                double side = s.getWidth();
                areaBefore = side * side;
                s.resize(percent);
                side = s.getWidth();
                areaAfter = side * side;
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                areaBefore = r.getWidth() * r.getHeight();
                r.resize(percent);
                areaAfter = r.getWidth() * r.getHeight();
            }

            System.out.printf("%s\nTăng %.0f%%\nDiện tích trước: %.2f\nDiện tích sau: %.2f\n\n",
                    shape.getClass().getSimpleName(), percent, areaBefore, areaAfter);
        }
    }
}

