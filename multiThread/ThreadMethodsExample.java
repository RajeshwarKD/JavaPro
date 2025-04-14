public class ThreadMethodsExample {
    public static void main(String[] args) {
        // Creating threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread-2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread-3");

        // 1. start() - begins thread execution
        System.out.println("Starting Thread-1");
        thread1.start();

        // 2. run() - called by start(), but we can call directly (not recommended)
        System.out.println("Calling run() directly (not as a thread)");
        thread2.run(); // Runs in main thread, not as a separate thread

        // 3. sleep() - pauses thread execution
        try {
            System.out.println("Main thread sleeping for 1 second");
            Thread.sleep(1000); // Static method
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. currentThread() - returns reference to currently executing thread
        Thread current = Thread.currentThread();
        System.out.println("Current thread: " + current.getName());

        // 5. getName() and setName()
        System.out.println("Thread-1 name: " + thread1.getName());
        thread1.setName("Renamed-Thread-1");
        System.out.println("Thread-1 new name: " + thread1.getName());

        // 6. getPriority() and setPriority()
        System.out.println("Thread-1 priority: " + thread1.getPriority());
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread-1 new priority: " + thread1.getPriority());

        // 7. isAlive() - checks if thread is running
        System.out.println("Is Thread-1 alive? " + thread1.isAlive());

        // 8. join() - waits for thread to die
        try {
            System.out.println("Main thread waiting for Thread-1 to finish");
            thread1.join(2000); // Wait for 2 seconds max
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 9. interrupt() - interrupts the thread
        thread3.start();
        System.out.println("Interrupting Thread-3");
        thread3.interrupt();

        // 10. isInterrupted() - checks if thread is interrupted
        System.out.println("Is Thread-3 interrupted? " + thread3.isInterrupted());

        // 11. interrupted() - checks and clears interrupted status (static method)
        System.out.println("Static interrupted check: " + Thread.interrupted());

        // 12. isDaemon() and setDaemon()
        System.out.println("Is Thread-1 a daemon? " + thread1.isDaemon());
        thread3.setDaemon(true);
        System.out.println("Is Thread-3 now a daemon? " + thread3.isDaemon());

        // 13. getState() - returns thread state
        System.out.println("Thread-1 state: " + thread1.getState());
        System.out.println("Thread-3 state: " + thread3.getState());

        // 14. getId() - returns thread ID
        System.out.println("Thread-1 ID: " + thread1.getId());

        // 15. getThreadGroup() - returns thread's group
        System.out.println("Thread-1 group: " + thread1.getThreadGroup().getName());

        // 16. getStackTrace() - returns stack trace
        System.out.println("Thread-1 stack trace:");
        for (StackTraceElement element : thread1.getStackTrace()) {
            System.out.println("\t" + element);
        }

        // 17. getAllStackTraces() - returns all stack traces (static method)
        System.out.println("All stack traces:");
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            System.out.println("\t" + t.getName());
        }

        // 18. holdsLock(Object) - checks if current thread holds lock (static method)
        Object lock = new Object();
        synchronized (lock) {
            System.out.println("Does main thread hold lock? " + Thread.holdsLock(lock));
        }

        // 19. dumpStack() - prints stack trace (static method)
        System.out.println("Dumping stack:");
        Thread.dumpStack();

        System.out.println("Main thread exiting");
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running");

            try {
                // Demonstrate sleep and interrupt handling
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
                // Restore interrupted status
                Thread.currentThread().interrupt();
            }

            if (Thread.currentThread().isInterrupted()) {
                System.out.println(Thread.currentThread().getName() + " is in interrupted state");
            }

            System.out.println(Thread.currentThread().getName() + " is finishing");
        }
    }
}