import java.awt.*;
// GridBagLayout is a powerful layout manager that allows you to create complex layouts by specifying
// constraints for each component. It arranges components in a grid, but unlike GridLayout,
// it allows components to span multiple rows and columns and have varying sizes.
public class GridBagLayoutExample {
    Frame f;
    Button b1, b2, b3, b4;

    GridBagLayoutExample() {
        // Create frame
        f = new Frame("GridBagLayout Example");
        f.setSize(400, 300);
        f.setLayout(new GridBagLayout());

        // Create constraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        // Create buttons
        b1 = new Button("Button 1");
        b2 = new Button("Button 2");
        b3 = new Button("Button 3");
        b4 = new Button("Button 4");

        // Add buttons with grid positions
        addButton(b1, 0, 0, gbc); // Row 0, Column 0
        addButton(b2, 1, 0, gbc); // Row 1, Column 0
        addButton(b3, 0, 1, gbc); // Row 0, Column 1
        addButton(b4, 1, 1, gbc); // Row 1, Column 1

        f.setVisible(true);
    }

    // Helper method to add buttons
    private void addButton(Button btn, int row, int col, GridBagConstraints gbc) {
        gbc.gridx = col;
        gbc.gridy = row;
        f.add(btn, gbc);
    }

    public static void main(String[] args) {
        new GridBagLayoutExample();
    }
}