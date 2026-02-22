package packageB;
import packageA.ParentClass;

public class WorldClass {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println(obj.publicVar);      // ✅ Works
//        System.out.println(obj.protectedVar); // ❌ Error
//        System.out.println(obj.defaultVar);   // ❌ Error: Different package
//        System.out.println(obj.privateVar);   // ❌ Error: private access

}
}
