package SwingPackage;
import javax.swing.*;

public class JListExample {
    JFrame f;
    JList<String> list;
    JListExample(){
        f = new JFrame(" My JFrame");
        DefaultListModel<String> l1 = new DefaultListModel<>();
        l1.addElement("Item1");
        l1.addElement("Item2");
        l1.addElement("Item3");
        l1.addElement("Item4");
        list = new JList<>(l1);
        list.setBounds(100,100, 75,75);
        f.add(list);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]) {
        new JListExample();
    }
}