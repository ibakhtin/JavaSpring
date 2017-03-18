package javabyherbertschildt.chapter13.StaticImport;

/**
 * Created by ibakhtin on 15.03.17.
 */

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

// Compute the hypotenuse of a right triangle

public class Hypot {
    public static void main(String[] args) {
        double sideA, sideB;
        double hypotenuse;

        sideA = 3.0;
        sideB = 4.0;

        hypotenuse = sqrt(pow(sideA, 2) + pow(sideB, 2));

        System.out.println("Given sides of length " +
                sideA + " and " + sideB +
                " the hypotenuse is " + hypotenuse);
    }
}
