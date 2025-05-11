package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
