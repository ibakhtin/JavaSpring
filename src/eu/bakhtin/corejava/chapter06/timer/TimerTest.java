package eu.bakhtin.corejava.chapter06.timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author Igor Bakhtin
 */
public class TimerTest
{
    public static void main(String[] args)
    {
        ActionListener actionListener = new TimePrinter();

        Timer timer = new Timer(10000, actionListener);
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}