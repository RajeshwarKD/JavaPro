package com.company;

/*Consider first n even numbers starting from zero(0).
Complete the code segment to calculate sum of  all these numbers divisible by 3 .
Print the sum.
Example:
Input: n = 5
----------
0 2 4 6 8
Even number divisible by 3:0 6
sum:6
*/
import java.util.Scanner;
public class NPTEL_W1_ProAssign3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
//Use for or while loop to sum first n positive even numbers starting from 0 which are divisible by 3.

        for(int i=0;i<2*n;i=i+2){

            if(i%3==0)
                sum=sum+i;

        }
        System.out.print(sum);
    }
}
