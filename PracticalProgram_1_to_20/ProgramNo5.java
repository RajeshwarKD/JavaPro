public class ProgramNo5 {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();

        int a = 10;
        int b = 0; // This will cause the error

        System.out.println("Attempting to divide " + a + " by " + b + "...");

        try {
            // Calling the method from the other class
            int result = myCalc.divide(a, b);
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            // Handling the specific exception
            System.err.println("Error Caught: You cannot divide by zero!");
            System.err.println("Exception Message: " + e.getMessage());
        }
        finally {
            System.out.println("Execution complete. (The 'finally' block always runs).");
        }
    }
}