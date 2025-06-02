package Lesson_18.NumberGenerator;

public class Main {
    public static void main(String[] args) {

        NumberGenerator generator1 = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();


        Thread thread1 = new Thread(generator1, "Thread-1");
        Thread thread2 = new Thread(generator2, "Thread-2");

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
    }
}
