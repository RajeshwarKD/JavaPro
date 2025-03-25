import java.awt.*;
import java.awt.event.*;

public class MouseAdapterExample {
    Frame f;
    Label l;

    MouseAdapterExample() {
        // 1st step: create components
        f = new Frame("MouseAdapter Example");
        l = new Label("Mouse events will appear here", Label.CENTER);
        l.setBounds(50, 50, 200, 30);

        // 2nd step: register listener using MouseAdapter
        f.addMouseListener(new MyMouseAdapter());

        // Add components and set properties
        f.add(l);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);

        // Add window listener to close the window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    // 3rd step: MouseAdapter implementation as inner class
    class MyMouseAdapter extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            l.setText("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
        }

        public void mouseEntered(MouseEvent e) {
            l.setText("Mouse Entered");
            f.setBackground(Color.CYAN);
        }

        public void mouseExited(MouseEvent e) {
            l.setText("Mouse Exited");
            f.setBackground(Color.MAGENTA);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}