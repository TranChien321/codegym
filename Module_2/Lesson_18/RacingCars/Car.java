package Lesson_18.RacingCars;

import java.util.Random;

public class Car implements Runnable {
    // Hằng số cho khoảng cách đua và bước chia biểu đồ
    private static final int DISTANCE = 100; // Tổng quãng đường đua (KM)
    private static final int STEP = 10;      // Mỗi đoạn 10%

    // Khai báo Tên của xe đua
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        // Khởi tạo điểm start (hay km ban đầu)
        int runDistance = 0;

        // Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {

                // Random tốc độ KM/H
                int speed = (new Random()).nextInt(20);

                // Tính toán khoảng cách đã đi được
                runDistance += speed;

                // Vẽ đường đã đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }

                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
