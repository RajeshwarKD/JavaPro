package com.company;
// Given a snippet of code, add necessary codes to print the following:

// Output   Name of thread ‘t1’:Thread-0
//          Name of thread ‘t2’:Thread-1
//          New name of thread ‘t1’:Week 6 Assignment Q5
//          New name of thread ‘t2’:Week 6 Assignment Q5 New

public class NPTEL_W6_ProAssign5 extends Thread{
    public void run(){
    }
    public static void main(String[] args) {
        NPTEL_W6_ProAssign5 t1=new NPTEL_W6_ProAssign5();
        System.out.println("Name of thread 't1':"+ t1.getName());

        NPTEL_W6_ProAssign5 t2=new NPTEL_W6_ProAssign5();
        System.out.println("Name of thread 't2':"+ t2.getName());

        // Write the necessary code below...
        t1.setName("Week 6 Assignment Q5");
        t2.setName("Week 6 Assignment Q5 New");
        System.out.println("New name of thread 't1':"+ t1.getName());
        System.out.println("New name of thread 't2':"+ t2.getName());

    }
}
