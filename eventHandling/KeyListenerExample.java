import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample extends Frame implements KeyListener {
    Frame f;
    Label l;
    TextArea ta;

    KeyListenerExample() {
        f=new Frame("KeyListener Example");
        l = new Label();
        l.setBounds (20, 50, 100, 20);
        ta = new TextArea();
        ta.setBounds (20, 80, 300, 300);

        ta.addKeyListener(this);

        f.add(l);
        f.add(ta);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible (true);
    }
    public void keyPressed (KeyEvent e) {
        l.setText ("Key Pressed");
    }
    public void keyReleased (KeyEvent e) {
        l.setText ("Key Released");
    }
    public void keyTyped (KeyEvent e) {
        l.setText ("Key Typed");
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}   