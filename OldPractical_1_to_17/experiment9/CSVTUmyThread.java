package com.company;

public class CSVTUmyThread extends Thread{

    public void run(){
        for (int i=1; i<=10; i++){

            //Display CSVTU 10 times from this thread
            System.out.println( "CSVTU");
            try {
                Thread.sleep(1000);
            }

            catch (InterruptedException interruptedException){
                System.out.println( "First Thread is interrupted when it is sleeping" + interruptedException);
            }
        }
    }

    public static void main(String args[]){

        CSVTUmyThread t=new CSVTUmyThread();
        System.out.println("Thread will display CSVTU 10 times!");
        t.start(); // to start thread
    }
}
