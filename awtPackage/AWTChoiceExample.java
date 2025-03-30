import java.awt.*;

public class AWTChoiceExample {
    Frame f;
    Choice c;
    AWTChoiceExample(){
        // Create a frame with a title
        f = new Frame("My First Choice-Component With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        c = new Choice();
        c.add("Option 1");
        c.add("Option 2");
        c.add("Option 3");
        c.setBounds(20, 100, 120, 20);

        f.add(c);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTChoiceExample();
    }
}
