package Lesson_1;

import java.util.Scanner;

public class Bai_CurrencyConverterApp {
    public static void main(String[] args) {
        double vnd = 25000;
        double usd;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of USD: ");
        usd = sc.nextDouble();

        double result = usd * vnd;
        System.out.println("The amount of VND is " + result);
    }
}
