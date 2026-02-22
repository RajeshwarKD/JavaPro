package packageA;

public class ParentClass {
    public String publicVar = "I am Public (Everywhere)";
    protected String protectedVar = "I am Protected (Package + SubPackage/Subclass)";
    String defaultVar = "I am Default (Package only)";
    private String privateVar = "I am Private (Class only)";

    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println(obj.publicVar);      // ✅ Works
        System.out.println(obj.protectedVar);   // ✅ Works
        System.out.println(obj.defaultVar);     // ✅ Works
        System.out.println(obj.privateVar);     // ✅ Works

    }
}