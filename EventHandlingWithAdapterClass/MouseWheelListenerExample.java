import java.awt.*;
import java.awt.event.*;

public class MouseWheelListenerExample implements MouseWheelListener {
    Frame f;
    Label l;
    int scrollCount = 0;

    MouseWheelListenerExample() {
        // 1st step: create components
        f = new Frame("MouseWheelListener Example");
        l = new Label("Scroll the mouse wheel here", Label.CENTER);
        l.setBounds(50, 50, 250, 30);
        l.setBackground(Color.LIGHT_GRAY);

        // 2nd step: register listener
        f.addMouseWheelListener(this);
        l.addMouseWheelListener(this);

        // Add components and set size, layout and visibility
        f.add(l);
        f.setSize(350, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    // 3rd step: Implement MouseWheelListener method
    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        scrollCount += e.getWheelRotation();
        String direction = e.getWheelRotation() > 0 ? "Down" : "Up";
        int notches = Math.abs(e.getWheelRotation());

        l.setText("Scrolled " + direction + " (" + notches + " notch" +
                (notches != 1 ? "es" : "") + ") | Total: " + scrollCount);

        // Visual feedback
        l.setBackground(e.getWheelRotation() > 0 ?
                new Color(255, 200, 200) : // light red for down
                new Color(200, 255, 200)); // light green for up

        // Reset color after short delay
        new Thread(() -> {
            try { Thread.sleep(200); }
            catch (InterruptedException ex) {}
            EventQueue.invokeLater(() -> l.setBackground(Color.LIGHT_GRAY));
        }).start();
    }

    public static void main(String[] args) {
        new MouseWheelListenerExample();
    }
}