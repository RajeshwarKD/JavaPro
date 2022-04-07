import java.applet.*;
import java.awt.*;

public class newApplet extends Applet {

    int count =1;
    
    public void init(){
    System.out.println("Init Method" + count++);
    }
    
    public void start(){
    System.out.println("Start Method" + count++);
    }
    
    public void stop(){
    System.out.println("Stop Method" + count++);
    }
    
    public void destroy(){
    System.out.println("Destroy Method" + count++);
    }
    
    public void paint (Graphics g){
        System.out.println("Paint Method" + count++);
        g.drawString("Hello World", 50, 20);
    }
}

/*
<HTML><HEAD>
<TITLE>Welcome to JAVA APPLET</TITEL>
<APPLET code="myApplet.class" width = "200" height = "150"> </APPLET>
</HEAD></HTML>
*/