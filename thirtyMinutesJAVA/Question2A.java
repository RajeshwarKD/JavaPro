class Parents {
    int a = 40, b = 20;
}
public class Question2A extends Parents {
    int a = 100;
    int b = 200;
    void add(int a, int b) {
        System.out.println(a + this.b - super.a);
    }
    public static void main(String[] args) {
        Question2A child = new Question2A();
        child.add(10, 30);
    }
}
