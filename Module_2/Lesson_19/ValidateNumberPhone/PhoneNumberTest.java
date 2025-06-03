package Lesson_19.ValidateNumberPhone;

import static Lesson_19.ValidateNumberPhone.PhoneNumber.isValidPhoneNumber;

public class PhoneNumberTest {
    public static void main(String[] args) {
        String[] testNumbers = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(01)-(0123456789)"
        };

        for (String number : testNumbers) {
            System.out.printf("Số '%s' hợp lệ? %b%n", number, isValidPhoneNumber(number));
        }
    }
}

