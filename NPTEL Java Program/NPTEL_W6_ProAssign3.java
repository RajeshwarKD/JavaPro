package com.company;

/*  A part of the Java program is given, which can be completed in many ways, for example using the concept of thread, etc.
Follow the given code and complete the program so that your program prints the message
“NPTEL Java Week-6 New Assignment Q3”. Your program should utilize the given interface/ class.*/

//Invalid HTML tag: tag name o:p is not allowed
//Output    NPTEL Java Week-6 New Assignment Q3

// Interface A is defined with an abstract method run()
interface A1 {
    public abstract void run();
}
// Class B is defined which implements A and an empty implementation of run()
class B1 implements A1 {
    public void run() {}
}
// Create a class named MyThread and extend/implement the required class/interface
class MyThread extends B1 {
    // Define a method in MyThread class to print the output
    public void run() {
        System.out.print("NPTEL Java Week-6 New Assignment Q3");
    }
}

// Main class Question is defined
public class NPTEL_W6_ProAssign3 {
    public static void main(String[] args) {
        // An object of MyThread class is create
        MyThread t = new MyThread();
        // run() of class MyThread is called
        t.run();

    }
}
