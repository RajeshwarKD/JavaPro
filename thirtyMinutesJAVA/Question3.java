public class Question3 {
    public static int x=7;
    public static void main(String[] args) {
        Question3 a = new Question3();
        Question3 b = new Question3();
        a.x=3;
        b.x=2;
        System.out.println(a.x-b.x+Question3.x);
    }
}
