
class MyThread4 implements Runnable {
    // Method to start Thread
    @Override
    public void run() {
        String str = "Thread is Running Successfully";
        System.out.println(str);
    }
}
public class ImplementsRunnableInterface {
    public static void main(String[] args) {
        MyThread4 g1 = new MyThread4();

        // initializing Thread Object
        Thread t1 = new Thread(g1);
        // Running Thread
        t1.start();
    }
}
