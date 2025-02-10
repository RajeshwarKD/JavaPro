package uncheckedException;

public class ArrayIndexOutOfBoundsExample {
    public static void main(String[] args) {
        // Creating an array of 5 elements
        int[] array = {1, 2, 3, 4, 5};

        // Trying to access the 10th element (index 9) which does not exist
        try {
            int value = array[9];
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds. " + e.getMessage());
        }
    }
}
