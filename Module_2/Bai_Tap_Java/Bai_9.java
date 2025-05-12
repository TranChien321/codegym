package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        double S = number * number * Math.PI;
        double P =  2 * number * Math.PI;

        System.out.println("S = " + S);
        System.out.println("P = " + P);

    }
}
