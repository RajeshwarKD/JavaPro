package com.company;
/*  Complete the code segment to catch the ArithmeticException in the following, if any.
    On the occurrence of such an exception, your program should print “Exception caught:
    Division by zero.” If there is no such exception, it will print the result of division operation on two integer values.*/

//Input     4 5
//Output    0

import java.util.Scanner;

public class NPTEL_W5_ProAssign3 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        //Read any two values for a and b.
        a = input.nextInt();
        b = input.nextInt();

        //Get the result of a/b;
        int result;
        try{
            result = a/b;
            System.out.println(result);
        } catch (ArithmeticException e){
            System.out.println("Exception caught : Division by zero.");
        }
    }
}
