package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number a: ");
        int a = scanner.nextInt();

        System.out.print("Enter Number b: ");
        int b = scanner.nextInt();

        if ( a == b ) {
            System.out.println("Bằng nhau");
        } else if (a > b){
            System.out.println("Sô a lớn hơn");
        } else {
            System.out.println("Sô b lớn hơn");
        }
    }
}
