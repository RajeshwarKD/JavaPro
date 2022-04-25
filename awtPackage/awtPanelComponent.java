package com.company;
import java.awt.*;
import java.awt.event.*;

public class awtPanelComponent {
    public static void main(String[] args) {
        myFrame panel = new myFrame();
    }
}

class myFrame extends Frame{
    myFrame(){
        setTitle(" Panel Component");
        setVisible(true);
        setSize(500, 500);
        setLayout(new BorderLayout());

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();

        add(p1, BorderLayout.EAST);
        add(p2, BorderLayout.WEST);
        add(p3, BorderLayout.NORTH);
        add(p4, BorderLayout.SOUTH);
        add(p5, BorderLayout.CENTER);

        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLUE);
        p4.setBackground(Color.YELLOW);
        p5.setBackground(Color.BLACK);

        p1.setPreferredSize(new Dimension(150, 200));
        p2.setPreferredSize(new Dimension(150, 200));
        p3.setPreferredSize(new Dimension(200, 100));
        p4.setPreferredSize(new Dimension(200, 100));
        p5.setPreferredSize(new Dimension(50, 50));
    }
}