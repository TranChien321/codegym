package Lesson_13.TH;

import static Lesson_13.TH.BinarySearch.binarySearch;
import static Lesson_13.TH.BinarySearch.list;

public class Demo {
    public static void main(String[] args) {
        System.out.println(binarySearch(list,5));
        System.out.println(binarySearch(list,6));
        System.out.println(binarySearch(list,7));
        System.out.println(binarySearch(list,8));
        System.out.println(binarySearch(list,9));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,11));
    }
}
