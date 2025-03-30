import java.awt.*;

public class AWTCheckboxExample {
    Frame f;
    Checkbox cb;
    AWTCheckboxExample(){
        // Create a frame with a title
        f = new Frame("My First Checkbox With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        cb = new Checkbox("Enable feature");
        cb.setBounds(20, 70, 120, 20);
        f.add(cb);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTCheckboxExample();
    }
}
