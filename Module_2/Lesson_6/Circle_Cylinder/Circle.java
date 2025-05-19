package Lesson_6.Circle_Cylinder;

// Lớp Circle
public class Circle {
    private double radius;
    private String color;

    // Constructor mặc định
    public Circle() {
        this.setRadius(1.0);
        this.setColor("red");
    }

    // Constructor có tham số
    public Circle(double radius, String color) {
        this.setRadius(radius);
        this.setColor(color);
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }
    //Ghi đè toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}