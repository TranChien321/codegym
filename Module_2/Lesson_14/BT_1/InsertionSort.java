package Lesson_14.BT_1;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chế độ:");
        System.out.println("1. Sử dụng mảng mẫu");
        System.out.println("2. Nhập mảng từ bàn phím");
        int choice = sc.nextInt();

        int[] arr;
        if (choice == 1) {
            arr = new int[]{6, 5, 3, 1, 8, 7, 2, 4};
        } else {
            System.out.println("Enter Size Number: ");
            int size = sc.nextInt();
            arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.print("Enter element " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
            }
        }

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Mảng đã sắp xếp:");
        printArray(arr);
    }

    // Hàm thực hiện thuật toán sắp xếp chèn và hiển thị các bước
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            System.out.println("Bước " + i + ": Đang chèn phần tử " + key);

            // Di chuyển các phần tử lớn hơn key về phía sau
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.print("Trạng thái mảng sau bước " + i + ": ");
            printArray(arr);
            System.out.println("-----------------------------");
        }
    }

    // Hàm in mảng
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
