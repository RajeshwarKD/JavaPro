// Java Program to illustrate Creation and execution of
// thread via start() and run() method in Single inheritance

// Class 1 Helper thread Class extending main Thread Class
class MyThread1 extends Thread {

    // Method inside MyThread1
    // run() method which is called as soon as thread is started
    @Override
    public void run() {
        // Print statement when the thread is called
        System.out.println("Thread1 is running");
    }
}

// Class 2 Main thread Class extending main Thread Class
class MyThread2 extends Thread {

    // Method inside MyThread2
    // run() method which is called as soon as thread is started
    @Override
    public void run() {
        // run() method which is called as soon as thread is started
        // Print statement when the thread is called
        System.out.println("Thread2 is running");
    }
}

// Class 3 Main Class
class ThreadClass {
    // Main method
    public static void main(String[] args) {
        // Creating a thread object of our thread class
        MyThread1 obj1 = new MyThread1();
        MyThread2 obj2 = new MyThread2();

        // Getting the threads to the run state

        // This thread will transcend from runnable to run
        // as start() method will look for run() and execute it
        obj1.start();

        // This thread will also transcend from runnable to
        // run as start() method will look for run() and execute it
        obj2.start();
    }
}
