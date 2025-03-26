import java.awt.*;
import java.awt.event.*;

public class AdjustmentListenerExample implements AdjustmentListener {
    Frame f;
    Scrollbar scrollbar;
    Label label;

    AdjustmentListenerExample() {
        f = new Frame("AdjustmentListener Example");

        // Create a vertical scrollbar (min=0, max=100, initial=50, visibleAmount=10)
        scrollbar = new Scrollbar(Scrollbar.VERTICAL, 50, 10, 0, 100);

        // Label to display scrollbar value
        label = new Label("Scrollbar Value: 50", Label.CENTER);

        // Set bounds (position and size)
        scrollbar.setBounds(30, 50, 30, 200);
        label.setBounds(80, 120, 150, 30);

        // Step 2: Register AdjustmentListener with the scrollbar
        scrollbar.addAdjustmentListener(this);

        // Add components to the frame
        f.add(scrollbar);
        f.add(label);

        f.setSize(300, 300);
        f.setLayout(null); // Using absolute positioning
        f.setVisible(true);
    }

    // Step 3: Override adjustmentValueChanged method (from AdjustmentListener)
    public void adjustmentValueChanged(AdjustmentEvent e) {
        // Update the label with the current scrollbar value
        label.setText("Scrollbar Value: " + scrollbar.getValue());
    }

    public static void main(String[] args) {
        new AdjustmentListenerExample();
    }
}