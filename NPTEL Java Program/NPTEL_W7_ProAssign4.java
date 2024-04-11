package com.company;
/*The following program reads a string from the keyboard and is stored in the String variable "s1".
You have to complete the program so that it should print the number of vowels in s1 .
If your input data doesn't have any vowel it will print "0".*/

//Input Case 1      ram
// Case 2           aaA
// Case 3           10

//Output Case 1    1
// Case 2          3
// Case 3          0

import java.io.*;
import java.util.*;
public class NPTEL_W7_ProAssign4 {
    public static void main(String[] args) {
        int c=0;
        try{
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            String s1 = br.readLine();
            //Write your code here to count the number of vowels in the string "s1"
            int len = s1.length();
            String s = s1.toUpperCase();
            for(int i=0; i<len; i++) {
                char ch = s.charAt(i);
                if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
                    c++;
                }
            }

            System.out.println(c);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
