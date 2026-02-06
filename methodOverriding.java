// Example of Method Overriding in Java
// Method Overriding Conditions:
// 1.	Same method names.
// 2.	Within difference class
// 3.	Same arguments
//    i.	No of parameter
//    ii.	Type of parameter
//    iii.	Sequence of parameter
// 4.	Inheritance (IS-A relationship)

class Animal { // Base class
    void move() {
        System.out.println("Animal is moving.");
    }
    void eat() {
        System.out.println("Animal is eating."); }
}

class Dog extends Animal {
    @Override
    void move() { // move method from Base class is overridden in this method
        System.out.println("Dog is running.");
    }
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class methodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.move(); // Output: Dog is running.
        d.eat(); // Output: Animal is eating.
        d.bark(); // Output: Dog is barking.
    }
}

