package Lesson_11.Bai_1;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String input = "Hello this is Java";
        String[] words = input.split(" ");
        Stack<String> stack = new Stack<>();

        for (String word : words) {
            stack.push(word);
        }
        StringBuilder  reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop()).append(" ");
        }
        System.out.println("Chuỗi ban đầu: " + input);
        System.out.println("Chuỗi sau khi đảo ngược từ:" + reversed.toString().trim());
    }
}
