package SwingPackage;
import javax.swing.*;


public class JScrollBarExample {
    JFrame f;
    JScrollBar sb;

    // class constructor
    JScrollBarExample() {
        // creating a frame
        f = new JFrame("My First Swing ScrollBar Example");
        // setting size and layout of frame
        f.setSize(400, 400);
        f.setLayout(null);

        // creating a scroll bar
        sb = new JScrollBar();
        // setting the position of scroll bar
        sb.setBounds (100, 100, 50, 100);
        // adding scroll bar to the frame
        f.add(sb);

        // setting visibility of frame
        f.setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        new JScrollBarExample();
    }
}
