package eu.bakhtin.corejava.chapter06.anonymousinnerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @author Igor Bakhtin
 */
public class AnonymousInnerClassDemo
{
    public static void main(String[] args)
    {
        TalkingClock talkingClock = new TalkingClock();
        talkingClock.start(1000, true);

        JOptionPane.showMessageDialog(null, "Quit Program?");
        System.exit(0);
    }
}

class TalkingClock
{
    /**
     * Starts the clock.
     * @param interval is interval between messages (in milliseconds)
     * @param beep true if timer should beep
     */
    public void start(int interval, boolean beep)
    {
        ActionListener actionListener = event ->
            {
                System.out.println("At the tone time is: " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();

            };
//
//        ActionListener action_Listener = new ActionListener()
//        {
//            @Override
//            public void actionPerformed(ActionEvent e)
//            {
//                System.out.println("At the tone time is: " + new Date());
//                if (beep) Toolkit.getDefaultToolkit().beep();
//            }
//        };

        Timer timer = new Timer(interval, actionListener);
        timer.start();
    }
}
