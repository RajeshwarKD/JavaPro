package checkedException;

abstract class AbstractClass {
    // Abstract class with no concrete implementation
}

public class InstantiationExceptionExample {
    public static void main(String[] args) {
        try {
            // Attempting to create an instance of an abstract class
            AbstractClass obj = AbstractClass.class.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Error: " + e);
        } catch (IllegalAccessException e) {
            System.out.println("Error: " + e);
        }
    }
}

