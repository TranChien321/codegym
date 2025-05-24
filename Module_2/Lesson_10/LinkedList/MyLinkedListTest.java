package Lesson_10.LinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.add(1, 15);

        System.out.println("Kích thước: " + list.size());
        System.out.println("Phần tử đầu: " + list.getFirst());
        System.out.println("Phần tử cuối: " + list.getLast());
        System.out.println("Phần tử tại index 2: " + list.get(2));
        System.out.println("Chứa 20? " + list.contains(20));
        System.out.println("Vị trí của 30: " + list.indexOf(30));

        list.remove(1);
        System.out.println("Sau khi xoá index 1, phần tử tại index 1 là: " + list.get(1));

    }
}
