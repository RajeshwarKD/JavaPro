// Demonstrating various Thread methods and constructors

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}

class ThreadConstructorsMethodsExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");

        // Starting the threads
        t1.start();
        t2.start();

        // Checking if threads are alive
        System.out.println("Is " + t1.getName() + " alive? " + t1.isAlive());
        System.out.println("Is " + t2.getName() + " alive? " + t2.isAlive());

        // Getting the priority of threads
        System.out.println(t1.getName() + " priority: " + t1.getPriority());
        System.out.println(t2.getName() + " priority: " + t2.getPriority());

        // Setting the priority of threads
        t1.setPriority(Thread.MAX_PRIORITY); // Priority = 10
        t2.setPriority(Thread.MIN_PRIORITY); // Priority = 1

        System.out.println(t1.getName() + " new priority: " + t1.getPriority());
        System.out.println(t2.getName() + " new priority: " + t2.getPriority());

        try {
            // Joining the threads
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("All threads have finished execution");
    }
}
