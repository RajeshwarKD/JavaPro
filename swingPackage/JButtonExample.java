package SwingPackage;
import javax.swing.*;

public class JButtonExample {
    JFrame f;
    JButton b;
    JButtonExample(){
        // Create a frame with a title
        f = new JFrame("My First Swing Button With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        b = new JButton("Submit");
        b.setBounds(150, 200, 80, 30);
        f.add(b);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JButtonExample();
    }
}
