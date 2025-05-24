package Lesson_11.MyGenericStack;

import static Lesson_11.MyGenericStack.MyGenericStack.stackOfIStrings;
import static Lesson_11.MyGenericStack.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
