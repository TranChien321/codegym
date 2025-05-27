package Lesson_14.BT_2;

public class insertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list = {5,6,9,8,12,52,73,1,2,15,18,19,20,32};

        System.out.println("Trước khi sắp xếp:");
        display(list);

        insertionSort(list);

        System.out.println("Sau khi sắp xếp:");
        display(list);
    }

    public static void display(int[] list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}