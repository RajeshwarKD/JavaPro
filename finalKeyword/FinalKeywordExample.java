// 1. FINAL CLASS
// A final class cannot be inherited (extended). 
// If you try 'class Child extends FinalClass', it will cause a compiler error.
final class FinalClass {
    void showMessage() {
        System.out.println("This is a message from a final class.");
    }
}

class Parent11 {
    // 2. FINAL VARIABLE
    // A final variable cannot be reassigned. It acts as a constant.
    final int SPEED_LIMIT = 90;

    // 3. FINAL METHOD
    // A final method cannot be overridden by child classes.
    final void displaySecurityCode() {
        System.out.println("Security Code: XY-99");
    }

    void normalMethod() {
        System.out.println("This method can be overridden.");
    }
}

class Child11 extends Parent11 {
    // If we try to write 'void displaySecurityCode()', it will throw an error.

    @Override
    void normalMethod() {
        System.out.println("Overridden method in Child class.");
    }
}

public class FinalKeywordExample {
    public static void main(String[] args) {
        Parent11 p = new Parent11();

        // Testing Final Variable
        System.out.println("Speed Limit: " + p.SPEED_LIMIT);
        // p.SPEED_LIMIT = 120; // ERROR: Cannot assign a value to a final variable

        // Testing Final Method
        p.displaySecurityCode();

        // Testing Final Class
        FinalClass fc = new FinalClass();
        fc.showMessage();

        System.out.println("\n--- Final Keyword uses successfully demonstrated ---");
    }
}