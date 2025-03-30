// importing awt package  
import java.awt.*;

public class AWTScrollbarExample {
    Frame f;
    Scrollbar sb;

    // class constructor
    AWTScrollbarExample() {
        // creating a frame
        f = new Frame("My First Scrollbar Example");
        // setting size and layout of frame
        f.setSize(400, 400);
        f.setLayout(null);

        // creating a scroll bar
        sb = new Scrollbar();
        // setting the position of scroll bar
        sb.setBounds (100, 100, 50, 100);
        // adding scroll bar to the frame
        f.add(sb);

        // setting visibility of frame
        f.setVisible(true);
    }

    // main method
    public static void main(String args[]) {
        new AWTScrollbarExample();
    }
}    