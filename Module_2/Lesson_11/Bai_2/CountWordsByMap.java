package Lesson_11.Bai_2;

import java.util.Map;
import java.util.TreeMap;

public class CountWordsByMap {
    public static void main(String[] args) {
        String input = "Hello this is Java";
        String[] words = input.split(" ");

        Map <String,Integer> uniqueWords =  new TreeMap<>();

        for(String word : words){
            uniqueWords.put(word, uniqueWords.getOrDefault(word, 0) + 1);
        }

        System.out.println(uniqueWords);
    }
}
