package checkedException;

public class InterruptedExceptionExample {
    public static void main(String[] args) {
        // Creating a new thread
        Thread thread = new Thread(() -> {
            try {
                // Making the thread sleep for 5 seconds
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e);
            }
        });

        // Starting the thread
        thread.start();

        // Interrupting the thread after 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted: " + e);
        }
        thread.interrupt();
    }
}

