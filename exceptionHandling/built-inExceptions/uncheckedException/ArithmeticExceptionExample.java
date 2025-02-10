package uncheckedException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            // Trying to divide by zero to cause an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}
