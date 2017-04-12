package javabyherbertschildt.chapter23.passingparameterstoapplets;

import java.applet.Applet;
import java.awt.*;

/*
<applet code="ParamDemo" width=300 height=80>
    <param name=fontName value=Courier>
    <param name=fontSize value=14>
    <param name=leading value=2>
    <param name=accountEnabled value=true>
</applet>
 */

/**
 * @author Igor Bakhtin
 */
public class ParameterDemo extends Applet
{
    String fontName;
    int fontSize;
    float leading;
    boolean active;

    @Override
    public void start()
    {
        String parameter;

        fontName = getParameter("fontName");
        if (fontName == null) fontName = "Not Found";

        parameter = getParameter("fontSize");
        try
        {
            if (parameter != null)
                fontSize = Integer.parseInt(parameter);
            else
                fontSize = 0;
        }
        catch (NumberFormatException e)
        {
            fontSize = -1;
        }

        parameter = getParameter("leading");
        try
        {
            if (parameter != null)
                leading = Float.valueOf(parameter).floatValue();
            else
                leading = 0;
        }
        catch (NumberFormatException e)
        {
            leading = -1;
        }

        parameter = getParameter("accountEnabled");
        if (parameter != null)
            active = Boolean.valueOf(parameter).booleanValue();
    }

    // Display parameters.

    @Override
    public void paint(Graphics g)
    {
        g.drawString("Font name: " + fontName, 0, 10);
        g.drawString("Font size: " + fontSize, 0, 26);
        g.drawString("Leading: " + leading, 0, 42);
        g.drawString("Account Active: " + active, 0, 58);
    }
}
