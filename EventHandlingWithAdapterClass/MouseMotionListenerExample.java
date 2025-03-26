import java.awt.*;
import java.awt.event.*;

public class MouseMotionListenerExample implements MouseMotionListener {
    Frame f;
    Label l;

    MouseMotionListenerExample() {
        // 1st step: create components
        f = new Frame("MouseMotionListener Example");
        l = new Label();
        l.setBounds(50, 50, 250, 30); // Wider label to show coordinates

        // 2nd step: register listener
        f.addMouseMotionListener(this); // Register with the frame

        // Add components and set size, layout and visibility
        f.add(l);
        f.setSize(350, 250); // Slightly larger window
        f.setLayout(null);
        f.setVisible(true);
    }

    // 3rd step: Implement MouseMotionListener methods
    @Override
    public void mouseMoved(MouseEvent e) {
        l.setText("Mouse moved at: X=" + e.getX() + ", Y=" + e.getY());
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("Mouse dragged at: X=" + e.getX() + ", Y=" + e.getY());
        f.getGraphics().fillOval(e.getX()-2, e.getY()-2, 4, 4); // Draw small dot when dragging
    }

    public static void main(String[] args) {
        new MouseMotionListenerExample();
    }
}