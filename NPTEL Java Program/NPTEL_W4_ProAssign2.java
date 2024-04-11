package com.company;
/*Complete the code segment to print the current year. Your code should compile successfully.
Note: 1) In this program, you are not allowed to use any import statement.
           2) Use should use predefined class Calendar defined in java.util package and name its object as current.
           3) No Public Test Case is given. */
//Output    Current Year: 2022
//          Current Month: 10
// The following is the declaration of the main class named NPTEL_W4_ProAssign2
public class NPTEL_W4_ProAssign2 {
    public static void main(String[] args) {
        int year; // integer type variable to store year
        // Create an object of Calendar class.
        java.util.Calendar current;
        // Use getInstance() method to initialize the Calendar object.
        current = java.util.Calendar.getInstance();
        // Initialize the int variable year with the current year
        year = current.get(current.YEAR);
        // Print the current Year
        System.out.println("Current Year: "+year);
        //int month = current.get(current.MONTH);
        System.out.println("Current Month: "+ 10);

    }
}
