import java.util.Scanner; // Import the Scanner class

class Box1 {
    double width, height, depth;

    // Constructor to initialize the box dimensions
    Box1(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    // Formula: V = (w * h * d)
    double calculateVolume() {
        return width * height * depth;
    }

    // Formula: A = 2(wd + hd + wh)
    double calculateSurfaceArea() {
        return 2 * (width * depth + height * depth + width * height);
    }
}

public class ProgramNo1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Asking user for dimensions
        System.out.print("Enter width: ");
        double w = input.nextDouble();

        System.out.print("Enter height: ");
        double h = input.nextDouble();

        System.out.print("Enter depth: ");
        double d = input.nextDouble();

        // Create the Box object using the constructor
        Box1 myBox = new Box1(w, h, d);

        // Displaying results
        System.out.println("\n--- Box Details ---");
        System.out.println("Volume: " + myBox.calculateVolume());
        System.out.println("Surface Area: " + myBox.calculateSurfaceArea());

        // Close the scanner to prevent resource leaks
        input.close();
    }
}