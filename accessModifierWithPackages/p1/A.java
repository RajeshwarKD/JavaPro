// Java program to illustrate error while
// Using class from different package with
// Private Modifier
package p1;
// Class A
class A {
     void display() {
        System.out.println("Hello Friends I am Class A");
    }
}

// Class B
class B {
    public static void main(String args[]) {
        A obj = new A();
        // Trying to access private method
        // of another class
        obj.display();
    }
}