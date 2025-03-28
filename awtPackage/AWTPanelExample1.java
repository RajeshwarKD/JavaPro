import java.awt.*;

public class AWTPanelExample1 {
    Frame f;
    Panel p1, p2, p3, p4, p5;

    AWTPanelExample1(){
        f = new Frame("Panel Component");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(new BorderLayout());

        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        p5 = new Panel();

        f.add(p1, BorderLayout.EAST);
        f.add(p2, BorderLayout.WEST);
        f.add(p3, BorderLayout.NORTH);
        f.add(p4, BorderLayout.SOUTH);
        f.add(p5, BorderLayout.CENTER);

        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLUE);
        p4.setBackground(Color.YELLOW);
        p5.setBackground(Color.BLACK);

        p1.setPreferredSize(new Dimension(150, 200));
        p2.setPreferredSize(new Dimension(150, 200));
        p3.setPreferredSize(new Dimension(200, 100));
        p4.setPreferredSize(new Dimension(200, 100));
        p5.setPreferredSize(new Dimension(50, 50));
    }

    public static void main(String[] args) {
        new AWTPanelExample1();
    }
}
