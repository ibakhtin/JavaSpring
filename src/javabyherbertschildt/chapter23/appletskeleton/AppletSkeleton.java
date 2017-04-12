package javabyherbertschildt.chapter23.appletskeleton;

import java.applet.Applet;
import java.awt.*;

/*
    <applet code="AppletSkeleton" width=300 height=100>
    </applet>
*/

/**
 * An Applet skeleton.
 */
public class AppletSkeleton extends Applet
{
    // Called first.
    @Override
    public void init()
    {
        // initialization
    }

    // Called second, after init().  Also called whenever the applet is restarted.
    @Override
    public void start()
    {
        // start or resume execution
    }

    // Called when the applet is stopped.
    @Override
    public void stop()
    {
        // suspends execution
    }

    // Called when applet is terminated.  This is the last method executed.
    @Override
    public void destroy()
    {
        // perform shutdown activities
    }

    // Called when an applet’s window must be restored.
    @Override
    public void paint(Graphics g)
    {
        // redisplay contents of window
    }
}
