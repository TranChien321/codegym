package Lesson_10.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(5);

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("List sau khi thêm phần tử: " + list);

        System.out.println("Size: " + list.size());

        System.out.println("Chứa 20? " + list.contains(20));
        System.out.println("Chứa 40? " + list.contains(40));

        System.out.println("Phần tử tại index 1: " + list.get(1));

        list.remove(1);
        System.out.println("Sau khi xóa index 1: " + list);

        System.out.println("Vị trí của 30: " + list.indexOf(30));

        list.ensureCapacity(10);
        list.add(40);
        list.add(50);
        System.out.println("Danh sách sau khi thêm phần tử: " + list);
        System.out.println("Kích thước: " + list.size());
    }
}

