package Lesson_6.CircleCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.setHeight(1.0);
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", height=" + getHeight() + ", color=" + getColor() + "]";
    }
}
