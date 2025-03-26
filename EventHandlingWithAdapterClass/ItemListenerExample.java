import java.awt.*;
import java.awt.event.*;

public class ItemListenerExample implements ItemListener {
    Frame f;
    Checkbox checkbox;
    CheckboxGroup radioGroup;
    Checkbox radio1, radio2;
    Choice dropdown;
    TextArea log;

    public ItemListenerExample() {
        f = new Frame("ItemListener Example");
        f.setLayout(new GridLayout(5, 1));

        // Create a standard checkbox
        checkbox = new Checkbox("Enable Feature");

        // Create radio buttons
        radioGroup = new CheckboxGroup();
        radio1 = new Checkbox("Option 1", radioGroup, false);
        radio2 = new Checkbox("Option 2", radioGroup, false);

        // Create a dropdown choice
        dropdown = new Choice();
        dropdown.add("Select an item");
        dropdown.add("Item 1");
        dropdown.add("Item 2");
        dropdown.add("Item 3");

        // Create log area
        log = new TextArea();
        log.setEditable(false);

        // Step 2: Register ItemListener with all components
        checkbox.addItemListener(this);
        radio1.addItemListener(this);
        radio2.addItemListener(this);
        dropdown.addItemListener(this);

        // Add components to frame
        f.add(checkbox);
        f.add(radio1);
        f.add(radio2);
        f.add(dropdown);
        f.add(log);
        f.setSize(400, 300);
        f.setVisible(true);
    }

    // Step 3: Implement ItemListener method
    @Override
    public void itemStateChanged(ItemEvent e) {
        String componentName = "";
        String state = "";

        if (e.getSource() == checkbox) {
            componentName = "Checkbox";
            state = checkbox.getState() ? "checked" : "unchecked";
        }
        else if (e.getSource() == radio1 || e.getSource() == radio2) {
            componentName = "Radio Buttons";
            state = radioGroup.getSelectedCheckbox().getLabel();
        }
        else if (e.getSource() == dropdown) {
            componentName = "Dropdown";
            state = dropdown.getSelectedItem();
        }

        log.append(componentName + " changed: " + state + "\n");
    }

    public static void main(String[] args) {
        new ItemListenerExample();
    }
}