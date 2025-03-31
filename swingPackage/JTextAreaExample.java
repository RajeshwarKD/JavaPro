package SwingPackage;
import javax.swing.*;

public class JTextAreaExample {
    JFrame f;
    JTextArea ta;

    JTextAreaExample() {
        // Create a frame with a title
        f = new JFrame("My First Swing TextArea With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position TextArea
        ta = new JTextArea();
        ta.setBounds(50, 50, 300, 200); // x, y, width, height
        f.add(ta);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaExample();
    }
}
