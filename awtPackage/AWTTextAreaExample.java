import java.awt.*;

public class AWTTextAreaExample {
    Frame f;
    TextArea ta;

    AWTTextAreaExample() {
        // Create a frame with a title
        f = new Frame("My First TextArea With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position TextArea
        ta = new TextArea();
        ta.setBounds(50, 50, 300, 200); // x, y, width, height
        f.add(ta);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTTextAreaExample();
    }
}