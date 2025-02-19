class MyThread10 extends Thread{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("My Cooking Thread is Running");
            System.out.println("I am sad!");
        }
    }
}

class MyThread20 extends Thread{
    @Override
    public void run(){
        for (int i=0; i<5; i++){
            System.out.println("My Chatting Threading is Running");
            System.out.println("I am happy!");
        }
    }
}
public class multiThread {
    public static void main(String[] args) {
        MyThread10 t1 = new MyThread10();
        MyThread20 t2 = new MyThread20();
        t1.start();
        t2.start();
    }
}
