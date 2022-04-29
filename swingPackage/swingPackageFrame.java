package com.company;

import javax.swing.*;
import java.awt.*;

public class swingPackageFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(700,500);
        frame.setLocation(100,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(" My JFrame");
//        frame.setBounds(100,100,100,500);
        frame.setResizable(false);

        ImageIcon icon = new ImageIcon("icon.png");
        frame.setIconImage(icon.getImage());

        Container c = frame.getContentPane();
//        Color color = new Color(255,0,0);
        c.setBackground(Color.RED);
    }
}
