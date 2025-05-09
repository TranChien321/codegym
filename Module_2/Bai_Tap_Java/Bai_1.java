package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");

        int number = scanner.nextInt();

        if( number % 2 == 0 )
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}
