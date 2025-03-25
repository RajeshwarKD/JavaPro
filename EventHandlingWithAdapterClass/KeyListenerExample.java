import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample implements KeyListener {
    Frame f;
    Label l;
    TextArea ta;

    KeyListenerExample() {
        //create components  //1st step
        f=new Frame("KeyListener Example");
        l = new Label();
        l.setBounds(20, 50, 360, 20);
        ta = new TextArea();
        ta.setBounds(20, 80, 360, 280);

        //register listener  //2nd step
        ta.addKeyListener(this);
        //add components and set size, layout and visibility
        f.add(l);
        f.add(ta);
        f.setSize (400, 400);
        f.setLayout (null);
        f.setVisible (true);
    }
    //3rd step
    @Override
    public void keyPressed (KeyEvent e) {
        l.setText ("Key Pressed");
    }
    @Override
    public void keyReleased (KeyEvent e) {
        l.setText ("Key Released");
    }
    @Override
    public void keyTyped (KeyEvent e) {
        l.setText ("Key Typed");
    }
    public static void main(String[] args) {
        new KeyListenerExample();
    }
}   