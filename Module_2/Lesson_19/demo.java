package Lesson_19;

public class demo {
    public static void main(String[] args) {
        ValidateName validator = new ValidateName();

        System.out.println(validator.validate("BOOK-1234")); // true
        System.out.println(validator.validate("NV-5678"));   // true
        System.out.println(validator.validate("HV-0001"));   // true
        System.out.println(validator.validate("BOOK-12A4")); // false
        System.out.println(validator.validate("NV-123"));    // false
        System.out.println(validator.validate("HV-12345"));  // false
    }
}
