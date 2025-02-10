package uncheckedException;

public class ArrayStoreExceptionExample {
    public static void main(String[] args) {
        // Creating an array of type Object
        Object[] array = new Integer[5];

        // Trying to store a String in an Integer array
        try {
            array[0] = "Hello";
        } catch (ArrayStoreException e) {
            System.out.println("Error: " + e);
        }
    }
}
