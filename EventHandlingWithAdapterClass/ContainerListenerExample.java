import java.awt.*;
import java.awt.event.*;

public class ContainerListenerExample implements ContainerListener {
    Frame f;
    Panel panel;
    Button addButton, removeButton;
    TextArea log;
    int counter = 0;

    public ContainerListenerExample() {
        f = new Frame("ContainerListener Example");
        f.setLayout(new BorderLayout());

        // Create control panel with buttons
        Panel controlPanel = new Panel();
        addButton = new Button("Add Component");
        removeButton = new Button("Remove Component");
        controlPanel.add(addButton);
        controlPanel.add(removeButton);

        // Create main panel that will receive components
        panel = new Panel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(300, 200));

        // Create log area
        log = new TextArea(10, 40);
        log.setEditable(false);

        // Add components to frame
        f.add(controlPanel, BorderLayout.NORTH);
        f.add(panel, BorderLayout.CENTER);
        f.add(log, BorderLayout.SOUTH);

        // Step 2: Register ContainerListener with the panel
        panel.addContainerListener(this);

        // Add button listeners
        addButton.addActionListener(e -> {
            Label newLabel = new Label("Label " + (++counter));
            panel.add(newLabel);
            panel.validate(); // Refresh layout
            log.append("Added: " + newLabel.getText() + "\n");
        });

        removeButton.addActionListener(e -> {
            if (panel.getComponentCount() > 0) {
                Component c = panel.getComponent(panel.getComponentCount() - 1);
                panel.remove(c);
                panel.validate();
                log.append("Removed: " + (c instanceof Label ? ((Label)c).getText() : c) + "\n");
            }
        });

        // Window listener for closing
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        f.pack();
        f.setVisible(true);
    }

    // Step 3: Implement ContainerListener methods
    public void componentAdded(ContainerEvent e) {
        log.append("[Event] Component added: " + e.getChild() + "\n");
    }

    public void componentRemoved(ContainerEvent e) {
        log.append("[Event] Component removed: " + e.getChild() + "\n");
    }

    public static void main(String[] args) {
        new ContainerListenerExample();
    }
}