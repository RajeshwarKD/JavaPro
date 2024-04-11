package com.company;

/*Complete the following code fragment to read three integer values from the keyboard and find the sum of the values.
Declare a variable "sum" of type int and store the result in it.*/

//Input     1
//          1
//          1
//Output    3

// Write the appropriate statement(s) to import the package(s) you need in your program
import java.util.*;
public class NPTEL_W7_ProAssign1 {
    public static void main(String[] args) {
//Write the appropriate code to read the 3 integer values and find their sum.
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        int c = obj.nextInt();
        int sum = a + b + c;

        System.out.println(sum);
    }
}
