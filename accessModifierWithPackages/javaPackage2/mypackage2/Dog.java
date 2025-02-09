package mypackage2;
public class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
    public void showActions() {
        eat(); // public method
        sleep(); // protected method
        run(); // default method
        // breathe(); // private method, not accessible
        showBreathe(); // Accessing private method through public method
    }
}