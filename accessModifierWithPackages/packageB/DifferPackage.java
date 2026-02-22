package packageB;
import packageA.ParentClass;

public class DifferPackage extends ParentClass {
    public static void main(String[] args) {
        // ❌ DON'T DO THIS:
        // ParentClass obj = new ParentClass();
        // ✅ DO THIS:
        DifferPackage obj = new DifferPackage();

        System.out.println(obj.publicVar);      // ✅ Works
        System.out.println(obj.protectedVar);   // ✅ Works (through inheritance)
//        System.out.println(obj.defaultVar);   // ❌ Error: Different package
//        System.out.println(obj.privateVar);   // ❌ Error: private access

    }
}
