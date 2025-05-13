package Lesson_4;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {

        int[] arr = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100000);
        }

        StopWatch sw = new StopWatch();
        sw.start();

        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        sw.stop();

        System.out.println("Time elapsed: " + sw.getElapsedTime() + " milliseconds");
    }
}

