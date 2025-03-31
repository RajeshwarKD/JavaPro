package SwingPackage;

import javax.swing.*;
public class JPasswordFieldExample {
    JFrame f;
    JLabel l;
    JPasswordField value;
    JPasswordFieldExample(){
        f = new JFrame("Password Field Example");
        l = new JLabel("Password:");
        value = new JPasswordField();
        l.setBounds(20,100, 80,30);
        value.setBounds(100,100,100,30);
        f.add(value);  f.add(l);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JPasswordFieldExample();
    }
}
