package uncheckedException;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        // Creating a reference variable but not initializing it
        String str = null;

        // Trying to call a method on the null reference
        try {
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e);
        }
    }
}
