package rootModifiers.packageA;
//Visible within the same package AND in subclasses (even if they are in different packages).


public class ProtectedAccess1 {

    // 1. Move the method OUTSIDE of main
    protected void show() {
        System.out.println("Protected Method: Accessible via Inheritance");
    }

    public static void main(String[] args) {
        // 2. To call a non-static method, create an object
        ProtectedAccess1 obj1 = new ProtectedAccess1();
        obj1.show();
    }
}
