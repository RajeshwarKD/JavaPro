package com.company;
/*Write a program which will print a pascal pyramid of "*" 's of height "l" .*/

//Input Case 1      4
//Input Case 2      8
//Input Case 3      7

//Output Case 1
//        *
//       * *
//      * * *
//     * * * *

//Output Case 2
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//   * * * * * *
//  * * * * * * *
// * * * * * * * *

//Output Case 3
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//   * * * * * *
//  * * * * * * *

import java.util.*;
public class NPTEL_W8_ProAssign2 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int l = inr.nextInt();
        // Add the necessary code in the below space
        int space = l - 1;
        /*run loop (parent loop) till number of rows*/
        for(int i=0; i<l; i++) {
            /*loop for initially space, before star printing*/
            for(int j=0; j<space; j++) {
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            space--; /* decrement one space after one row*/
        }
    }
}
