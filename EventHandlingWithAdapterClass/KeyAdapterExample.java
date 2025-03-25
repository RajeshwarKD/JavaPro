import java.awt.*;
import java.awt.event.*;

public class KeyAdapterExample {
    Frame f;
    Label l;
    TextArea ta;

    KeyAdapterExample() {
        // 1st step: create components
        f = new Frame("KeyAdapter Example");
        l = new Label("Key events will appear here", Label.CENTER);
        l.setBounds(20, 50, 360, 20);
        ta = new TextArea();
        ta.setBounds(20, 80, 360, 280);

        // 2nd step: register listener using KeyAdapter
        ta.addKeyListener(new MyKeyAdapter());

        // Add components and set properties
        f.add(l);
        f.add(ta);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

        // Add window listener to close the window
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    // 3rd step: KeyAdapter implementation as inner class
    class MyKeyAdapter extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            l.setText("Key Released: " + e.getKeyChar());
        }

        public void keyTyped(KeyEvent e) {
            l.setText("Key Typed: " + e.getKeyChar());
        }
    }

    public static void main(String[] args) {
        new KeyAdapterExample();
    }
}