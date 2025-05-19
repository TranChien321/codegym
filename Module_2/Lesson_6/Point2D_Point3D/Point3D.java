package Lesson_6.Point2D_Point3D;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
        super();
        this.setZ(0.0f);
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.setZ(z);
    }


    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void move(double dx, double dy, double dz){
        super.move(dx, dy);
        this.z += dz;
    }

    @Override
    public String toString() {
        return "Point3D[x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
