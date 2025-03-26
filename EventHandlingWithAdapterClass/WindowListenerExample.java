import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample implements WindowListener {
    Frame f;
    Label statusLabel;
    TextArea eventLog;

    public WindowListenerExample() {
        // 1st step: create components
        f = new Frame("WindowListener Example");
        statusLabel = new Label("Window events will appear below", Label.CENTER);
        eventLog = new TextArea(10, 40);
        eventLog.setEditable(false);

        // Set component bounds
        statusLabel.setBounds(50, 50, 300, 30);
        eventLog.setBounds(50, 100, 300, 200);

        // 2nd step: register listener
        f.addWindowListener(this);

        // Add components and set properties
        f.add(statusLabel);
        f.add(eventLog);
        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
    }

    // 3rd step: Implement all WindowListener methods
    @Override
    public void windowOpened(WindowEvent e) {
        eventLog.append("Window opened\n");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        eventLog.append("Window closing - disposing window\n");
        f.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        eventLog.append("Window closed - exiting program\n");
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        eventLog.append("Window minimized\n");
        statusLabel.setText("Window minimized");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        eventLog.append("Window restored from minimization\n");
        statusLabel.setText("Window restored");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        eventLog.append("Window gained focus\n");
        statusLabel.setBackground(Color.GREEN);
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        eventLog.append("Window lost focus\n");
        statusLabel.setBackground(Color.RED);
    }

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}