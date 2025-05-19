package Lesson_6.Point2D_Point3D;

public class Point2D {
    protected double x,y;

    public Point2D() {
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Point2D[x=" + x + ", y=" + y + "]";
    }
}
