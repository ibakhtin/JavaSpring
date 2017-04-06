package eu.bakhtin.corejava.chapter06.lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @author Igor Bakhtin
 */
public class LambdaTest
{
    public static void main(String[] args)
    {
        String[] planets = new String[] { "Mercury", "Venus", "Earth",
                "Mars", "Jupiter", "Saturn", "Uranus", "Neptun" };

        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets, new SomeComparator());
        System.out.println(Arrays.toString(planets));

        Timer timer = new Timer(1000, event ->
                System.out.println("The time is: " + new Date()));
        timer.start();

        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class SomeComparator implements Comparator<String>
{
    public int compare(String first, String second)
    {
        return second.length() - first.length();
    }
}
