import java.awt.*;

public class AWTPanelExample {
    Frame f;
    Panel p;

    AWTPanelExample() {
        // Create a frame with a title
        f = new Frame("AWT Frame with Panel");

        // Create a panel
        p = new Panel();

        // Set panel properties
        p.setBackground(Color.LIGHT_GRAY);
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
        new AWTPanelExample();
    }
}