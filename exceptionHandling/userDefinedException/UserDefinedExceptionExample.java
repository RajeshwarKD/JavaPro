// Step 1: Define a user define (custom) exception class by extending Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Step 2: Create a class to use the user define (custom)  exception
public class UserDefinedExceptionExample {
    // Method to check if the age is valid
    public void checkAge(int age) {
        try {
            if (age < 18) {
                throw new InvalidAgeException("Age is not valid to vote.");
            } else {
                System.out.println("Welcome to vote!");
            }
        } catch (InvalidAgeException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }
    }
// getMessage() Methods to prints the description/ information of the exception.


    // Main method to test the user define (custom) exception
    public static void main(String[] args) {
        UserDefinedExceptionExample example = new UserDefinedExceptionExample();
        example.checkAge(16); // This will trigger the custom exception
    }
}
