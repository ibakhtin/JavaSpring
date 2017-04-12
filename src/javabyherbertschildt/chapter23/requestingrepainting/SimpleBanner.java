package javabyherbertschildt.chapter23.requestingrepainting;

/*
<applet code="SimpleBanner" width=300 height=50>
</applet>
*/

import java.applet.Applet;
import java.awt.*;

/**
 * SimpleBanner.java
 * @author Igor Bakhtin
 */
public class SimpleBanner extends Applet implements Runnable
{
    private String message = " A Simple Moving Banner.";
    private Thread thread = null;
    int state;
    volatile boolean stopFlag;

    // Set colors and initialize thread.

    @Override
    public void init()
    {
        setBackground(Color.blue);
        setForeground(Color.white);
    }

    @Override
    public void start()
    {
        thread = new Thread(this);
        stopFlag = false;
        thread.start();
    }

    @Override
    public void run()
    {
        for ( ; ; )
        {
            try
            {
                repaint();
                Thread.sleep(50);
                if (stopFlag)
                    break;
            }
            catch (InterruptedException e)
            {
                System.out.println("InterruptedException" + e);
            }
        }
    }

    @Override
    public void stop()
    {
        stopFlag = true;
        thread = null;
    }

    @Override
    public void paint(Graphics g)
    {
        char ch;

        ch = message.charAt(0);
        message = message.substring(1, message.length());
        message += ch;

        g.drawString(message, 50, 30);
    }
}
