
class MyThread3 extends Thread {
    // initiated run method for Thread
    @Override
    public void run() {
        String str = "Thread Started Running...";
        System.out.println(str);
    }
}
public class ExtendsThreadClass{
    public static void main(String args[]) {
        MyThread3 t1 = new MyThread3();
        t1.start();
    }
}
