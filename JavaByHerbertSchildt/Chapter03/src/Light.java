/**
 * Created by ibakhtin on 01.03.17.
 */

// Compute distance light travels using long variables.

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightSpeed = 1860000;

        days = 1000; // specify number of days here

        seconds = days * 24 * 60 * 60; // convert to seconds

        distance = lightSpeed * seconds; // compute distance

        System.out.print("In " + days);
        System.out.print(" days light will be travel about ");
        System.out.println(distance + " miles.");
    }
}
