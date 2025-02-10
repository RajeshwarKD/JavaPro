package uncheckedException;

public class IllegalThreadStateExceptionExample {
    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new Thread(() -> System.out.println("Thread is running"));

        // Starting the thread
        thread.start();

        // Trying to start the thread again, which will cause an IllegalThreadStateException
        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("Error: " + e);
        }
    }
}

