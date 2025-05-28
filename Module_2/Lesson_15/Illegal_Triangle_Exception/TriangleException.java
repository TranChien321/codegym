package Lesson_15.Illegal_Triangle_Exception;

import java.util.Scanner;

public class TriangleException  {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Hãy nhập cạnh x: ");
            double x = scanner.nextInt();

            System.out.println("Hãy nhập cạnh y");
            double y = scanner.nextInt();

            System.out.println("Hãy nhập cạnh z");
            double z = scanner.nextInt();

            checkTriangle(x, y, z);
            System.out.println("Đây là tam giác");
        } catch (IllegalTriangleException e) {
            System.err.println("Đây không phải là tam giác");
        }
    }

    public static void checkTriangle(double x, double y, double z) throws IllegalTriangleException {
        if (x <= 0 || y <= 0 || z <= 0) {
            throw new IllegalTriangleException("Cạnh tam giác không thể nhỏ hơn hoặc bằng 0");
        }
        if (x + y <= z || x + z <= y || y + z <= x) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
    }
}