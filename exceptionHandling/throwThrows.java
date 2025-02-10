// Step 1: Define a user define (custom) exception class by extending Exception

import java.util.Scanner;

class myException extends Exception {
    myException(String message) {
        super(message);
    }
}
// Step 2: Create a class to use the user define (custom)  exception
public class throwThrows {
    // Main method to test the user define (custom) exception
    public static void main(String[] args) throws myException { //userDefineException
        System.out.print("Enter marks: ");
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt();

        if( marks > 100 )  {
            throw new myException ("Input marks greater than 100 "); // This will trigger the custom exception
        }
        else
            System.out.println("Marks: "+marks);
    }
}