package com.company;

//Complete the code segment to check whether the number is an Armstrong number or not.
import java.util.Scanner;
public class NPTEL_W1_ProAssign4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int result=0;
        int initial=n,digit,rem=0;
        //Use while loop check the number is Armstrong or not.
        while(n>0)
        {
            digit=n%10;
            rem+=digit*digit*digit;
            n=n/10;
        }

        //store the output(1 or 0) in result variable.
        if(initial==rem)
            result=1;
        System.out.print(result);
    }
}