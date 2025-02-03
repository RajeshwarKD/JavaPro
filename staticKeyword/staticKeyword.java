class Example {
    // Static variable
    static int count = 0;

    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }

    // Static block
    static {
        System.out.println("Static block executed.");
        count = 10;
    }

    // Static nested class
    static class NestedClass {
        void show() {
            System.out.println("Inside static nested class.");
        }
    }
}

public class staticKeyword {
    public static void main(String[] args) {
        // Accessing static variable
        Example.count = 15;

        // Accessing static method
        Example.displayCount();

        // Creating an instance of static nested class
        Example.NestedClass nested = new Example.NestedClass();
        nested.show();
    }
}
