import java.awt.*;
import java.awt.event.*;


public class MouseListenerExample implements MouseListener{
    Frame f;
    Label l;
    MouseListenerExample(){
        //create components  //1st step
        f=new Frame("MouseListener Example");
        l=new Label();
        l.setBounds(50, 50, 200, 30);

        //register listener  //2nd step
        l.addMouseListener(this); //passing current instance

        //add components and set size, layout and visibility
        f.add(l);
        f.setSize(300,200);
        f.setLayout(null);
        f.setVisible(true);
    }
    //3rd step
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public static void main(String[] args) {
        new MouseListenerExample();
    }
}  