package com.company;
/*Write a program to display any digit(n) from 0-9 represented as a "7 segment  display".*/
//Input Case 1      5
//Input Case 2      4

//Output Case 1
//      _
//     |_
//     _|


//Output Case 2
//     |_|
//       |
import java.util.*;
public class NPTEL_W8_ProAssign5 {
    public static void main(String[] args) throws Exception {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        // Add the necessary code in the below space
        if(n==2 || n==3 || n==5 || n==6 || n==7 || n==8 || n==9 || n==0)
            System.out.println(" _ ");
        else
            System.out.println(" ");
        if(n==1 || n==7)
            System.out.println(" |");
        else if(n==2 || n==3)
            System.out.println(" _|");
        else if(n==4 || n==8 || n==9)
            System.out.println("|_|");
        else if(n==5 || n==6)
            System.out.println("|_ ");
        else
            System.out.println("| |");
        if(n==1 || n==4 || n==7)
            System.out.println(" |");
        else if(n==3 || n==5 || n==9)
            System.out.println(" _|");
        else if(n==6 || n==8 || n==0)
            System.out.println("|_|");
        else
            System.out.println("|_ ");
    }
}
