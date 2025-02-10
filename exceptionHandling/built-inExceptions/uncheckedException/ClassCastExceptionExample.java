package uncheckedException;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        // Creating an object of type Object
        Object obj = new Integer(10);

        // Trying to cast the Object to a String
        try {
            String str = (String) obj;
        } catch (ClassCastException e) {
            System.out.println("Error: " + e);
        }
    }
}
