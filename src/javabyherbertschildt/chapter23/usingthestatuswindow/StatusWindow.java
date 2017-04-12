package javabyherbertschildt.chapter23.usingthestatuswindow;

/*
    <applet code="StatusWindow" width=300 height=50>
    </applet>
*/

import java.applet.Applet;
import java.awt.*;

/**
 * StatusWindow.java
 * @author Igor Bakhtin
 */
public class StatusWindow extends Applet
{
    @Override
    public void paint(Graphics g)
    {
        g.drawString("This is in the applet window.", 10, 20);
        showStatus("This is shown in the status window.");
    }
}
