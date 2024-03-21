// Java program to illustrate
// public modifier
package p2;
// importing all classes in package p1
import p1.*;
public class F {
    public static void main(String args[]) {
        E obj = new E();
        // Trying to access public method
        // of another class
        obj.display();
    }
}
