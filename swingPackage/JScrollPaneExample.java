package SwingPackage;
import javax.swing.*;

public class JScrollPaneExample {
    JFrame f;
    JTextArea ta;
    JScrollPane scrollPane;
    JScrollPaneExample(){
        // Create a frame with a title
        f = new JFrame("My First Swing ScrollPane With TextArea");
        // Set the boundary and size of the frame (x-cor, y-cor, width, height)
        f.setBounds(200, 200, 300, 200);
        // Create and position TextArea
        ta = new JTextArea(20, 50);
        scrollPane = new JScrollPane(ta,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // Add the scroll pane (which contains the text area) to the frame
        f.add(scrollPane);
        // Make the frame visible
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new JScrollPaneExample();
    }
}
