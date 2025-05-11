package Lesson_2;

public class DisplayPrime2 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;

        while (count < 100) {
            if (isPrime(number)) {
                System.out.println(number + " ");
                count++;
            }
            number++;
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
