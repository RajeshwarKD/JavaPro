
// Example Wrapper Objects into Primitive Data Types
public class WrapperClass2 {
    public static void main(String[] args) {

        // Create objects of wrapper class
        Integer aObj = Integer.valueOf(23); // Wrapping int to Integer
        Double bObj = Double.valueOf(5.55); // Wrapping double to Double

        // Convert wrapper objects into primitive data types
        // Unboxing: Converting wrapper objects back to primitive data types
        int a = aObj.intValue();    // Unwrapping Integer to int
        double b = bObj.doubleValue(); // Unwrapping Double to double

        // Print the primitive data values
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);
    }
}