import java.util.Scanner;

// Abstract Base Class
abstract class Dimension {
    double val1, val2;

    // Constructor to initialize dimensions
    Dimension(double a, double b) {
        this.val1 = a;
        this.val2 = b;
    }

    // Abstract method: No body here, implementation is forced on subclasses
    abstract void displayArea();
}

// Subclass for Rectangle
class RectangleSubClass  extends Dimension {

    RectangleSubClass (double length, double breadth) {
        super(length, breadth);
    }

    // Implementing the abstract method
    @Override
    void displayArea() {
        double area = val1 * val2;
        System.out.println("Rectangle Area (Length * Breadth): " + area);
    }
}

// Subclass for Triangle
class TriangleSubClass  extends Dimension {

    TriangleSubClass (double base, double height) {
        super(base, height);
    }

    // Implementing the abstract method
    @Override
    void displayArea() {
        double area = 0.5 * val1 * val2;
        System.out.println("Triangle Area (0.5 * Base * Height): " + area);
    }
}

public class ProgramNo4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for Rectangle
        System.out.print("Enter Rectangle Length and Breadth: ");
        RectangleSubClass  rect = new RectangleSubClass (input.nextDouble(), input.nextDouble());

        // Input for Triangle
        System.out.print("Enter Triangle Base and Height: ");
        TriangleSubClass  tri = new TriangleSubClass (input.nextDouble(), input.nextDouble());

        System.out.println("\n--- Calculating Areas ---");
        rect.displayArea();
        tri.displayArea();

        input.close();
    }
}