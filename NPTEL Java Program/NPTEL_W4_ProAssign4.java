package com.company;
/*Complete the code segment to call the default method in the interface First and Second.*/

//Output    Default method implementation of First interface.
//          Default method implementation of Second interface.

interface First{    // default method
    default void show(){
        System.out.println("Default method implementation of First interface.");
    }
}

interface Second{   // Default method
    default void show(){
        System.out.println("Default method implementation of Second interface.");
    }
}

// Implementation class code
public class NPTEL_W4_ProAssign4 implements First, Second {
    // Overriding default show method
    public void show(){
        // Call show() of First interface.
        First.super.show();
        // Call show() of Second interface.
        Second.super.show();
    }
    public static void main(String[] args) {
        NPTEL_W4_ProAssign4 q = new NPTEL_W4_ProAssign4();
        q.show();
    }
}
