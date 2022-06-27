import javax.swing.*;
import java.awt.event.*;
public class SwingCalci implements ActionListener {
    JFrame frame;
    JTextField textField;
    JButton button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonDot, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEql, buttonDel, buttonClr;
    double a, b, result;
    int operator;
    SwingCalci(){
        frame=new JFrame("Swing-Calculator");
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20, 20, 300, 350);
        frame.setResizable(false);

        textField=new JTextField();
        textField.setBounds(40,40,200,50);

        button1=new JButton("1");
        button2=new JButton("2");
        button3=new JButton("3");
        button4=new JButton("4");
        button5=new JButton("5");
        button6=new JButton("6");
        button7=new JButton("7");
        button8=new JButton("8");
        button9=new JButton("9");
        button0=new JButton("0");
        buttonDot=new JButton(".");

        buttonAdd =new JButton("+");
        buttonSub=new JButton("-");
        buttonMul=new JButton("*");
        buttonDiv=new JButton("/");
        buttonEql =new JButton("=");

        buttonDel=new JButton("Delete");
        buttonClr=new JButton("Clear");

        button7.setBounds(40,100,50,40);
        button8.setBounds(90,100,50,40);
        button9.setBounds(140,100,50,40);
        buttonDiv.setBounds(190,100,50,40);

        button4.setBounds(40,140,50,40);
        button5.setBounds(90,140,50,40);
        button6.setBounds(140,140,50,40);
        buttonMul.setBounds(190,140,50,40);

        button1.setBounds(40,180,50,40);
        button2.setBounds(90,180,50,40);
        button3.setBounds(140,180,50,40);
        buttonSub.setBounds(190,180,50,40);

        buttonDot.setBounds(40,220,50,40);
        button0.setBounds(90,220,50,40);
        buttonEql.setBounds(140,220,50,40);
        buttonAdd.setBounds(190,220,50,40);

        buttonDel.setBounds(40,260,100,40);
        buttonClr.setBounds(140,260,100,40);

        frame.add(textField);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button0);
        frame.add(buttonDot);
        frame.add(buttonAdd);
        frame.add(buttonSub);
        frame.add(buttonMul);
        frame.add(buttonDiv);
        frame.add(buttonEql);
        frame.add(buttonDel);
        frame.add(buttonClr);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        button0.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDiv.addActionListener(this);
        buttonEql.addActionListener(this);
        buttonDel.addActionListener(this);
        buttonClr.addActionListener(this);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SwingCalci();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source==button1){
            textField.setText(textField.getText() + "1");
        } else if (source==button2){
            textField.setText(textField.getText() + "2");
        } else if (source==button3){
            textField.setText(textField.getText() + "3");
        } else if (source==button4){
            textField.setText(textField.getText() + "4");
        } else if (source==button5){
            textField.setText(textField.getText() + "5");
        } else if (source==button6){
            textField.setText(textField.getText() + "6");
        } else if (source==button7){
            textField.setText(textField.getText() + "7");
        } else if (source==button8){
            textField.setText(textField.getText() + "8");
        } else if (source==button9){
            textField.setText(textField.getText() + "9");
        } else if (source==button0){
            textField.setText(textField.getText() + "0");
        }

        else if (source == buttonDot) {
            if (textField.getText().contains(".")) {
                return;
            } else {
                textField.setText(textField.getText() + ".");
            }
        }
        else if (source==buttonAdd) {
            a = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 1;
        } else if (source==buttonSub) {
            a = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 2;
        } else if (source==buttonMul) {
            a = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 3;
        } else if (source==buttonDiv) {
            a = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = 4;
        }

        else if (source==buttonEql) {
            b = Double.parseDouble(textField.getText());
            switch (operator){
                case 1:result =a+b;
                    break;
                case 2:result =a-b;
                    break;
                case 3:result =a*b;
                    break;
                case 4:result =a/b;
                    break;
            }
            textField.setText(""+result);
        }

        else if (source==buttonClr){
            textField.setText("");
        }

        else if (source==buttonDel){
            String s=textField.getText();
            textField.setText("");
            for (int i=0; i<s.length()-1; i++)
                textField.setText(textField.getText()+s.charAt(i));
        }
    }
}
