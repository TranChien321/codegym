package Lesson_19.ValidateNumberPhone;

public class PhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        return phoneNumber.matches(regex);
    }

}
