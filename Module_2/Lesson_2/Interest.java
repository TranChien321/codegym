package Lesson_2;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;

        System.out.print("Enter the amount of money: ");
        money = scanner.nextDouble();

        System.out.print("Enter the number of months: ");
        month = scanner.nextInt();

        System.out.print("Enter the interest rate: ");
        interestRate = scanner.nextDouble();

        double totalInterest = 0;
        for(int i = 0; i < month; i++){
            totalInterest += money * (interestRate / 100) / 12;

            System.out.printf("After month %d, the interest is %.2f\n", i+1, totalInterest);
        }
    }
}
