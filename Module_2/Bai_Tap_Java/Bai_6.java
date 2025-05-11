package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        System.out.println("Hello, my name is " + firstName + " and I am " + age + " years old.");
    }
}
