public class Question_1D extends Thread {
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println(++i);
        }
    }
    public static void main(String[] args) {
        Question_1D t1 = new Question_1D();
        t1.start();
    }
}
