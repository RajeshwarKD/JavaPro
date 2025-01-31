class Animal2 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Barking...");
    }
}

class Cat2 extends Animal2 {
    void meow() {
        System.out.println("Meowing...");
    }
}

public class hierarchicalInheritance {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();
        dog.eat();
        dog.bark();

        Cat2 cat = new Cat2();
        cat.eat();
        cat.meow();
    }
}
