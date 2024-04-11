package com.company;

/*Write a program which will print a pyramid of "*" 's of height "n" and print the number of "*" 's in the pyramid. */

//Input Case 1      -2
//Input Case 2      3
//Input Case 3      5

//Output Case 1     0

//Output Case 2
//          *
//        * * *
//      * * * * *
// 9

//Output Case 3
//          *
//        * * *
//      * * * * *
//    * * * * * * *
//  * * * * * * * * *
// 25

import java.util.*;
public class NPTEL_W8_ProAssign1 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        // Add the necessary code in the below space

        int a = 0, sum = 0;
        for(int i=1; i<=n; ++i) {
            a=0;
            for(int j=1; j<=n-i; ++j) {
                System.out.print(" ");
            }
            while(a!=2*i-1) {
                System.out.print("* ");
                sum++;
                ++a;
            }
            System.out.println();
        }
        System.out.println(sum);
    }
}
