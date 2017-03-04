package JavaByHerbertSchildt.Chapter03;

/**
 * Created by ibakhtin on 01.03.17.
 */

// Compute the area of a circle.

public class Area {
    public static void main(String[] args) {
        double pi, radius, area;

        radius = 10.8; // radius of circle
        pi = 3.14159265; // pi, approximately

        area = pi * radius * radius;

        System.out.println("The area of circle is " + area);
    }
}
