package Lesson_18.EvenOldThread;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.println("EvenThread: " + i);
                }
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }
}
