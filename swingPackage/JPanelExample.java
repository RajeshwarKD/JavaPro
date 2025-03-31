package SwingPackage;
import javax.swing.*;
import java.awt.*;

public class JPanelExample {
    JFrame f;
    JPanel p;

    JPanelExample() {
        // Create a frame with a title
        f = new JFrame("My First Swing Frame With Panel Example");

        // Create a panel
        p = new JPanel();

        // Set panel properties
        p.setBackground(Color.yellow);
        p.setBounds(50, 50, 300, 200); // x, y, width, height
        p.setLayout(null); // No layout manager for the panel

        // Add panel to the frame
        f.add(p);

        // Set frame properties
        f.setSize(400, 300);
        f.setLayout(null); // No layout manager for the frame
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}
