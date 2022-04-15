import java.awt.*;
import java.awt.event.*;

//1st step
public class eventHandling implements ActionListener{
    Frame f;
    TextField tf;
    Button b;

    eventHandling(){
        f=new Frame("ActionListener Example");
        tf= new TextField();
        tf.setBounds(50, 50, 300, 20);
        b= new Button ("Click Here");
        b.setBounds(50, 100, 70, 30);

        //2nd step
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
    //3rd step
    public void actionPerformed(ActionEvent ae){
        tf.setText("Welcome to the Event Handling Program");
    }

    public static void main(String[] args) {
        eventHandling ae = new eventHandling();
        //new eventHandling();
    }
}
