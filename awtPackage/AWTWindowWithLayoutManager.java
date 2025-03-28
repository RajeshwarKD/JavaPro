import java.awt.*;
import java.awt.event.*;

public class AWTWindowWithLayoutManager {
    Frame f;

    AWTWindowWithLayoutManager() {
        f = new Frame("AWT Window with Layout");
        f.setSize(400, 300);
        f.setLayout(new BorderLayout(5, 5)); // Use BorderLayout

        // North panel
        Panel northPanel = new Panel(new FlowLayout());
        northPanel.add(new Label("Enter your name:"));
        northPanel.add(new TextField(15));

        // Center panel
        Panel centerPanel = new Panel(new GridLayout(2, 2, 5, 5));
        centerPanel.add(new Checkbox("Enable feature"));

        Choice choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        centerPanel.add(choice);

        centerPanel.add(new Button("View"));
        centerPanel.add(new Button("Edit"));

        // South panel
        Panel southPanel = new Panel(new FlowLayout(FlowLayout.RIGHT));
        southPanel.add(new Button("OK"));
        southPanel.add(new Button("Cancel"));

        // Add panels to frame
        f.add(northPanel, BorderLayout.NORTH);
        f.add(centerPanel, BorderLayout.CENTER);
        f.add(southPanel, BorderLayout.SOUTH);

        // Window closing handler
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTWindowWithLayoutManager();
    }
}