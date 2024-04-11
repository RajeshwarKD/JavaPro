package com.company;
/*Complete the code segment to catch the exception in the following, if any. On the occurrence of such an exception,
your program should print “Please enter valid data” .If there is no such exception, it will print the "square of the number".*/

//Input Case 1      2
// Case 2           q

//Output Case 1     4
// Case 2           Please enter valid data

import java.io.*;
public class NPTEL_W7_ProAssign2 {
    public static void main(String[] args) {
        //Use appropriate Try..catch block to complete the code
      try {
          InputStreamReader r=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(r);
          String number=br.readLine();
          int x = Integer.parseInt(number);
          System.out.println(x*x);
      } catch (Exception e){
          System.out.println("Please enter valid data");
      }

    }
}
