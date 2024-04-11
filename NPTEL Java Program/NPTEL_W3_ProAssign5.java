package com.company;
//Complete the code segment to swap two numbers using call by object reference.
//Input     10
//          20
//Output    20 10

import java.util.Scanner;
class Question5 {  //Define a class Question with two elements e1 and e2.
    Scanner sc = new Scanner(System.in);
    int e1 = sc.nextInt();  //Read e1
    int e2 = sc.nextInt();  //Read e2
}
public class NPTEL_W3_ProAssign5 {
    // Define static method swap()to swap the values of e1 and e2 of class Question.
    public static void swap(Question5 t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }

    public static void main(String[] args) {
        //Create an object of class Question
        Question5 t = new Question5 ();
        //Call the method swap()
        swap(t);
        System.out.println(t.e1+" "+t.e2);
    }
}
