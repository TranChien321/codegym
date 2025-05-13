package Lesson_3;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array:");
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();


        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        System.out.println("After remove: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
