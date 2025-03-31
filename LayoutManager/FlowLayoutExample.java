import java.awt.*;

// FlowLayout is a simple layout manager that arranges components in a row, left to right, wrapping to the next line as needed.
// It is ideal for scenarios where components need to maintain their natural sizes and maintain a flow-like structure.

public class FlowLayoutExample {
    Frame f;
    Button b1, b2, b3, b4;
    FlowLayoutExample(){
        // Create a frame with a title
        f = new Frame("FlowLayout Example");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // FlowLayout manager
        f.setLayout(new FlowLayout());

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);

        // Make the frame visible
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}
