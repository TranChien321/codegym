package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number a: ");
        int a = sc.nextInt();
        System.out.println("Enter Number b: ");
        int b = sc.nextInt();

        int sum = a + b;
        int signal = a - b;
        int core = a * b;
        int divide = a / b;

        System.out.println(sum);
        System.out.println(signal);
        System.out.println(core);
        System.out.println(divide);
    }
}
