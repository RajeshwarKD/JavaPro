
// Example Primitive Data Types to Wrapper Objects
public class WrapperClass {
    public static void main(String[] args) {

        // Create primitive data types
        int a = 5;
        double b = 5.65;

        // Convert into wrapper objects
        // Boxing using valueOf() method
        Integer aObj = Integer.valueOf(a); // Wrapping int to Integer
        Double bObj = Double.valueOf(b);  // Wrapping double to Double

        // Check if the objects are instances of their respective wrapper classes
        if (aObj instanceof Integer) {
            System.out.println("An object of Integer is created.");
        }

        if (bObj instanceof Double) {
            System.out.println("An object of Double is created.");
        }
    }
}