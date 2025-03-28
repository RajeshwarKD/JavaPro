import java.awt.*;

public class AWTButtonExample {
    Frame f;
    Button b;
    AWTButtonExample(){
        // Create a frame with a title
        f = new Frame("My First Button With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        b = new Button("Submit");
        b.setBounds(150, 200, 80, 30);
        f.add(b);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTButtonExample();
    }
}
