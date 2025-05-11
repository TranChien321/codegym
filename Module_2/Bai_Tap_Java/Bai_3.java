package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number Width: ");
        int width = scanner.nextInt();

        System.out.print("Enter Number Height: ");
        int height = scanner.nextInt();

        int Acreage = width * height;
        System.out.println("Acreage = " + Acreage);
    }
}
