package SwingPackage;
import javax.swing.*;

public class JFrameExample {
    JFrame f;
    JFrameExample(){
        // Create a frame with a title
        f = new JFrame("My First Swing Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);
        // Make the frame visible
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new JFrameExample();
    }
}
