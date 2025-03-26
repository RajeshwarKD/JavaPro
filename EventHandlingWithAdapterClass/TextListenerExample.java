import java.awt.*;
import java.awt.event.*;

// Step 1: Implement the TextListener interface
public class TextListenerExample implements TextListener {
    Frame f;
    TextField tf1, tf2;
    Label label;

    TextListenerExample() {
        f = new Frame("TextListener Example");

        // Create components
        label = new Label("Text changes will appear below:");
        tf1 = new TextField();
        tf2 = new TextField();
        tf2.setEditable(false); // Make the second text field read-only

        // Set bounds (position and size)
        label.setBounds(30, 50, 250, 20);
        tf1.setBounds(30, 80, 200, 30);
        tf2.setBounds(30, 120, 200, 30);

        // Step 2: Register TextListener with tf1
        tf1.addTextListener(this);

        // Add components to the frame
        f.add(label);
        f.add(tf1);
        f.add(tf2);

        f.setSize(300, 200);
        f.setLayout(null); // Using absolute positioning
        f.setVisible(true);
    }

    // Step 3: Override textValueChanged method (from TextListener)
    public void textValueChanged(TextEvent e) {
        // Update tf2 with the current text from tf1
        tf2.setText("You typed: " + tf1.getText());
    }

    public static void main(String[] args) {
        new TextListenerExample();
    }
}