package Lesson_1;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {

    // Tạo đối tượng nhập
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");

    // Nhập số nguyên từ bàn phím
        int number = scanner.nextInt();

        String result = readNumber(number);
        System.out.println("Number in words: " + result);

    }

    // Phương thức chuyển đổi số nguyên thành chuỗi
    public static String readNumber(int number) {
        if (number < 0 || number > 999) {
            return "Invalid number";
        }
        // Mảng chứa các số từ 0 đến 9
        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        // Mảng chứa các số từ 10 đến 19
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        // Mảng chứa các số từ 20 đến 90
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        StringBuilder result = new StringBuilder();

        // Kiểm tra nếu số là 0
        if (number == 0) {
            return "zero";
        }

        if (number >= 100) {
            result.append(units[number / 100]).append(" hundred");
            number %= 100;
            if (number > 0) {
                result.append(" and ");
            }
        }

        if (number >= 20) {
            result.append(tens[number / 10]);
            number %= 10;
            if (number > 0) {
                result.append(" ").append(units[number]);
            }
        } else if (number >= 10) {
            result.append(teens[number - 10]);
        } else if (number > 0) {
            result.append(units[number]);
        }

        return result.toString();
    }
}
