import java.awt.*;

public class AWTTextFieldExample {
    Frame f;
    TextField tf;
    AWTTextFieldExample(){
        // Create a frame with a title
        f = new Frame("My First TextField With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        tf = new TextField();
        tf.setBounds(130, 40, 150, 20);
        f.add(tf);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTTextFieldExample();
    }
}
