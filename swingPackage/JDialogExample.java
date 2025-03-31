package SwingPackage;

import javax.swing.*;

public class JDialogExample {
    JFrame f;
    JDialog d;
    JDialogExample(){
        // Create a frame
        f = new JFrame();
        // Create a dialog component
        d = new JDialog(f,"My First Swing Dailog", true);
        // Set the size of the dialog (width, height)
        d.setSize(400, 150);
        // No layout manager
        d.setLayout(null);
        // Make the dialog visible
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new JDialogExample();
    }
}
