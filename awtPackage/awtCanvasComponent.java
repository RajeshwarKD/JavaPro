package com.company;
import java.awt.*;
public class awtCanvasComponent {

    public awtCanvasComponent(){
            Frame frame = new Frame("Canvas Component");
            frame.setVisible(true);
            frame.setSize(400,500);
            frame.setLayout(null);
            frame.add(new canvasComponet());
    }

    public static void main(String[] args) {
       awtCanvasComponent obj = new awtCanvasComponent();
    }
}
class canvasComponet extends Canvas{
    canvasComponet(){
        setBackground(Color.GRAY);
        setSize(300,200);
    }
    public void paint (Graphics g){
        g.setColor(Color.RED);
        g.fillRect(75,75,150,100);
    }
}
