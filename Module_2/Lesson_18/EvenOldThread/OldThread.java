package Lesson_18.EvenOldThread;

public class OldThread implements Runnable {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 1) {
                    System.out.println("OldThread: " + i);
                }
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
    }
}
