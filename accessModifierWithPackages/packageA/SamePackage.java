package packageA;

public class SamePackage {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println(obj.publicVar);      // ✅ Works
        System.out.println(obj.protectedVar);   // ✅ Works
        System.out.println(obj.defaultVar);     // ✅ Works
//        System.out.println(obj.privateVar);   // ❌ Error: private access
    }
}
