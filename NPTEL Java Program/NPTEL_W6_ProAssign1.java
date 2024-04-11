package com.company;
/*Complete the code segment to print the following using the concept of extending the Thread class in Java:*/
//Output    Thread is Running.

// Write the appropriate code to extend the Thread class to complete the class Question61.
public class NPTEL_W6_ProAssign1 extends Thread{
    public void run(){
        System.out.print("Thread is Running.");
    }

    public static void main(String[] args) {
        // Creating object of thread class
        NPTEL_W6_ProAssign1 thread=new NPTEL_W6_ProAssign1();
        // Start the thread
        thread.start();
    }
}
