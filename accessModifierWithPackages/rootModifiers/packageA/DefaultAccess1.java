// Save in Package A
package rootModifiers.packageA;
// Java program to illustrate default modifier
//If you don't use any keyword, it is Default. It is visible only within the same package.
class DefaultExample1{
    void massage() { // No modifier means 'default'
        System.out.println("Hello from Default (Same Package Only)");
    }
}
public class DefaultAccess1 {
    public static void main(String[] args) {
        DefaultExample1 obj1 = new DefaultExample1();
        obj1.massage();
    }
}
