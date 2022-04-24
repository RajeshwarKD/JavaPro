package com.company;

import java.awt.*;

public class awtExtendsFrame extends Frame {
    public static void main(String[] args) {
        awtExtendsFrame frame = new awtExtendsFrame("My Frame");
        frame.setVisible(true);
        frame.setSize(600, 500);
        System.out.println("frame is created successfully through inherit class");
    }

    public  awtExtendsFrame(String title){
        super(title);
    }
}
