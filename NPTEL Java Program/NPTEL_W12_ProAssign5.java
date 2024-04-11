package com.company;
/*Write a recursive function to print the sum of first n odd integer numbers.
The recursive function should have the prototype ” int sum_odd_n(int n) “.*/
//Input_1       5
//Input_2       6

//Output_1      25
//Output_1      36

import java.util.*;
public class NPTEL_W12_ProAssign5 {
    static int sum_odd_n(int n){
        if(n==1)
            return 1;
        if (n<=0)
            return 0;

        return 2*n-1 + sum_odd_n(n-1);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=in.nextInt();
        int r=sum_odd_n(count);
        System.out.println(r);
    }
}
