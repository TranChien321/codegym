package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int number = scanner.nextInt();

        if ( number < 18 ) {
            System.out.println("Không đủ điều kiện");
        } else {
            System.out.println("Đủ điều kiện");
        }
    }
}
