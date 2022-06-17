package com.company;

import javax.swing.*;
import java.awt.*;

public class swingPackageFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

//        frame.setSize(700,500);
//        frame.setLocation(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 1000, 500 );
        frame.setTitle(" My JFrame");

//        frame.setResizable(false);

//        ImageIcon icon = new ImageIcon("icon.png");
//        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
        c.setLayout(null);
//        Color color = new Color(255,0,0);
//        c.setBackground(Color.RED);

        JLabel label = new JLabel("User Name");
        label.setBounds(100,50,120,30);
        c.add(label);

        JTextField text = new JTextField();
        text.setBounds(200,50,120,30);
        c.add(text);

        JButton btn= new JButton("Click Here");
        btn.setBounds(100,100,120,30);
        c.add(btn);

        String[] values = {"A", "B", "C", "D"};

        JComboBox list = new JComboBox(values);
        list.setBounds(100,150,120,30);
        c.add(list);
//        list.setSelectedItem("B");
        list.setSelectedIndex(2);

        JScrollBar scrollBar = new JScrollBar();
        scrollBar.setBounds(400,100,120,30);
        c.add(scrollBar);


        frame.setVisible(true);
    }
}
