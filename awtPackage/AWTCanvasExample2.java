import java.awt.*;

public class AWTCanvasExample2 {
    Frame f;
    Canvas c;
    AWTCanvasExample2() {
        f = new Frame("Canvas Component");
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
        c = new Canvas(){
            public void paint(Graphics g) {
                g.drawOval(40, 40, 120, 150); // Head
                g.drawOval(57, 75, 30, 20); // Left Eye
                g.drawOval(110, 75, 30, 20); // Right Eye
                g.fillOval(68, 81, 10, 10); // Left Pupil
                g.fillOval(121, 81, 10, 10); // Right Pupil
                g.drawOval(85, 100, 30, 30); // Nose
                g.fillArc(60, 125, 80, 40, 180, 180); // Mouth
                g.drawOval(25, 92, 15, 30); // Left Ear
                g.drawOval(160, 92, 15, 30); // Right Ear
            }
        };
        f.add(c);
        c.setBackground(Color.GRAY);
        c.setSize(300, 200);

    }

    public static void main(String[] args) {
        new AWTCanvasExample2();
    }
}

