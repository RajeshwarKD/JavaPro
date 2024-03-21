// Java program to illustrate
// protected modifier
package p2;
// importing all classes in package p1
import p1.*;
// Class D is subclass of C
public class D extends C {
    public static void main(String args[]) {
        D obj = new D();
        // Trying to access protected method
        // of another class
        obj.display();
    }
}
