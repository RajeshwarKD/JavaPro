// Java program to illustrate protected modifier
package rootModifiers.packageA.packageB;

import rootModifiers.packageA.ProtectedAccess1;
// importing all classes in package p1
// Class ProtectedAccess3 is subclass of ProtectedAccess1
public class ProtectedAccess3 extends ProtectedAccess1 {
    public static void main(String[] args) {
        // You were creating the Parent object.
        // FCreate the object of the CHILD class (ProtectedAccess3)
        ProtectedAccess3 obj3 = new ProtectedAccess3();
        // Trying to access protected method of another class
        // Now this works because ProtectedAccess3 "inherited" show()
        obj3.show();
    }
}