import java.awt.*;
import java.awt.event.*;

public class FocusListenerExample implements FocusListener {
    Frame f;
    TextField field1, field2;
    TextArea log;

    public FocusListenerExample() {
        f = new Frame("FocusListener Example");
        f.setLayout(new GridLayout(3, 1));

        // Create text fields
        field1 = new TextField("First Field");
        field2 = new TextField("Second Field");

        // Create log area
        log = new TextArea();
        log.setEditable(false);

        // Step 2: Register FocusListener with both text fields
        field1.addFocusListener(this);
        field2.addFocusListener(this);

        // Add components to frame
        f.add(field1);
        f.add(field2);
        f.add(log);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Step 3: Implement FocusListener methods
    @Override
    public void focusGained(FocusEvent e) {
        Component source = e.getComponent();
        log.append(source.getClass().getSimpleName() + " gained focus\n");
        source.setBackground(Color.YELLOW);
    }
    @Override
    public void focusLost(FocusEvent e) {
        Component source = e.getComponent();
        log.append(source.getClass().getSimpleName() + " lost focus\n");
        source.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new FocusListenerExample();
    }
}