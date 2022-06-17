package com.company;

import javax.swing.*;
import java.awt.*;

public class swingJScrollPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame(" My JFrame");
        frame.setBounds(100, 100, 1000, 500 );
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextArea textArea = new JTextArea(10,15);
        JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        frame.add(scrollPane);


        frame.setVisible(true);
    }
}
