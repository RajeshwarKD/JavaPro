package thirtyMinutesJAVA;

// Superclass
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal is making a sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
}

// Subclass Cat
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}

// Main class to test polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        // Creating objects of Animal, Dog, and Cat
        Animal myAnimal = new Animal();  // Animal object
        Animal myDog = new Dog();       // Dog object
        Animal myCat = new Cat();       // Cat object

        // Calling the sound method
        myAnimal.sound();  // Output: Animal is making a sound
        myDog.sound();     // Output: Dog is barking
        myCat.sound();     // Output: Cat is meowing
    }
}