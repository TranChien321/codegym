package Lesson_7.Animal;

public class TestAnimal {
    // Chương trình chính để kiểm thử
    public static void main(String[] args) {
        Animal animal1 = new Chicken();
        Animal animal2 = new Tiger();

        animal1.makeSound(); // Gọi phương thức của Chicken
        animal2.makeSound(); // Gọi phương thức của Tiger

        // Các đối tượng edible
        Edible chicken = new Chicken();
        Edible apple = new Apple();
        Edible orange = new Orange();

        // Gọi phương thức của interface Edible
        chicken.howToEat();
        apple.howToEat();
        orange.howToEat();
    }
}
