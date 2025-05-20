package Lesson_9;

public class TriangleClassifier {
    public static String classify(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return "Không là tam giác";
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            return "Không là tam giác";
        }
        if (a == b && b == c) {
            return "Tam giác Đều";
        }
        if (a == b || b == c || c == a) {
            return "Tam giác Cân";
        }
        return "Tam giác Thường";
    }
}
