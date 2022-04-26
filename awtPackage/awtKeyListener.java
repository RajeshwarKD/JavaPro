package com.company;

import java.awt.*;
import java.awt.event.*;


class keyListenerFrame extends Frame {
    TextField text;

    keyListenerFrame(){
        setVisible(true);
        setSize(500,600);
        setLayout(new FlowLayout());
        text= new TextField(20);
        add(text);

        text.addKeyListener(new myKeyListener());
    }
}

class myKeyListener implements KeyListener{
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed : "+e.getKeyChar()+"& Code is : "+e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released : "+e.getKeyChar()+"& Code is : "+e.getKeyCode());
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed : "+e.getKeyChar()+"& Code is : "+e.getKeyCode());
    }
}

public class awtKeyListener{
    public static void main(String[] args) {
        keyListenerFrame frame = new keyListenerFrame();
    }
}