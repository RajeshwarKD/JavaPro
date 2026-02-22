package rootModifiers.packageA;

// Illustration of Protected Modifier within the same package
public class ProtectedAccess2 {
    public static void main(String[] args) {
        // Changed ProtectedAcess to ProtectedAccess (matching the first class)
        ProtectedAccess1 obj1 = new ProtectedAccess1();

        // This works because they are in the same package (Package_A)
        obj1.show();
    }
}