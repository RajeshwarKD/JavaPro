import java.awt.*;

// BorderLayout divides the container into five regions: NORTH, SOUTH, EAST, WEST, and CENTER. Components can be added to these regions,
// and they will occupy the available space accordingly. This layout manager is suitable for creating interfaces with distinct sections,
// such as a title bar, content area, and status bar.

public class BorderLayoutExample {
    Frame f;
    Button b1, b2, b3, b4, b5;
    BorderLayoutExample(){
        // Create a frame with a title
        f = new Frame("BorderLayout Example");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);
        // BorderLayout manager
        f.setLayout(new BorderLayout());
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        b5 = new Button("Button 5");
        f.add(b1, BorderLayout.NORTH);
        f.add(b2, BorderLayout.SOUTH);
        f.add(b3, BorderLayout.EAST);
        f.add(b4, BorderLayout.WEST);
        f.add(b5, BorderLayout.CENTER);

        // Make the frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
