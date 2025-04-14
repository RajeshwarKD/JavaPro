class MyRunnable implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " is running: Iteration " + i);
                Thread.sleep(1000); // Pausing the thread for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        // Create Runnable instance
        MyRunnable myRunnable = new MyRunnable();

        // Create a Thread object and associate it with the Runnable instance
        Thread thread = new Thread(myRunnable, "MyThread");

        // Start the thread
        thread.start();

        // Check if the thread is alive
        System.out.println("Is thread alive? " + thread.isAlive());

        try {
            // Main thread sleeps for 3 seconds
            Thread.sleep(3000);

            // Interrupt the thread
            thread.interrupt();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted.");
        }

        // Check thread status after interruption
        System.out.println("Is thread alive after interruption? " + thread.isAlive());
    }
}
