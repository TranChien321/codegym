package Lesson_12.TH;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 31);
        hashMap.put("Lewis", 29);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String, Integer> treeMap = new java.util.TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> LinkedHashMap = new java.util.LinkedHashMap<>(16, 0.75f, true);
        LinkedHashMap.put("Smith", 30);
        LinkedHashMap.put("Anderson", 31);
        LinkedHashMap.put("Lewis", 29);
        LinkedHashMap.put("Cook", 29);
        System.out.println("The age for " + "Lewis is " + LinkedHashMap.get("Lewis"));

    }
}
