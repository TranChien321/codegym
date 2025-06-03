package Lesson_19;

public class ValidateName {
    public boolean validate(String code) {
        return code.matches("BOOK-\\d{4}") ||
                code.matches("NV-\\d{4}") ||
                code.matches("HV-\\d{4}");
    }
}
