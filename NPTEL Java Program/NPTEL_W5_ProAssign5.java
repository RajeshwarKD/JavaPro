package com.company;
/*  In the following program, there may be multiple exceptions. You have to complete the code using
    only one try-catch block to handle all the possible exceptions.
    For example, if user’s input is 1, then it will throw and catch “java.lang.NullPointerException“.*/

//Case - 1
//Input     5
//Output    No exception

//Case - 2
//Input     0
//Output    java.lang.ArithmeticException: / by zero

//Case - 3
//Input     1
//Output    java.lang.NullPointerException

import java.util.Scanner;

public class NPTEL_W5_ProAssign5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j;

        // Put the following code under try-catch block to handle exceptions
        try {
            switch (i) {
                case 0:
                    int zero = 0;
                    j = 92 / zero;
                    break;
                case 1:
                    int b[] = null;
                    j = b[0];
                    break;
                default:
                    System.out.println("No exception");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
