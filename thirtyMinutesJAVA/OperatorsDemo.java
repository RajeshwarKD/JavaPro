public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // 1. Arithmetic Operators
        System.out.println("--- 1. Arithmetic Operators ---");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Division (a / b): " + (a / b));
        System.out.println("Modulus (a % b): " + (a % b));

        // 2. Unary Operators
        System.out.println("\n--- 2. Unary Operators ---");
        int x = 10;
        System.out.println("Original: " + x);
        System.out.println("Post-increment (x++): " + (x++)); // Prints 10, then x becomes 11
        System.out.println("Pre-increment (++x): " + (++x));  // x becomes 12, then prints 12
        System.out.println("Negation (!true): " + (!true));

        // 3. Relational (Comparison) Operators
        System.out.println("\n--- 3. Relational Operators ---");
        System.out.println("Equal to (a == b): " + (a == b));
        System.out.println("Not equal (a != b): " + (a != b));
        System.out.println("Greater than (a > b): " + (a > b));
        System.out.println("Less than or equal (a <= b): " + (a <= b));

        // 4. Logical Operators
        System.out.println("\n--- 4. Logical Operators ---");
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println("Logical AND (&&): " + (condition1 && condition2));
        System.out.println("Logical OR (||): " + (condition1 || condition2));

        // 5. Assignment Operators
        System.out.println("\n--- 5. Assignment Operators ---");
        int c = 20;
        c += 5; // c = c + 5
        System.out.println("Add and Assign (c += 5): " + c);
        c *= 2; // c = c * 2
        System.out.println("Multiply and Assign (c *= 2): " + c);

        // 6. Ternary Operator
        System.out.println("\n--- 6. Ternary Operator ---");
        // (condition) ? value_if_true : value_if_false
        int min = (a < b) ? a : b;
        System.out.println("Minimum of " + a + " and " + b + " is: " + min);

        // 7. Bitwise Operators
        System.out.println("\n--- 7. Bitwise Operators ---");
        // a = 10 (1010), b = 5 (0101)
        System.out.println("Bitwise AND (a & b): " + (a & b)); // 0000 -> 0
        System.out.println("Bitwise OR (a | b): " + (a | b));  // 1111 -> 15
        System.out.println("Left Shift (2 << 1): " + (2 << 1)); // 0010 becomes 0100 -> 4
    }
}