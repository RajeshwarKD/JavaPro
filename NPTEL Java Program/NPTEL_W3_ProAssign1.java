package com.company;

//This program is related to the generation of Fibonacci numbers. For example: 0,1, 1,2, 3,5, 8, 13,…
// is a Fibonacci sequence where 13 is the 8th Fibonacci number. A partial code is given and you have
// to complete the code as per the instruction given below.

import java.util.Scanner;
public class NPTEL_W3_ProAssign1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }
    //Template code:
    static int fib(int n) {
        //complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
        if (n==1)      //Terminate condition
            return 0;
        else if(n==2)
            return 1;
        return fib(n - 1) + fib(n - 2); //Recursive call of function
    }
}
