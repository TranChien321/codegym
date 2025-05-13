package Lesson_3;

import java.util.Scanner;

public class SmallestValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            if (size < 20) {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            } else {
                System.out.println("The array is too large!");
                break;
            }
        }
        int min = findMin(array);
        System.out.println("The smallest value in the array is: " + min);
    }
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}