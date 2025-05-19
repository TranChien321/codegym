package Lesson_7.Resizeable;


public interface Resizeable {
    void resize(double percent);
}

class Circle implements Resizeable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void resize(double percent) {
        radius += radius * percent / 100;
    }
}


class Rectangle implements Resizeable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void resize(double percent) {
        width += width * percent / 100;
        height += height * percent / 100;
    }
}


class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }
}


