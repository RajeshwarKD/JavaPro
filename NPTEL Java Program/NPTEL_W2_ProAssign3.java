package com.company;

//Complete the code segment to call print() method of class Question by creating a method named ‘studentMethod()’.

// This is the main class Question
public class NPTEL_W2_ProAssign3 {
    public static void main(String[] args) {
        // Object of the main class is created
        NPTEL_W2_ProAssign3 q = new NPTEL_W2_ProAssign3();
        // Print method on object of Question class is called
        q.studentMethod();
    }

    // 'print()' method is defined in class Question
    void print(NPTEL_W2_ProAssign3 object) {
        System.out.print("Well Done!");
    }
        // Define a method named 'studentMethod()' in class Question
        public void studentMethod(){
        // Call the method named 'print()' in class Question
        print(this);
    }
}
