package com.company;

//Complete the code segment to call the method  print() of class given class Printer to print the following.

//      Hi! I am class STUDENT
//      Hi! I class SCHOOL.

// This is the class named Printer
class Printer {
    // This are the methods in class Printer
    public void print() {
        System.out.println("Hi! I class SCHOOL.");
    }
    public void print(String s) {
        System.out.println(s);
    }
}

public class NPTEL_W2_ProAssign2 {
    public static void main(String[] args) {
        // Create an object of class Printer
        Printer prt = new Printer();

        // Call 'print()' methods for desired output
        prt.print("Hi! I am class STUDENT");
        prt.print();
    }
}
