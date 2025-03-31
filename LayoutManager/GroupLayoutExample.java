import javax.swing.*;
import java.awt.*;
// GroupLayout is a versatile and complex layout manager that provides precise control over the positioning
// and sizing of components. It arranges components in a hierarchical manner using groups.
// GroupLayout is commonly used in GUI builders like the one in NetBeans IDE.

public class GroupLayoutExample  {
    private Frame frame;
    private Panel panel;
    private Button b1, b2, b3, b4;

    public GroupLayoutExample () {
        // Create and set up the window
        frame = new Frame("GroupLayout Example");
        frame.setSize(400, 300);

        // Create panel with GroupLayout
        panel = new Panel();
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);

        // Create buttons
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");

        // Set up horizontal group
        layout.setHorizontalGroup(layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                        .addComponent(b1)
                        .addComponent(b2))
                .addGroup(layout.createSequentialGroup()
                        .addComponent(b3)
                        .addComponent(b4)));

        // Set up vertical group
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup()
                        .addComponent(b1)
                        .addComponent(b2))
                .addGroup(layout.createParallelGroup()
                        .addComponent(b3)
                        .addComponent(b4)));

        // Add panel to frame
        frame.add(panel);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the event dispatch thread
         new GroupLayoutExample();
    }
}