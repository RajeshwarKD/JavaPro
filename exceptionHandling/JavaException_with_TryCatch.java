//The try statement allows you to define a block of code to be tested for errors while it is being executed.
//The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
//The try and catch keywords come in pairs:
//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:

public class JavaException_with_TryCatch {
    public static void main(String[] args) {

        try {
            // Code that may throw an exception
            int num1 = 10;
            int num2 = 0;

            int ans = num1 / num2;
            System.out.println("Answer: " + ans);
        }
        catch (Exception e) {
            // Handling the exception
            System.out.println("Error: Division by zero is not allowed!");
        }
    }
}
