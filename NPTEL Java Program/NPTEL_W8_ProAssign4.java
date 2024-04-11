package com.company;
/*Write a program to print symmetric Pascal's triangle of "*" 's of  height "l" of odd length .
If input "l" is even then your program will print "Invalid line number".*/
//Input Case 1      6
//Input Case 2      7

//Output Case 1
//Invalid line number

//Output Case 2
//   *
//  * *
// * * *
//* * * *
// * * *
//  * *
//   *
import java.util.*;
public class NPTEL_W8_ProAssign4 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int l = inr.nextInt();
        // Add the necessary code in the below space
        int ul=0, ll=0;
        if (l%2!=0) {
            ul = (l/2)+1;
            ll=l-ul;
            for(int i=1;i<=ul;i++) {
                for(int j=1;j<=(ul-i); j++) {
                    System.out.print(" ");
                }
                for(int j=1;j<=i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            int c=ll;
            for(int i=1;i<=ll; i++) {
                for(int j=c;j<ll; j++) {
                    System.out.print(" ");
                }
                for(int j=1;j-1<=ll-i; j++) {
                    System.out.print(" *");
                }
                c--;
                System.out.println();
            }
        }
        else {
            System.out.print("Invalid line number");
        }
    }
}
