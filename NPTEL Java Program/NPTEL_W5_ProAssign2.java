package com.company;
/*This program is to find the GCD (greatest common divisor) of two integers writing a recursive function findGCD(n1,n2).
Your function should return -1, if the argument(s) is(are) other than positive number(s).*/
//Input     40 60
//Output    20

import java.util.Scanner;

interface GCD {
    public int findGCD(int n1,int n2);
}

//Create a class B, which implements the interface GCD.
class B implements GCD{
    int n1, n2;

    @Override
    public int findGCD(int n1, int n2) {
        if (n1 ==0 && n2 ==0)
            return -1;
        else if (n2 == 0)
            return n1;
        else
            return findGCD(n2, n1%n2);
    }
}
public class NPTEL_W5_ProAssign2 {
    public static void main(String[] args) {
        B a = new B();   //Create an object of class B
        // Read two numbers from the keyboard
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        System.out.print(a.findGCD(p1,p2));
    }
}
