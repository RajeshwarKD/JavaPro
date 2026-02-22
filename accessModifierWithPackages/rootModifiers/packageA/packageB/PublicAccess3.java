// Java program to illustrate public modifier
package rootModifiers.packageA.packageB;
// importing all classes in package
import rootModifiers.PublicAccess1;

public class PublicAccess3 {
    public static void main(String[] args) {
        // Trying to access public method of another class
        PublicAccess1 obj1 = new PublicAccess1();
        obj1.welcome();
    }
}
