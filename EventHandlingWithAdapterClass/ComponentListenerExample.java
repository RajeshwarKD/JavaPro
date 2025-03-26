import java.awt.*;
import java.awt.event.*;

public class ComponentListenerExample implements ComponentListener {
    Frame f;
    Label label;
    TextArea log;

    ComponentListenerExample() {
        f = new Frame("ComponentListener Example");

        // Create a label to display current component status
        label = new Label("Component Events Log:", Label.CENTER);

        // Create a text area to log component events
        log = new TextArea();
        log.setEditable(false); // Make it read-only

        // Set bounds (position and size)
        label.setBounds(20, 30, 260, 20);
        log.setBounds(20, 60, 260, 200);

        // Step 2: Register ComponentListener with the frame
        f.addComponentListener(this);

        // Add components to the frame
        f.add(label);
        f.add(log);

        f.setSize(300, 300);
        f.setLayout(null); // Using absolute positioning
        f.setVisible(true);
    }

    // Step 3: Implement all ComponentListener methods
    @Override
    public void componentResized(ComponentEvent e) {
        log.append("Frame resized to: " + f.getWidth() + "x" + f.getHeight() + "\n");
    }
    @Override
    public void componentMoved(ComponentEvent e) {
        log.append("Frame moved to: (" + f.getX() + ", " + f.getY() + ")\n");
    }
    @Override
    public void componentShown(ComponentEvent e) {
        log.append("Frame is now visible\n");
    }
    @Override
    public void componentHidden(ComponentEvent e) {
        log.append("Frame is now hidden\n");
    }

    public static void main(String[] args) {
        new ComponentListenerExample();
    }
}