package rootModifiers;

public class PublicAccess1 {
    public void welcome() {
        System.out.println("Public: I am accessible from any package!");
    }
    public static void main(String[] args) {
        PublicAccess1 obj1 = new PublicAccess1();
        obj1.welcome();
    }
}
