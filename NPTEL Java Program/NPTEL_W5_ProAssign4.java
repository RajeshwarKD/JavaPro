package com.company;

/*  In the following program, an array of integer data to be initialized. During the initialization,
    if a user enters a value other than integer value, then it will throw InputMismatchException exception.
    On the occurrence of such an exception, your program should print “You entered bad data.”
    If there is no such exception it will print the total sum of the array.*/
//Case - 1
//Input     3
//          5 2 1
//Output    8

//Case - 2
//Input     2
//          1 j
//Output    You entered bad data.


//Prefixed Fixed Code:
import java.util.*;


public class NPTEL_W5_ProAssign4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        // create an array to save user input
        int[] name = new int[length];
        int sum=0;//save the total sum of the array.

        //Define try-catch block to save user input in the array "name",
        // if there is an exception then catch the exception otherwise print the total sum of the array.
        try{
            for (int i=0; i<length; i++){
                int a = sc.nextInt();
                name[i]= a;
                sum += name [i];
            }
            System.out.println(sum);
        }catch (InputMismatchException e){
            System.out.println("You entered bad data.");
        }
    }
}
