package SwingPackage;
import javax.swing.*;

public class JCheckBoxExample {
    JFrame f;
    JCheckBox cb1, cb2;
    JCheckBoxExample(){
        f = new JFrame("CheckBox Example");
        cb1 = new JCheckBox("C++");
        cb1.setBounds(100,100, 100,50);
        cb2 = new JCheckBox("Java");
        cb2.setBounds(100,150, 100,50);
        f.add(cb1);
        f.add(cb2);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new JCheckBoxExample();
    }
}
