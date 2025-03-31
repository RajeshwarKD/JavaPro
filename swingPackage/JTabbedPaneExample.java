package SwingPackage;
import javax.swing.*;

public class JTabbedPaneExample {
    JFrame f;
    JTabbedPane tabbedPane;

    JTabbedPaneExample() {
        f = new JFrame("JTabbedPane Example");
        tabbedPane = new JTabbedPane();

        // Add tabs with simple components
        tabbedPane.addTab("Tab 1", new JLabel("Content for Tab 1"));
        tabbedPane.addTab("Tab 2", new JLabel("Content for Tab 2"));
        tabbedPane.addTab("Tab 3", new JLabel("Content for Tab 3"));

        f.add(tabbedPane);
        f.setSize(300, 200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new JTabbedPaneExample();
    }
}