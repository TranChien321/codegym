package Lesson_9.FizzBuzzTranslate;

import java.util.Scanner;

public class FizzBuzzTranslate {
    public static String fizzBuzz(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Chỉ hỗ trợ số từ 1 đến 99");
        }

        boolean isFizz = number % 3 == 0 || String.valueOf(number).contains("3");
        boolean isBuzz = number % 5 == 0 || String.valueOf(number).contains("5");

        if (isFizz && isBuzz) return "FizzBuzz";
        if (isFizz) return "Fizz";
        if (isBuzz) return "Buzz";

        return readNumber(number);
    }

    public static String readNumber(int number) {
        String[] digits = {"không", "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};
        if (number < 10) {
            return digits[number];
        }
        int tens = number / 10;
        int ones = number % 10;
        return digits[tens] + " " + digits[ones];
    }
}