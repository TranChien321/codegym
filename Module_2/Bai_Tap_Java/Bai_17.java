package Bai_Tap_Java;

import java.util.Scanner;

public class Bai_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Number: ");
        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("Array: " + java.util.Arrays.toString(array));

        int max = array[0];
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(max > array[i]){
                min = array[i];
            } else {
                max = array[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
