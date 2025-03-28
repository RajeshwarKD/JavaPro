import java.awt.*;

public class AWTLabelExample {
    Frame f;
    Label l;
    AWTLabelExample(){
        // Create a frame with a title
        f = new Frame("My First Label With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        l = new Label("Enter your name:");
        l.setBounds(20, 40, 100, 20);
        f.add(l);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTLabelExample();
    }
}
