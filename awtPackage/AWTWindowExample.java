import java.awt.*;

public class AWTWindowExample {
    Frame f;
    Button btn;
    TextField tf;
    Label lbl;
    Checkbox chk;
    Choice choice;
    List list;

    AWTWindowExample() {
        // Create frame with title
        f = new Frame("Enhanced AWT Window");
        f.setSize(400, 300);
        f.setLayout(null); // Using null layout for manual positioning

        // Create and position components
        lbl = new Label("Enter your name:");
        lbl.setBounds(20, 40, 100, 20);

        tf = new TextField();
        tf.setBounds(130, 40, 150, 20);

        chk = new Checkbox("Enable feature");
        chk.setBounds(20, 70, 120, 20);

        choice = new Choice();
        choice.add("Option 1");
        choice.add("Option 2");
        choice.add("Option 3");
        choice.setBounds(20, 100, 120, 20);

        list = new List(3, false);
        list.add("Item A");
        list.add("Item B");
        list.add("Item C");
        list.add("Item D");
        list.setBounds(20, 130, 120, 60);

        btn = new Button("Submit");
        btn.setBounds(150, 200, 80, 30);

        // Add components to frame
        f.add(lbl);
        f.add(tf);
        f.add(chk);
        f.add(choice);
        f.add(list);
        f.add(btn);

        // Make frame visible
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new AWTWindowExample();
    }
}