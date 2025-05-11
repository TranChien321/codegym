package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập điểm môn Toán: ");
        int mathScore = scanner.nextInt();

        System.out.print("Nhập điểm môn Lý: ");
        int logicScore = scanner.nextInt();

        System.out.print("Nhập điểm môn Hoá: ");
        int chemistryScore = scanner.nextInt();

        int averageScore = (mathScore + logicScore + chemistryScore) / 3;
        System.out.println("Điểm trung bình: " + averageScore);

        if ( averageScore >= 8 ) {
            System.out.println("Học sinh giỏi");
        } else if ( averageScore >= 6.5 ) {
            System.out.println("Học sinh khá");
        } else if ( averageScore >= 5 ) {
            System.out.println("Học sinh trung bình");
        } else {
            System.out.println("Học sinh yếu");
        }
    }
}
