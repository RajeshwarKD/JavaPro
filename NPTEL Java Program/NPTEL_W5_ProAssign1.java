package com.company;
/*An interface Number is defined in the following program. You have to declare a class A,
which will implement the interface Number.
Note that the method findSqr(n) will return the square of the number n.*/
//Input     10
//Output    100

import java.util.Scanner;

interface Number {
    int findSqr(int i);  // Returns the square of n
}
//Create a class A which implements the interface Number.

class A implements Number{
    int i;
    public int findSqr(int i){
        return i*i;
    }
}
public class NPTEL_W5_ProAssign1 {
    public static void main(String[] args) {
        A a = new A();   //Create an object of class A
        // Read a number from the keyboard
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(a.findSqr(i));
    }
}
