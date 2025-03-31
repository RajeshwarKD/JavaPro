package SwingPackage;
import javax.swing.*;

public class JTextFieldExample {
    JFrame f;
    JTextField tf;
    JTextFieldExample(){
        // Create a frame with a title
        f = new JFrame("My First Swing TextField With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        tf = new JTextField();
        tf.setBounds(130, 40, 150, 20);
        f.add(tf);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldExample();
    }
}
