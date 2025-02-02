//1.	A method without a body (no implementation) is known as abstract method.
//2.	A method must always be declared in an abstract class, or we can say that if a class has an abstract method, it should be declared abstract as well.
//3.	If a regular class extends an abstract class, then the class must have to implement all the abstract methods of the abstract parent class or it has to be declared abstract as well.
//4.	Abstract methods in an abstract class are meant to be overridden in derived concrete classes otherwise compile time error will be thrown.
//5.	Abstract classes cannot be instantiated, which means we can’t create an object of an Abstract class.


abstract class Animal5 { // Abstract class
    abstract void makeSound(); // Abstract method (does not have a body)

    void sleep() { // Regular method
        System.out.println("Zzz...");
    }
}
class Dog5 extends Animal5 { // Subclass (inherits from Animal)

    @Override
    void makeSound() {  // Providing the body of the abstract method
        System.out.println("Woof!");
    }
}
class Cat5 extends Animal5 { // Subclass (inherits from Animal)

    @Override
    void makeSound() { // Providing the body of the abstract method
        System.out.println("Meow!");
    }
}
public class abstractClass2 {
    public static void main(String[] args) {
        Dog5 dog = new Dog5();
        Cat5 cat = new Cat5();

        dog.makeSound();  // Output: Woof!
        dog.sleep();      // Output: Zzz...

        cat.makeSound();  // Output: Meow!
        cat.sleep();      // Output: Zzz...
    }
}
