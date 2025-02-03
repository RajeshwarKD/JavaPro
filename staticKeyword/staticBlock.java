//a static block in Java is automatically executed only once
// when the class is loaded into memory, meaning it runs before
// any objects of that class are created and even before the
// main method is called.
class Test2 {
    static {
        System.out.println("Static block is executed");
    }
    static void display() { // Static method
        System.out.println("static method is executed");
    }
}
public class staticBlock {
    public static void main(String[] args) {
        System.out.println("main method is executed");
        Test2.display();
    }
}
