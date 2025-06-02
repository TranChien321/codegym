package Lesson_18.RacingCars;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW");
         Car car2 = new Car("Audi");
          Car car3 = new Car("Mercedes");
          Car car4 = new Car("Lexus");

          Thread t1 = new Thread(car1);
           Thread t2 = new Thread(car2);
            Thread t3 = new Thread(car3);
             Thread t4 = new Thread(car4);

             System.out.println("Distance: 100KM");

              t1.start();
               t2.start();
                t3.start();
                 t4.start();
    }
}
