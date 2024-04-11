package com.company;

/*A string "s1" is already initialized. You have to read the index "n"  from the keyboard. Complete the code segment to
catch the exception in the following, if any. On the occurrence of such an exception, your program should print “exception occur” .
If there is no such exception, your program should replace the char "a" at the index value "n" of the "s1" ,then it will print the modified string.*/

//Input Case 1      -1
// Case 2           e
// Case 3           4

//Output Case 1    exception occur
// Case 2          exception occur
// Case 3          NPTEaJAVA

import java.util.*;
public class NPTEL_W7_ProAssign5 {
    public static void main(String[] args) {
        try{
            String s1="NPTELJAVA";
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            char c='a';
            //Replace the char in string "s1" with the char 'a' at index "n"  and print the modified string
            StringBuilder str = new StringBuilder(s1);
            str.setCharAt(n,c);
            System.out.print(str);
        }

            catch (Exception e){
                System.out.println("exception occur");
            }

        }
}
