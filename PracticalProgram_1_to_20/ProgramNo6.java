import java.util.Scanner;

// 1. User-defined Exception Class
class userDefineException  extends Exception {
    public userDefineException (String message) {
        super(message);
    }
}

public class ProgramNo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        try {
            // 2. Check the condition and THROW
            if (marks > 100) {
                throw new userDefineException ("Error: Marks cannot be more than 100!");
            }
            System.out.println("Result: " + marks + " is a valid marks.");

        } catch (userDefineException  e) {
            // 3. CATCH and print the error
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}