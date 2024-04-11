package com.company;
/*In the following program, a thread class Question62 is created using the Runnable interface
Complete the main() to create a thread object of the class Question62 and run the thread.
It should print the output as given below*/

//Output    Welcome to Java Week 6 New Question.
//          Main Thread has ended.

public class NPTEL_W6_ProAssign2  implements Runnable {
    @Override
    public void run() {
        System.out.print(Thread.currentThread().getName()+" has ended.");
    }

    // Create main() method and appropriate statements in it
    public static void main(String[] args) {
        NPTEL_W6_ProAssign2 obj = new NPTEL_W6_ProAssign2();
        Thread t1 = new Thread(obj);
        System.out.println("Welcome to Java Week 6 New Question.");
        t1.setName("Main Thread");
        t1.start();
    }
}
