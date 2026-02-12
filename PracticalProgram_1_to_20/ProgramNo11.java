class BankAccount {
    private int balance = 1000; // Starting balance

    // 'synchronized' keyword ensures only one thread can withdraw at a time
    public synchronized void withdraw(String name, int amount) {
        System.out.println(name + " is attempting to withdraw ₹" + amount);

        if (balance >= amount) {
            try {
                // Simulating time taken for processing
                Thread.sleep(500);
            } catch (InterruptedException e) {}

            balance -= amount;
            System.out.println(name + " successfully withdrew ₹" + amount);
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println(name + " failed! Not enough balance for ₹" + amount);
            System.out.println("Current Balance: ₹" + balance);
        }
        System.out.println("-----------------------------------");
    }
}

class UserThread extends Thread {
    BankAccount account;
    String name;
    int amount;

    UserThread(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class ProgramNo11 {
    public static void main(String[] args) {
        // One shared account
        BankAccount jointAccount = new BankAccount();

        // Two users trying to withdraw money at the same time
        UserThread user1 = new UserThread(jointAccount, "Suresh", 700);
        UserThread user2 = new UserThread(jointAccount, "Ramesh", 600);

        user1.start();
        user2.start();
    }
}