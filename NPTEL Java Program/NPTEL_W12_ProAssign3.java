package com.company;
/*Write a program to create a record by taking inputs using Scanner class as first name as string,
last name as string ,roll number as an integer, subject1 mark as float, subject2 mark as float.
Your program should print in the format “name   rollnumber  avgmark“.*/
/*Input:-       ram
                das
                123
                25.5
                24.5

Output:-        ramdas  123 25.0    */

import java.util.*;
public class NPTEL_W12_ProAssign3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        //Read your first name
        String f = s1.next();
        //Read your last name
        String l = s1.next();
        //Read rollnumber
        int n = s1.nextInt();
        //Read 1st subject mark
        double db = s1.nextDouble();
        //Read 2nd subject mark
        double db1 = s1.nextDouble();
        double avg=(db+db1)/2;
        System.out.println(f + l +" "+ n +" "+avg );
    }
}
