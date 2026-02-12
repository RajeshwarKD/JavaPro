import java.util.Scanner;

// Base Class
class Shape {
    double x, y;

    // Base Class Constructor
    Shape() {
        System.out.println("1. Base Class (Shape) Constructor Called.");
    }

    // Method to accept coordinates
    void getXYValue(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Method to display coordinates
    void showXYValue() {
        System.out.println("Coordinates: (" + x + ", " + y + ")");
    }
}

// Subclass
class Rectangle extends Shape {
    double length, breadth;

    // Subclass Constructor
    Rectangle(double l, double b) {
        // super(); is implicitly called here by Java
        this.length = l;
        this.breadth = b;
        System.out.println("2. Subclass (Rectangle) Constructor Called.");
    }

    // Overriding the showXYValue() method
    @Override
    void showXYValue() {
        // Calling the parent version of the method
        super.showXYValue();
        System.out.println("Rectangle Dimensions: Length = " + length + ", Breadth = " + breadth);
        System.out.println("Area: " + (length * breadth));
    }
}

public class ProgramNo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of X coordinate: ");
        double x = sc.nextDouble();
        System.out.print("Enter value of Y coordinate: ");
        double y = sc.nextDouble();
        System.out.print("Enter value of Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter value of Breadth: ");
        double b = sc.nextDouble();

        System.out.println("\n--- Initializing Objects ---");
        // Creating the subclass object
        Rectangle rect = new Rectangle(l, b);

        // Setting coordinates using base class method
        rect.getXYValue(x, y);

        System.out.println("\n--- Displaying Values (Method Overriding) ---");
        // Calling the overridden method
        rect.showXYValue();

        sc.close();
    }
}