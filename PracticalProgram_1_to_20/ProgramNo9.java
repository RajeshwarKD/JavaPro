// 1. Create the thread class by extending Thread
class MyThread extends Thread {

    // Constructor to set the thread name immediately
    MyThread(String name) {
        super(name); // Passes the name to the parent Thread class
    }

    // 2. Override the run() method to define the task
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(getName() + " (Iteration " + i + "): SSPU-BHILAI");

            try {
                // Adding a tiny sleep so we can see the threads interleaving
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ProgramNo9 {
    public static void main(String[] args) {
        // 3. Create objects of the MyThread class
        MyThread t1 = new MyThread("Thread-Alpha");
        MyThread t2 = new MyThread("Thread-Beta");

        // 4. Start the threads
        System.out.println("Starting Threads...");
        t1.start();
        t2.start();
    }
}