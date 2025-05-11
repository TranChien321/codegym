package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Please enter a non-negative number");
            return;
        }

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

    }
}
