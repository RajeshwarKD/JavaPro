package SwingPackage;
import javax.swing.*;

public class JLabelExample {
    JFrame f;
    JLabel l;
    JLabelExample(){
        // Create a frame with a title
        f = new JFrame("My First Swing Label With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        l = new JLabel("Enter your name:");
        l.setBounds(20, 40, 100, 20);
        f.add(l);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelExample();
    }
}
