package com.company;

/*Complete the code segment to find the highest mark and average mark secured by Hari in "s" number of subjects. */

import java.util.Scanner;
public class NPTEL_W1_ProAssign5{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it of integer type.
        int[] arr = new int[s];

        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
        }
//Initialize maximum element as first element of the array.
        int max=arr[0];
        //Traverse array elements to get the current max.
        for(i=0;i<arr.length;i++)
            if(max<arr[i])
                max=arr[i];
        //Store the highest mark in the variable result.
        result=max;
        //Store average mark in avgMarks.
        double avg,sum=0;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        Double d=Double.valueOf(s);
        avg=(sum/d);

        System.out.print(max+"\n"+avg);
    }
}
