package com.company;
/*Write a program which will print a pyramid of "numbers" 's of height "n" and print the sum of all number's in the pyramid.*/
//Input Case 1      5
//Input Case 2      3

//Output Case 1
//        1
//      1 2 3
//    1 2 3 4 5
//  1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8 9
//95

//Output Case 2
//    1
//  1 2 3
//1 2 3 4 5
//22
import java.util.*;
public class NPTEL_W8_ProAssign3 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        // Add the necessary code in the below space
        int num, sum = 0;
        for(int i=1; i<=n; i++) {
            num=1;
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            while(num <= 2*i-1) {
                System.out.print(num + " ");
                sum = sum + num;
                num++;
            }
            System.out.println();
        }
        System.out.println(sum);

    }
}
