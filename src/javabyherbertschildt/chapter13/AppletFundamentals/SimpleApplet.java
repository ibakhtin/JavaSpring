package javabyherbertschildt.chapter13.AppletFundamentals;

import java.applet.Applet;
import java.awt.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
*/
/**
 * Created by ibakhtin on 15.03.17.
 */

public class SimpleApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("A Simple Applet", 20, 20);
    }
}
