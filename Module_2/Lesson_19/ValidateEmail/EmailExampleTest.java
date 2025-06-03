package Lesson_19.ValidateEmail;

public class EmailExampleTest {
    private  static EmailExample emailExample;
     public static final String[] validEmail = new String[]{"a@gmail.com", "tranchienn@gmail.com", "nnntqư@gmail.com", "abc@gmail.com.vn", "abc@yahoo.com", "abc@live.com"};
     public static final String[] invalidEmail = new String[]{"@gmail.com", "abcd@", "@#@%@gmail.com", "abc@gmail.com.com.vn", "abc@.com", "abc@.com.vn"};

    public static void main(String[] args) {
         emailExample = new EmailExample();
         for( String email: validEmail){
             boolean isValid = emailExample.validate(email);
              System.out.println("Email is " + email +" is valid: "+ isValid);
         }
          for( String email: invalidEmail){
             boolean isValid = emailExample.validate(email);
              System.out.println("Email is " + email +" is valid: "+ isValid);
         }
    }
}
