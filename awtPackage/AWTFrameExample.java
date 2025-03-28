import java.awt.*;

public class AWTFrameExample {
    Frame f;
    AWTFrameExample(){
        // Create a frame with a title
        f = new Frame("My First AWT Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);
        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTFrameExample();
    }
}
