// Java Program to demonstrate synchronization in Java
class Counter {
    private int count  = 0; // Shared variable

    // Synchronized method to increment counter
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get counter value
    public synchronized int getCount() {
        return count ;
    }
}

public class ThreadSynchronizationExample {
    public static void main(String[] args) {
        Counter counter = new Counter(); // Shared resource

        // Thread 1 to increment counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Thread 2 to increment counter
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final counter value
        System.out.println("Counter: " + counter.getCount());
    }
}
