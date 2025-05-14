package Lesson_5;

public class Car {
    public String name;
    public String engine;

    public static int numberOfCars;
    public Car(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
