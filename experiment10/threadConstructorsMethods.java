package com.company;

class myThread1 extends Thread{
    public myThread1 (String name){ //thread constructor
        super(name);
    }

    @Override
    public void run(){
        //for (int i=0; i<40; i++) {
        System.out.println("My Thread first is Running");
        // }
    }
}
class myThread2 extends Thread{
    public myThread2 (Runnable target, String name){ //thread constructor
        super(target, name);
    }
    @Override
    public void run(){
        //for (int i=0; i<40; i++) {
        System.out.println("My Thread second is Running");
        //}
    }
}

public class threadConstructorsMethods {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1("SRK");
        myThread2 t2 = new myThread2(t1,"AJD");
        t1.start();
        t2.start();
        System.out.println("Thread t1 is true=live or false=dead & ans is " + t1.isAlive());
        System.out.println("The ID of the thread t1 is " + t1.getId());
        System.out.println("The Name of the thread t1 is " + t1.getName());
        System.out.println("The Priority of the thread t1 is " + t1.getPriority());

        System.out.println("The ID of the thread t2 is " + t2.getId());
        System.out.println("The Name of the thread t2 is " + t2.getName());
        System.out.println("The Priority of the thread t2 is " + t2.getPriority());
        System.out.println("Thread t2 is true=live or false=dead & ans is " + t2.isAlive());
    }
}