import java.awt.*;

public class AWTListExample {
    Frame f;
    List l;
    AWTListExample(){
        // Create a frame with a title
        f = new Frame("My First List With Frame");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // No layout manager
        f.setLayout(null);

        // Create and position components
        l = new List(3, false);
        l.add("Item A");
        l.add("Item B");
        l.add("Item C");
        l.add("Item D");
        l.setBounds(20, 130, 120, 60);
        f.add(l);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTListExample();
    }
}
