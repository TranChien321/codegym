package Lesson_5;

public class TestCar {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3","Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazda 6","Skyactiv 6");
        System.out.println(Car.numberOfCars);
        Car car3 = new Car("Mazda 2","Skyactiv 2");
        System.out.println(Car.numberOfCars);
    }
}
