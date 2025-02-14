package thirtyMinutesJAVA;

// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    public abstract void draw();

    // Concrete method (with implementation)
    public void display() {
        System.out.println("Displaying the shape...");
    }
}

// Concrete subclass Circle
class Circle extends Shape {
    // Implementing the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Concrete subclass Rectangle
class Rectangle extends Shape {
    // Implementing the abstract method
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Main class to test abstraction
public class AbstractionExample {
    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        // Calling methods
        circle.display(); // Calls the concrete method from the abstract class
        circle.draw();    // Calls the overridden method in Circle

        rectangle.display(); // Calls the concrete method from the abstract class
        rectangle.draw();    // Calls the overridden method in Rectangle
    }
}