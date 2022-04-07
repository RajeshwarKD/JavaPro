import java.applet.*;
import java.awt.*;

public class myApplet extends Applet {

    public void paint (Graphics g){
    
        g.drawString("Hello World", 50, 20);
    }
}

/*
<HTML><HEAD>
<TITLE>Welcome to JAVA APPLET</TITEL>
<APPLET code="myApplet.class" width = "200" height = "150"> </APPLET>
</HEAD></HTML>
*/