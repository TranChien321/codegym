package Lesson_1;

public class ReadNumber {
    public static void main(String[] args) {
        int number = 110;
        String result = readNumber(number);
        System.out.println(result);
    }
    public static String readNumber(int number) {
        if (number < 0 || number > 999) {
            return "Invalid number";
        }

        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        StringBuilder result = new StringBuilder();

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
