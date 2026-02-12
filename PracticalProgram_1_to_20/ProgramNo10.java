class MyThread1 extends Thread {
    // Constructor: Using the name parameter
    MyThread1(String name) {
        super(name);
    }
    // Override the run() method to define the task
    @Override
    public void run() {
        // Method: getName() - identifies the thread
        System.out.println(getName() + " is now STARTING.");

        try {
            // Method: sleep() - makes the thread wait
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(getName() + " is now FINISHED.");
    }
}

public class ProgramNo10 {
    public static void main(String[] args) {
        // 1. Using Constructor to name threads
        MyThread1 t1 = new MyThread1("Thread-A");
        MyThread1 t2 = new MyThread1("Thread-B");

        // 2. Method: setPriority() - Give Thread-A more importance
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        // 3. Method: start() - Begin execution
        t1.start();
        t2.start();

        // 4. Method: isAlive() - Check if they are running
        System.out.println("Is Thread-A running? " + t1.isAlive());
        System.out.println("Is Thread-B running? " + t2.isAlive());

        try {
            // 5. Method: join() - Wait for Thread-A to finish before continuing
            t1.join();
        } catch (Exception e) {}

        System.out.println("Main thread execution is complete.");
    }
}