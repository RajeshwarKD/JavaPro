package SwingPackage;

import javax.swing.*;
public class JComboBoxExample {
    JFrame f;
    JComboBox cb;
    JComboBoxExample(){
        String country[]={"India","Australia","U.S.A","England","NewZealand"};
        f=new JFrame("ComboBox Example");
        cb=new JComboBox(country);
        cb.setBounds(50, 50,90,20);
        f.add(cb);
        f.setLayout(null);
        f.setSize(300,200);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JComboBoxExample();
    }
}