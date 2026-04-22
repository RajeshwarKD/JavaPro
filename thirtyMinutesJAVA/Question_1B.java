class Parents {
    int a=40;
    int b=20;
}
public class Question_1B extends Parents {
    int a = 100;
    int b = 200;
    void add(int a, int b) {
        System.out.println(a + this.b - super.a);
    }
    public static void main(String[] args) {
        Question_1B child = new Question_1B();
        child.add(10, 30);
    }
}

