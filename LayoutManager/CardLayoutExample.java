import java.awt.*;
// CardLayout allows components to be stacked on top of each other, like a deck of cards. Only one component is
// visible at a time, and you can switch between components using methods like next() and previous().
// This layout is useful for creating wizards or multi-step processes.

public class CardLayoutExample {
    Frame f;
    Panel p;
    Button b1, b2, b3, b4;
    CardLayoutExample(){
        // Create a frame with a title
        f = new Frame("CardLayout Example");
        // Set the size of the frame (width, height)
        f.setSize(400, 300);

        // CardLayout manager
        CardLayout layout = new CardLayout();
        p = new Panel(layout);
        f.add(p);

        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");
        p.add(b1, "Button 1");
        p.add(b2, "Button 2");
        p.add(b3, "Button 3");
        p.add(b4, "Button 4");

        // Make the frame visible
        f.setVisible(true);

        b1.addActionListener(e -> layout.show(p, "Button 2"));
        b2.addActionListener(e -> layout.show(p, "Button 3"));
        b3.addActionListener(e -> layout.show(p, "Button 4"));
        b4.addActionListener(e -> layout.show(p, "Button 1"));
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }
}
