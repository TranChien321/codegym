package Lesson_18.EvenOldThread;

public class Main {
    public static void main(String[] args) {
        OldThread oldThread = new OldThread();
        EvenThread evenThread = new EvenThread();

        Thread thread1 = new Thread(oldThread, "OldThread");
        Thread thread2 = new Thread(evenThread, "EvenThread");

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread2.start();
    }
}
