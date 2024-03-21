// Java program to illustrate error while
// using class from different package with
// default modifier
package p2;
import p1.*;
// This class is having default access modifier
public class GeekNew {
    public static void main(String[] args) {
        // Accessing class Geek from package p1
        Geek obj = new Geek();
        obj.display();
    }
}
