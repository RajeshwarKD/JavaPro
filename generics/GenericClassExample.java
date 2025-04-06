// Generics means parameterized types. The idea is to allow a type (like Integer, String, etc., or user-defined types) to be a parameter to methods,
// classes, and interfaces. Using Generics, it is possible to create classes that work with different data types. An entity such as a
// class, interface, or method that operates on a parameterized type is a generic entity.
// Main features of generics: 1. Compile time type safety. 2. Removing risk of ClassCastException at run time. 3. No casting.
// The type parameters naming conventions are important to learn generics thoroughly. The common type parameters are as follows:
// T – Type
// E – Element
// K – Key
// N – Number
// V – Value


// Generic Class definition
class Box<T> {
    private T content;

    // Constructor
    public Box(T content) {
        this.content = content;
    }

    // Getter
    public T getContent() {
        return content;
    }

    // Setter
    public void setContent(T content) {
        this.content = content;
    }

    // Generic method to print any type
    public <U> void printItem(U item) {
        System.out.println("Item: " + item);
    }
}

// Main class to demonstrate usage
public class GenericClassExample {
    public static void main(String[] args) {
        // To create an instance of generic class
        // Creating Box with Integer type
        Box<Integer> integerBox = new Box<>(42);
        System.out.println("Integer Box content: " + integerBox.getContent());

        // Creating Box with String type
        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Box content: " + stringBox.getContent());

        // Using generic method with different types
        integerBox.printItem("A String");
        integerBox.printItem(123);
        integerBox.printItem(3.14);

        // Using generic method with the box's own content
        integerBox.printItem(integerBox.getContent());
        stringBox.printItem(stringBox.getContent());

        // Creating Box with Double type
        Box<Double> doubleBox = new Box<>(15.75);
        System.out.println("Double Box content: " + doubleBox.getContent());
    }
}