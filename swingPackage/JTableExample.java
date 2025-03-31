package SwingPackage;
import javax.swing.*;
public class JTableExample {
    JFrame f;
    JTable jt;
    JTableExample(){
        f = new JFrame(" My JFrame");
        String data[][]={ {"101","Amit","670000"},
                {"102","Jai","780000"},
                {"101","Sachin","700000"}};
        String column[]={"ID","NAME","SALARY"};
        jt = new JTable(data,column);
        jt.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(jt);
        f.add(sp);
        f.setSize(300,400);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JTableExample();
    }
}