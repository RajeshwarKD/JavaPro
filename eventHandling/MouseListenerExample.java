import java.awt.*;
import java.awt.event.*;


public class MouseListenerExample extends Frame implements MouseListener{
    Frame f;
    Label l;
    MouseListenerExample(){
        //create components  //1st step
        f=new Frame("MouseListener Example");
        l=new Label();
        l.setBounds(20,50,100,20);

        //register listener  //2nd step
        l.addMouseListener(this); //passing current instance

        //add components and set size, layout and visibility
        f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    //3rd step
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public static void main(String[] args) {
        new MouseListenerExample();
    }
}  