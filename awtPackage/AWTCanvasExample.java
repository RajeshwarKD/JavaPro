import java.awt.*;

public class AWTCanvasExample {
    Frame f;
    Canvas c;
    AWTCanvasExample() {
         f = new Frame("Canvas Component");
         f.setSize(400, 500);
         f.setLayout(null);
         f.setVisible(true);
         c = new Canvas(){
             public void paint(Graphics g) {
                 g.setColor(Color.YELLOW);
                 g.fillRect(75,75,150,100);
                 g.drawString("Drawing Area", 30, 60);
             }
         };
         f.add(c);
         c.setBackground(Color.GRAY);
         c.setSize(300, 200);

     }

    public static void main(String[] args) {
        new AWTCanvasExample();
    }
}

