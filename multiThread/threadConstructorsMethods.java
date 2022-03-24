package com.company;

class myThread3 extends Thread{
    public myThread3 (String name){
       super(name);
    }

    @Override
    public void run(){
        //for (int i=0; i<40; i++) {
        System.out.println("My Thread first is Running");
       // }
    }
}
class myThread4 extends Thread{
    public myThread4 (Runnable target, String name){
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
        myThread3 t1 = new myThread3("SRK");
        t1.start();
        myThread4 t2 = new myThread4(t1,"AJD");
        t2.start();
        System.out.println("The ID of the thread t1 is " + t1.getId());
        System.out.println("The Name of the thread t1 is " + t1.getName());
        System.out.println("The ID of the thread t2 is " + t2.getId());
        System.out.println("The Name of the thread t2 is " + t2.getName());


    }
}
