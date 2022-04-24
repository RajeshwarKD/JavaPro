package com.company;

import java.awt.*;

public class awtPackage {
    public static void main(String[] args) {

        Frame frame = new Frame("My Frame");
        frame.setVisible(true);
        frame.setTitle("My New Frame");
        frame.setBackground(Color.BLUE);
        frame.setSize(600, 500);
        frame.setLocation(200,200);
        // frame.setBounds(100,200,700,500);

        frame.setLayout(new FlowLayout(FlowLayout.LEFT)); // Layout managers
        TextField tf = new TextField("This is Text Field");
        frame.add(tf);

        TextField tf1 = new TextField("This is Text Field 1");
        frame.add(tf1);
        TextField tf2 = new TextField("This is Text Field 2");
        frame.add(tf2);
        TextField tf3 = new TextField("This is Text Field 3");
        frame.add(tf3);

        System.out.println("frame is created successfully");
        System.out.println(tf.isEditable()); // return boolean value true and false, but TextField by default editable so value return always true
        System.out.println(tf.getText());

        Button button1 =new Button("login");
        Button button2 = new Button("Signup");
        frame.add(button1);
        frame.add(button2);

        button1.setLabel("Login label changed");
        button2.setLabel("Signup label changed");

        button1.setPreferredSize(new Dimension(150, 80));
        button2.setPreferredSize(new Dimension(150, 80));

        button1.setBackground(Color.YELLOW);
        button1.setForeground(Color.RED);

        button1.setEnabled(false);
        //button1.setVisible(false);
    }
}
