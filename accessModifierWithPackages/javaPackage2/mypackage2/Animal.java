// a program that demonstrates the use of a user-defined package with all access modifiers. I'll create a package named mypackage
// with a class Animal that uses different access modifiers. Then, I'll create another class Dog in the same package to demonstrate
// inheritance and access to the members of Animal.

package mypackage2;
public class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
    protected void sleep() {
        System.out.println("Sleeping...");
    }
    void run() {
        System.out.println("Running...");
    }
    private void breathe() {
        System.out.println("Breathing...");
    }
    // Method to demonstrate access to private method within the same class
    public void showBreathe() {
        breathe();
    }
}