package Lesson_7.Animal;

// Lớp trừu tượng Animal
abstract class Animal {
    public abstract void makeSound(); // Phương thức bắt buộc các lớp con phải triển khai
}

// Class Chicken kế thừa Animal và implements Edible
class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chicken: cluck cluck");
    }

    @Override
    public void howToEat() {
        System.out.println("Chicken: fried or roasted");
    }
}

// Class Tiger kế thừa Animal
class Tiger extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Tiger: roar");
    }
}

// Interface Edible
interface Edible {
    void howToEat();  // Phương thức chỉ định cách ăn
}

// Class Fruit trừu tượng, implement Edible
abstract class Fruit implements Edible {
    // Có thể có các phương thức chung cho fruit nếu cần
}

// Class Apple kế thừa Fruit và implements Edible
class Apple extends Fruit {
    @Override
    public void howToEat() {
        System.out.println("Apple: eat raw");
    }
}

// Class Orange kế thừa Fruit và implements Edible
class Orange extends Fruit {
    @Override
    public void howToEat() {
        System.out.println("Orange: eat peeled");
    }
}
