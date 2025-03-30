import java.awt.*;

public class AWTDialogExample {
    Frame f;
    Dialog d;
    AWTDialogExample(){
        // Create a frame
        f = new Frame();
        // Create a dialog component
        d = new Dialog(f,"My First AWT Dailog", true);
        // Set the size of the dialog (width, height)
        d.setSize(400, 150);
        // No layout manager
        d.setLayout(null);
        // Make the dialog visible
        d.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTDialogExample();
    }
}
