package com.company;

import javax.swing.*;
import java.awt.*;

public class swingJTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" My JFrame");
        frame.setBounds(100, 100, 1000, 500 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setBounds(50,50,250,200);

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();

        panel1.add(new JLabel("This is my first page"));
        panel2.add(new JLabel("This is my second page"));
        panel3.add(new JLabel("This is my third page"));

        tabbedPane.add("First", panel1);
        tabbedPane.add("Second", panel2);
        tabbedPane.add("Third", panel3);

        frame.add(tabbedPane);

        frame.setVisible(true);
    }
}
