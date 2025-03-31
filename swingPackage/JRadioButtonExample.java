package SwingPackage;

import javax.swing.*;
public class JRadioButtonExample {
    JFrame f;
    JRadioButton r1, r2;
    JRadioButtonExample(){
        f = new JFrame(" My JFrame");
        r1 = new JRadioButton("A) Male");
        r2 = new JRadioButton("B) Female");
        r1.setBounds(75,50,100,30);
        r2.setBounds(75,100,100,30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);
        f.add(r1);f.add(r2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JRadioButtonExample();
    }
}
