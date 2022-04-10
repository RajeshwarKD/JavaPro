package com.company;

class bankAccount {
    int balance= 1000;

    public int getBal(){
        return balance;
    }

    public void withdraw(int bal){
       balance= balance-bal;
    }

    public void deposit(int bal){
        balance= balance+bal;
    }
}

public class bankThreadSync implements Runnable{

    bankAccount acc = new bankAccount();

    public static void main(String[] args) {
        bankThreadSync ts = new bankThreadSync();
        Thread t1 = new Thread(ts, "person 1");
        Thread t2 = new Thread(ts, "person 2");
        Thread t3 = new Thread(ts, "person 3");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            withdraw(100);
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            deposit(200);
        }
    }


    private void withdraw(int bal){
        if (acc.getBal()>=bal) {
            System.out.println(Thread.currentThread().getName()+" "+ "is try to withdraw Rs." + bal);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.withdraw(bal);
            System.out.println(Thread.currentThread().getName()+" "+ "is complete the withdraw of Rs." + bal);
        }else{
            System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough money for withdraw ");
        }
    }

    private void deposit(int bal){
        if (bal>=0) {
            System.out.println(Thread.currentThread().getName()+" "+ " is try to deposit Rs." + bal);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            acc.deposit(bal);
            System.out.println(Thread.currentThread().getName()+" "+ "is complete the deposit of Rs." + bal);
        }else{
            System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough money for deposit");
        }
    }
}

