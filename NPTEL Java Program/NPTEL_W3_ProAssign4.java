package com.company;
/*This program to exercise the call of static and non-static methods. A partial code is given defining two methods,
namely sum( ) and multiply ( ). You have to call these methods to find the sum and product of two numbers.
Complete the code segment as instructed.  */

//Input     3
//          5
//Output    8
//          15
import java.util.Scanner;
class QuestionScope {
    int sum(int a, int b){ //non-static method
        return a + b;
    }
    static int multiply(int a, int b){ //static method
        return a * b;
    }
}
public class NPTEL_W3_ProAssign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();


        //Called the method multiply() to find the product of two numbers.
        QuestionScope st = new QuestionScope(); // Create an object to call non-static method

        //Called the method sum() to find the sum of two numbers.
        int result1=st.sum(n1,n2);       // Call the method

        //Called the method multiply() to find the product of two numbers.
        int result2=QuestionScope.multiply(n1,n2); // Create an object to call static method

        System.out.println(result1);
        System.out.println(result2);
    }
}
