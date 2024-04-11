package com.company;
/*Complete the code segment to execute the following program successfully. You should import the correct package(s)
 and/or class(s) to complete the code. */
//Input     NPTEL JAVA

//Output    Course: NPTEL JAVA

// Import the required package(s) and/or class(es)
import java.util.Scanner;
// Import of pre-defined package java.lang and class System and all of its member
import static java.lang.System.*;
// main class Question is created
public class NPTEL_W4_ProAssign1 {
    public static void main(String[] args) {
        // Scanner object is created
        Scanner scanner = new Scanner(System.in);
        // Read String input using scanner class
        String courseName = scanner.nextLine();
        // Print the scanned String
        out.println("Course: " + courseName);
    }
}
