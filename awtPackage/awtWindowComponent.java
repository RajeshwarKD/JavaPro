package com.company;
import java.awt.*;
import java.awt.event.*;

public class awtWindowComponent extends Frame implements WindowListener{
        awtWindowComponent(){
        setSize(300, 500);
        setLocation(200,300);
        setVisible(true);

        addWindowListener(this);
    }
    public static void main(String[] args) {
        awtWindowComponent wc = new awtWindowComponent();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("window is opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("window is closing");
        dispose(); // finally close the window
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("window is closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("windows is minimize");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("windows is maximize");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("window is activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("window is deactivated");
    }
}
