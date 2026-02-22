package rootModifiers;
// Java program to illustrate error while Using class from different package with Private Modifier.
// The private modifier is visible only within the same class.


public class PrivateAccess1 {
    private void display() {
        System.out.println("Private Method: I am accessible from only within the class");
    }
    public static void main(String[] args) {
        PrivateAccess1 obj1 = new PrivateAccess1();
         obj1.display(); // ERROR: Cannot access private method from outside

    }
}
