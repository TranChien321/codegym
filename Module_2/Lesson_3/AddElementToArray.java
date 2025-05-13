package Lesson_3;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to add: ");
        int number = scanner.nextInt();

        System.out.println("Enter the index to add the number: ");
        int index = scanner.nextInt();

        if (index < 0 || index > array.length) {
            System.out.println("Invalid index.");
        } else {
            int[] newArray = new int[array.length + 1];

            for (int i = 0, j = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = number;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }

            System.out.println("After add: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        }
    }
}
