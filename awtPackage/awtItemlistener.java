import java.awt.*;
import java.awt.event.*;

public class awtItemlistener extends Frame implements ItemListener {

    Choice list;

    awtItemlistener(){
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        list = new Choice();
        list.setBounds(100,100,75,75);
        list.add("Background Color is Blue");
        list.add("Background Color is Red");
        list.add("Background Color is Yellow");
        list.add("Background Color is Green");
        list.add("Background Color is Black");
        add(list);

        list.addItemListener(this);
    }

    public static void main(String[] args) {
        awtItemlistener frame = new awtItemlistener();
    }

    public void itemStateChanged(ItemEvent ie){
        if(list.getSelectedIndex()==0){
            setBackground(Color.BLUE);
        }
        else if(list.getSelectedIndex()==1){
            setBackground(Color.RED);
        }
        else if(list.getSelectedIndex()==2){
            setBackground(Color.YELLOW);
        }
        else if(list.getSelectedIndex()==3){
            setBackground(Color.GREEN);
        }
        else if(list.getSelectedIndex()==4){
            setBackground(Color.BLACK);
        }
    }
}

