package com.company;

class bankAccount {
    int balance= 1000;

    public int getBalance(){
        return balance;
    }

    public void withdraw(int amount){
       balance= balance-amount;
    }

    public void deposit(int amount){
        balance= balance+amount;
    }
}

public class bankThreadSync implements Runnable{

    bankAccount jointAccount = new bankAccount();

   @Override
    public void run() {
        for (int i = 3; i <= 3; i++) {
            withdraw(100);
            if (jointAccount.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
            deposit(200);
        }
    }

    private synchronized void withdraw(int amount){
        if (jointAccount.getBalance()>=amount) {
            jointAccount.withdraw(amount);
            System.out.println(Thread.currentThread().getName()+" "+ "is complete the withdraw of Rs." + amount);
            System.out.println(Thread.currentThread().getName()+" after withdrawal joint account balance Rs. " + jointAccount.getBalance());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+ " "+"doesn't have enough amount for withdraw ");
        }
    }

    private synchronized void deposit(int amount){
        if (amount>=0) {
            jointAccount.deposit(amount);
            System.out.println(Thread.currentThread().getName()+" "+ "is complete the deposited of Rs." + amount);
            System.out.println(Thread.currentThread().getName()+" after deposit joint account balance Rs. " + jointAccount.getBalance());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            System.out.println(Thread.currentThread().getName()+ " "+"you have invalid amount for deposit");
        }
    }

    public static void main(String[] args) {
        bankThreadSync ts = new bankThreadSync();
        Thread t1 = new Thread(ts, "Naresh");
        Thread t2 = new Thread(ts, "Mahesh");
        Thread t3 = new Thread(ts, "Suresh");
        t1.start();
        t2.start();
        t3.start();
    }
}

