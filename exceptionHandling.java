// My userDefineException Class
class userDefineException extends Exception {
    public userDefineException(String message) {
        super(message);
    }
}

public class exceptionHandling {
    // Method that throws a userDefineException exception
    public static void processInput(int denominator) throws userDefineException {
        if (denominator < 0) {
            throw new userDefineException("denominator value cannot be negative!");
        }
        System.out.println("denominator value is : " + denominator);
    }

    // Method that throws a predefined exception
    public static void divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Cannot divide by zero!");
        }
        int result = numerator / denominator;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        try {
            int userInput = 0; // Change this value to test different scenarios
            processInput(userInput);

            int numerator = 10;
            int denominator = userInput;
            System.out.println("numerator value is : " + numerator);
            divide(numerator, denominator);

        } catch (userDefineException e) {
            System.out.println("Caught user-define exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught pre-defined exception: " + e.getMessage());
        }
        finally {
            System.out.println("I am always here");
        }
    }
}
