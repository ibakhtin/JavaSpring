package javabyherbertschildt.chapter23.simpleappletdisplaymethods;

/*
    <applet code="Sample" width=300 height=50>
    </applet>
*/

import java.applet.Applet;
import java.awt.*;

/**
 * @author Igor Bakhtin
 */
public class Sample extends Applet
{
    String message;

    @Override
    public void init()
    {
        this.setBackground(Color.gray);
        this.setForeground(Color.white);

        message = "Inside init() --";
    }

    @Override
    public void start()
    {
        message += " Inside start() --";
    }

    @Override
    public void paint(Graphics g)
    {
        message += " Inside paint().";
        g.drawString(message, 20, 20);
    }
}
