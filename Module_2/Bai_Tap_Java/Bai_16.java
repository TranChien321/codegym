package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size Array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for( int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(array));

        for( int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("Element " + (i + 1) + " Số chẵn");
            } else {
                System.out.println("Element " + (i + 1) + " Số lẻ");
            }
        }
    }
}
