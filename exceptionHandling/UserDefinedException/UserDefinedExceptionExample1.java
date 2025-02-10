// Step 1: Define a user define (custom) exception class by extending Exception
class InvalidAgeException1 extends Exception {
    public InvalidAgeException1(String message) {
        super(message);
    }
}

// Step 2: Create a class to use the user define (custom)  exception
public class UserDefinedExceptionExample1 {
    // Method to check if the age is valid
    public void checkAge(int age) throws InvalidAgeException1 {
        if (age < 18) {
            throw new InvalidAgeException1("Age is not valid to vote.");
        } else {
            System.out.println("Welcome to vote!");
        }
    }

    // Main method to test the user define (custom) exception
    public static void main(String[] args) {
        UserDefinedExceptionExample1 example = new UserDefinedExceptionExample1();
        try {
            example.checkAge(16); // This will trigger the custom exception
        } catch (InvalidAgeException1 e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
}

